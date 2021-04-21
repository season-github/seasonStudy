package com.season.book.other;MyBatis

POJO对象
传统Java对象（满足Java Bean规范）的Java对象
1.MyBatis是什么?
  是一个开源的持久层框架，

2.如何使用MyBatis?
  step1: 导包。---mybatis,ojdbc 
  step2 添加配置文件。.xml文件
        <configuration>
	<environments default="environment">
		<environment id="environment">
			<transactionManager type="JDBC" />
			<!--MyBatis自带的连接池配置-->
			<dataSource type="POOLED">
				<property name="driver" 
				       value="oracle.jdbc.OracleDriver" />
				<property name="url"					
				      value="jdbc:oracle:thin:@172.176.0.42:1521:orcl" />
				<property name="username" value="oracle" />
				<property name="password" value="oracle" />
			</dataSource>
		</environment>
	</environments>
	<!--映射文件的位置
	    注：要将.改为"/"进行分割
	 -->
	<mappers>
		<mapper resource="mappers/UserMapper.xml" />
	</mappers>
        </configuration>

  
  step3: 写映射文件。 .xml文件
        注：
    a.insert元素用于添加操作,查询应该使用select元素,修改使用update元素,删除使用delete元素。
    b.这些元素可以使用的属性不同，不要误用，比如添加操作使用select元素是不对的。
        <!-- 命名空间：为了避免sqlId重名 -->
       <mapper namespace="cn.tedu.dao.UserMapper">
       <!-- id属性：sql的名称,要求唯一，类似于以前写的方法名
            parameterType属性：参数类型，要求写类的完整名称
            resultType属性：查询结果的每个元素类型-->
           <!-- 查询所有的用户信息List<User> -->
           <select id = "findAllUsers"
                      resultType = "cn.tedu.entity.User">
               select 
                 id,username,password,mobile,address
               from JSD08_t_wdd  
          </select>
          <select id = "findUserByName"
                 resultType = "cn.tedu.entity.user"
                  parameterType = "string">
               select id,username,password,mobile,address
               from JSD08_t_wdd where username = #{name}
          </select>
     </mapper>
  step4: 写实体类。
         注：实体类的属性名与表的字段名要求一致（大小写可以不一样）。
  step5: 调用SqlSession提供的方法来访问数据库。
       //打开配置文件
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		//创建SqlSession
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//利用配置文件创建sqlSessionFactory
		SqlSessionFactory factory = builder.build(reader);
		//session必须关闭（包含数据库连接)
		SqlSession session = factory.openSession();
		System.out.println(session);
		session.close();
查询：
       List<User> list = session.selectList("findAllUsers");
       或
       UserMapper mapper = session.getMapper(UserMapper.class);
       List<User> list = mapper.findAllUsers();
       
       User user = mapper.findById(10);
       或
      User user = session.selectOne("findById",id);

更新：
      int a = mapper.updateUser(user);
      或
      a = session.update("updateUser", user);
      
      int a = mapper.addUser(user);
      或
      int a = session.update("addUser",user);
      
MyBatis默认情况下将结果集的列名映射到同名的实体对象的Bean属性上。
如果不一致，会出现空值现象。    
      
当结果集的Bean属性与数据库列名不同时，便不能自动调用set方法了
解决方案：
  1.sql语句中加as
  2.写resultMap标签
    <resultMap type = "entity.Emp" id = "ResultMap">
      <id column = "empno" property = "id"/>
      <result column = "ename" property = "name"/>
      <result column = "salary" property = "salary"/>
      <result column = "hiredate" property = "hiredate"/>
      <result column = "deptno" property = "deptId"/>
    </resultMap> 
    
    复杂的
    <resultMap id = "postMap" type = "cn.tedu.note.entity.Post">
      <id property = "id" column = "id"/>
      <result property = "content" column = "content"/>
      <result property = "time" column = "time"/>
      <association property = "person" javaType = "cn.tedu.note.entity.Person" >
        <id property = "id" column = "personId"/>
        <result property = "name" column = "name"/>
        <result property = "age" column = "age"/>
      </association>
      <!-- 映射集合 -->
     <collection property = "comments" select = "findCommentByPostId" column = "id"/>
   </resultMap>
    
    
    
     
    
