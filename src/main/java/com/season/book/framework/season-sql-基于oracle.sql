SQL结构化的查询语言
使用数据库,可以实现:存数据，取数据，安全，共享
--	数据库中不可能放图片,但是可以放路径哦
数据库概念：	
	数据库：
		容量大，可长久保存
		有用的准确的数据
		查询效率高
		安全，共享
	原因：
		存放数据方式：	
		    硬盘:	量大，可长久保存
					需电，依赖软件
		    光盘：保存
		    纸：保存	
		    脑子：瞬间遗忘
	数据库dbs 
		数据文件 dbf
		日志文件 ldf
	数据库管理dbms	
		客户端----服务器
		数据控制：
			存 ： 处理冗余，完整性约束
			取 ： SQL  ==== DDL，DCL，DQL，DML

words:
	user用户
	tables 表
	constraint 约束
	sequence 序列    
	view 视图
	index    索引
	procedure 存储过程
	function 函数
	trigger 触发器
	tablespace 表空间 


1.进入数据库,进行默认的操作
2.创建自己想要的用户
3.创建表空间tableapace
4.创建表,并对表结构进行操作
5.进行表内容增加,更新,删除
6.根据具体需要进行Query
	
SQL四种语言:DDL,DML,DCL,TCL
--sql: 
	--	DDL(数据定义)
		--	create	alter	drop
	--	DCL(数据控制)
		--	grant	revoke
	--	TCL(事务控制)
		--	commit	rollback
	--	DML(数据操作)
		--	select	insert	update	delete
1.DDL(Data Definition Language)数据库定义语言
	statements are used to define the database structure or schema.
	DDL是SQL语言的四大功能之一。
	用于定义数据库的三级结构,包括外模式、概念模式、内模式及其相互之间的映像,
	定义数据的完整性、安全控制等约束
	DDL不需要commit.
		
	create	创建
	ALTER	修改
	DROP	删除
	TRUNCATE
	COMMENT
	RENAME	重命名

2.DML(Data Manipulation Language)数据处理/操作语言
	statements are used for managing data within schema objects.
	由DBMS提供,用于让用户或程序员使用,实现对数据库中数据的操作。
	DML分成交互型DML和嵌入型DML两类。
	依据语言的级别,DML又可分成过程性DML和非过程性DML两种。
	需要commit.	

	select
	insert		commit
	update		commit
	delete		commit
	MERGE
	CALL
	EXPLAIN PLAN
	LOCK TABLE

3.DCL(Data Control Language)数据控制语言  授权,角色控制等

	GRANT 授权
	REVOKE 取消授权
		grant  角色||权限   to   用户
		revoke  角色||权限  from  用户

4.TCL(Transaction Control Language)事务控制语言

	SAVEPOINT 	设置保存点
	commit		提交
	ROLLBACK  	回滚
	SET TRANSACTION

SQL主要分成四部分:
(1)数据定义。(SQL DDL)用于定义SQL模式、基本表、视图和索引的创建和撤消操作。
(2)数据操纵。(SQL DML)数据操纵分成数据查询和数据更新两类。
	数据更新又分成插入、删除、和修改三种操作。
(3)数据控制。(SQL DCL)包括对基本表和视图的授权,完整性规则的描述,事务控制等内容。
(4)嵌入式SQL的使用规定。涉及到SQL语句嵌入在宿主语言程序中使用的规则



select 语句的执行顺序:
	1.分析器会先看语句的第一个词，当它发现第一个词是 select 关键字的时候，它会跳到 from 关键字，
		然后通过 from 关键字找到表名并把表装入内存。
		接着是找 where 关键字，如果找不到则返回到 select 找字段解析，如果找到 where ，则分析其中的条件，
		完成后再回到 select 分析字段。最后形成一张我们要的虚表。
	2.where 关键字后面的是条件表达式。条件表达式计算完成后，会有一个返回值，
		即非0或0，!0 true		0	false
		同理 where 后面的条件也有一个返回值，真或假，来确定接下来执不执行 select.

由 exists 想到了 where 后面可以先运行,所以呢,可以在 where 里面加上 emp.deptno=dept.deptno

----------------------------具体用户----------------------------------------
	表：存放数据的基本单位  
	行：一个实体的数据
	列：组成表的结构
----------------------------数据类型:---------------------------------------
	数字：number（数位，小数位），
	文字：char、varchar2(长度)、nchar、nvarchar2 ，
	日期：date、timestamp
----------------------------------------------------------------------------
一张表其实就相当于一个集合，每一行是集合的一个元素
集合:	
		无序性	唯一性
		交集	并集	乘	减
设计表遵循的3大范式
1．第一范式(确保每列保持原子性)
第一范式是最基本的范式。如果数据库表中的所有字段值都是不可分解的原子值，就说明该数据库表满足了第一范式。
2．第二范式(确保表中的每列都和主键相关)
也就是说在一个数据库表中，一个表中只能保存一种数据，不可以把多种数据保存在同一张数据库表中。
3．第三范式(确保每列都和主键列直接相关,而不是间接相关)
每一列数据都和主键直接相关，而不能间接相关。



