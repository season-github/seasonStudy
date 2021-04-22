package com.season.book.other;Ioc:���Ʒ�ת��������װ����Ȩ��ת�������ļ�applicationContext.xml

DI������ע�룬����Ĵ���������һ������Ĵ������ܴ���

Ҫ��
	
	����ע�룺��������޲η��������Ե�set������ref������Ƕ���
	1
	<bean id="������" class="��ĵ�ַ">
		<property name="���������" value="�������ͻ��ַ���ֵ">
		<property name="���������" ref="����bean��ǩ��id">
	</bean>
	
	2
	<bean id="������" class="��ĵ�ַ" p:������="�������ͻ��ַ���ֵ"
				p:������-ref="����bean��ǩ��id"
	/>
	3
	4���ϳ�����
		property��ǩ��
			<list>
			   <value>�������ͻ��ַ���</value>
			   <ref bean="����bean��ǩ��id"/>
			   <bean class="��.��"></bean>
			</list>	
			<set>
			   <value>�������ͻ��ַ���</value>
			   <ref bean="����bean��ǩ��id"/>
			   <bean class="��.��"></bean>
			</set>
			<map>
			   <entry key="��" value="�������ͻ��ַ���"></entry>
			   <entry key="��" value-ref="����bean��ǩ��id"></entry>
			</map>
			<props>
				<prop key="�ַ�����">�ַ���ֵ</prop>
			</props>
	5null��д��
	1 ���ַ���
		<property name="������"><value/></property>
	2 ����Ϊ��
		<property name="������"><null/></property>

	���췽��ע�룺ע�����֮���ѭ������
		constructor-arg ��ǩ�ĸ��������췽����������
		constructor-arg ��ǩ���Կ�д���֣�typeֻҪ����ƥ�䣬�ظ����Ͱ������Ⱥ�˳��
		<bean id="" class="��ĵ�ַ">
			<constructor-arg type="��������"  index="�ڼ�����������0��ʼ��" 
				name="������" value="�������ͻ��ַ���"||ref="����bean��ǩ��id">
			</constructor-arg>
		</bean>
	
	��̬�����������������õ�ǰ��ĵ�ַ��
	<bean id="��Ʒ����" class="������ĵ�ַ" 
		factory-method="������Ʒ����ľ�̬������"  ></bean>

	ʵ������������
		<bean id="��������"  class="������"></bean>
		<bean id="��Ʒ����" factory-bean="��������" 
				factory-method="������Ʒ�����ʵ��������"></bean>
	look-up����ע��
		<bean id="�������" class="������">
			<lookup-method name="���󷽷�" bean="���󷽷����ض���"/>
		</bean>

bean��ǩ�ĳ�������
	<bean id="ʵ���������ظ�" name="ʵ�������ظ�" class="��ĵ�ַ" 
		init-method="��������ĳ�ʼ��������" scope="����Ĵ�����ʽ">
	scope="singleton"����һ��ʵ��������ʹ�õ�ʵ����һ������
	scope="prototype"ÿ��ʹ�ô���һ��ʵ��
	�ڲ���java�����ֻ��һ�Σ�
	<property name="������">
		<bean class="���Ե�����">
			<property name="" value=""></property>
		</bean>
	</property>

	���������ļ�
	ApplicationContext  ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	��ȡ�����ļ�����װ�Ķ���
	���� ������=������)ac.getBean("bean��ǩ��name||id����ֵ");
	
	
AOP����������ı��
	
	֪ͨ��ֲ��Ĵ��룩
		ǰ��֪ͨ������֪ͨ���������غ󣬻��ƣ��쳣
		
	���ӵ� joinpoint��pointcut
	

	�������
		�ӿ� ����������
		�ࣺ
	 		 ��������{
		
				����
			
			}

	ʹ�÷�����1����ʽ��2schemaʽ��3ע��

	1֪ͨʵ��MethodBeforeAdvice ǰ��֪ͨ,
			AfterReturningAdvice �������غ�֪ͨ,
			MethodInterceptor ����
	1��������
	<bean id="Ŀ�������" class="����Ŀ��"/>
	<bean id="֪ͨ������" class="֪ͨ��"/>
	<aop:config>
		<aop:pointcut expression="execution(* springdemo.dao�ӿڰ�.��*.����*(..))" 
			id="��������"/>
		<aop:advisor advice-ref="֪ͨ������" pointcut-ref="��������"/>
	</aop:config>

	
	2 ֪ͨ�� ����������	���� ������JoinPoint jp�� 
		                �������� ������JoinPoint jp��Object ������������
	 	                ���� ������ProceedingJoinPoint pjp��
	2 ��������
	<aop:config>
		<aop:pointcut expression="execution(* springdemo.dao.UsersDaoInterface.*(..))" 
			id="������"/>
		<aop:aspect ref="֪ͨ������">
			<aop:after method="������"  pointcut-ref="������" />
			<aop:after-returning method="������" pointcut-ref="������" 
					returning="������������Ϊ����ֵ��������"/>
			<aop:before method="������" pointcut-ref="������"/>
			<aop:around method="������" pointcut-ref="������"/>
		</aop:aspect>
	</aop:config>

	3֪ͨ����2��ͬ���������ܸģ������ע��
		�������@Aspect
		���������
		@Around("execution(* springdemo.dao.UsersDaoInterface.*(..))")
		@Before("execution(* springdemo.dao.UsersDaoInterface.*(..))")
		@After("execution(* springdemo.dao.UsersDaoInterface.*(..))")
		@AfterReturning(pointcut="execution(*  springdemo.dao.UsersDaoInterface.*(..))"
				,returning="��ʾ���صĲ�����")
 	3��������<aop:aspectj-autoproxy></aop:aspectj-autoproxy>



