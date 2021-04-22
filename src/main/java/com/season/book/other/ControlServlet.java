package com.season.book.other;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import web.Action;
import web.ActionMapping;
import web.ActionRestult;

public class ControlServlet extends HttpServlet {
	private List<ActionMapping> actionMappings = new ArrayList<ActionMapping>();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取访问地址
		String reqpath = request.getServletPath().substring(1);
		// 获取处理的action的类名
		String className = findActionName(reqpath);
		// 获取ActionMapping
		ActionMapping actionMapping = findActionMapping(reqpath);
		// 获取处理方法名
		String methodName = request.getParameter("method");
		// 获取处理类的对象
		Action action = (Action) getAction(className);
		String path = "";
		try {
			// 反射获取方法
			Method method = action.getClass().getDeclaredMethod(methodName,
							new Class[] { ActionMapping.class,
									HttpServletRequest.class,
									HttpServletResponse.class });
			// 使用方法，获得跳转地址
			path = (String) method.invoke(action, new Object[] { actionMapping,
					request, response });
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher(path).forward(request, response);
	}

	// 根据action的类名，通过反射获取该类的对象
	private Object getAction(String className) {
		try {
			return Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// 根据路径名获取对应的ActionMapping
	private ActionMapping findActionMapping(String reqpath) {
		for (ActionMapping am : actionMappings) {
			if (reqpath.equals(am.getName())) {
				return am;
			}
		}
		return null;
	}

	// 根据路径名获取对应的action名字
	private String findActionName(String reqpath) {
		for (ActionMapping am : actionMappings) {
			if (reqpath.equals(am.getName())) {
				return am.getClasstype();
			}
		}
		return null;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	// 初始化获取所有action
	public void init(ServletConfig config) throws ServletException {
		// 获取config.xml在tomcat上的地址
		String configXMLPath = config.getServletContext().getRealPath("")
				+ config.getInitParameter("config_file");
		// 使用dom4j读取config.xml
		SAXReader saxReader = new SAXReader();
		try {
			// 将读取的信息封装到Document中
			Document doc = saxReader.read(configXMLPath);
			// 获取action节点
			List<Element> elements = doc
					.selectNodes("//action-mappings/action");
			// 遍历，每个element就是一个action
			for (Element element : elements) {
				ActionMapping am = new ActionMapping();
				actionMappings.add(am);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
