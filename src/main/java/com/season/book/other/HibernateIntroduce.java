package com.season.book.other; /**
 * 加载hibernate.cfg.xml
 * Configuration cfg=new Configuration（）.configure();
 * 
 * Session数据库连接对象
 * save，update，delete，get  load	saveorupdate merge
 * 	增删改需要事务提交（Transaction）	
 * 
 * 	对象状态:
 * 		瞬时(内存中新建的)							delete
 * 		持久(调用save等持久化方法,Session未关闭)		get save update	
 * 													saveorupdate(了解,参数是持久化对象) 
 * 													merge(了解)(却别于前面的有返回值,返回值是持久化对象,之前传入的只是模版)
 * 													saveorupdate merge:仅对自己写主键好使assigned
 *				做东西时,持久化了,改东西,要全写上值,不然为空(有变得,那就全改了)
 *
 * 		脱管（游离 持久化方法 ----> Session关闭）
 * 
 * 		1.新建的  new的是瞬时,内存中存在,对数据库没任何关系的
 * 
 * 		2.Session中调用持久化方法,持久
 * 			拿回来之后,就是持久状态
 * 			进入持久状态,不关闭Session,就一直在联动,除了删除(这时跟数据库没任何关系)
 *
 * 		3.游离状态	0
 * 
 * -----------------------------------------------
 * 	注意:
 * 		事务提交
 * 		Session关闭的时间
 * -----------------------------------------------
 * 
 * 
 * ----如果是native sequence 会先查询序列号
 * 
 * hibernate.cfg.xml文件		进行数据库参数配置引用hbm文件
 * hibernate.hbm.xml文件		进行对象关系映射配置(orm框架)
 * 
 * 类---表的映射
 * 属性--列的映射
 * class ，id，property，set，many-to-one
 * 			标签的name属性值都是属性名
 * column                  标签的name属性名都是列名
 * 
 * 一般使用java类型，也可是hibernate类型
 * 	type 属性对应的都是属性类型
 * 	class属性对应的都是属性类型
 * 
 * 主键属性：
 * 主键生成策略assigned（人工添加主键，（保存对象时主键属性必须有值)
 * native（数据库本地自动生成主键）
 * <id name="属性名" type="属性类型">
 * 	<column name="列名"/>
 * 	<generator name="assigned"></generator>
 * 	<generator name="native">
 * 	 <param name="sequence">序列名</param>
 * 	</generator>
 * </id>
 * 一般属性：
 * <property name="属性名" type="属性类型">
 * 	<column name="列名"/>
 * </property>
 * 
 * 外键对象属性：
 * 多的一方配置一的一方的属性 Emp类中有dept属性
 * <many-to-one name="一的一方的属性名" 
 * 		class="一的一方包名+类名" >
 *   <column name="外键列名"  />
 *   </many-to-one>
 *   
 *   外键集合属性：
 *   一的一方配置 多的一方的属性  Dept类中有 Set<Emp> emps
 * <set name="多的一方的属性名" >
 *             <key>
 *                           <column name="外键列名"/>
 *                                      </key>
 *                                                <one-to-many class="多的一方包名+类名" />
 *     </set>
 *
 * 一般设置在set集合中：
cascade 级联save-update  delete  all
inverse 维护外键关系反转给多的一方（由多的一方维护外键关系）
 cascade="all" inverse="true"		lazy(延时加载)

互存对方对象：
 一的一方.get集合（）.add(多的一方的对象)
 多的一方.set一的一方（一的一方对象）
 * 
 * ------------------------------------------------------------------------------------------------
 * 延时加载:lazy(查询)能提高查询效率,性能,只能缓解一部分压力(用syso("---------")区分下)
 * 		update默认延时加载
 * 		是用get load 方法时 需要用到
 * 			类查询
 * 			主外键查询(主表查询(是否要把子表插叙))
 * 
 * 		Session session =HibernateSessionFactory.getSession();
 * 		Dept d = (Dept)session.get(Dept.class,70);
 * 		syso("----------------------");
 * 		syso("d.getDname()");
 * 		syso("d.getDeptno()");
 * 		syso("----------------------");
 * 		session.close();
 * 
 * 		load 延时			找不到(没数据)报异常			关早了,相当于什么也没做	Hibernate.initialize(d);(吃饱了撑的)
 * 		get	不延时		找不到(没数据)得到null		没毛病
 * 		lazy="false" 延时上面就没区别了	load毛病多,一般用 get
 * 
 * 延时加载用的是代理,在Session未关闭之前查
 * 这里延时没多大用处,你要查,延时不延时没区别
 * 
 * 集合加载(用处大些)		查主表一般不查子表
 * 							查子表一般查主表
 * 		查部门不会查员工的
 * 			想要员工,再查一次	d.getEmps();
 * 		Hibernate.initialize(d.getEmps().size());
 * 		session.close();
 * 		syso
 * 
 * 		1.延时加载去掉	2.Session后关闭		3.Hibernate初始化
 * 
 * 
 * 
------------------------------------------------------------------------------
 * 
自动生成hibernate   然后自己手写一下,    看看区别

Session 是hibernate.Session
增删改用的是    跟查是不一样的

序列那里不能用bigdecimal  不信可以试试		assigned人工存就无所谓了

小写大写short是可以自动转换的

学生跟老师,学生好认老师 , 老师不好认学生
	   多的一方设置	```一的一方设置
				里面没外键要一个一个认

所以维护外键关系要反转

casecade="all" inverse="true"(维护关系不给级联,反转给多的一方)关系反转,外键就不能加上了.
emp.setDept(dept);	多的一方维护关系    不加这一句就没有外键 了

casecade级联必须加	做级联,把对方放在自己里面
如果不加inverse,由一的一方维护关系,会多几个update语句
如果外键不允许为空,1的一方维护就彻底错了

将外键维护,反转给多的一方

级联保存,级联删除

删除时,只要有非空 会报错的 , 
1  notnull  删了
2  把那个名字加上	这里只需要让名字不是空就行

casecade inverse 写在set上面	写在一的一方,所以反转给多的一方,由多的一方维护关系

互存对方对象:维护关系,反转(对不对?)



 *
 */
