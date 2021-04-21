package com.season.book.other; ����spring.jar�ļ���Spring������������13��������jar�������԰����Ŷ�Ӧ��Spring������û����Ը����Լ�����Ҫ��ѡ������Լ���jar������������������spring.jar���������ļ���
(1) spring-core.jar
���jar�ļ�����Spring��ܻ����ĺ��Ĺ����࣬Spring�������Ҫ��Ҫʹ�õ����������࣬����������Ļ������ģ���Ȼ��Ҳ�������Լ���Ӧ��ϵͳ��ʹ����Щ�����ࡣ
(2) spring-beans.jar
���jar�ļ�������Ӧ�ö�Ҫ�õ��ģ����������������ļ��������͹���bean�Լ�����Inversion of Control / Dependency Injection��IoC/DI��������ص������ࡣ���Ӧ��ֻ�������IoC/DI֧�֣�����spring-core.jar��spring-beans.jar�ļ��Ϳ����ˡ�
(3) spring-aop.jar
���jar�ļ�������Ӧ����ʹ��Spring��AOP����ʱ������ࡣʹ�û���AOP��Spring���ԣ����������������Declarative Transaction Management����ҲҪ��Ӧ����������jar����
(4) spring-context.jar
�������jar�ļ�ΪSpring�����ṩ�˴�����չ�������ҵ�ʹ��Spring ApplicationContext����ʱ�����ȫ���࣬JDNI�����ȫ���࣬UI�����������ģ�壨Templating��������Velocity��FreeMarker��JasperReports���ɵ��࣬�Լ�У��Validation���������ࡣ
(5) spring-dao.jar
�������jar�ļ�����Spring DAO��Spring Transaction�������ݷ��ʵ������ࡣΪ��ʹ������������֧�֣��������Լ���Ӧ�������spring-aop.jar��
(6) spring-hibernate.jar
�������jar�ļ�����Spring��Hibernate 2��Hibernate 3���з�װ�������ࡣ
(7) spring-jdbc.jar
�������jar�ļ�������Spring��JDBC���ݷ��ʽ��з�װ�������ࡣ
(8) spring-orm.jar
�������jar�ļ�����Spring��DAO���Լ���������չ��ʹ��֧�� iBATIS��JDO��OJB��TopLink����ΪHibernate�Ѿ������ɰ��ˣ����ڲ���������������ˡ����jar�ļ���󲿷ֵ��඼Ҫ����spring-dao.jar����࣬�������ʱ����Ҫͬʱ����spring-dao.jar����
(9) spring-remoting.jar
�������jar�ļ�����֧��EJB��JMS��Զ�̵���Remoting��RMI��Hessian��Burlap��Http Invoker��JAX-RPC��������ࡣ
(10) spring-support.jar
�������jar�ļ�����֧�ֻ���Cache��ehcache����JCA��JMX���ʼ�����Java Mail��COS Mail��������ƻ�Scheduling��Timer��Quartz��������ࡣ
(11) spring-web.jar
�������jar�ļ�����WebӦ�ÿ���ʱ���õ�Spring���ʱ����ĺ����࣬�����Զ�����WebApplicationContext���Ե��ࡢStruts��JSF�����ࡢ�ļ��ϴ���֧���ࡢFilter��ʹ������߸����ࡣ
(12) spring-webmvc.jar
�������jar�ļ�����Spring MVC�����ص������ࡣ�������ʻ�����ǩ��Theme����ͼչ�ֵ�FreeMarker��JasperReports��Tiles��Velocity��XSLT����ࡣ��Ȼ��������Ӧ��ʹ���˶�����MVC��ܣ����������JAR�ļ�����κ��ࡣ
(13) spring-mock.jar
�������jar�ļ�����Springһ����mock��������Ӧ�õĲ��ԡ�Spring�����׼�ʹ�������д���mock�࣬�������Ծ͸��Ӽ򵥡�ģ��HttpServletRequest��HttpServletResponse����WebӦ�õ�Ԫ�����Ǻܷ���ġ�
���ѡ����Щ������������ѡ����Щ��������ʵ�൱�򵥡�
 ��������ڹ���WebӦ�ò���ȫ��ʹ��Spring����ô��þ�ʹ�õ���ȫ����spring.jar�ļ���
 ������Ӧ�ý����õ��򵥵�Inversion of Control / Dependency Injection��IoC/DI����������ôֻ��spring-core.jar��spring-beans.jar���ɣ�
 �����Է����Ĵ�СҪ��ܸߣ���ô�͵þ���ϸѡ�ˣ�ֻȡ�����Լ��������Ե�jar�ļ��ˡ�
���ö����ķ���������Ա�������Լ���Ӧ�ò���Ҫ��ȫ���ࡣ��Ȼ����Բ���������һЩ�������跨������Ӧ�ð���С����ʡ�ռ���ص�����׼ȷ���ҳ��Լ������Spring�����࣬Ȼ��ϲ������������Ϳ����ˡ�
 Eclispe�и������ClassPath Helper���԰����������������ࡣ
