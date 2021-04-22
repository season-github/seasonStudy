package com.season.book.other;��������
	����action����
	
1	extends AbstractInterceptor
	��дintercept����
	ʹ��ActionInvocation ai���������invoke()����
	ʵ�ֵ���Ŀ��action�ķ�����������һ��������
2       ��struts�����ļ��ж���������
	<interceptors>
		����������
		<interceptor name="��������" class="�Զ�����������ַ"></interceptor>
		����������ջ
		<interceptor-stack name="������ջ��">
			<interceptor-ref name="���õ�������"></interceptor-ref>
			<interceptor-ref name="���õ�������ջ"></interceptor-ref>
		</interceptor-stack>
	</interceptors>
Ĭ������������ǰpackage�µ�����action��ǩ��û������������������£�Ĭ�����õ�������
��action�����Լ�����������Ĭ��������ʧЧ
<default-interceptor-ref name="myInterceptor"></default-interceptor-ref>
3 	��struts.xml�����ļ���action��ǩ������������
	<action>
	<result></result>
	<interceptor-ref name="����������������ջ��"></interceptor-ref>
	
	</action>
4	������������˳������������������Ⱥ�

5 ��������return��string����ת��ͼ�� ��action�д��ڵ���ͼ
6 �������һ����������action
	ʹ��ActionInvocation ai���������invoke()����
  ���������һ��	ֱ�ӷ�����ͼ
7 ��������action��ǩ������ʹ�õ���ͼ 
<global-results>
	<result name="��ͼ">/ʵ�ʽ��</result>	
</global-results>
8 ��action���������ȶ��󴫳�ʼ��ֵ��������get��set����
	Struts.xml�е�action��ǩ��intercept��ǩ�����
	  <param name="����">value</param>
9 ����������ʼ��ֵ���÷���������get��set����
	<interceptor name="��������" class="�Զ�����������ַ">
	 <param name="����">value</param>����ʹ�ø��������Ķ�����
	</interceptor>

	<interceptor-ref name="���õ�������">
	 <param name="����">value</param>������Ӹ����������ñ�ǩ��
	</interceptor-ref>

	<interceptor-ref name="���õ�������">
	 <param name="��������.����">value</param>������Ӹ����������ñ�ǩ��
	</interceptor-ref>
10 �������������ˣ��̳�MethodFilterInterceptor
			������excludeMethods�����ų���������������ö��Ÿ���









