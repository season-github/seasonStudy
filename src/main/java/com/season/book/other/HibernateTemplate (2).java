package com.season.book.other;

public class HibernateTemplate {
/**
 * 
 * 
 * HibernateTemplate:Hibernate操作的模板

简化对增删改的操作

不用自己打开,关闭session

事务的提交,回滚不用自己 了

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
HibernateTemplate中常用的方法
find(string querystring)返回List
save(object)  返回serializable
update(object)无返回值
delete(object)无返回值
get(Class entityclass,serializable id)返回object
saveOrUpdate(object)无返回值类型
setMaxResult(int maxResult)无返回值类型   设置结果集的最大行数









没写一个dao就要在改dao中写一个hibernateTemplate属性，有没有简单的方法？
可以将hibernateTemplate定义在一个工具类中，然后每个dao继承这个工具类就可以
public class BaseUtil {
	
	protected HibernateTemplate hibernateTemplate;
	
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
在dao中
@Repository("gradeDao")
public class GradeDao extends BaseUtil{
	
	
	
	public void a(){
		Grade grade = new Grade();
		grade.setGradename("封装ht");
		System.out.println(this.hibernateTemplate.save(grade));
	}
	
	public static void main(String[] args) {
		ApplicationContext ac =
		new ClassPathXmlApplicationContext("applicationContext.xml");
		GradeDao gradeDao = (GradeDao)ac.getBean("gradeDao");
		gradeDao.a();
	}
	
}

 * 
 * 
 */
}
