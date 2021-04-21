package com.season.book.other;

public class HibernateCallback {
/**
 * HibernateCallback
 * 
 * ʹ��HibernateCallbackʵ���Զ��幦��

HibernateTemplate��Hibernate��sessionʵ���˷�װ�����˶�dao��Ŀ�������ʧȥ�˶�session������ԣ���ʵ��һЩ���⹦����HibernateTemplate���޷�����ˡ�Ϊ�˽����ЩΪ��spring�ṩ��HibernateCallback�ӿڡ�HibernateTemplate���ṩ��һЩ�����͸Ľӿ����
һ�·�����HibernateTemplate�ķ���
Public Object execute(HibernateCallback action)throws DataAccessException:�÷�����һ��ͨ�õ�ִ�лص����ܵķ���

Public List executeFind(HibernateCallback action)throws DataAccessException:�÷�������List��������ʺ�ִ�в�ѯ

@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Student> getStudents(final Integer hangshu,final Integer yeshu){
		List<Student> students =  getHT().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				String hql = "from Student stu inner join fetch stu.grade";
				Query query = session.createQuery(hql);
				query.setMaxResults(hangshu);
				query.setFirstResult((yeshu-1)*hangshu);
				return query.list();
			}
		});
		return students;
	}
ע������б��е�ֵΪfinal���εĳ���

public List<Grade> getgrades(final String str){
		
		List<Grade> grades = getHT().execute(new HibernateCallback() {

			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				String hql="from Grade g inner join fetch g.students where g.gradename like :gradename";
				Query query = session.createQuery(hql);
				query.setParameter("gradename", "%"+str+"%");
				List<Grade> grades = query.list();
				return grades;
			}
		});
		return grades;
	}


 * 
 */
}
