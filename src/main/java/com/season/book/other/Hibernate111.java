package com.season.book.other;

//one

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import util.Dept;
import util.Emp;
import db.HibernateSessionFactory;

/**
 * 	Criteria��ѯ����(��׼��ѯ)
 * 				���session	SessionFactory.getSession();
 * 				Hibernate��Session�Ǻ���
 * 				ion ����������
 * 				û�漰����ɾ��
 * 
 */


/**
* 1.��ѯ����
* 		Criteria criteria=session.createCriteria(Emp.class);
* 
* 		List<Emp> emps =  criteria.list();	��ò�ѯ����ļ���
* 
* 
* 
* 
* 2.����������ѯ
* 		Restrictions�����Ƶ���˼  ���Ǹ���̬��
* 		��һ�����������ԣ��ڶ�������������	
* 		eq equals
* 
* 		Restrictions.eq("dept.deptno",10); 
* 
* 		Criteria criteria = session.createCriteria(Emp.class);
* 
*		Criterion criterion = Restrictions.eq("dept.deptno", 1);
* 
* 		criteria.add(criterion);
* 		List<Emp> emps =  criteria.list();
* 
* 
* 
* 
* 3.	��д��ʽ---����һ��д
* 		List<Emp> emps =  session.createCriteria(Student.class).add(Restrictions.eq("grade.gradeid", 1)).list();
* HQL��CriTERIA֧�ֵıȽ�����
* 		HQL�����	Criteria���㷽��							˵��
* 
* 		=			Restrictions.eq(propertyName, value)   	����
* 		<>			Restrictions.ne(propertyName, value)   	������
* 		>			Restrictions.gt(propertyName, value)   	����
* 		>=			Restrictions.ge(propertyName, value)   	���ڵ���
* 		<			Restrictions.lt(propertyName, value)   	С��
* 		<=			Restrictions.le(propertyName, value)  	С�ڵ���
* 		Is null		Restrictions.isNull(propertyName)   	��ֵ
* 
* 		Is not null	Restrictions.isNotNull(propertyName)   	�ǿ�
* 
* 
* 
* 
* 4.�������
* 		�������ion����
* 
* Criteria criteria = session.createCriteria(Emp.class);
* 
* Criterion criterion1 = Restrictions.eq("grade.gradeid",1);
* Criterion criterion2 = Restrictions.eq("name", "ss");
* 
* criteria.add(criterion).add(criterion2);
* 
* List<Emp> emps =  criteria.list();
* 
* 
* 
* 
* 5:��Χ����   
* 				in(7935,7957,7521)	����÷�װ������,����������
* 				not in
* 				between
* 				not between
* 
* 6:ģ����ѯ
* 
*	propertyName:����
*	value������
*	matchMode���ַ���ģʽƥ�� ������ģ�ͣ� 
*	MatchMode.START  ��ʲô��ͷ  %s
*	MatchMode.END   ��ʲô��β   s%
*	MatchMode.ANYWHERE  ����ʲô��  %s%
*	MatchMode.EXACT ��ȷƥ��   
*    	 
*	Criterion criterion = Restrictions.like("name", "s",MatchMode.ANYWHERE);
*    
*	Criterion criterion = Restrictions.ilike("name", "s",MatchMode.ANYWHERE);
*
*
*
* 	ע��like��ilike������
* 		ilike���Ժ���Ӣ�ĵĴ�Сд
* 
*/


public class EmpDao {
	/**
	 * ��ѯ����Ա����
	 * 
	 * 1.	��ѯ����
	 * Criteria criteria=session.createCriteria(Emp.class);
	 * 
	 * List<Emp> emps =  criteria.list();	��ò�ѯ����ļ���
	 */
	@SuppressWarnings("unchecked")
	public void a(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria  = session.createCriteria(Emp.class);
		
		List<Emp> emps = criteria.list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
	}
	
	/**
	 * ����������ѯ
	 * ��ѯdeptno=10��Ա����Ϣ
	 * 
	 * propertyName:������
	 * value:��ѯ����
	 * Criterion:��������
	 */
	public void b(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class);
		
