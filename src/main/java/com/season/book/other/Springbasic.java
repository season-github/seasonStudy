package com.season.book.other;Spring框架  （软件半成品）  讲20天
两个阶段
  前8天   spring基础+mybatis+ajax
          spring基础：
                     spring容器   2天
                     spring mvc   3天
                     sring jdbc/mybatis  3天
  后12天  spring应用（项目，扩展）

spring容器
一 spring 
  spring的本质是管理软件中的对象，即创建对象和维护对象之间的关系
  1.spring是什么？
     开源的，轻量级的应用开发框架，目的是用于简化企业级应用程序开发，降低侵入性。
     轻量级是相对于sun公司开发的ejb而言。
  2.spring的特点
     --简化开发 
         spring对常用的一些api做了简化（比如，对jdbc做了简化，我们使用spring jdbc来访问数
       据库，就不再需要考虑获取连接，关闭连接了），使代码更可靠。
     --管理对象（解藕）
        spring提供了一个容器，可以帮我们管理对象及对象之间的关系，这样一来，对象之间的耦合度
       降低了，方便代码的维护。
         IOC(控制反转)
     --集成（一站式框架）
          spring可以集成其他的一些框架（比如，可以集成用于任务调度的框架Quartz)
 
二 spring容器
  1.spring容器是什么？
     spring框架中的一个核心模块，用于管理对象及对象之间的关系。
  2.如何启动spring容器
     step1:导包  maven-spring-webmvc
     step2:添加一个配置文件  （aplicationContext.xml,放在main/resourse中)
     step3:启动容器 ：（后期不会这么用）
             //启动spring容器
	    //ApplicationContext:接口
	    //ClassPathXmlApplicationContext是ApplicationContext接口的一个实现类。
	    //参数值是spring配置文件的位置。
            ApplicationContext ac =
	new ClassPathXmlApplicationContext("applicationContext.xml");              
  3.创建对象
    1）利用无参构造器(*)
        step1:类应该提供有无参构造器（或缺省构造器）
        step2:在配置文件中配置bean元素。
        step3:启动spring容器，调用容器提供的getBean()方法。
                
       例：step1:先在first包中创建一个Student类
          step2:在容器配置文件applicationContext.xml中添加Bean定义
                 <bean id = "stu1" class = "first.Student"/>
                  id属性：设置bean的名称，要求唯一
                  class属性：类名（包含包名）
                  bean标签可以是单标签，也可以是双标签
          step3:在需要Student类的类中，通过spring容器获得对象
                 Student stu1 = ac.getBean("stu1",Student.class); 
    2）静态工厂方法（了解）
	调用类的静态方法创建对象。      
       例：
        <bean id = "cal1" class = "java.util.Calendar" factory-method = "getIntance"/>
	 factory-method属性：要调用的静态方法的名称
          注：spring容器会调用指定的静态方法来创建对象，方法要求必须是静态方法
    3）实例工厂方法（了解）
 	调用对象的方法创建对象。
       例：
         <bean id = "time1" factory-bean = "cal1" factory-method  ="getTime"/>
	  factory-bean属性：要调用的对象的id
          factory-method属性：该对象的方法。
          注：spring容器会调用该对象的方法来创建对象
  
  4.Bean的作用域---scope属性
    默认情况下，针对一个bean的配置，spring容器只会创建一个实例（即作用与为singleton)
    也可以设置scope属性值为prototype。此时，会创建多个实例。
    例：
      <bean id = "eb1" class = "basic.ExampleBean" scope = "prototype"/>
         scope属性:默认值是singleton(单例,即容器针对一个bean的配置,只会创建一个实例)。如果
       值是prototype(原型,会创建多个实例)。

  5.生命周期（有生命周期，可释放资源，节约资源）(*)
    1）初始化方法---init-method属性
          init-method属性指定,在启动spring容器时单例bean就会创建对象，这时便会初始化对
       象,getBean()方法只是获得,而不是创建。非单例bean会在getBean()创建对象时初始化对象。
       例：<bean id = "mb1" class = "basic.MessageBean" init-method = "init" />

    2）销毁方法---destroy-method属性
         destroy-method属性来指定,仅适用于singleton模式的bean。在spring容器关闭
       (ac.close())时启动。
          因为ApplicationContext接口没有定义关闭容器的方法，所以需要用其子接口-----  
       AbstractApplicationContext
       例：<bean id = "mb1" class = "basic.MessageBean" init-method = "init" 
                destroy-method = "destroy" />
  6.延迟加载（了解）---lazy-init属性
       默认情况下,当spring容器启动之后,会将所有作用域为单例(singleton)的bean先创建好。   
       可以设置lazy-init属性值为true.这样，容器启动之后，对于作用域为单例(singleton)的
    bean,就不再创建了，直到调用getBean()方法. 
    例：<bean id = "lz1" class = "basic.LazyBean" lazy-init = "true"/>
  
