package com.season.book.other;

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:aop="http://www.springframework.org/schema/aop"
	xmlns:tx="http://www.springframework.org/schema/tx" xmlns:p="http://www.springframework.org/schema/p"
	xmlns:util="http://www.springframework.org/schema/util" xmlns:jdbc="http://www.springframework.org/schema/jdbc"
	xmlns:cache="http://www.springframework.org/schema/cache"
	xsi:schemaLocation="  
    http://www.springframework.org/schema/context  
    http://www.springframework.org/schema/context/spring-context-3.1.xsd  
    http://www.springframework.org/schema/beans  
    http://www.springframework.org/schema/beans/spring-beans-3.1.xsd  
    http://www.springframework.org/schema/tx  
    http://www.springframework.org/schema/tx/spring-tx-3.1.xsd  
    http://www.springframework.org/schema/jdbc  
    http://www.springframework.org/schema/jdbc/spring-jdbc-3.1.xsd  
    http://www.springframework.org/schema/cache  
    http://www.springframework.org/schema/cache/spring-cache-3.1.xsd  
    http://www.springframework.org/schema/aop  
    http://www.springframework.org/schema/aop/spring-aop-3.1.xsd  
    http://www.springframework.org/schema/util  
    http://www.springframework.org/schema/util/spring-util.xsd">

	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="oracle.jdbc.OracleDriver" />
		<property name="url" value="jdbc:oracle:thin:@localhost:1521:orcl" />
		<property name="username" value="scott" />
		<property name="password" value="123" />
	</bean>
	<bean id="sessionFactory"
		class="org.springframework.orm.hibernate3.LocalSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.Oracle9Dialect</prop>
				<prop key="hibernate.show_sql">true</prop>
				<prop key="hibernate.format_sql">true</prop>
			</props>
		</property>
		<property name="mappingDirectoryLocations">
			<list>
				<value>classpath:hbm/</value>
			</list>
		</property>
	</bean>


<!--  
  <bean id="sessionFactory" class="org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean">
  		<property name="dataSource" ref="dataSource"/>
  		<property name="hibernateProperties">
  			<props>
  				<prop key="hibernate.dialect">org.hibernate.dialect.Oracle9Dialect</prop>
  				<prop key="hibernate.show_sql">true</prop>
  				<prop key="hibernate.format_sql">true</prop>
  			</props>
  		</property>
  		<property name="packagesToScan" value="entity"/>
  </bean>
  
  <bean id="empDao" class="dao.EmpDao">
  <property name="sessionFactory" ref="sessionFactory"></property>
  </bean>
  <bean id="empService" class="service.EmpService">
  <property name="empDao" ref="empDao"></property>
  </bean>
  -->
  <!-- 
  
  ��LocalSessionFactoryBean�����Ը�ֵ��˵��hibernate�����ļ���λ��
  <bean id="sessionFactory" class="org.springframework.orm.hibernate3.LocalSessionFactoryBean">
  <property name="configLocation" value="classpath:hibernate-cfg.xml" />
  </bean>
  ��dao��ע��sessionFactoryʵ��
  <bean id="deptdao" class="dao.DeptDao">
  <property name="sessionFactory" ref="sessionFactory"/>
  </bean>
  ��service��ע��daoʵ��
  <bean id="deptService" class="service.DeptService">
  <property name="deptDao" ref="deptdao"/>
  
  </bean>
  
  �������������HibernateTransactionManager
  <bean id="transmanager" class="org.springframework.orm.hibernate3.HibernateTransactionManager">
  <property name="sessionFactory" ref="sessionFactory"/>
  </bean>
  ��ǿ����
  <tx:advice id="txAdvice" transaction-manager="transmanager">
  <tx:attributes>
  read-only=true,sessionΨһ
  	<tx:method name="cha*" read-only="true"/>
  	propagation="REQUIRED"Ĭ��ֵ��û��������¿������������ֱ����
  	<tx:method name="save*" propagation="REQUIRED"/>
  </tx:attributes>
  </tx:advice>
  
  <aop:config>
  <aop:pointcut expression="execution(* service.*.*(*))" id="service"/>
  
  <aop:advisor advice-ref="txAdvice" pointcut-ref="service"/>
  </aop:config>
     -->
</beans>  
