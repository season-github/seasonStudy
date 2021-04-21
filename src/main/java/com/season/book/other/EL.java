package com.season.book.other;Express Language
	JavaBean��jsp�еľ���:
		1.Jsp�л�д�������java����
		2.��ȡJavaBean�е����� , ��ʵ����
		3.ǿ������ת��
	
	EL����:	����javabean��jsp�и��ӵĴ���
	�ص�:	�����Զ�����ת��	���õ�ĳ������ʱ,���Զ�����ת��,ʹ�ü�
		1.ʹ�ñ�����ȡֵ
		2.��������ֵ
		3.����

	ELȡֵ:
		1.	<%	request.setAttribute("user", new User());	%>
			${user }	${requestScope.user }
			${user.age }	${user["age"] }
			�� ��ʱ ����֪��EL��ôȡ����javabean�е�����,��Ϊ�����ҵı��ϰ�� , һ�㲻����ִ���
		2.	<% 	User u =(User)request.getAttribute("user");
				u.getAge(); %>
			֮ǰjsp��java�ű� , ȡ����ֵ, ����Ҫǿ������ת��
		3.	list	map
			${nameList[0] }
			${nameMap.["two"] }

el���ʽ,����Ϊ���ó�����bean�е����� , �ó��������㲻����������ɶ�� , Ҳ����� , �������� String

EL���ʽ�����ԡ�${XXX}������ʾ�����С�XXX�����־��Ǿ�����ʽ���ݣ���${}����������ʽ���ݰ��������У���ΪEL���ʽ�Ķ��塣
���ȡ����ֵ ����"" , ���� null

 �﷨�ṹ
JSP EL������������
�پ�̬�ı�
�ڱ�׼��ǩ���Զ����ǩ��������ΪԪ�����Ե�ֵ��Ҳ�������Զ�����ߡ���׼����Ԫ�ص�������ʹ�ã�
��EL�����ڽű�Ԫ����ʹ��

[]��a.�����
��1��EL�ṩ(.)��([])�������������ȡ���ݣ���ʹ�õ������(.)�ͷ����������([])������������ͷ��������������ʵ��ĳ�̶ֳȵĻ�������${student.name}�ȼ���${student [��name��]}����
��2����Ҫ��ȡ�����������а���һЩ�����ַ�����.��?�Ȳ�����ĸ�����ֵķ���ʱ����aҪʹ��[]������${student.name }Ӧ����Ϊ${a[a��name��] }��
��3�����Ҫ��̬ȡֵ���Ϳ�����[]��������.�޷�������̬ȡֵ������${sessionScope.student[data]}��data��һ��������

��֤�����
empty��Ϊǰ׺����������һ��ֵ�Ƿ�Ϊnull����empty����${empty user.name}�����ж�user�����е�name��ֵ�Ƿ�Ϊnull
��ʵ������ not empty ��

���������
${���� ? truevalue:falsevalue}���������Ϊ�棬����ʽ��ֵΪtruevalue������Ϊfalsevalue

EL���ʽ����ʽ������JSP���Ѿ�������9�����ö�����EL���ʽ�й���11����ʽ����
�����÷�Χ�йص�EL������������У�pageScope��requestScope��sessionScope��applicationScope
��1�����Զ�ȡʹ��JSP���ö���pageContext��request��session�Լ�application��setAttribute()�������趨�Ķ������ֵ-----��getAttribute(String name)��ȴ����ȡ�����������Ϣ���磺Ҫȡ��session�д����һ��username���Ե�ֵ��������������ķ�����session.getAttribute("username")
��2����EL����ʹ������ķ�����${sessionScope.username}
��3�����û���趨ʹ��EL���ö�������÷�Χ������pageScope��requestScope��sessionScope��applicationScope���Ⱥ�˳���ȡ����ֵ��
��4��֪ͨJSP�������pageContext.findAttribute()�������Ա�ʶ��Ϊ�ؼ��ִӸ���������л�ȡ�������������в����ڱ�ʶ������Ӧ�Ķ����򷵻ؽ��Ϊ������ע�⣬����null����
�������йص���ʽ����
��1���������йص�������������������param��paramValues��������EL�бȽ��ر�������������磬Ҫȡ���û����������ʱ�������������з�����
��2��request.getParameter(String name)
��3��request.getParameterValues(String name)
��4����EL�������ʹ��param��paramValues������ȡ�����ݣ�
��5��${param.name}
��6��${paramValues.name}��ʱ��ͬʱʹ��[]�����������ȡ�ĸ�Ԫ�أ�����${paramValues.week[0]}
������ʽ����
��1��cookie������ȡ��ʹ���ߵ�cookieֵ��������cookie���趨��username����ֵ������ʹ��${cookie.username.value}��ȡ������ֵ��
��2��header��headerValues����ȡ�����ͷ���ݣ�ʹ��header��headerValues���ö�������${header[��User-Agent��]}��headerValues������ȡ�����е�ͷ��Ϣ���ȼ��ڵ���request.getHeaders()������
��3��initParam������ȡ������web.xml�еĲ���ֵ������${initParam.repeat}���ȼ��ڣ�(String)application.getInitParameter(��repeat��);  ��
servletContext.getInitParameter(��repeat��);
��4��pageContext����ȡ�������й��û�Ҫ���ҳ�����ϸ��Ϣ

pageContext��Ӧ�ã�
��${pageContext.request.queryString} ȡ������Ĳ����ַ���
��${pageContext.request.requestURL} ȡ�������URL�������������ַ���
��${pageContext.request.contextPath}         �����web application ������
��${pageContext.request.method}           ȡ��HTTP �ķ���(GET��POST)
��${pageContext.request.protocol}         ȡ��ʹ�õ�Э��(HTTP/1.1��HTTP/1.0)
��${pageContext.request.remoteUser}         ȡ���û�����
��${pageContext.request.remoteAddr }         ȡ���û���IP ��ַ
��${pageContext.session.new}             �ж�session �Ƿ�Ϊ�µ�
��${pageContext.session.id}               ȡ��session ��ID
��${pageContext.servletContext.serverInfo}   ȡ�������˵ķ�����Ϣ