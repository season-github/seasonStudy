package com.season.book.other;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.accp.pojo.User;

@RequestMapping("/springmvc")
@Controller
@SessionAttributes("user")
public class SpringMVCTest {

	private static final String SUCCESS = "success";

	/**
	 * 1. �� @ModelAttribute ��ǵķ���, ����ÿ��Ŀ�귽��ִ��֮ǰ�� SpringMVC ����! 2. @ModelAttribute
	 * ע��Ҳ����������Ŀ�귽�� POJO ���͵����, �� value ����ֵ�����µ�����: 1). SpringMVC ��ʹ�� value ����ֵ��
	 * implicitModel �в��Ҷ�Ӧ�Ķ���, ���������ֱ�Ӵ��뵽Ŀ�귽���������. 2). SpringMVC ��һ value Ϊ key,
	 * POJO ���͵Ķ���Ϊ value, ���뵽 request ��.
	 */
	  @ModelAttribute
	public void getUser(
			@RequestParam(value = "id", required = false) Integer id,
			Map<String, Object> map) {
		System.out.println("modelAttribute method");
		if (id != null) {
			// ģ������ݿ��л�ȡ����
			User user = new User(1, "Tom", "123456", "tom@ACCP.com", 12);
			System.out.println("�����ݿ��л�ȡһ������: " + user);

			map.put("user", user);
		}
	} 

	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user) {
		System.out.println("�޸�: " + user);
		return SUCCESS;
	} 

	/**
	 * @SessionAttributes ���˿���ͨ��������ָ����Ҫ�ŵ��Ự�е�������(ʵ����ʹ�õ��� value ����ֵ),
	 *                    ������ͨ��ģ�����ԵĶ�������ָ����Щģ��������Ҫ�ŵ��Ự��(ʵ����ʹ�õ��� types ����ֵ)
	 * 
	 *                    ע��: ��ע��ֻ�ܷ����������. ���������ηŷ���.
	 */
	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(Map<String, Object> map) {
		User user = new User("Tom", "123456", "tom@ACCP.com", 15);
		map.put("user", user);
		map.put("school", "ACCP");
		return SUCCESS;
	} 

	/**
	 * Ŀ�귽��������� Map ����(ʵ����Ҳ������ Model ���ͻ� ModelMap ����)�Ĳ���.
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> map) {
		System.out.println(map.getClass().getName());
		map.put("names", Arrays.asList("Tom", "Jerry", "Mike"));
		return SUCCESS;
	}

	/**
	 * Ŀ�귽���ķ���ֵ������ ModelAndView ���͡� ���п��԰�����ͼ��ģ����Ϣ SpringMVC ��� ModelAndView ��
	 * model �����ݷ��뵽 request �������.
	 * 
	 * @return
	 */
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		String viewName = SUCCESS;
		ModelAndView modelAndView = new ModelAndView();

		// ���ģ�����ݵ� ModelAndView ��.
		modelAndView.addObject("time", new Date());
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	/**
	 * ����ʹ�� Serlvet ԭ���� API ��ΪĿ�귽���Ĳ��� ����֧����������
	 * 
	 * HttpServletRequest HttpServletResponse HttpSession
	 * java.security.Principal Locale InputStream OutputStream Reader Writer
	 * 
	 * @throws IOException
	 */
	@RequestMapping("/testServletAPI")
	public void testServletAPI(HttpServletRequest request,
			HttpServletResponse response, Writer out) throws IOException {
		System.out.println("testServletAPI, " + request + ", " + response);
		 
		out.write("hello springmvc");
		// return SUCCESS;
	}

	/**
	 * Spring MVC �ᰴ����������� POJO �����������Զ�ƥ�䣬 �Զ�Ϊ�ö����������ֵ��֧�ּ������ԡ�
	 * �磺dept.deptId��dept.address.tel ��
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("testPojo: " + user);
		return SUCCESS;
	}

	/**
	 * �˽�:
	 * 
	 * @CookieValue: ӳ��һ�� Cookie ֵ. ����ͬ @RequestParam
	 *//*
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("Cookie") String sessionId) {
		System.out.println("testCookieValue: sessionId: " + sessionId);
		return SUCCESS;
	}*/

	/**
	 * �˽�: ӳ������ͷ��Ϣ �÷�ͬ @RequestParam    httpclient   
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(
			@RequestHeader(value = "Accept-Language") String al) {
		System.out.println("testRequestHeader, Accept-Language: " + al);
		return SUCCESS;
	}

	/**
	 * @RequestParam ��ӳ���������. value ֵ����������Ĳ����� required �ò����Ƿ����. Ĭ��Ϊ true
	 *               defaultValue ���������Ĭ��ֵ
	 */
	@RequestMapping(value = "/testRequestParam")
	public String testRequestParam(
			@RequestParam(value = "username") String un,
			@RequestParam(value = "age", required = false, defaultValue = "0") int age) {
		System.out.println("testRequestParam, username: " + un + ", age: "
				+ age);
		return SUCCESS;
	}

	/**
	 * @PathVariable ������ӳ�� URL �е�ռλ����Ŀ�귽���Ĳ�����.
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable: " + id);
		return SUCCESS;
	} 
    //springmvc//testAntPath/varl/abc
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}

	/**
	 * �˽�: ����ʹ�� params �� headers �����Ӿ�ȷ��ӳ������. params �� headers ֧�ּ򵥵ı��ʽ.
	 * 
	 * @return httpclient
	 */
	 /*@RequestMapping(value="/testParamsAndHeaders", params = { "username",
			"age!=11" }, headers = { "Accept-Language=en-US,zh;q=0.8" })
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	} */

	/**
	 * ����: ʹ�� method ������ָ������ʽ
	 */
	@RequestMapping(value = "/testMethod", method = RequestMethod.GET)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}

	/**
	 * 1. @RequestMapping �������η���, ������������ 2. 1). �ඨ�崦: �ṩ����������ӳ����Ϣ������� WEB Ӧ�õĸ�Ŀ¼
	 * 2). ������: �ṩ��һ����ϸ��ӳ����Ϣ�� ������ඨ�崦�� URL�����ඨ�崦δ��ע @RequestMapping���򷽷�����ǵ� URL
	 * ����� WEB Ӧ�õĸ�Ŀ¼
	 */
	
	//lei+method
	@RequestMapping(value="/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}

}