1.建表（关键字create）
2.给列添加约束条件
3.增删改查表中的信息
4.建序列并用序列去维护主键
5.模糊查询（in;between;like ‘%_’）
6.聚合函数（count；max；min；avg；sum）
7.排序（order by） 组合（group by）
8.数据合并（union；union all；minus；intersect）
9.表连接（交叉连接 cross join；内连接 inner join；外连接left join；right join；full  join；）
10.子查询：
	a.查询结果做条件
	b.查询结果做列
	c.查询结果做表
	d.带关联的子查询
11.列的数据类型（number；varchar2()；date）
12.常用函数nvl(v1,v2)；to_char()；to_date()
13.建表空间；建用户；导入导出表结构、数据；分配权限（grant）



-----------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------
	--create	数据对象  名字
	--alter		数据对象  名字
	--drop		数据对象  名字
	--	表空间
		create tablespace mybookdb
			datafile 'C:\book.dbf'
			size 5M;
		drop tablespace mybookdb;

	--	用户
		create user mybook 
			identified by 123
			default tablespace mytbs;
	--	权限
		--	当前用户必须拥有的权限才能分配	分配其他用户的表需要使用 用户名.表
		--角色connect,resource,dba,具体权限
		--授予 
    		grant quanxian to userName ;
		--回收 
    		revoke quanxian from userName ;
    		grant connect,resource to userName;
   			grant select on test  to scott;
	--	表
		create table book
		(
 		    id number,
  		    name varchar2(20),
  	    	price number(10,2),	--	共10位,其中2位是小数,那么整数8位
  	 	    publishDate date,
 	 	    btypeid  number 
		);
		
	--	序列
		create sequence sq_tableName
		[start with n] 
		[increment by n]
		[maxvalue n|nomaxvalue]
		[cycle|nocycle]
		[cache  n|nocache] ;
		--当前序号 
		sq_name.currval

		--下一个序号 
		sq_name.nextval
		
		--删除序列
		drop sequence sq_name;

	--	约束条件	主键 外键 检查约束
		alter table 表名
			add constraint pk_表名_主键列  primary key(主键列);

			add constraint ck_表名_列名 check(条件);

			add constraint fk_表名_外键表名
				foreign key(外键列) references 外键表(外键在表中的列名);
		--	constraint	constraints	貌似都行哩

	--	创建视图view,但是我不知道作用是什么
		create view myView as select empno,ename,sal from scott.emp;
		select * from myView;
	--	插入语句 insert
       	insert into 表名(列名，列名，...)
       		values(值，值，...)


----------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------


1.准备工作(DDL、DCL)
	#1....DDL-数据定义语言
		create（创建）对象 +名字
		alter（添加）
		drop（删结构 ）

	1.创建表空间tableapace（在c盘的database下就会看到pet.dbf）
		create tablespace pet
		datafile 'c:/database/pet.dbf'---datafile数据文件
		size 10M;---空间大小
	2.创建用户jijie（identified 识别、确认;default默认）
		create user jijie identified by 123
			default tablespace pet;
			--(此时还不能登录用户-jijie,会显示privilege-无权限)
			--因为这时候还没分配权限

	#2.....DCL-数据控制语言 grant revoke
		给用户分配权限connect（访客）,resource（可靠角色）,sysdba（grant授予 ）
		grant connect,resource to jijie;
			--分配完权限后就可以登录user jijie了
			--创建表空间,创建用户,分配权限:都要在system下进行(只有,自己有才能做)

	#3....补充:权限的转移
		将权限 scott.emp 分配给用户jijie
			grant select on scott.emp to jijie;		
			select * from scott.emp;--	就可以在用户jijie下查询Scott的表emp
		把别人的表导入当前用户
			create table emp as select * from scott.emp;
			--	这时候得是在自己用户里面,因为得创建在我那里啊,还有之前得有select权限
		把别人的表导入自己内已经存在的表（外键关系不会导进来）   
			insert into student(id,name,born)
				select empno,ename,hiredate from scott.emp; 
		--因为主外键关系,你得有多个表,你不一定有所有表

