## spring

## 优点、特点
1. 简化开发
1. 可扩展性好，可扩展多个框架
2. 默认单例，减少创建对象的次数，降低了内存的开销
3. AOP切面的引入，解耦，方便
    1. 使功能组件化，成为可能、
    2. 便于重构
    3. spring通过ProxyFactoryBean将通知置入到目标对象中，返回一个和目标对象拥有相同接口的代理对象，如果目标对象没有接口，spring将采用CGLIB代理。(`不懂为啥这么说`)
4. IOC 依赖注入
   1. 因为spring的bean默认单例，便于复用
5. DI  控制反转
   1. 控制反转给抽象类，降低耦合
    2. 便于重构
6. dao、service中只存放无状态的bean，不然会导致并发的问题


## spring mvc
### 步骤
1. 配置核心控制器DispatcherServlet在web.xml文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
         version="2.5" metadata-complete="true">
    <display-name>spring framework demo</display-name>

    <!-- MVC Servlet -->
    <servlet>
        <servlet-name>springServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:spring/spring-mvc.xml</param-value>
        </init-param>
    </servlet>
    <servlet-mapping>
        <servlet-name>springServlet</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
</web-app>
```

2. 新建自定义控制类的配置文件核心控制器名-servlet.xml配置文件在WEB-INF下。
可在dispatcherServlet配置中添加参数namespace，value值表示用web-inf下的test-servlet.xml代替核心控制器名-servlet.xml
也可使用dispatcherServlet配置中添加参数contextConfigLocation指定位置和文件
3. spring-mvc.xml


## 事务

1. @Transactional(readOnly = true)，可以提高我们查询的效率，优化查询的性能，在jdk中是这么，描述的 
> A boolean flag that can be set to true if the transaction is effectively read-only, allowing for corresponding optimizations at runtime.

2. @Transactional(readOnly = true, propagation = Propagation.REQUIRED)，默认事务，如果没有事务，则创建新的事务
> Support a current transaction, create a new one if none exists. Analogous to EJB transaction attribute of the same name.
This is the default setting of a transaction annotation.
3. qwe 
