package com.season.book.other;��ʵ��
1.���ú��Ŀ�����DispatcherServlet��web.xml�ļ�
<servlet>
  	<servlet-name>���Ŀ�������</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
 	
</servlet>
<servlet-mapping>
  	<servlet-name>���Ŀ�������</servlet-name>
  	<url-pattern>*.do</url-pattern>
</servlet-mapping>
2�½��Զ��������������ļ����Ŀ�������-servlet.xml�����ļ���WEB-INF��
	����dispatcherServlet��������Ӳ���namespace��valueֵ��ʾ��web-inf�µ�test-servlet.xml������Ŀ�������-servlet.xml
	<init-param>
 		<param-name>namespace</param-name>
 		<param-value>test-servlet</param-value>
 	</init-param>
Ҳ��ʹ��dispatcherServlet��������Ӳ���contextConfigLocationָ��λ�ú��ļ�
	<init-param>
 		<param-name>contextConfigLocation</param-name>
 		<param-value>/WEB-INF/source/test-servlet.xml</param-value>
 	</init-param>
3��д�Զ����������ʵ��Controller�ӿ�
	�Զ���ҵ�񷽷�
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("index.jsp");
		//return new ModelAndView("index.jsp"��key��value);����index.jsp����request��
	}
4��д�Զ��������������ļ�
	a���ÿ�����ķ��ʵ�ַ
<bean id="/hello.do" class="testSpringmvc.HelloController"/>
	b������ͼ��ǰ׺�ͺ�׺(return new ModelAndView("index")��ʾ��ת��/WEB-INF/jsp/index.jsp)
	<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        	<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"></property>
        	<property name="prefix" value="/WEB-INF/jsp/"></property>
    	    	<property name="suffix" value=".jsp"></property>        
   	 </bean>
5��д��ʾ��ͼindex.jsp


 