2.开始工作
	1.create table jijie_table();							--创建一个表
	2.alter table 											--对表中的列进行操作
	3.alter table tableName add constraint constraintName	--添加约束
	4.create sequence seq_student start with 1 increment by 1 cache 10;
															--添加序列
	5.	drop tablespace jijiespace contents and datafiles;
		alter table Student drop column sex;
		alter table Student drop constraint pk_student_id;
		drop table Student;
		drop user jijie cascade;
		revoke connect,resource from jijie;

	1.创建Student表，（）中写的是表Student的结构
		create table Student (
			id number(4),
			name varchar2(20), --not null,--作为主键必填not null
			sex char(2),
			born date,
			acount number(8,2),--共8位数，有两位小数
			address varchar2(100)
		);
		--表里出现的ROWID删除了就不能编辑表格了,如果有,在Oracle11g中,在表上会出现一个小锁,打开就可以修改数据了
			create table class (		--	需要这个表
				classid number(4),--年级号
				name varchar2(20)--年级名称
			);
	alter table Student add classid number(4);

	2.往student表中删除,添加address列
		alter table student drop column address;
		alter table student add address varchar2(100);
		
	3.添加约束	alter table tableName add constraint constraintName howConstraint(how to do);
		--域完整性约束		check约束			控制数据内容
		--实体完整性约束	primary key约束		保证数据唯一可靠不重复
		--引用完整性约束	foreign key约束		保证引用的可行
		
		check constraint:  
			alter table student add constraint ck_student_sex 	check (sex='男' or sex='女');
			alter table student add constraint ck_student_born	check (born>=to_date('2010-1-1','YYYY-mm-dd')
																	and born<=to_date('2015-1-1','YYYY-mm-dd'));
		primary key constraint:
			alter table student add constraint pk_student_id primary key(id);

		foreign key constraint:		--	references 不是 reference	而且呢外键用的是dept(deptno)
			alter table emp		add constraint fk_emp_dept foreign key(deptno) references dept(deptno);

	4.添加序列
		create sequence seq_student start with 1	--从1开始
									increment by 1	--一次增长1
									cache 10;		--缓存到10

	5.各种删除
		删除表空间（只能删除自己创建的表空间，其他的不要动，否则数据库会出错）
			drop tablespace jijiespace including contents and  datafiles;	--	contents内容
		删除创建的用户
			drop user jijie cascade;
				--	要删除的用户若创建表,需要在删除时带一个参数cascade,就会把用户及该用户的表删除;
		回收权限	(revoke取消)	(回收权限要在system下进行)
			revoke connect,resource from jijie;
		删除表  
			drop table student;
		删除列，删除时必须有column	定义时列的格式是什么样删除时格式就什么样,当然也可以省略
			alter table student drop column address varchar2(100);
		删除约束
			--	alter table 表名 drop constraint constraintName
			alter table student	drop constraint ck_student_born;
			alter table score	drop constraint fk_score_student;

3.重点工作DML
	DML-数据处理语言（insert（增加数据）、update(更新数据)、delete（删数据））
	需要 commit;
	--	当执行了commit语句后，会确认事务的变化、结束事务、删除保存点、释放锁;
	--	当使用commit语句结束事务后，其他会话可以查看到事物变化后的新数据;
	--	如果不commit，那么数据只会累积;
	1.insert
	2.update
	3.delete

	1.添加数据
		--	注意事项：
		--	1 列名个数和值的个数一致，对应列的类型一致
		--	2 自增列可以不写(sqlserver,mysql)，
		--		oracle自增用序列(sequence), 序列值：序列名.nextval
		--	3 列允许为空，可以不用添加
		--	4 注意约束：主键约束（主键列不重复）  
				--	check约束（自定义的）
				--	非空 （不能不填）
				--	外键约束（外键不能添加主键表的主键不存在问题）
		insert into class (classid,name) values (seq_student.nextval,'admin');		commit;
		insert into class values (seq_student.nextval,'bfg');	commit;	
			--	此时我已经去诶的那个表结构,可以省去填写列名;
		insert into emp select from scott.emp;

	2.更新数据  
		--	注意事项：
		--	1满足条件的行全部更新  
		--	2 可选择部分列
		--	3 更新时列可以进行运算
		--	4 注意约束
		--	5 主键列最好别修改
		update class set name='SMITH' where classid=32 or classid=33;
		update emp set (job,sal,comm)=(select job,sal,comm from emp where ename='SMITH') where ename='SCOTT';
			--	update 希望emp表中的SCOTT的岗位、工资、补助与SMITH一样		在这里可以批量改变哦
			--	这就是查询结果做结果
	3.删除数据
		注意别SB的把所有都删除了
		delete from class where classid=32 or classid=40;
		delete from emp ;	--	全部删除