		Criterion criterion = Restrictions.eq("dept.deptno", 10);
		
		criteria.add(criterion);
		
		List<Emp> emps = criteria.list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
	}
	
	/**
	 * ��д��ʽ
	 * ������һ�仰д����
	 */
	public void bb(){
		
		Criteria criteria = HibernateSessionFactory
				.getSession()
				.createCriteria(Emp.class)
				.add(Restrictions.eq("dept.deptno", 10));
		
		List<Emp> emps = criteria.list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
	}
	
	/**
	 * ��������ѯ
	 */
	public void c(){	
		List<Emp> emps = HibernateSessionFactory
				.getSession()
				.createCriteria(Emp.class)
				.add(Restrictions.eq("dept.deptno", 10))
				.add(Restrictions.gt("empno", 7800))
				.list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
	}
		
	/**
	 * ��Χ��ѯ	
	 */
	public void d(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class);
		/**
		 * propertyName	������
		 * values		����/����
		 */
		Criterion criterion = Restrictions.in("empno",new Object[]{7935,7957,7521});
		Criterion criterion2= Restrictions.not(criterion);
		Criterion criterion3= Restrictions.between("empno", 7500, 7900);
		Criterion criterion4= Restrictions.not(criterion3);
		
		List<Emp> emps = criteria.add(criterion).list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
		System.out.println("------------------------------------");
		for (Emp emp : (List<Emp>)criteria.add(criterion2).list()) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
		System.out.println("------------------------------------");
		for (Emp emp : (List<Emp>)criteria.add(criterion3).list()) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
		System.out.println("------------------------------------");
		for (Emp emp : (List<Emp>)criteria.add(criterion4).list()) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
	}
	
	/**
	 * ģ����ѯ
	 *
	 * 6:ģ����ѯ
	 * 
	 *		propertyName:����
	 *		value������
	 *		matchMode���ַ���ģʽƥ�� ������ģ�ͣ� 
	 *			MatchMode.START  ��ʲô��ͷ  %s
	 *			MatchMode.END   ��ʲô��β   s%
	 *			MatchMode.ANYWHERE  ����ʲô��  %s%
	 *			MatchMode.EXACT ��ȷƥ��   
	 *    	 
	 *		Criterion criterion = Restrictions.like("name", "s",MatchMode.ANYWHERE);
	 *    
	 *		Criterion criterion = Restrictions.ilike("name", "s",MatchMode.ANYWHERE);
	 *
	 * 		ע��like��ilike������
	 * 			ilike���Ժ���Ӣ�ĵĴ�Сд
	 */
	public void e() {
		Criteria criteria = HibernateSessionFactory.getSession().createCriteria(Emp.class);
		
		Criterion criterion = Restrictions.ilike("ename", "s", MatchMode.ANYWHERE);
		
		List<Emp> emps = criteria.add(criterion).list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
	}

	/**
	 * 7���߼�����  and  or not
	 * 		Where id=? And/or name=? 
	 * 		Criterion criterion = 
	 * 		Restrictions.and
	 * 		(
	 * 			Restrictions.like("name", "ss",MatchMode.ANYWHERE), 
	 * 			Restrictions.eq("grade.gradeid", 1)
	 * 		);
	 * 
	 */
	public void f() {
		Criteria criteria = HibernateSessionFactory.getSession().createCriteria(Emp.class);
		
		Criterion criterion =Restrictions.or(
				Restrictions.ilike("ename", "s", MatchMode.ANYWHERE),
				Restrictions.eq("dept.deptno", 10)
				);
		
		Criterion criterion1 =Restrictions.not(criterion);
	
		List<Emp> emps = criteria.add(criterion).list();
		for (Emp emp : emps) {
			System.out.println(emp.getEmpno()+"\t"+emp.getEname());
		}
		System.out.println("------------------------------------------");
	}
	
	/**
	 * 
	 * 8:��������
	 * 		isEmpty  isNotEmpty
	 * 
	 * ��ѯû��ѧ�����꼶
	 * Criteria criteria = session.createCriteria(Grade.class);
	 * Criterion criterion = Restrictions.isEmpty("students");
	 * 
	 * isEmpty()�Ĳ�������Ϊĳ����ļ������ԣ�
	 * 
	 * ��hibernateָ����һ��һ��
	 * ����1	Ա����
	 * �༶1	ѧ����
	 */
	public void g() {
		//sql���õ����Ӳ�ѯ
		Criteria criteria = HibernateSessionFactory.getSession().createCriteria(Dept.class);
		Criterion criterion = Restrictions.isEmpty("emps");
		Criterion criterion2= Restrictions.isNotEmpty("emps");
		
		List<Dept> emps = criteria.add(criterion).list();
		for (Dept emp : emps) {
			System.out.println(emp.getDeptno()+"\t"+emp.getDname());
		}
		System.out.println("------------------------------------------");
		emps = criteria.add(criterion2).list();	//������,��hibernate��bug?
												//û����,��add��2 ��
		for (Dept emp : emps) {
			System.out.println(emp.getDeptno()+"\t"+emp.getDname());
		}
		System.out.println("------------------------------------------");
		
		
		
	}
	
	
	/**
	 * 9����̬��ѯ
	 * Criteria criteria = session.createCriteria(Student.class);
	 * if(student!=null){
	 * if(student.getName()!=null && student.getName().length()>0){
	 * criteria.add(Restrictions.like("name", student.getName(),MatchMode.ANYWHERE));
	 * }
	 * if(student.getSex()!=null && student.getSex().length()>0){
	 * criteria.add(Restrictions.eq("sex", student.getSex()));
	 * }
	 * if(student.getGrade()!=null && student.getGrade().getGradeid()>0){
	 * criteria.add(Restrictions.eq("grade.gradeid", student.getGrade().getGradeid()));
	 * }
	 * }
	 * 
	 */
	private void h(Emp emp) {

	}