三 IOC（Inversion of Control 控制反转）(*)
  1.什么是IOC？
    对象的依赖关系由容器来建立。
  2.什么是DI？（Dependency Injection 依赖注入）
    容器通过调用对象提供的set方法或者构造器来建立对象之间的依赖关系
    注：IOC是目标，DI是手段
    1）set方法（*）（用property 标签）
       容器调用对象提供的set方法来建立依赖关系。
          spring容器在启动时去读.xml配置文件，会将单例不延迟加载的bean（A和B）创建成对象，
	当看到property标签时，注入Setter依赖关系，调用对应的set方法。
       setp1:类应该提供有对应的set方法
       step2:在配置文件当中，使用property元素来配置依赖关系。
       例：
       <!-- property元素:表示采用set方法来注入,将name中第一个字母大写，再在前面加上set方法
            name属性用来指定属性名，ref属性指定属性值 -->
       <bean id = "b1" class = "ioc.B"/>
       <bean id = "a1" class = "ioc.A">
           <property name = "b" ref = "b1"/>
       </bean>
	   
    2）构造器（了解）（用constructor-arg 标签）
       容器调用构造器来建立依赖关系。
       step1:类应该提供有对应的构造器
       step2:在配置文件当中，使用constructor-arg元素来配置依赖关系
	例：将Waiter类注入到Restaurant类
	    <!-- index属性：指定参数的位置（从0开始） -->
	    <bean id = "w1" class = "ioc.Waiter"/>
           <bean id = "r1" class = "ioc.Restaurant">
               <constructor-arg index = "0" ref = "w1"/>
           </bean>
	
    3)自动装配（了解）(autowire属性)
       自动装配即容器依据某种规则，自动建立对象之间的依赖关系。
       注：默认情况下，容器禁止自动装配。
       可以设置autowire属性值让容器自动装配。
       --byName:以属性名作为bean的中property的ref值，查找配置文件，找到后用set方法注入
                 找不到会注入空值，不会找到多个符合条件的bean.
                例：
                   先在Restaurant类中定义属性Waiter wt,并写好set方法。
                  <bean id = "wt" class = "ioc.Waiter"/>
                  <bean id = "rest" class = "ioc.Restaurant" autowire = "byName"/>
       --byType:以属性类型为依据查找配置文件，找到后用set方法注入。
                 找不到会注入空值，如果找到多个符合条件的bean会出错。
                 例：
                   先在Restaurant类中定义属性Waiter wt,并写好set方法。
                   <bean id = "wt" class = "ioc.Waiter"/>
                  <bean id = "rest" class = "ioc.Restaurant" autowire = "byType"/>
                   
       --constructor:与byType类似，只不过会采用构造器来注入。
      优先使用byName. 
   
   4)注入基本类型的值（包括String)  value属性
     例：在ExampleBean中有name age 属性
       <bean id = "eb1" class = "value.ExampleBean">
       <property name = "name" value  = "小月"/>
       <property name = "age" value = "18"/>
       </bean>
   
   5）注入集合值
      List Set Map Properties
      List中的value允许重复值，Set中的value有重复值的话只显示一个
      List例：
           <bean id = "eb1" class = "value.ExampleBean">
           <property name = "interest">
             <list>
               <value>钓鱼</value>
               <value>台球</value>
               <value>看电视</value>
               <value>看电视</value>
            </list>
          </property> 
          </bean>    
      Set例：
           <property name = "cities">
             <set>
               <value>北京</value>
               <value>上海</value>
               <value>长沙</value>
               <value>长沙</value>
            </set>
          </property>
     Map例：
           <property name = "score">
             <map>
               <entry key = "english" value = "59.5"/>
               <entry key = "math" value = "80"/>
             </map>
          </property>
    Propertie例：
          <property name = "db">
            <props>
              <prop key = "username">Sally</prop>
              <prop key = "password">1234</prop>
           </props>
         </property>       


  5）以引用的方式注入集合类型的值（List Set Map Properties)
     List例：
           <util:list id = "interestBean">
              <value>钓鱼</value>
              <value>台球</value>
              <value>看电视</value>
           </util:list>
           <bean id = "eb2" class = "value.ExampleBean">
             <property name = "interest" ref = "interestBean"/>
           </bean>
     Set例：
          <util:set id = "citiesBean">
             <value>北京</value>
             <value>上海</value>
             <value>长沙</value>
             <value>长沙</value>
         </util:set>
         <bean id = "eb2" class = "value.ExampleBean">
             <property name = "cities" ref = "citiesBean"/>
         </bean>
    Map例：
         <util:map id = "scoreBean">
            <entry key = "english" value = "59.5"/>
            <entry key = "math" value = "80"/>
         </util:map>
         <bean id = "eb2" class = "value.ExampleBean">
             <property name = "score" ref = "scoreBean"/>
         </bean>
    Properties例：
          <util:properties id = "dbBean">
            <prop key = "username">Tom</prop>
            <prop key = "password">12314</prop>
          </util:properties>
          <bean id = "eb2" class = "value.ExampleBean">
             <property name = "db" ref = "dbBean"/>
          </bean>
       读取properties文件例：
            <!-- location:指定读取的文件的位置
                 classpath:依据类路径来查找，从src/main/resorse下 -->
            <util:properties id = "configBean" 
               location = "classpath:config.properties"/>

  6)注入Spring表达式值  （#{id名.属性名}）
    例：
      <util:properties id = "db" location = "classpath:db.properties"/>
      <bean id = "dbUtil" class = "Util.DBUtil" >
      <!-- 从id = db的文件中的Bean中读取属性driver，写到driverClass属性中 -->
         <property name = "driverClass" value = "#{db.driver}"/>
         <property name = "url" value = "#{db.url}"/>
         <property name = "userName" value = "#{db.user}"/>
         <property name = "password" value = "#{db.pwd}"/>
      </bean>

  7）注入null或空字符串  value = ""  <null/>

四 基于注解的组件扫描
  1.什么是组件扫描？
    容器启动之后，如果发现配置文件有component-scan元素，则容器会扫描相应的包及其子包下面的所有类，如果这些类前面有一些特殊的注解（比如@Component)，则容器会将这些类纳入容器进行管理（相当于以前配置文件当中有相应的bean元素）
  2.编程步骤
    step1:在配置文件当中，添加component-san元素。
          base-package属性:指定要扫描的包名，容器会扫描该包及其子包下面的所有的类。
          例：<context:component-scan base-package = "spring.day03.demo"/>
    step2:在类名前，添加一些注解
          例：@Component("db1") 
                //括号里为bean的id  可不写，默认为demoBean
               //Spring在扫描到这个类的注解Component,Spring
               //会将DemoBean实例化为对象
              public class DemoBean(){}
               
       注：bean的默认id是首字母小写之后的类名
           @Scope  默认作用域为单例，也可更改 @Scope("prototype")
 @Component 通用
 @Service  业务层
 @Repository 持久层
 @Controller 控制层
 @Named      通用 需要导包：maven中javax.inject的1.0-PFD-1
 
  3.用于指定作用域的注解：放在类外
   @Scope  默认作用域为单例，也可更改 @Scope("prototype") 
          
  4.生命周期相关的两个注解：放在方法外
   @PostConstruct  初始化
   @PreDestroy 销毁  ---只能在单例的bean下起作用
   例：
     @PostConstruct
     public void init(){}
     @PreDestroy
     public void destroy(){}
   注：这两个注解来自javaee，不属于spring框架
  5.用于延迟加载的注解：放在类外
    @Lazy(true)  true表示延迟加载
  6.依赖相关的注解：
    1) @Autowired和@Qualifier
       a.支持set方式的注入和构造器方式的注入。
       b.set方式注入：
         将@Autowired和@Qualifier加到set方法前面，也可以加到属性前面。其中@Qualifier用于指
         定要注入的bean的id.
         注：如果不指定id,则使用byType的方式来注入。
         例：
          @Autowired
          public void setGirlFriend(@Qualifier("girl") Girl girlFriend){}
       c.构造器注入
          将@Autowired和@Qualifier加到构造器前既可
          例：
           @Autowired
            public Boy(@Qualifier("girl") Girl girlFriend){}    
     2)@Inject和@Named     与@Autowired和@Qualifier一样 只是还需要额外导包     
    3）@Resource(*)
       a.只支持set方式注入（bean属性注入）
       b.可以将该注解加到set方法前，或者属性前。使用name属性来指定要注入的bean的id.
         在set方法前注入相比于在属性前注入，会执行set方法，因此里面可以加一些其他业务
         例：
          @Resource(name = "girl")
          Girl girlFriend;
           //@Resource(name = "girl")
          public void setgirlFriend(Girl girlFriend){}

  7.Spring表达式相关的注解
    例：
    在.xml文件中依然要写
    <util:properties id = "db" location = "classpath:db.properties"/>
    在需要使用db.properties文件的类中
    @Value("苍松")
    private String name;
    @Value("#{db.driver}")
    private String driverName;
    注：@Value注解既可以用在属性前，也可以用在set方法前。另外，也可以使用该注解注入基本类型的值。
















练习：
1.写一个java类（比如ManagerBean),为该类提供初始化方法与销毁方法，作用域要求为singleton,不使
  用延迟加载。
2.将Computer对象注入到Manager对象，要求使用set方法来注入。






1.什么是JabaBean:一种简单规范的Java对象
2.在@Test中的新知识点:@Before  在每个测试方法之前执行Before方法 
                     @After   在每个测试案例执行结束后执行
3.导包方式 maven pom.xml拷坐标  在maven.tedu.cn中搜出相应坐标（dependency标签)
4.同时使用不同包中的同名类时，其中一个必须是类的全名。