4.DQL 数据查询语言,select 查询表中数据	这里单独拿出来
		select classid as '班级编号',name from class;
			--	as可以省略,f 是classid的别名	别名不能用数字
	1.限定范围查找:
		1....=
			select * from dept where deptno=90;

		2....<>	!=
			select empno,job from emp where empno<>7839;

		3....or
			select empno,job from emp where empno>7839 or empno<7839;

		4....and
			select empno,job from emp where empno>7369 and empno<7839;

		5....not(empno=3)
			select empno,job from emp where not(empno>7839);	--<=7839的都显示出来
			select empno,job from emp where not(empno=7839);

		6....between A and B
			select empno,job from emp where empno between 1 and 10000;

		6....in(3,5,7)--等值匹配，等于3,5,7的列出来
			select empno,hiredate from emp 
				where hiredate in(to_date('1981/06/09','yyyy-mm-dd'),to_date('1987/4/19','yyyy-mm-dd'));

	2.like 模糊查询(只适合字符类型)
		1.跟 = 一样,可以精确查找
			select empno,ename from emp where ename	like 'SMITH';
			select empno,ename from emp where ename = 	'SMITH';

		2.%	0/n 个
			select empno,ename from emp where ename like 'A%';	--	以A开头
			select empno,ename from emp where ename like '%S';
			select empno,ename from emp where ename like '%A%';	--	只要带A就可以

		3. "_" 必须有一个
			select empno,ename from emp where ename like '_A%';	--	至少两个字符,第二个字符是A
			select empno,ename from emp where ename like 'A_A_%';
			select empno,ename from emp where ename like '_A___';

	3.order by 排序
		1.升序 order by empno asc	系统默认 asc
		2.降序 order by empno desc
		3.先主(job)后次(sal )
			select * from emp where job is not null order by job desc,sal;
			--	先对首次出现的列job进行desc,在job相等时再对sal升序
		4.管辖范围(就近原则)
			select * from emp where job is not null order by sal ,job desc
			--	desc只对job降序,而sal升序
			--	job is not null 作用是：不把 job为空的计算在内
		5.当存在rownum,先有rownum,后排序,所以排序前后每一条数据的rownum不会变

	4. null		is not null
		account is null--为空
		account is not null == not(account is null)--不是空

	5.聚合函数:
		1.count  sum	avg	 min  max  
			select count (*),sum(comm),avg(comm),,avg(nvl(comm,0)),max(comm),min(comm) from emp;
				--	avg(nvl(comm,0))把空补为0，再计算平均数
		
		2.聚合后,除了分组依据之外,不能不出现除了聚合函数之外的
			--	因为一组一行, 其他column有能让你一组多行的可能啊
			--	一般函数不能和聚合函数在一块运算，必须把一般函数放在group by中，否则会出错,跟上面原因一样
			--	一般函数,该是几行就是几行,没聚合!!
			select to_char(hiredate,'yyyy'),count(*),sum(comm),avg(nvl(comm,0)) from emp 
				group by to_char(hiredate,'yyyy')	--	先过滤后聚合,过滤条件是to_char(hiredate,'yyyy')
				having count(*)>1		--	聚合函数的条件写在having中
				order by count(*) desc;	--	必须是前边有的才可以排序

	6.一般函数:
		1.nvl(sal,0)	如果每个单元格为空转换为0输出

		2.to_char	to_date		to_date('2012-2-3','YYYY-mm-dd')表示日期可以以任何格式添加
			select to_char(hiredate,'YYYY'),ename,nvl(comm,0) from emp;
			select ename,to_char(hiredate,'YYYY') from emp where hiredate>to_date(1980,'YYYY');

		3."||"字符串拼接	empno||ename两列放在一列中

		4.all()		所有的
		5.any()		任一个

5.TCL
	保存点，恢复编辑数据之前的一种方法
	从创建保存点到会回滚之间不能 commit;
		insert into emp(empno,ename,mgr,sal)values(9999,'QWER',7369,1000);
		insert into emp(empno,ename,mgr,sal)values(1111,'ASDD',2222,2000);

		savepoint a1;	--	创建保存点，
		delete from emp where empno=1111;
		savepoint a2;	--	创建保存点
		delete from emp where empno=9999;
		rollback to a2;	--	回滚到想要的点
		rollback;		--	回滚到最初

