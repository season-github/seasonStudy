package com.season.book.other;


public class Demo {
/**
 * mybatis
 * 
 * 
 * ��һ��������jar��
 * 
 * �ڶ�������дmybatis�������ļ�	mybatis-config.xml
 * 
 * 	<?xml version="1.0" encoding="UTF-8"?>
 * 	<!DOCTYPE configuration 							���￴������configuration
 * 	PUBLIC "-//mybatis.org//DTD Config 3.0//EN" 
 * 	"http://mybatis.org/dtd/mybatis-3-config.dtd">
 * 
 * 	<configuration>
 * 		<environments default="school">
 * 			<environment id="school">
 * 				<!--�����������   ����JDBC������Ŀ -->
 * 				<transactionManager type="JDBC"/>
 * 				<dataSource type="POOLED">
 * 					<property name="driver" value="com.mysql.jdbc.Driver"/>
 * 					<property name="url" value="jdbc:mysql://localhost:3306/school"/>
 * 					<property name="username" value="root"/>
 * 					<property name="password" value="root"/>
 * 				</dataSource>
 * 			</environment>
 * 		</environments>
 * 	</configuration>
 * 
 * �����������ݱ���ʵ��
 * 
 * ���Ĳ�������ʵ�����Ӧ��ӳ���ļ�   ȡ���淶������+Mapper.xml   �磺StudentMapper.xml
 * <?xml version="1.0" encoding="UTF-8"?>
 * <!DOCTYPE mapper  
 * PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"  
 * "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 * ���ӳ���ļ����ֽ�StudentMapper.xml������dao�����棬��ônamespace=��dao.StudentMapper��
 * <mapper namespace="dao.StudentMapper">
 * <!-- id:��sqlȡ��  resultType:�����ķ���ֵ����-->
 * <select id="count" resultType="java.lang.Integer">
 * select count(1) from student
 * </select>
 * </mapper>
 * 
 * 
 * 
 * 
 * ��д���mybatis-cfg.xml����Ҫ�������ļ������
 * 	<configuration>
 * 		<mappers>
 * 			<mapper resource="dao/StudentMapper.xml"/>
 * 		</mappers>
 * 	</configuration>
 * 
 * 
 * 
���岽����д���������
String resource="mybatis-config.xml";
int count=0;
		SqlSession sqlSession=null;
		try {
			//1:��ȡ�����ļ���������
			InputStream is = Resources.getResourceAsStream(resource);
			//2:����sqlSessionFactory������ɶ������ļ��Ķ�ȡ
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
			//3,������sqlSession
			//������ִ��sql�������з���
			sqlSession=factory.openSession();
			//����mapper�ļ��������ݿ����  namespace+id   �����ռ�.id
			count = sqlSession.selectOne("dao.StudentMapper.count");
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			/**
			 * �����sqlSession���йر�
			 *//**
			sqlSession.close();
		}
		
	�������ļ���ע���������������Ϣ
<!-- ��ȡjdbc.properties�����ļ� -->
	<properties resource="jdbc.properties"></properties>
	
	<!-- ��ӱ��� -->
	<typeAliases>
		<!-- <typeAlias alias="Student" type="entity.Student"/> -->
		<package name="entity"/>
	</typeAliases>
<!-- ����mybatis��logʵ��ΪLOG4J sql�������-->
<settings>
	<setting name="logImpl" value="LOG4J"/>
</settings>

 * 
 * 
 */
	
	
/**
 * log4j	mybatis	jdbc
 * 
 */
	
	

	
	
}