ssh

	 1 ���spring���ܣ������Ĺ��ܰ��⣬���persistent��orm�ã���web����mvc�ã�
spring��hibernate���(spring-persistent.jar)
	 2 ���hibernate���ܣ���applicationContent.xml�ļ�����hibernate.cfg.xml
	 3 applicationContent.xml��
		sessionFactory bean��ǩhibernateproperties��ǩ�����
			<prop key="hibernate.show_sql">true</prop>
			<prop key="hibernate.format_sql">true</prop>
	 4 ��������hbm�ļ���ʵ���� ������У������������͵�
	 5 ��дDao�����̳�spring�ṩ�Ĺ�����HibernateDaoSupport
	 6 dao��ʹ�� this.getHibernateTemplate()�ķ���������ݷ��ʲ���
	   ���÷�����
		getHibernateTemplate().save��Entity��
		getHibernateTemplate().update��Entity��
		getHibernateTemplate().delete��Entity��
		List<T> list=getHibernateTemplate().find��hql,�����б�...��
 		T entity=getHibernateTemplate().get(T.class,����)
	 7 ͨ��getHibernateTemplate()�ķ��� 
			��ȡ hibernateԭ��session���÷����ķ�ʽ��
a����ȡ����
  List<Users> list=getHibernateTemplate().executeFind(
	new HibernateCallback<List<Users>>() {
		public List<Users> doInHibernate(org.hibernate.Session session) throws org.hibernate.HibernateException ,java.sql.SQLException 
		{
			return session.createQuery("from Users").list();
		}
    })��
