package com.season.book.other;2016年9月12日 00:11:27

今天开始复习springFrame

Spring 是一个框架 ,可以减少代码的耦合度,还有就是关于单例的相关,是不是程序的复用变得更有可能了?

依赖于一个叫做 applicationContext.xml 的文件
在里面写好相关设置,然后呢framework就可以通过反射,在我们看不到的地方把该有的都实现了



IOC:控制反转（依赖注入）
	1.导入jar包
	2.编写spring的配置文件（applicationContext.xml）
		<beans>	
			<bean id="student" class="entity.Student">
				<property name="name">
					<value>张三</value>
				</property>
			</bean>
			//	这里是xml文件的相关配置
			//	这里可以改变一个属性的内部属性,控制反转之后将创建对象的权利给了xml文件,也可改变对象的属性
		</beans>
		
	3.创建主方法测试
	ApplicationContext ac = new ClassPathXmlApplicationContext("/entity/applicationContext.xml");
//	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	Student s= (Student)ac.getBean("student");
	System.out.println(s);

IOC	annotation
	1.添加支持Annotation的配置
	//	annotation 注解
		xmlns:context=http://www.springframework.org/schema/context
		http://www.springframework.org/schema/context
		http://www.springframework.org/schema/context/spring-context-3.1.xsd

	2.编写配置文件
		<context:annotation-config/>					//	开启对注解的支持
		<context:component-scan base-package="*"/>		//	扫描src目录下所有的包

	3.在类中添加注解

		隐式写上bean,只改类名,让首字母小写		
			@Component  :一个实体
			@Repository  ：dao层
			@Service    service层
			@Controller   控制器层 action
		//	用起来一样,只是让别人知道俺们是分层开发的
		//	注解不能写在接口里	接口不能被实现

		@Repository(value=myid) ：dao层
		涉及到,接口,实现类,要把东西赋值给接口上面

		@Resource(name="userBizImpl")  按照名称注入：更直观
		//@Resource		默认按照类型匹配
		@Resource(name="userService")//按照名称进行匹配
		@Autowired   自动装配，默认按照类型，跟@Qualifier  也可按照名称配置


			
		@Repository   默认userDao
		public class UserDao(){
			
		}
			
		@Service   默认userService
		public class UserService(){
				
		private UserDao userDao;
			
			1通过类型   
			@AutoWired  --按照类型注入的一种方式
			@Resource   --按照类型注入的第二种方式
			
			2通过名称
			@AutoWired 
			@Qualifier("id名称")  
				@AutoWired+@Qualifier完成按照名称进行注入
				@Qualifier("")参数放的是一个id名称
				这是按照名称的第一种方式
			@Resource(name="id名")
				这是按照名称的第二种方式
			public void setUserDao(){
			
			}
		}



























简单实例
	1.配置核心控制器DispatcherServlet在web.xml文件
	<servlet>
		<servlet-name>核心控制器名</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
			
	</servlet>
	<servlet-mapping>
		<servlet-name>核心控制器名</servlet-name>
		<url-pattern>*.do</url-pattern>
	</servlet-mapping>
	2新建自定义控制类的配置文件核心控制器名-servlet.xml配置文件在WEB-INF下
		可在dispatcherServlet配置中添加参数namespace，value值表示用web-inf下的test-servlet.xml代替核心控制器名-servlet.xml
		<init-param>
			<param-name>namespace</param-name>
			<param-value>test-servlet</param-value>
		</init-param>
	也可使用dispatcherServlet配置中添加参数contextConfigLocation指定位置和文件
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>/WEB-INF/source/test-servlet.xml</param-value>
	 	</init-param>
	3编写自定义控制器类实现Controller接口
		自定义业务方法
		public ModelAndView handleRequest(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			return new ModelAndView("index.jsp");
			//return new ModelAndView("index.jsp"，key，value);（给index.jsp传参request）
		}
	4编写自定义控制类的配置文件
		a设置控制类的访问地址
	<bean id="/hello.do" class="testSpringmvc.HelloController"/>
		b设置视图的前缀和后缀(return new ModelAndView("index")表示跳转到/WEB-INF/jsp/index.jsp)
		<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
			<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"></property>
			<property name="prefix" value="/WEB-INF/jsp/"></property>
			<property name="suffix" value=".jsp"></property>        
		</bean>
	5编写显示视图index.jsp






















	Spring 容器型框架
	IOC：依赖注入
	（DI：控制反转）
	
	数据访问层----业务层----表现层（jsp,main）
	Context 
	
	上下文环境 服务器端创建的共用内存空间
	Xml
		作用：配置、当做文本化的数据库用于存储、用于跨语言交换
		良构：有且只有一个根节点，又开始必须有结束并严格区分大小写
	applicationContext.xml
		1、在xml中定义过的所有类都可以通过spring单例模式来new
		2、无状态的（谁用都一样的）bean才可以放在里面（dao service）
		3、找id用ref，直接赋值用value
	委托和代理
		Delegate:委托，调用service里的方法等同于调用dao里的
		Proxy: 代理，调用service里的方法不等同于调用dao里的
	为什么使用spring
		（Spring核心思想：IOC 、AOP）
	为什么用IOC
		IOC：称为依赖注入，也叫DI，控制反转；
		它使组件松散成为可能；
		优点：
			1、便于重用：spring默认产生的bean均是单例模式。
			2、便于重构：spring注入的方式有两种
				a、set方法注入
				b、构造方法注入（c、接口注入）
	构造方法:constructor-arg
	为什么用AOP
		AOP：面向切面编程
		它使功能组件化成为可能     
		优点：便于重构 
		Spring通过ProxyFactoryBean将通知织入到目标对象当中，返回一个和目标对象拥有相同接口的代理对象，如果目标对象没有接口，spring将采用CGLIB代理。
		例子：日志、事务来源于数据库，通过AOP形成通知织入目标对象   
	      
	通知（advice）
		前置、后置、环绕、异常
		Advisor = advice + pointcut(切入点)
	转发和重定向
		1、想要共享request的共享变量，只能通过转发
		2、想要访问本工程目录之外的网页，只能用重定向
		3、请求转发地址栏不变，会重复提交，令牌机制；
			重定向地址栏改变。
		4、session为什么能跨越多个页面

------------------------------------------------------------
--------以上是like的笔记season自己的在最上面----------------
------------------------------------------------------------