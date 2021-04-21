package com.season.book.other;	Spring�����ص㣺IoC(����ע��)   AOP�����������̣�
	Spring �����ļ�application-context.xml
	�Ҳ��ع����ǿ�ͷ����ôд�� , ֻ��Ҫ֪��������ô���ʲô�ͺ���
	ʹ��:
	1.ioc: ���Ʒ�ת
		���ú���,ֱ��ʹ��
		ApplicationContext ac=new ClassPathXmlApplicationContext("application-context.xml");
			Emp e=(Emp)ac.getBean("emp");
			syso(e);
	2.aop: ������

		ʹ��ע������AOP
		�������ϼ�ע��@Aspect����������������������
		@Before("execution(* printer.*.*(*))")���Ӹ�ע��ķ�������Ŀ�귽��ǰִ�У����������������JoinPoint
		@AfterReturning(pointcut="execution(* printer.*.*(*))",returning="o")���Ӹ�ע��ķ�������Ŀ�귽����ִ�У����������������JoinPoint
		@Around("execution(* printer.*.*(*))")���Ӹ�ע��ķ����ỷ��Ŀ�귽��ִ�У����������������ProceedingJoinPoint
		@After("execution(* printer.*.*(*))")���Ӹ�ע��ķ�������Ŀ�귽����ִ�У����ұ�ִ�У����������������JoinPoint
		�����application-context.xml�����ø�bean��ͬʱ����<aop:aspectj-autoproxy/>