b) ��ȡ����
  Users user=this.getHibernateTemplate().execute(
	new HibernateCallback<Users>() {
		public Users doInHibernate(Session session)throws HibernateException, SQLException 
		{
		return (Users)session.createQuery("from Users 
					where name=:name and password=:password"
						  )
			.setProperties(user).uniqueResult();
		}
					
	});		
	8 ͨ��applicationContext.xml����bean��ǩ�ķ�ʽ����daoʵ��
	9 ��sessionFactory����ע�뵽daoʵ����getHibernateTemplate������������
 �� struts2�Ľ��
	
	1 ����struts����/*��spring-web����û��
	2  �鿴web.xml 

		a)���ü�������ContextLoaderListener
		<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  		</listener>

		b)����spring�����ļ���ַ��
		<context-param>
   			 <param-name>contextConfigLocation</param-name>
    			<param-value>classpath:applicationContext.xml</param-value>
 		 </context-param>

		c)struts2�����������filter
	3 �Ƿ���ڣ�spring-web.jar��
		 ��struts2-spring-plugin-2.2.1.jar
	4 ҳ�棬action service dao �ļ���д
	5 ���ļ���дʱע�⣺ע��������Ա�����set����  
	6 
	  struts.xml  <action name="loginAction" 
			class="spring�ж����actionbean��id" 
			method="login">
	7 application.xml���໥ע�룩
		dao ����sessionFactory ��ҪsessionFactoryע��
		service ��dao���� ��Ҫdao bean����
		action �� service����  ��Ҫservice bean���� 	
		       �޸Ķ��󴴽�ģʽ scope="prototype"



������
	
    �������ԣ�Aԭ����Cһ����I������D������

Spring����Ĵ������Ժ͸��뼶��

����ļ��ִ�������
1. PROPAGATION_REQUIRED: �������һ��������֧�ֵ�ǰ�������û����������
2. PROPAGATION_SUPPORTS: �������һ������֧�ֵ�ǰ�������û��������������ִ��
3. PROPAGATION_MANDATORY: ����Ѿ�����һ������֧�ֵ�ǰ�������û��һ������������׳��쳣��
4. PROPAGATION_REQUIRES_NEW: ���ǿ���һ���µ��������һ�������Ѿ����ڣ���������ڵ��������
5. PROPAGATION_NOT_SUPPORTED: ���Ƿ������ִ�У��������κδ��ڵ�����
6. PROPAGATION_NEVER: ���Ƿ������ִ�У��������һ����������׳��쳣
7. PROPAGATION_NESTED�����һ�����������ڣ���������һ��Ƕ�׵�������. ���û�л����, 
      ��TransactionDefinition.PROPAGATION_REQUIRED ����ִ��

Spring����ĸ��뼶��
1. ISOLATION_DEFAULT�� ����һ��PlatfromTransactionManagerĬ�ϵĸ��뼶��ʹ�����ݿ�Ĭ�ϵ�������뼶��.
      �����ĸ���JDBC�ĸ��뼶�����Ӧ
2. ISOLATION_READ_UNCOMMITTED�� ����������͵ĸ��뼶������������һ��������Կ����������δ�ύ�����ݡ�
      ���ָ��뼶����������������ظ����ͻ������
3. ISOLATION_READ_COMMITTED�� ��֤һ�������޸ĵ������ύ����ܱ�����һ�������ȡ������һ�������ܶ�ȡ������δ�ύ������
4. ISOLATION_REPEATABLE_READ�� ����������뼶����Է�ֹ����������ظ��������ǿ��ܳ��ֻ������
      �����˱�֤һ�������ܶ�ȡ��һ������δ�ύ�������⣬����֤�˱���������������(�����ظ���)��
5. ISOLATION_SERIALIZABLE ���ǻ�����ߴ��۵�����ɿ���������뼶�����񱻴���Ϊ˳��ִ�С�
      ���˷�ֹ����������ظ����⣬�������˻������ 

���е�һЩ�����˵���� 

  ���: ָ��һ���������ڷ������ݣ����Ҷ����ݽ������޸ģ��������޸Ļ�û���ύ�����ݿ��У���ʱ������һ������Ҳ����������ݣ�Ȼ��ʹ����������ݡ���Ϊ��������ǻ�û���ύ�����ݣ� ��ô����һ �������������������������ݣ����������������Ĳ��������ǲ���ȷ�ġ�

�����ظ���: ָ��һ�������ڣ���ζ�ͬһ���ݡ����������û�н���ʱ������һ������Ҳ���ʸ�ͬһ���ݡ� ��ô���ڵ�һ�������е����ζ�����֮�䣬���ڵڶ���������޸ģ���ô��һ���������ζ��������ݿ����ǲ�һ���ġ������ͷ�������һ�����������ζ����������ǲ�һ���ģ���˳�Ϊ�ǲ����ظ�����

 �þ���: ָ�������Ƕ���ִ��ʱ������һ�����������һ�������һ�����е����ݽ������޸ģ������޸��漰 �����е�ȫ�������С�ͬʱ���ڶ�������Ҳ�޸�������е����ݣ������޸�������в���һ�������ݡ���ô���Ժ�ͻᷢ��������һ��������û����ֱ��л���û���޸ĵ������У��ͺ������˻þ�һ����

�������
1 ��������������
  <bean id="������������" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource"/>
  </bean>

2 ����������֪ͨ
  <tx:advice id="�������֪ͨ��" transaction-manager="������������">

	���巽��ʹ�ú������񴫲����Ժ͸��뼶���г����쳣�Ƿ�ع�
    <tx:attributes>				
         <tx:method name="������*" isolation="READ_COMMITTED" 
      			propagation="REQUIRED"
      			no-rollback-for="IllegalArgumentException"	
      	/>
    </tx:attributes>
  </tx:advice>
3 �����������������֪ͨ
  <aop:config>
    <aop:pointcut id="������" expression="execution(������ʽ)"/>
    <aop:advisor advice-ref="�������֪ͨ��" pointcut-ref="������"/>
  </aop:config>


checkException:
		
	���rollback-for��д�������쳣���񲻻ع� 
	���rollback-for��Ӹ��쳣�������쳣�ع�����

runtimeException:
	���rollback-for��д:�����쳣�ع�����
	no-rollback-forд�ϣ������쳣���ع�����


datasource���ɷ�����
	1 JndiObjectFactoryBean��tomcat���ӳ�
	2 PropertyPlaceholderConfigurer�� ��properties�ļ�
	3 BasicDataSource ��Ĭ������Դ

SessionFactory���ɷ�����
	LocalSessionFactoryBean��

TransactionManager���ɷ�����
	DataSourceTransactionManager ��dataSource
	HibernateTransactionManager��sessionFactory
	JtaTransactionManager
	
