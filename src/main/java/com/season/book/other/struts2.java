package com.season.book.other;

/**
 * 搭建struts2框架
 * 第一步：导入jar包
 * 
 * 第二步：在web.xml中配置struts2的过滤器
 * 	<filter>
 * 		<filter-name>struts2</filter-name>
 * 		<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
 * 	</filter>
 * 
 * 		这里是一一对应的,为了让action的目标与class对应起来,servlets也是这样的好像
 * 
 * 	<filter-mapping>
 * 		<filter-name>struts2</filter-name>
 * 		<url-pattern>/*</url-pattern>
 * </filter-mapping>
 * 
 * 
 * 第三步：编写action类
 * 注意1:编写的类声明的包要为：action
 * 自定义的action都要当成一个控制器来使用		controller
 * 第一：继承 ActionSupport
 * 
 * 
 * 第四步：编写struts2的配置文件：  
 * 在src目录下编写struts.xml文件
 * <?xml version="1.0" encoding="UTF-8" ?>
 * <!DOCTYPE struts PUBLIC "-//Apache Software Foundation//DTD Struts Configuration 2.1//EN"
 *  "http://struts.apache.org/dtds/struts-2.1.dtd">
 * <!—-name名字随便取，但是不能重复-->
 * <!—-extends="struts-default"  固定的-->
 * <!—-name：请求地址-->
 * <!—- class ：请求地址对应的action类-->
 * <!—- name   当执行的方法返回name中的值的时候result标签内为要跳转的地址-->
 * 	<struts>
 * 		<package name="testaction" extends="struts-default">
 * 			<action name="test" class="action.TestAction" method=”方法名”>
 * 				<result name="success">/index.jsp</result>
 * 				<result name="input">/error.jsp</result>
 * 			</action>
 * 		</package>
 * 	</struts>    
 * 
 * 
 * 
 * 	第二个知识点：如何将action中属性对应的值传入给jsp页面
 * 	知道在action中生成属性的get和set方法就可以不用往request中封装值了，
 * 	就可以直接在jsp页面中获取action中的属性值！
 * 
 * 	第三个知识点：如何将表单的值传入到action中对应的属性中区
 * 	Action中获取Jsp页面的表单值，只需要在jsp的表单name属性中设置的属性值跟action中的属性值对应即可，
 * 	如：
 * 		<input type=”text” name=”name”/>
 * 		在action中
 * 		public class HelloWorldAction extends ActionSupport{
 * 			private String name;
 * 		}
 * 	要注意：生成属性的get和set方法
 * 	如果action中的属性为一个对象的话
 * 	如：private User user;
 * 	那么在表单中就要<input type=”text” name=”user.name”/>
 * 
 * 	第四个知识点：如何获取jsp中的作用域对象：request,response,session,application
 * 	有两种方式获取：一种是解耦的方式，一种是耦合的方式
 * 	1.解耦的方式：
 * 		第一步先创建好你ActionContext
 * 			ActionContext ac = ActionContext.getContext();
 * 		获取request:			Map request = (Map)ac.get("request");
 * 		获取session: 		Map session = ac.getSession();
 * 		获取application: 	Map application = ac.getApplication();
 * 		
 * 		request需要单独get,其他都有对应方法		
 * 
 * 	2.耦合的方式：
 * 		HttpServletRequest request = ServletActionContext.getRequest();
 * 		request.setAttribute("ouhe", "ouhe");
 * 		HttpSession session = request.getSession();
 * 		session.setAttribute("session_ouhe", "session-ouhe");
 * 
 *
 */
public class TestDrive {

}