Spring������˵��:
1) spring-core.jar��commons-collections.jar��spring-core.jar���������������Ļ�����
2) spring-beans.jar��spring-core.jar��cglib-nodep-2.1_3.jar
3) spring-aop.jar��spring-core.jar��spring-beans.jar��cglib-nodep-2.1_3.jar��aopalliance.jar
4) spring-context.jar��spring-core.jar��spring-beans.jar��spring-aop.jar��commons-collections.jar��aopalliance.jar
5) spring-dao.jar��spring-core.jar��spring-beans.jar��spring-aop.jar��spring-context.jar
6) spring-jdbc.jar��spring-core.jar��spring-beans.jar��spring-dao.jar
7) spring-web.jar��spring-core.jar��spring-beans.jar��spring-context.jar
8) spring-webmvc.jar��spring-core.jar/spring-beans.jar/spring-context.jar/spring-web.jar
9) spring-hibernate.jar��spring-core.jar��spring- beans.jar��spring-aop.jar��spring-dao.jar��spring-jdbc.jar��spring- orm.jar��spring-web.jar��spring-webmvc.jar
10) spring-orm.jar��spring-core.jar��spring-beans.jar��spring-aop.jar��spring-dao.jar��spring-jdbc.jar��spring-web.jar��spring-webmvc.jar
11) spring-remoting.jar��spring-core.jar��spring-beans.jar��spring- aop.jar��spring-dao.jar��spring-context.jar��spring-web.jar��spring- webmvc.jar
12) spring-support.jar��spring-core.jar��spring-beans.jar��spring-aop.jar��spring-dao.jar��spring-context.jar��spring-jdbc.jar
13) spring-mock.jar��spring-core.jar��spring-beans.jar��spring-dao.jar��spring-context.jar��spring-jdbc.jar
һ��ֻ��ʹ��spring���
dist\spring.jar
lib\jakarta-commons\commons-logging.jar

���ʹ�õ���������(AOP)������Ҫ����jar�ļ�
lib\aspectj\aspectjweaver.jsr �� aspectjrt.jar
lib\cglib\cglib-nodep-2.1_3.jar

���ʹ����JSR-250�е�ע����@Resource/@PostConstruct/@PreDestroy
��������jar�ļ�
lib\j2ee\common-annotations.jar

����ֻ��ʹ��spring�����ʹ��ע�ⷽʽ
ֻҪ��һЩ�����ռ�Ϳ���������
����@Resource��Ҫ��lib\j2ee\common-annotations.jar
<context:annotation-config/>�򿪴�����

����Ҫ�Զ�ɨ��
ֻҪ������������һЩ�����ռ�
<context:component-scan base-package=""/>

�ġ�spring��ܲ���aop���
��Ҫ����һЩ�����ռ�
xmlns:aop.......
<aop:aspectj-autoproxy/>����������
���ʹ�õ���������(AOP)������Ҫ����jar�ļ�
lib\aspectj\aspectjweaver.jsr �� aspectjrt.jar
lib\cglib\cglib-nodep-2.1_3.jar

�塢spring+Jdbc����
��Ҫ����Դ�ļ� lib\jakarta-commons\commons-pool.jar��lib\jakarta-commons\commons-dbcp.jar
1��spring�ļ� ��

dist\spring.jar��
 lib\jakarta-commons\commons-logging.jar
2��jdbc�����ļ� mysql**** sql*** ��
����tx�����ռ�
<tx:annotation-driven transaction-manager=""/>
������ע��Ľ�����

����spring2.5+hibernate3.3+struts1.3


��1����hibernate���İ�

hibernate3.jar
lib\required\*.jar
lib\optional\ehcache-1.2.3.jar (���������ļ�)
hibernateע���
lib\test\slf4j-log4j12.jar

��2����spring��
dist\spring.jar
lib\jakarta-commons\commons-logging.jar ��commons-pool.jar��commons-dbcp.jar(��Ϊ����Դ�ļ�)
dist\modules\spring-webmvc-struts.jar (��struts1�ļ���)
lib\aspectj\aspectjweaver.jsr �� aspectjrt.jar (Aop�ļ�)
lib\cglib\cglib-nodep-2.1_3.jar     (Aop�ļ�)
lib\j2ee\common-annotations.jar     (ע���ļ�)
lib\log4j\log4j-1.2.15.jar      

��3����sturs1.3.8
���齫jstl-1.0.2.jar��standard-1.0.2.jar�ļ�����Ϊ1.1�汾 ��ʱJSTL�ļ�
����spring�Ѵ���antlr-2.7.6.jar�ļ����Խ�struts�е�antlr-2.7.6.jar�ļ�ɾ�������ͻ

���ݿ�����
mysql*** sql****��������

�����web����ʵ��spring����
���ļ���web.xml......

���action������������path(Struts�������ļ�)��name(Spring�����ļ�)Ҫһ��
��������struts�������ļ����һ��������

springΪstruts1.3�����������
��web.xml����һ��filter

�ߡ�spring2.5+hibernate3.3+struts2���Ͽ���


struts2�ļ�lib�������в���-plugin��β��jar�ļ���������struts2-spring-plugin-2.0.11.1.jar