package com.season.book.other;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDemo {

	/**
	 * mybatis的使用：<br>
	 * 1.导入jar包<br>
	 * 2.编写mybatis-config.xml，用来配置mybatis<br>
	 * 3.编写实体类<br>
	 * 4.创建实体类对应的映射文件，取名规范：类名+Mapper.xml<br>
	 * 5.将mapper.xml文件添加到mybatis-config.xml中<br>
	 * 6.编写测试类<br>
	 */
	public static void main(String[] args) {

		String resource = "mybatis-config.xml";
		int count = 0;
		SqlSession sqlSession = null;
		try {
			// 1:读取配置文件的输入流
			InputStream is = Resources.getResourceAsStream(resource);
			// 2:创建sqlSessionFactory对象，完成对配置文件的读取
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			// 3,：创建sqlSession
			// 包含了执行sql语句的所有方法
			sqlSession = factory.openSession();
			// 调用mapper文件进行数据库操作 namespace+id 命名空间.id
			count = sqlSession.selectOne("dao.StudentMapper.count");
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/**
			 * 必须对sqlSession进行关闭
			 */
			sqlSession.close();
		}
	}

}