/**

10������
Criteria criteria = session.createCriteria(Student.class);
criteria.add(Restrictions.eq("grade.gradeid", 1));
/**
* addOrder��Criteria�ķ������������ʱ��Ҫ����������ڲ�ѯ����֮��
* addOrder�����еĲ�����org.hibernate.criterion.Order���͵Ĳ�����������       desc��asc
* desc��asc�Ĳ����з��õ���������

		List<Student> list = criteria.addOrder(Order.desc("id")).list();
		
		*/
	/*public void i (){
		Criteria criteria = HibernateSessionFactory.getSession().createCriteria(Emp.class);
		criteria.addOrder(Order.desc("empno"));
		criteria.add(Restrictions.eq("grade.gradeid", 1));
		
		List<Dept> emps = criteria.add(criterion).list();
		for (Dept emp : emps) {
			System.out.println(emp.getDeptno()+"\t"+emp.getDname());
		}
		System.out.println("------------------------------------------");
		
		
	}*/
	
	
/**
11����ҳ
//�ӵڼ��п�ʼ��ʾ
criteria.setFirstResult((yeshu-1)*hangshu);
//ÿҳ��ʾ������
criteria.setMaxResults(hangshu);

*/
	public void j(Integer yeShu , Integer hangShu) {
		Criteria criteria = HibernateSessionFactory.getSession().createCriteria(Emp.class);
		
		criteria.setFirstResult(hangShu);
		criteria.setMaxResults((yeShu-1)*hangShu);
		criteria.addOrder(Order.desc("empno"));
		
		List<Dept> emps = criteria.list();
		for (Dept emp : emps) {
			System.out.println(emp.getDeptno()+"\t"+emp.getDname());
		}
		System.out.println("------------------------------------------");
		
		
	}
	
	