6.数据合并:
	1.行合并		
	--	对同一表进行操作
		1.并集	union 合并,除去重复的	union all 合并,不除去重复的
		--有重复,区别是,会不会重复出现	
			select * from emp where empno in(7369,7499,7521) 
				union select * from emp where empno in(7566,7521);
			select * from emp where empno in(7369,7499,7521) 
				union all select * from emp where empno in(7566,7521);

		2.减集 minus 以(7369,7499,7521)为准，去除(7566,7521)和前边重复的内容
			select * from emp where empno in(7369,7499,7521) minus select * from emp where empno in(7566,7521);

		3.交集
			select * from emp where empno in(7369,7499,7521) intersect select *from emp where empno in(7566,7521);

	2.列合并,联合查询
		1.表关联 ,from后边跟两个表用',' 隔开,条件用where	
			--	获得3x8=24条结果
			--	格式：select * from 表1 a，表2 b where a.主键=b.外键
			select * from dept,emp;
				--	表emp跟在dept后边,dept.deptno与emp.deptno不对应，所有的都显示,每一条dept信息对应所有的emp信息
			select * from dept,emp where dept.deptno=emp.deptno;
				--	dept.deptno与emp.deptno对应,只显示两个deptno相等的行
		
			select dept.dname,dept.deptno,count(*) from dept,emp
				where emp.deptno=dept.deptno and dept.dname='SALES'
				group by dept.deptno,dept.dname;	--	可以group by 2个哦;
			--	查询部门名为'SALES'的部门号及个数
		2.表联接:
			1.内连接
			2.左(外)连接
			3.右(外)连接
			4.全连接
			5.交叉连接
				select * from dept,emp where emp.deptno=dept.deptno and dname='SALES';
				select * from dept inner join	emp	on	emp.deptno=dept.deptno where dname='SALES';
				--	表关联用where,还有条件的话就and		内连接,必须有on,条件用where

				select * from dept left join	emp	on	emp.deptno=dept.deptno; ----左链接
				select * from dept right join	emp	on	emp.deptno=dept.deptno;----右链接

			1.inner join 条件用on
				select * from dept inner join	emp	on	emp.deptno=dept.deptno where dname='SALES';

			2.left outer join    条件用on
				--	以左边表为基准；左边表有右边表没有的显示；右边有左边没有的不显示
				select * from dept left outer  join emp on emp.deptno=dept.deptno;

			3.右连接right outer join
				--	同左连接	不过以右边表为基准
				select * from dept right outer  join emp on emp.deptno=dept.deptno;

			4.左右全连接full outer join
				--	两个表的数据都显示出来了	没有匹配的
				select * from dept full outer join emp on emp.deptno=dept.deptno;
				--	查找垃圾数据的找法
				select * from 表1 full outer join 表2 on 表1.主键=表2.外键
					where 表1.任意列名 is null or 表2.任意列名 is null;		--	查找到的数据一般是垃圾数据           
				select * from dept full outer  join emp on emp.deptno=dept.deptno 
					where emp.empno is null or dept.deptno is null;

			5.cross join
				--	交叉连接,跟表关联是一样的效果	只是没加限制条件而已,当然你也可以加上
				select * from dept cross join emp;
		
		1：查找部门人数超过三人的部门名
			select dept.deptno,count(*) from emp,dept where emp.deptno=dept.deptno 
				having count(*)>3 group by dept.deptno;
			select dept.deptno,dname,count(*) from dept,emp where emp.deptno=dept.deptno 
				group by dname,dept.deptno having count(*)>3;
			select dname,count(*) from emp inner join dept on emp.deptno=dept.deptno
				group by dname having count(*)>3;

		2：dname=SALES部门的各岗位job人数
			select dname,job,count(*) from emp inner join dept on dept.deptno=emp.deptno
				where dname='SALES'
				group by dname,job;

		3：查询部门平均收入超过2000的部门名称
			select dname,avg(nvl(sal,0)) from emp inner join dept on dept.deptno=emp.deptno
				having avg(nvl(sal,0))>2000 group by dname;		--	聚合函数的条件写在having中
			
		4：查询 hiredate 是1981年的员工名和部门名称		--	表关联	内连接都行
			select ename,dname from emp inner join dept on dept.deptno=emp.deptno
				where to_char(hiredate,'yyyy')='1981';

		5：查找经理是king的员工名和部门名(用一般方法与子查询查询显示会不同,但效果一样)
			select * from emp 
				where mgr=(select empno from emp where ename='KING' );

		6：查找员工smith的部门名字
			select * from emp inner join dept on emp.deptno=dept.deptno where ename='SMITH'  ----用内连接查询    
			select * from dept where deptno=(select deptno from emp where ename='SMITH');
			--	当查询结果有一行时可以用 =，也可以用in

		7：查找员工名字包含A的部门名字
			select * from emp inner join dept on emp.deptno=dept.deptno where ename like '%A%';
			select dname from dept where deptno in(select deptno from emp where ename like '%A%');
			--当查询结果有多个行时要用 in

		8：找部门没有人的 （垃圾数据的找法）				            
			select * from dept full join emp on emp.deptno=dept.deptno 
				where emp.empno is null or dept.deptno is null;
				
	3.子查询
		1.子查询作为条件查询(只能是查一列)(不能查询个数)

			1：查找经理是king的员工名和部门名	同一表用了2次
				select * from emp yuangong inner join emp jingli on yuangong.mgr=jingli.empno
					where jingli.ename='KING';

			2：平均工资大于2000的部门名称
				select dname,avg(nvl(sal,0)) from dept inner join emp on emp.deptno=dept.deptno
					group by dname having avg(nvl(sal,0))>2000;
				select dname from dept where deptno in 
					(select deptno from emp group by deptno having avg(sal)>2000);

			3：部门名称为SALES的平均工资
				select avg(nvl(sal,0)) from dept inner join emp on emp.deptno=dept.deptno where dname='SALES';

			4：查找所在部门名字是SALES且工资大于该部门平均工资的人
				select ename from emp inner join 
					(select emp.deptno,avg(sal) avg from dept inner join emp on emp.deptno=dept.deptno 
						where dname='SALES' group by dept.deptno)temp 
					on temp.deptno=emp.deptno where emp.sal>avg;	--	故意写错了一个地方

				select ename from emp where
					deptno=(select deptno from dept where dname = 'SALES')
					and emp.sal>
					(select avg(sal) from emp inner join dept on emp.deptno=dept.deptno where dname='SALES');

			5：找1981年雇佣的工资最高的人
				select * from emp where to_char(hiredate,'yyyy')='1981'
					and sal=(select max(sal) from emp where to_char(hiredate,'yyyy')='1981');

			6：找部门是SALES的经理 
				select * from  emp where empno in(
					select mgr from emp where deptno in(
						select deptno from dept where dname='SALES'
					)
				);		--	还是用in吧, 自己不能保证数据只有一个, 保不准出什么幺蛾子

			7：人数大于3的部门名
				select *from dept where deptno in(
					select deptno from emp 
						group by deptno having count(*)>3
				);

		2.子查询作为列（查询结果是1行1列）

			1：添加了只有1000的一列
				select ename,sal,1000 from emp;

			2：收入与平均工资的差          avgsal是前边表达式的别名
				select  ename,sal-(select avg(sal) from emp) from emp;	--	如果想实现A-B	可以用 ||
				select sal+nvl(comm,0)-( select avg(sal+nvl(comm,0)) from emp )"差值" from emp;
					--	貌似''内加String,不能当别名,要么别名不加引号,要么"";

			3：各部门人数占总人数的比重                 
				select deptno,round(count(*)/(select count(*) from emp )*100,2)||'%'	--	保留两位小数，显示加%
					from emp group by deptno;;
				
				select deptno,count(*)/(select count(*) from emp )from emp group by deptno;--	显示小数
				
				select * from dept where deptno in
					(select deptno from emp group by deptno having count(*)/(select count(*) from emp )>0.3);

			4：查询各岗位job平均工资比总的平均工资多的岗位名称  
				select job,count(*),avg(sal+nvl(comm,0)),sum(sal+nvl(comm,0)) from emp
					group by job having avg(sal+nvl(comm,0))>(select avg(sal)from emp);

			5：查询Smith的收入与他所在部门的平均收入的差
				select sal,(select avg(sal) from emp where deptno in(select deptno from emp where ename='SMITH'))
					from emp where ename='SMITH';

		3.查询结果作为表的方式(多行多列)（用于从多个表中查数据）
			
			1：查询员工姓名，工资和所在部门的平均工资（加别名）
				select *from emp inner join (select deptno,avg(sal) avgsal from emp group by deptno) t 
					on t.deptno=emp.deptno;

			2：查询各个岗位最高工资的人的名字，岗位，工资
				select ename,emp.job,sal from emp inner join 
				(select job,max(sal) maxsal from emp group by job)t on emp.job=t.job where sal=maxsal;
			3：查询各年雇佣员工中工资最低的人的名字，岗位，工资
				select * from emp inner join (
					select to_char(hiredate,'yyyy') as nian,min(sal) minsal from emp 
					group by to_char(hiredate,'yyyy')
				)t on to_char(emp.hiredate,'yyyy')=nian where sal=minsal

			4：查询员工工资与各部门的平均工资的差
				select e.*,
					( select avg(sal) avgsal from emp t where t.deptno=e.deptno group by deptno)
					from emp e;

		4.带关联的子查询

			1.没有员工的部门
			--	第一种
				select dept.* from dept 
					left outer join emp on dept.deptno=emp.deptno where emp.empno is null;
			--	第二种（常用）
				select * from dept where deptno not in( select deptno from dept );
			--	第三种（常用）
				select * from dept where not exists (select *from emp where dept.deptno=emp.deptno );

			2.查询员工收入与同年份进入公司人的平均工资的差
				select ename,temp.deptno,dname,sal,avgsal,sal-avgsal"minus" from emp inner join
					(select dept.dname,dept.deptno,avg(sal) avgsal from dept
					inner join emp on emp.deptno=dept.deptno group by dept.dname,dept.deptno)temp
					on temp.deptno=emp.deptno;

			3.查询各部门的名称和人数(两个表取数据用关联)
			--	第一种
				select dname,count(empno) from dept left outer join emp on emp.deptno=dept.deptno group by dname;
			--	第二种
				select dname,
					nvl((select count(*) renshu from emp where emp.deptno=dept.deptno group by deptno),0)
					from dept;
			--第三种
				select dname,nvl(renshu,0) from dept 
				left join( select deptno,count(empno)renshu from emp group by deptno )t on t.deptno=dept.deptno;
			--第四种(性能更好一点)
				select dname,0 from dept where not exists(select *from emp where dept.deptno=emp.deptno)
				union
				select dname,count(empno) from dept,emp where dept.deptno=emp.deptno group by dname