mapper映射器
(1)mapper映射器是什么?
符合映射文件要求的接口。
注：mybatis会依据mapper映射器，自动生成符合 其要求的对象。

(2)具体要求:
a. 方法名要与sqlId一致。
b. 参数类型要与parameterType一致。
c. 返回类型要与resultType一致。
d. 映射文件的namespace必须等于mapper映射器的完整的名字。

(3)编程步骤
step1. 写Mapper映射器。
step2. 使用SqlSession提供的getMapper方法来获得 映射器的实现对象。

二 Spring集成MyBatis
  1.集成的好处
    a. 简化代码：比如，不用关心SqlSession如何获得和关闭。
    b. 可以使用依赖注入。
       可以将DAO注入到目标对象，比如将AdminDAO注入到LoginController,方便代码的维护。
  2.如何集成
    step1:导包
     spring-webmvc(包含了spring核心包和springmvc), mybatis,mybatis-spring(用于二者集成),
      spring-jdbc, dbcp,ojdbc,junit。
   step2. 添加spring配置文件。
     注：不再需要mybatis的配置文件，只需要配置SqlSessionFactoryBean就可以了。
        例：
          <!-- 配置SqlSessionFactoryBean -->
         <bean id = "sqlSessionFactory" 
               class = "org.mybatis.spring.SqlSessionFactoryBean">
            <!-- 指定连接资源 -->
           <property name = "dateSource" ref = "dateSource"/>
             <!-- 指定映射文件 -->
           <property name = "mapperLocations" value = "classpath:mappers/*.xml"/>
         </bean>
         
         
  step3. 实体类 
  step4. 映射文件 
  step5. Mapper映射器(DAO) 
  step6. 配置MapperScannerConfigurer。
       注：这个bean会创建SqlSession对象，另外，会调用SqlSession对象的getMapper方法，来创建
      符合映射器要求的对象，最后，将这些对象(即符合映射器要求) 放到spring容器里面(即可以调用
      容器提供的getBean方法来获得这些对象，当然，也可以使用依赖注入)。
       
       a. 默认的id是首字母小写之后的映射器名。
       b. 可以使用@Respository对id进行命名。此时， 不需要配置组件扫描。
       c.如果只扫描特定的映射器，可以设置 MapperScannerConfigurer的annotationClass 属性。
        c1.开发一个注解，比如@MyRepository。
        c2.将该注解添加到要扫描的映射器。
        c3.配置annotationClass属性。

       <!-- 在Spring容器初始化的时候自动初始化MapperScannerConfigurer对象
          这时扫描器会扫描dao包中的全部接口，并自动创建此接口的匿名实例（反射） -->
        <bean class = "org.mybatis.spring.mapper.MapperScannerConfigurer">
              <property name = "basePackage" value = "dao"/>
             <!-- 声明注解，在扫描Mapper接口时，只实例化包含MapperBean注解的接口 -->
              <property name = "annotationClass" value = "util.MapperBean"/>
       </bean>

spring集成mybatis的另外一种方式(了解)。
  step1. 导包。
    spring-webmvc(包含了spring核心包和springmvc), mybatis,mybatis-spring(用于二者集成), 
    spring-jdbc, dbcp,ojdbc,junit。
  step2. 添加spring配置文件。
     注：不再需要mybatis的配置文件，只需要配置 SqlSessionFactoryBean就可以了。
  step3. 实体类 
  step4. 映射文件 
  step5. Mapper映射器(DAO) 
  step6. 配置SqlSessionTemplate。
      <!-- MyBatis DAO 模板类 -->
      <bean id = "sqlSessionTemplate" class = "org.mybatis.spring.SqlSessionTemplate">
        <constructor-arg index = "0" ref = "sqlSessionFactory"/>
       </bean>
  step7. 写一个DAO实现类，将SqlSessionTemplate 注入到该类。
      @Repository
       public class UserDao {
	 @Autowired
	 private SqlSessionTemplate sqlSessionTemplate;
	 public List<User> findAll(){
	   //读取缓存，再读取数据库
	   //提交队列，最后查询
	   ......
	   return sqlSessionTemplate.selectList("findAllUser");
	}
      }
      
      
      
      
      
  
  
  
1.@Service("empService")
  //原则上实现类BeanId按照接口命名
  public class EmpServiceImpl implements EmpService{}


