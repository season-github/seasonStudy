package com.season.book.other;

public class SSH {
/**
 * 
 * 
 * 
 * 用hibernatecallback   不用session写	后天作业2016年8月2日 11:16:55
 * 
 * 	第一步：导入spring的jar包
 * 		注意：导入核心包，持久化包，web包
 * 		core
 * 		facets/fesit/n.面 pl.切面
 * 		Spring persistence n.持续,存留
 * 		Spring web
 * 
 * 
 * 	第二步：导入hibernate的jar包
 * 		如果要连接数据库连接池记着选择第三个
 * 		core
 * 		extra libraries	额外的类库
 * 
 * 
 * 	第三步：导入struts2的jar包
 * 		core
 * 		facets
 * 		spring web	要想让spring整合struts就需要把spring web的包导上
 * 
 * 
 * 		不要忘记在web.xml中添加如下配置(新版本MyEclipse帮忙自动配置了)
 * 		<listener>
 * 			<listener-class>
 * 				org.springframework.web.context.ContextLoaderListener
 * 			</listener-class>
 * 		</listener>
 * 
 * 		<context-param>
 * 			<param-name>contextConfigLocation</param-name>
 * 			<param-value>classpath:applicationContext.xml</param-value>
 * 		</context-param>
 * 
 * 
 * 
 *		注意配置OpenSessionInViewFilter	 位于struts2之上,listener之下	filter 过滤器
 * 
 * 		让session始终开启
 * 		如果没有它,session在查找出数据后会关闭的
 * 		这时候需要迫切内链接 或者是 , OpenSessionInViewFilter
 * 
 * 		普通删除只要保证有id就行,但是级联删除,你就得保证先查出来
 * 		
 * 		<filter>	
 * 			<filter-name>OpenSessionInViewFilter</filter-name>
 * 			<filter-class>org.springframework.orm.hibernate3.support.OpenSessionInViewFilter</filter-class>
 * 		</filter>
 * 		<filter-mapping>
 * 			<filter-name>OpenSessionInViewFilter</filter-name>
 * 			<url-pattern>/*</url-pattern>
 * 		</filter-mapping>
 * 
 * 	第四步：完善applicationContext.xml文件的配置
 * 
 * 		将命名空间和自动提示功能补全：aop，context,tx
 * 		
 * 		<context:annotation-config/>		开启对注解的支持
 * 		<context:component-scan base-package="*"/>	扫描src下所有的包
 * 
 * 		声明式事务管理
 * 
 * 		定义一个事务管理器
 * 			既然要将事务交给spring中管理，那么就要用到sessionFactory,
 * 			就需要将sessionFactroy注入到HibernateTransactionManager
 * 		<bean id="txManager" class="
 * 				org.springframework.orm.hibernate3.HibernateTransactionManager">
 * 			<property name="sessionFactory" ref="sessionFactory"></property>
 * 		</bean>
 * 
 * 
 * 		定义事务的增强
 * 			当为查询时，可定义 read-only="true"   可以提高我们查询的效率，优化查询的性能
 * 			propagation="REQUIRED"	当存在一个事务的事务支持当前事务，如果当前方法没有事务就开启一个新的事务
 * 		<tx:advice id="txAdvice" transaction-manager="txManager">
 * 			<tx:attributes>	attribute属性,特性
 * 				<tx:method name="get*" read-only="true" />
 * 				<tx:method name="delete*" propagation="REQUIRED"/>
 * 				<tx:method name="update*" propagation="REQUIRED"/>
 * 				<tx:method name="add*" propagation="REQUIRED"/>
 * 				<tx:method name="save*" propagation="REQUIRED"/>
 * 			</tx:attributes>
 * 		</tx:advice>
 * 
 * 
 * 		定义切面 定义切入点 将事务增强和切入点组合
 * 		<aop:config>
 * 			<aop:pointcut id="serviceMethod" expression="execution(* service..*.*(..))"/>
 * 			<aop:advisor advice-ref="txAdvice" pointcut-ref="serviceMethod"/>
 * 		</aop:config>
 * 
 * 
 * 
 * 	第五步：创建工具类 BaseUtil
 * 	public class BaseUtil {
 * 
 *	private HibernateTemplate hibernateTemplate;
 * 
 * 	@Resource(name="hibernateTemplate")
 * 	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
 * 	this.hibernateTemplate = hibernateTemplate;
 * 	}
 * 
 * 	public HibernateTemplate getHT(){
 * 	return hibernateTemplate;
 * }
 * }	
 * <bean class="org.springframework.orm.hibernate3.HibernateTemplate" id="hibernateTemplate">
 * <property name="sessionFactory" ref="sessionFactory"></property>
 * </bean>
 * 
 */
}