/*	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setEname("t");
		emp.setMgr(1000);
		
		Dept dept = new Dept();
		dept.setDeptno(30);
		
		emp.setDept(dept);
		//new EmpDao().h(emp);
		
		//new EmpDao().j(4, 4);
		
		new EmpDao().aaa(7499);
		
	}
*/
	
	
/**

12����ѯΨһ���
uniqueResult();


*/
	public void aaa(Integer empno){
		Criteria criteria = HibernateSessionFactory.getSession().createCriteria(Emp.class);
		Emp emp =(Emp)criteria.add(Restrictions.eq("empno", empno))
								.uniqueResult();
		System.out.println(emp.getEmpno()+"\t"+emp.getEname());
	}
	
	
	
/**

13�����Ӳ�ѯ  ���ϲ�ѯ

��һ�������ӣ�createCriteria("�������������")		�Ź���������
//��������ַ������������Ӳ�ѯ�����Ȳ�ѯ�õ�һ���࣬Ȼ����������Ĳ�ѯ����
Criteria criteria = session.createCriteria(Student.class);
criteria.add(Restrictions.eq("name", "ss"));
//��ɶ������Ĳ�ѯ�﷨�����Ҫ������һ�����Ҫcriteria.crieateCriteria()�����������������ԣ�Ȼ�������ӵķ�ʽ���������Ĳ�ѯ����
criteria.createCriteria("grade")
.add(Restrictions.eq("gradeid", 1));
���صõ��ļ����Ըտ�ʼ��ѯ�õ�����Ϊ��׼


�ڶ��������ӣ�
Criteria criteria = session.createCriteria(Grade.class, "g");	//����
criteria.createAlias("students", "stu");	//��������
List<Grade> list = criteria.list();
Set<Grade> grades = new HashSet<Grade>(list);
������ظ���ֵ�Ͱ�list���Ϸ��뵽set������ȥ


����������
Criteria criteria = session.createCriteria(Grade.class, "g");
criteria.setFetchMode("students", FetchMode.JOIN);

*/
	public List<Emp> l(){
		Session session = HibernateSessionFactory.getSession();
		
		/**
		 * ���Լ���2�ű�,д����
		 */
		Criteria criteria = session.createCriteria(Emp.class, "e");//����Ϊ��׼
		criteria.createAlias("e.dept", "d");
		
		
		
		/**
		 * �������
		 */
		criteria.add(Restrictions.ilike("e.ename", "t", MatchMode.ANYWHERE));
		criteria.add(Restrictions.eq("d.dname", "SALES"));
		List<Emp> emps = criteria.list();
		
		
		
		
		session.close();
		return emps;
	}
	
/*	public static void main(String[] args) {
		for (Emp emp : new EmpDao().l()) {
			System.out.println(emp);
		}
	}*/
	
	
	/**
	 * ֮ǰ���һ�������ٵ�һ��	���õ�һ��һ����Ϣ
	 * һ�����϶��			�����õ����	����fetch(����)����	���ܼӱ���
	 * 
	 * �����ظ���ʱ��,�Ǿ���set���·�װ
	 * Set<dept> sets = new hashSet<dept>(new DeptDao().method());
	 * 
	 * �������Ƽ����ĵ��ڶ���
	 * ֻ����������
	 * 
	 */
	public List<Dept> li(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Dept.class, "d");//����Ϊ��׼
		criteria.createAlias("d.emps", "e");
	
//		criteria.add(Restrictions.ilike("e.ename", "t", MatchMode.ANYWHERE));
//		criteria.add(Restrictions.eq("d.dname", "SALES"));
		List<Dept> emps = criteria.list();
		
		session.close();
		return emps;
	}
	/*
		public static void main(String[] args) {
		for (Dept emp : new EmpDao().li()) {
			System.out.println(emp);
		}
	}
	
	
	*/