/**
 * HQL查询
 * 
 * 不让直接用对象 select d.dname from.....
 * 真的吗?试一下
 * 加上d.deptno
 * 	
 * 		1.区分大小写:类名,属性名,参数名,'值'
 * 				Dept deptno '值'
 * 		` 关键字不区分大小写:
 * 				select from where group  having order 聚合函数
 * 		
 * 		2.from 类名
 * 		
 * 			投影:(显示哪些列)
 * 				select 属性,属性 from 类
 * 					return:List<Object[]>
 * 				select new 类(属性,属性) from 类
 * 					return:List<类>
 * `			不在映射文件上的属性,不会影响数据库,eg.empsSize
 * 			条件:(显示哪些行)
 * 				传参方式:	1.?	设置时从0开始
 * 									from 类 where 属性 like ?
 * 	
 * 							2.:参数名	设置时根据参数名设置
 * 									from 类 where 属性 like :参数名	
 * 
 * 							3.对象	沿用上面参数名(参数名,和对象的属性名一致)	
 * 									from 类 where 属性 like :对象属性名(只有这样才能找到,传参)
 * 
 * 				模糊查询在set传值(设置值)时添加通配符
 * 										like ?
 * 										Query q 
 * 										q.setString(0,"%S%");
 * 
 * 				hql="from Dept where deptno=?"	hibernate 从0开始(跟java相关)
 * 
 * 	where 1=1 ....and.....防止后面条件为空
 * 	专门做一个对象ConditionDept extends Dept 自己加上多的条件
 * 	可以创建一个方法,生成HQL语句
 * 
 * 
 * HQL不能写*
 * session.createQuery(hql).list();/.uniqueResult();
 * fetch得到的是一个对象不是2个或多个 Emp e inner jion fetch e.dept.d
 * 		把后面对象塞到前面对象中
 * 
 * ------------------------------------------------------------------
 * 多条件查询:
 * 
 * 聚合函数,排序,分页,关联查询,连接查询,子查询
 * 
 * 聚合函数
 * 		avg(属性名),count(属性名/类的别名),max(属性名),min(属性名)
 * 					若不想用属性名,又不能用*,可以用类的别名(不是表的)
 * 		group by 对象.属性
 * 
 * 排序
 * 			hql="    order by 属性名 desc";
 * 
 * 	
 * 分页
 * 			使用Query方法
 * 				q.setFirstResult(3);//起始记录数（页数-1）*条数
				q.setMaxResults(3);//每页条数
 * 			
 * 关联查询
 * 
 * 连接查询	----查询多的一方使用
 * 		from 类 别名 inner join 别名.关联属性
 * 		结果是:List<Object[]>	一行是两个对象
 * 
 * 		from 类 别名 inner join fetch 别名.关联属性
 * 		结果是:List<类>
 * 		注意:
 * 			join后面是 from 后类的关联属性
 * 			使用带关联的聚合分组时:不要使用fetch
 * 		
 * 
 * 子查询
 * 本地sql
 * 命名查询
 * 
 * 
 * 
 * Query方法:
 * 		List list = q.list();多行数据
 * 		Object obj= q.uniqueResult();//一行数据	得到的是一行数据,就是数据,是对象就是对象,多个就是Object数组
 * 		q.setFirstResult((页数-1)+条数);
 * 		q.setMaxResults(每页条数);
 * 		
 */
		

public class Introduce {

}
