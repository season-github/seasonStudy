package com.season.book.other;
/**
 * HibernateTemplate:Hibernate������ģ��

private HibernateTemplate hibernateTemplate;

<bean class="org.springframework.orm.hibernate3.HibernateTemplate" id="hibernateTemplate">
  	<property name="sessionFactory" ref="sessionFactory"></property>
  </bean>

@Resource(name="hibernateTemplate")
public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
}
public void a(){
	List<Student> students = hibernateTemplate.find("from Student");
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}
HibernateTemplate�г��õķ���
find(string querystring)����List
save(object)  ����serializable
update(object)�޷���ֵ
delete(object)�޷���ֵ
get(Class entityclass,serializable id)����object
saveOrUpdate(object)�޷���ֵ����
setMaxResult(int maxResult)�޷���ֵ����   ���ý�������������









ûдһ��dao��Ҫ�ڸ�dao��дһ��hibernateTemplate���ԣ���û�м򵥵ķ�����
���Խ�hibernateTemplate������һ���������У�Ȼ��ÿ��dao�̳����������Ϳ���
public class BaseUtil {
	
	protected HibernateTemplate hibernateTemplate;
	
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
��dao��
@Repository("gradeDao")
public class GradeDao extends BaseUtil{
	
	
	
	public void a(){
		Grade grade = new Grade();
		grade.setGradename("��װht");
		System.out.println(this.hibernateTemplate.save(grade));
	}
	
	public static void main(String[] args) {
		ApplicationContext ac =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		GradeDao gradeDao = (GradeDao)ac.getBean("gradeDao");
		gradeDao.a();
	}
	
}

 * @author jijie
 *
 */
public class HibernateTemplate {

}