/**
 * 14:ͶӰ
 * 
 * �õ��������ݣ�����ֵΪ���е��������ͼ���
 * Criteria criteria = session.createCriteria(Student.class);
 * List<String> list = 
 * setProjection��������ͶӰ�У��÷��������Ҫ�õ�һ���о���
 * Property.forName("") ��������еĲ���ΪҪ��Ҫ��������
 * criteria.setProjection(Property.forName("name")).list();	forname��ȡ����
 * 
 * �õ���������
 * criteria.setProjection(
 * 		Projections.projectionList()
 * 		.add(Property.forName("id"))
 * 		.add(Property.forName("name"))
 * );
 * 
 * projection	ͶӰ
 * 
 * 
*/
	
	public void n(){
		Session session  = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class);
		
	//	criteria.setProjection(Property b)
	}
	public void n2(){
		Session session  = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class);
		
		criteria.setProjection(Projections.projectionList()
				.add(Property.forName("empno"))
				.add(Property.forName("ename"))
				.add(Property.forName("sal"))
				);
		List<Object[]> obj = criteria.list();
		for (Object[] objects : obj) {
			for (int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]+"\t");
			}
			System.out.println();
		}
	}
	
/*	public static void main(String[] args) {
		new EmpDao().n();
	}*/
	
	
	
	/**
	 * ���оۺϺ�������projections��
	 * �õ��Ĳ�һ�������ݿ���е�  		��������
	 * 
	 * ��ͶӰ���
	 * 
	 */

	
	
/**
15���ۺϺ���  
�ۺϺ����ķ��������ڣ�Projections��
��ȡ������Projections.rowCount()
criteria.setProjection(Projections.rowCount());


���ֵ����Сֵ��ƽ��ֵ   �õ���ֵ��ʵ��һ��List<Object[]>
criteria.setProjection(
				Projections.projectionList()
				.add(Projections.max("id"))
				.add(Projections.min("id"))
				.add(Projections.avg("id"))
				);

�����ѯ   ��criteria��û��having()����
Criteria criteria = session.createCriteria(Student.class,"stu");
criteria.createAlias("stu.grade", "g");
List<Object[]> list = criteria.setProjection(
			Projections.projectionList()
.add(Projections.groupProperty("g.gradename"))
			.add(Projections.rowCount())
			).list();
for (Object[] object : list) {
	System.out.println(object[0]+"\t"+object[1]);
}				
session.close();

*/
	public static void main(String[] args) {
		
	}
	public void o(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(Emp.class, "e");
		
		criteria.createAlias("e.dept", "d");
		
		criteria.setProjection(
				Projections.projectionList()
				.add(Projections.groupProperty("d.dname"))
				.add(Projections.rowCount())
				.add(Projections.avg("e.sal"))
				.add(Projections.max("e.sal"))
				.add(Projections.min("e.sal"))		
				);
		for (Object[] obj : (List<Object[]>)criteria.list()) {
			for (int i = 0; i < obj.length; i++) {
				System.out.println(obj[i]+"\t");
				
			}
			System.out.println();
		}
				
		session.close();
				
	}		
/*				public void o(){
			Session session = HibernateSessionFactory.getSession();
			Criteria criteria = session.createCriteria(Emp.class, "e");
			
			criteria.createAlias("e.dept", "d");
			
			criteria.setProjection(
					Projections.projectionList()
					.add
					
					
					
					)
		
		
		
		session.close();
	}
 */		
	
	
	
	
	
	
	
/**
16��ʹ��DetachedCriteria  ��������
Criteria����session������
DetachedCriteria����ʱ����ҪSession����
��ʵ��Ӧ�õ�ʱ����Խ�DetachedCriteria����Ĵ�������action�У�Ȼ����action����dao�еķ���
����DetachedCriteria�����뵽dao�С�

ģ��Action:
DetachedCriteria dc = DetachedCriteria.forClass(Grade.class,"g");
dc.setFetchMode("g.students", FetchMode.JOIN);
dc.add(Restrictions.eq("g.gradename", "1510"));

Dao��
public Grade a(DetachedCriteria detachedCriteria){
//��ȡ��ִ�е�criteria
Criteria criteria = detachedCriteria.getExecutableCriteria(session);
Grade grade =  (Grade)criteria.uniqueResult();
return grade;
}

��Action�е���Dao
Grade grade = dao.a(dc);


 *
 */

}