7.关键字及特殊用法
	1.exists:
		EXISTS用于检查子查询是否至少会返回一行数据，该子查询实际上并不返回任何数据，而是返回值True或False
		EXISTS 指定一个子查询，检测 行 的存在。

		select *from dept where deptno in(select deptno from emp);								--	子查询
		select *from dept where exists( select * from emp where emp.deptno=dept.deptno );
		select * from dept where not exists( select * from emp where emp.deptno=dept.deptno );	--	not exists
		Select * from dept where exists(Select deptno from emp where dept.deptno=emp.deptno);

		--	几条语句是一样的		因为exists只是为了得到一个boolean请求,是否要这一行

		--	这里面的EXISTS是如何运作呢？子查询返回的是 deptno 字段，可是外面的查询要找的是 empno 字段，
		--	这两个字段肯定不在 dept 里面啊，这是如何匹配的呢？ 

		语法： EXISTS subQuery
		参数： subQuery 是一个受限的 SELECT 语句 (不允许有 COMPUTE 子句和 INTO 关键字)。
		结果类型： Boolean

		1.在子查询中使用 NULL 仍然返回结果集
			select * from emp where exists(select null from dept);
			select * from emp;		--	一样的效果
		 
		2.比较使用 EXISTS 和 IN 的查询。注意两个查询返回相同的结果。	--	查找有dept的员工,去除垃圾数据
			select * from emp where exists(select * from dept where deptno=emp.deptno);
			select * from emp where deptno in(select deptno from dept);

		3.比较使用 EXISTS 和 = ANY 的查询。注意两个查询返回相同的结果。
			select * from TableIn where exists(select BID from TableEx where BNAME=TableIn.ANAME);
			select * from TableIn where ANAME=ANY(select BNAME from TableEx);
			--	还没遇到过
		
		1.exists (包括 not exists )子句的返回值是一个 boolean 值。 EXISTS内部有一个子查询语句(select ... from...)， 
			将其称为 exists 的内查询语句。其内查询语句返回一个结果集。 
			exists 子句根据其内查询语句的结果集，返回一个 boolean , 所以要与 where 配合使用。

		2.一种通俗的可以理解为：将外查询表的每一行，代入内查询作为检验，如果内查询返回的结果取非空值，
			则EXISTS子句返回TRUE，这一行行可作为外查询的结果行，否则不能作为结果。

		3.NOT EXISTS 的作用与 EXISTS 正好相反。如果子查询没有返回行，则满足了 NOT EXISTS 中的 WHERE 子句。
		
		4.分析器先找到关键字 select，然后跳到 from 关键字将 emp 表导入内存，并通过指针找到第一条记录，
			接着找到 where 关键字计算它的条件表达式，
			如果为 true 那么把这条记录装到一个虚表当中，指针再指向下一条记录。
			如果为 false 那么指针直接指向下一条记录，而不进行其它操作。
			一直检索完整个表，并把检索出来的虚拟表返回给用户。
			exists 是条件表达式的一部分，它也有一个返回值(true/false)。

		5.在插入记录前，需要检查这条记录是否已经存在，只有当记录不存在时才执行插入操作，
			可以通过使用 exists 条件句防止插入重复记录。
			insert into emp (
				select * from scott.emp t
				where not exists(select * from emp where t.empno =empno)
			);

		6.exists 与 in 的使用效率的问题，通常情况下采用 exists 要比 in 效率高，因为 in 不走索引，
			但要看实际情况具体使用：
			1.in		适合于外表大而内表小的情况；
			2.exists	适合于外表小而内表大的情况。
		
			1:查询员工姓名，工资和所在部门的平均工资（加别名）
				select ename,sal,deptno,
					(select avg(sal) from emp t1 where t1.deptno=t2.deptno ) from emp t2;

			2：所有人工资在3000以下的部门
				select *from dept where 3000>
					(select max(sal)from emp where emp.deptno=dept.deptno);

	--	all 跟 any 是一个函数,只是当时没展开,这里展开来看
	2.all （两个表关联不上的也会出来）	所有得到的结果都满足
		--	在 all 里 null肯定符合要求,不能进行判断,判断一定是 true
		--	所有员工 工资在3000以下的部门
		select *from dept 
			where 3000>all( select sal from emp where emp.deptno=dept.deptno )	--	数在all的前边
			--	 数据为空的也会显示出来
			and exists (select * from emp where emp.deptno=dept.deptno );
			--	数据为空的不会显示出来

	3.any （只要有一个就显示出来）		任意一个满足就好
		--	在 any 里面 null肯定是 false
		select *from dept where 3000< any( select sal from emp where emp.deptno=dept.deptno );

	4.distinct

	5.case when....then....		when....then.....	else....end
		select ename,(
			case when 	sal<=1000 		then '一级'   
			when sal>1000 and sal<3000 	then '二级'   
										else '三级' 
			end)from emp;

	6.dual	伪表
		select seq_dept.currval from dual;

		select t.nian,nvl(num,0) from (
				select to_char(hiredate,'yyyy') nian ,count(*) num from emp 
				group by to_char(hiredate,'yyyy')
			)t right join
			(
				select  '1980'nian from dual
				union
				select  '1989'nian from dual
			)t1 on t.nian=t1.nian;

	7.Select null 与Select 1 类似，只不过返回的列值为Null，在与Exists配合使用时，只要有行返回，
		则Exists子查询仍然为True。和Select 1 不同，Select null 中不可以使用Count 和 sum 函数。
		null是一个特殊的值，既不是空也不是空格，而是一个不确定的值。 如下代码
		Select null from addresses where address_id = 1
		--	意义是在表addresses中有几行满足条件address_id = 1的值就返回几行null值 。

	8.格式输出:
		deptno	clerk   manager  
		10		1		2
		20		2		1
		30		0		1
		40		0		0
			--	case when
			--	可以根据得到的结果,输出另外一些自己想要的东西
		select deptno
			,sum(case when job='SALESMAN' then renshu else 0 end) SALESMAN
			,sum(case when job='CLERK' then renshu else 0 end) CLERK
			,sum(case when job='MANAGER' then renshu else 0 end) MANAGER
		from (select deptno,job,count(*) renshu  from emp group by deptno,job )t group by deptno;

	9.select * from users where 1=1 and usex = '男'	
		这么写,在PreparedStatement注入的时候,可以保证 where 后面如果没东西不出错

	10.分页
		--	不需要排序的。  伪类rownum,行号！
		--	分页的公式，规则！！
		--	需要排序的,对于排序rownum基本没用，必须得先套一层，而且rownum不能写大于号，只能套一层再套一层
		--	外层的数据 =（页数-1）*条数    内层的数据=页数*条数
		select empno,ename,rn from
		(select t.*,rownum rn from emp t where rownum <=6)
		where rn>=4;
		select empno,ename,rn from(
			select empno,ename,rownum rn from( select t.* from emp t order by ename ）where rownum <=6
		）where rn>=4;

	11.注意事项：
		1.统一规则：从一个表取数据，结果显示是一个表中的数据
			条件是另一个表里的数据
		2.子查询结果必须是1列，多行用in关键字，1行比较运算符都可以用
		3.子查询结果各列必须有列名
		4.关联或连接后的列名重名问题
		5.导数据，先别建外键，因为有外键是导入不进表信息的  
		6.改表之前要先备份
		7.处理垃圾数据！！！左链接  全链接
		8.空值很重要  is null很重要！

	12.比较特殊的查询 利用同一个表
		--查询各个经理的名字及所在部门的名称
		select temp.ename,dname from(
			select  manager.* from emp manager inner join emp e on manager.empno=e.mgr	
			) temp
			inner join dept
			on dept.deptno=temp.deptno;

	13.	查看当前登陆的用户名：
			select user from dual;		--	只是告诉我们谁登陆了
			select * from user_users;	--	登录用户的详细信息

		查看当前用户拥有的角色和权限：
			select * from user_role_privs;
			select * from session_privs;

		查看数据库中所有的序列
			select sequence_name from ALL_SEQUENCES;
			select sequence_name from USER_SEQUENCES;
			select sequence_name from DBA_SEQUENCES;

--	Query	单独拿出来	
	--	select columnName [as ]"alias",columnName2... from tableName
	--	where conditions
	--	group by 分组列，分组列
	--	having  聚合函数条件
	--	order by 列 desc,列 asc
	--	其实排序只是显示的时候按照顺序来,或者说是rownum是按照之前的顺序来的,须注意

--	sql函数
	--	单行函数
		--	对于从表中查询的每一行只返回一个值
		--	可以出现在select,where语句中
		--	数字,字符,日期,转换,其他
	--	聚合函数(统计分析，表)
		--	基于每组返回一个结果,为每一组返回一个值
			--	avg		某列平均
			--	min		某列最小值
			--	max 	某列最大值
			--	sum		某列和
			--	count	条数
		--	group by	将信息划分为更小的组,每一组返回针对该组的单个结果
		--	having		用于指定group by子句检索行的条件
    	--	注意：
    		--	1 count 对记录行来说的，其他对应具体列（数值列）
			--	2 所有函数空行不记录在内
			--	3 聚合函数旁边存在非聚合函数列，该列必须放入group by 中 
			--	4 排序列,having 非聚合函数条件列 必须在select中列出来的列才能排序
			--	5 非聚合函数条件放where中，聚合函数条件放having中
			--	6 先where后having
	
--	联合查询
	--	使用了集合操作符
		--	并集	
		--	union		--	返回各个查询的所有记录,可以去除重复
		--	union all	--	同上,但是重复会出现多次
		--	intersect	--	交集	--	交集,2表查询共有的记录
		--	minus		--	差			--	返回第一个查询检索出的记录减去第二个的剩余记录	
	--	多表合并

--	分页查询
	--	什么是Oracle伪列？
	--	Oracle 中伪列就像一个表列，但是它并没有存储在表中,伪列可以从表中查询，但不能插入、更新和删除它们的值
	--	常用的伪列有哪些？
		--	ROWID
			--	ROWID 是表中行的存储地址，该地址可以唯一地标识数据库中的一行，可以使用 ROWID 伪列快速地定位表中的一行
		--	ROWNUM
			--	ROWNUM 是查询返回的结果集中行的序号，可以使用它来限制查询返回的行数
	--	如何获取emp表中薪水最高的前5人？
	--	Select * from ( Select  * from emp order by sal desc ) where rownum<6;
	--	select empno,ename,rn from( select t.*,rownum rn from emp t where rownum <=6) where rn>=4;


	--	明确对于rownum 来说 它是oracle 系统顺序分配为从查询返回的行的编号，
	--	返回的第一行分配的是1，第二行是2，
	--	以此类推，这个为字段可以用于限制查询的返回的总行数，
	--	因为rownum总是从1开始，但是1以上的自然数在rownum 做等于判断时都认为是false 条件，
	--	所以无法查到 rownum=n （n>1的自然数），1是可以的
	--	所以查找第二行以后的记录可以用子查询方法来解决，给子查询中的rownum取别名;
	--	对于小于某个值的情况两种方法都差不多，
	--	但是对于某个不等于一的值或者求某个值到某个值之间的情况，用row_number() over() 别名获得排名 ，
	--	比用rownum伪列要简单方便的多；因为伪列总是从一开始查找； 
--	栈,可以保证数据是最新的
--	distinct 直接排除重复的信息，是俩快信息加在一起重复的信息！不用考虑是否会删掉不重复的东西！！！
--	但是尽量少用distinct，能不用就不用！！！group by 去重复的！！
--	条件查询where语句很重要！//优点：把一个查询结果放在另一个查询里，查找出要差的结果！！
--	表格设计：（重复数据）
	--	1列不能再分
	--	2主键列（保证每行数据唯一），其他列与主键相关
	--	3其他列与主键 ，直接相关（外键关系，引用主键表的主键）