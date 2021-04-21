package com.season.book.other;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.User;

public class Test {

	public static void main(String[] args) {
		//使用hibernate
		//1.加载hibernate主配置文件
		Configuration config=new Configuration().configure("hibernate-config.xml");
		//2.创建会话工厂
		SessionFactory factory=config.buildSessionFactory(); // factory线程安全
		//3.创建会话
		Session session=factory.openSession(); // 会话线程不安全，所以在使用的时候，每个线程都需要创建新的，设计架构的时候可以考虑使用ThreadLocal存放
		//4.创建事务
		Transaction ts=session.beginTransaction();
		try {
			//5.具体操作
			//增加一个用户
			User u=(User)session.get(User.class, 7);
			//u=(User)session.load(User.class, 7);
			u.setUname("张三");
			//session.saveOrUpdate(u);
			ts.commit(); // 6.提交事务
		} catch (HibernateException e) {
			e.printStackTrace();
			ts.rollback(); //回滚事务
		} finally {
			session.close(); //7.关闭链接
		}
	}

}
