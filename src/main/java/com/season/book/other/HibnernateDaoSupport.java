package com.season.book.other;

public class HibnernateDaoSupport {
/**
 * 
 * 
 * ���Խ�dao�����̳�һ��HibnernateDaoSupport��
extends HibernateDaoSupport
��������������������
setSessionFactory(sessionFactory)
this.getHibernateTemplate()
����
public class Grade2Dao extends HibernateDaoSupport
��ΪGrade2Dao�̳�HibernateDaoSupport������Grade2Dao��Ҳ��������ķ�������ʹ�õ�ʱ��ʵ������Ҫ��sessionFactoryע�뵽ָ����dao��
���£�
<bean class="dao.Grade2Dao" id="grade2Dao">
  	<property name="sessionFactory" ref="sessionFactory"></property>
  </bean>
��ȻHibernateDaoSupport����HibernateTemplate����ô��ʹ�õ�ʱ�����ʹ��HibernateTemplate���еķ���
System.out.println(this.getHibernateTemplate().save(grade));

ÿ��dao��ķ����̳�һ��HibernateDaoSupport��Ҫ����һ��bean
��û�м򵥵ķ�����

 * 
 * 
 */
}
