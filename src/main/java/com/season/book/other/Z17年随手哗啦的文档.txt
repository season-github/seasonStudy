








6.严格来讲有区别。javascript作为一种脚本语言可以放在html页面中任何位置，但是浏览器解释html时是按先后顺序的，所以前面的script就先被执行。
	比如进行页面显示初始化的js必须放在head里面，因为初始化都要求提前进行（如给页面body设置css等）；而如果是通过事件调用执行的function那么对位置没什么要求的。因而除了部分需要在网页中输出内容、调整显示的JavaScript必须放在<head></head>之间，
	一般的JavaScript放在<head></head>和放在<body></body>之间从执行结果来看是没有区别的，但是有如下的经验规则：
	1.当JavaScript要在页面加载过程中动态建立一些Web页面的内容时，应将JavaScript放在body中。
	2.定义为函数并用于页面事件的JavaScript应当放在head标记中，因为它会在body之前加载。采用这种方法，页面就不会被脚本搞得一团糟，易于阅读，在每个页面中，总可以在同一个位置找到脚本。


9.	oracle的jdbc中的url("/"可以用":"代替) 跟plsql客户端的url(必须这个格式)是不同的
	oracle.jdbc.url=jdbc:oracle:thin:@172.16.2.16:1521/shoudan
	oracle.plsql.url=172.16.1.160:1521/orcl
	dos连接远程数据库：sqlplus mixpay/123456@10.10.21.102:1521/mixpay


10.maven导入本地jar包：(导入本地仓库之后的位置)
	mvn install:install-file  -Dfile=C:\Users\Season\Desktop\Demo.jar  -DgroupId=com.mix -DartifactId=mixweb -Dversion=1.0.0 -Dpackaging=war


11.web.xml is missing and <failOnMissingWebXml> is set to true
	这时候需要右击项目——>Java EE Tools——>Generate Deployment Descriptor Stub.
	然后系统会在src/main/webapp/WEB_INF文件加下创建web.xml文件。错误解决！


window.history.forward();





27.放在head中的JS代码会在页面加载完成之前就读取，而放在body中的JS代码，会在整个页面加载完成之后读取。所以呢，写js要注意一下位置问题
	js有先后顺序，这个我可以理解，但是其他呢


25.不要轻易下结论，如果你觉得他不错，那你就只把自己的想法告诉直系领导，如果当时有外人，那就由直系领导判断，不要插嘴，不要乱说话


28.吃亏是福，很多事，记住但是不说出去，就这么简单，吃小亏无所谓了，吃了就吃了吧，吃了亏，别板着脸问为什么，
	也许人家真的忘记了呢，没考虑到呢，可以笑着问怎么总是欺负自己，哎，以后记住了500块钱以下不是吃亏，
	多了/少了，又有什么关系呢？并不会影响大局，乐观一下，别总是带着仇恨，板着脸。
	成长就是不断遇到各种人/事，不断地做错，不断地找到不足，不断地去修正自己的轨迹，不能的成长、变得优秀
	成长也是，不断地记住一些事情，不去再犯同样的错误，犯了就该抽自己俩耳光了




17.人生苟且啊，一个下午整这破玩意，恶心，但是也很有用的哦，对Tomcat的理解加深了一些，没遇到这些，也许一辈子都不会遇到
	tomcat的web项目都在webapps里面，在tomcat运行之后，是按照文件的目录结构进行选择执行哪一个文件的
	webapps/demo/(META-INF WEB-INF index.jsp)这里面的3个文件/文件夹分别的作用是：还是不明白，反正作用是不同的，嘿嘿
	<wb-module deploy-name="season_channel">	--	部署的项目名是这个哈
		<wb-resource deploy-path="/" source-path="/WebContent" tag="defaultRootSource"/>	--	将WebContent的文件部署在根目录
		<wb-resource deploy-path="/WEB-INF/classes" source-path="/src"/>	--	将src下面的文件部署在class下面
		<property name="context-root" value="season_channel"/>				--	这个不知道了，反正得一样
		<property name="java-output-path" value="/season_channel/build/classes"/>	--	
	</wb-module>


20.web.xml 学名叫部署描述符文件，是在Servlet规范中定义的。它是用来初始化配置信息的。
web.xml 文件是用来配置：欢迎页（welcome-file-list）、servlet、filter、listener，启动加载级别等的。
当你的web工程没用到这些时，你可以不用 web.xml 文件来配置你的web工程。



7.在sql文件中，空行也代表着另一条sql的开始，创建表的时候，如果有空行，那么执行会出现错误。
	同样，tab不能替代空格，他们不会认tab的
这个没测过，我也忘记当时为什么这么记下来的


26.
	如果计划购买大批家电，建议去京东。等等网上商店
	安装比价器。惠惠助手。虽然有时候不准确
	京东靠谱，比苏宁店里靠谱
	那是因为网上没有搞活动。不然你从成本上分析网上只会比线下便宜
	线下，你去京东 国美看看就知道了，摆上面的。你能看上眼的都很贵，贵的可怕
	线下不利于你比较电器的参数，真的不利于。你不可能都记住。也不可能拿个本子看
	线下的销售很会忽悠
	我的老板吸油烟机就是苏宁线下买的。。。
	一般般吧。样机都死贵
	京东一般会在，五一，618 国庆节 双十一 前后高活动。经常会提前
	年后三四月份，京东很多商品，小商品也有很大的力度。
	京东e卡
	面值1000元的淘宝可以982左右买到。
	缺点是用e卡的部分不能开发票。比如你买了3000的电视，用了2000的e卡。
	发票只能开1000
	不过不影响售后保修
	京东联盟，上获取连接购买家电，基本都是百分之一以上的返利。
	plus会员，返京逗是普通会员的10倍 + 普通会员反逗
	昨天去超市看了一下日常用品，比如清扬洗发膏 悠选洗衣液 威尔士消毒液在京东上回比超市便宜
	而矿泉水这个就不便宜了。除非京东搞活动。一般比较少。
	千元以内的，尤其是百元左右的，适合去淘宝天猫买。这里服务好，还便宜。
	比如，水龙头，插座。门垫，等等
	家具 也不太适合在京东上买。便宜可以在淘宝买。贵的最好还是去店里。
	记住，京东买家电，不能上来就买。必须盯着这个家电看。持续关注。要等降价，和领取优惠券的时候买。


10. 
	乐观锁&悲观锁：
		悲观锁：假定会发生并发冲突，屏蔽一切可能违反数据完整性的操作。
	　　乐观锁：假设不会发生并发冲突，只在提交操作时检查是否违反数据完整性。乐观锁不能解决脏读的问题。
		在实际生产环境里边,如果并发量不大且不允许脏读，可以使用悲观锁解决并发问题；
		但如果系统的并发非常大的话,悲观锁定会带来非常大的性能问题,所以我们就要选择乐观锁定的方法.

		乐观锁实现：
			1、在数据库中创建一个Number的version字段，每修改 1次加 1，
				查询的时候查出version，在更新的时候进行比对，版本号同则+1，不同则不进行修改
			2、在数据库中创建一个时间戳字段，在进行修改的时候比对时间戳是不是之前的时间戳，在聚合支付 2期中采用这种实现方式
		悲观锁的实现：
	脏读：读到的数据不是最新的数据，我不知道是不是这个解释




9.修改web项目名
	1、右键工程：Refactor->Rename，或选中工程按F2，修改名称
	2、右键工程：Properties->Web Project Settings,修改Context Root
	--	后面需要在navigator视图下
	3、修改项目目录/.setting目录下的org.eclipse.wst.common.component文件，project-modules的wb-module内容，包括：
		deploy-name：配置到web server时显示的组件名称；
		java-output-path：类编译文件的输出位置；
		context-root：部署目录。
	4、修改项目目录下：.project文件
		<?xml version="1.0" encoding="UTF-8"?>
			<projectDescription>
				<name>Season</name>


11.处理oracle时间戳
	SELECT TO_TIMESTAMP('2017-05-09 14:39:25.21907','YYYY-MM-DD HH24:MI:SS.ff') A from dual;


12.看一看ajax dataType的类型指的是不是传递到request中的数据的类型，是不是加上是不是可以用request.getParameter()获得数据，不加又会怎样


13.MUJI的香薰机	zara的香精


14. to_char(UPD_TIME,'YYYY-MM-DD HH24:MI:SS.ff') "UPD_TIME"
	在获取select的时候。如果不to_char()，那么在前台显示的数据会省略'2017-05-15 09:25:08.011648'最后面的0


16.当别人需要你的帮助的时候，你去帮助他。那么你是一个好人
	时时都有一颗帮助别人的心，那么你更是一个好人
	如果需要的帮助的人的眼里你说的不会相信，他不想要你的帮助，你还去帮助他，那你就是一个真真正正的傻缺
	情商真的很重要


17.这也是一种left join 的写法：
	select * from tn_changoods goods,tn_chanrate rate
	where goods.goods_no =rate.goods_no(+)
	and goods.del_flag='0'


19.java.lang.IllegalStateException: Ambiguous mapping found. Cannot map 'cityController' bean method
		配置springmvc的时候，出现这个错误，原因是：我赋值了类中的方法，结果没有
		改@RequestMapping（名称）这里，修改即可。
		在springmvc中不能同时映射一个名字（@RequestMapping（"/***"））


21.在js中严格区分大小写


22.在sql中想大小写确定了，那就用""吧，之前刘文杰说应该用``，感觉刘文杰说的更在理吧，或者是都对


23.添加序列之后，可以直接拿出序列值插入，也可以创建一个触发器，在insert的时候屏蔽掉值就可以插入了


27.	plsql中插入数据会很慢的，你这个时候可以考虑用command窗口来进行插入，你会发现嗖嗖的


今天一个maven项目之前ojdbc的jar不能从网上down下来，于是我本地加入仓库中，但是一直不能通过类名进行反射，
最后的解决方案是：clean了一下project，其中重启eclipse不能解决问题，可能因为使用了缓存技术吧


套路：
	1、见到一见钟情的女孩，就问他是不是王阿姨介绍的女孩，当然那时候你得着装得体
	2、如果被女孩发现自己的缺点/聊到不开心的地方之后，先缓一缓，不要让自己的缺点放大


少妇白洁，灏基这样子描述的
	一个乡村女老师和校长，丈夫之间的恩怨纠葛，文笔情真意切，催人泪下


对于并发量大的系统，可以考虑利用redis等缓存，实现数据的快速访问，nosql是什么意思呢？


日切：切换系统工作日；
日终处理：日切完成后，进行清算、对账、差错交易处理；
对账：发起方跟接受方的交易核对。





















1.查看linux版本是centos还是redhat
cat /etc/redhat-release


2.查看操作系统位数：
uname -a


3.q：退出
wq：修改后保存退出
q！：强制退出，不保存修改的内容



ps -aux|grep svn
kill -9 进程号




&&短路与和||短路或
 当第一个关系可以判断结果的时候，将不进行第二个关系的运算
但是出现一个& |  ，会进行第二个关系，不是短路


char的认知
1 单引号之间 有且只有一个 字母；
2 char 的范围是0-65535的int


转义符------比较特殊的需要转义，例如    \n表示换行    



注意规则：1）整数直接量(不是变量，)可以直接赋值给byte,short,char
		2）byte,short.int参与运算时，先一律先转为int再进行运算
		   强转的优先级  高于  算术运算符
  分析四种类型赋值和运算之间的关系
 答：规则还是很准确的，赋值的话，int可以自动转换，但是一旦参与运算的话，自动变成int型，运算需要强制转换。  


boolean 的默认值为False


int[] arr={1,2,3,4};成立
int[] arr;
arr={1,2,3,4};不成立
arr=new int[]{1,2,3,4};成立
数组中，大括号赋值方式必须同时使用


数组复制
System.arraycopy（源数组，源数组的起始下标，目标数组，目标数组的起始位置，源数组的复制长度）；
int[] a1=Arrays.copyOf(a,a1的长度); .......数组扩容


交换次数越少，则效率越高
Arrays.sort(arr);//升序排列
Arrays.toString(arr);


冒泡法：
1）四个数冒三次
2）每一轮都是从第一个数开始
   前一个数跟后一个数比较
3）冒出来就不带它玩了


new之后，所有成员变量都有默认值
引用类型的默认值为 null
Student e =new Student();


步骤
1、找对象
2、抽类
3、设计类中的成员变量和方法
4、创建对象并测试


new出来的是对象,不在一个类里面，需要实例化
new Cell();
Student student = new Student();
数据类型 引用	  指向	对象


栈：存放局部变量,方法内的
堆：存放成员变量  new的才能创建
cell c=new cell();
cell cc=c;//指向了同一个对象
1）指向同一个对象
2）对其中一个引用修改，会应影响另外一个变量
基本数据类型之间画等号：则相反
cell c =new cell();
c=null;//空，没有指向任何对象,若引用的值为null则不能进行任何操作了
c.row=2;//NullPointerException 空指针异常  

引用类型之间画等号：相当于身份证和复印件，
纪杰修改： 因为java引用的是地址而不是数据，倒不如说是带有柜子号码的便签与柜子之间的关系。
我们假定柜子没有锁，通过便签可以知道柜子的位置，并且呢对柜子中的东西进行操作
如果柜子里的东西被修改了，那么后面的人来找（分发出去了好多便签），看到的是修改之后的东西
如果柜子里的东西被删除/拿掉了，那么后面的人，什么也不会找到/看到
如果这个柜子被拿走了，那么地址就是null了








































方法签名：方法名和参数列表   与返回值无关
方法重载：1）在同一个类中方法名相同，参数列表不同
		   2）编译器在编译时根据方法签名进行选择


文件中建类规则： 
1）一个文件中可以创建多个类
2）public 的类只能有一个
3）public的名必须跟文件一样；

构造方法：
1）作用：给成员变量赋初始值
2）与类同名，没有返回值类型
3）在创建对象时被自动调用的构造方法，传递参数
4）若自己不写构造方法，编译器提供无参构造
5）若自己写了，则不提供无参构造
6）若两个都想要，则构造方法可以重载，实现


this:指代当前对象，谁调用就指谁；
	方法中访问成员变量之前默认有个this.
	  可以区分 同名的 成员变量和局部变量
1)this.成员变量名 调用成员变量
2）this() 调用方法


创建类后：
成员变量可以先不初始话；
若要初始化需要创建  构造方法


方法有参，可以使方法写活














































2016.09.13
JVM管理  堆、栈、方法区
JVM的内存是固定的，不可以通过给电脑增加内存来解决问题
JVM通过配置内存来扩增内存

System.gc();  可以让堆中垃圾回收比较快一些
通过把变量设置为NULL 避免内存泄漏

栈中装着正在调用中的方法中定义的局部变量
栈帧的存在：调用方法的时候在栈中为该方法分配一块栈帧，方法执行结束后栈帧消失，局部变量也随之消失。

方法
1）存储的字节码文件（包括方法）
2）方法只有一份
  通过this来区分对象的执行顺序

继承：
1）一个类只能继承一个父类
2）继承是具有传递性的；


JAVA规定：在子类方法中若不调用父类构造，则默认调用Super（）父类的无参构造；super（）调用，必须在子类构造的第一句。
super的使用：当前对象的父类对象


向上造型
1）父类型的引用指向子类型对象
Animal a0= new Animal(); // 动物是动物
Tiger  t0=new Tiger(); // 老虎是老虎
Animal x0=new  Tiger(); // 老虎是动物


2)能点出来什么，看引用的类型
注意：
继承不能滥用，继承要符合is a 的关系
构造方法不能被继承
父类构造是被子类调用的，而不是被子类继承的


方法重写：
1)父类不好的时候，重写；
2)子类有新的想法的时候，重写


1）发生在父子类中，方法名和参数列表相同，但是方法体不同
2）重写方法被调用时，看对象的范围  看NEW出来的对象


重写遵循“两同两小一大”原则
2.两小
1）子类的返回值要小于或等于非类
   void时，必须相同
	基本类型，必须相同
	引用类型，小于或者等于
//父类大，子类小
Person p1=new Student();//向上造型，自动类型转换

2）子类抛出异常小于等于
3.一大
子类的访问权限  大于或等于 父类


重载为“编译期”绑定，只看引用的类型。
重写是“运行期”绑定，只看new 出来的对象
编译期（.java编译成.class）没有对象（JVM未参加），只检查语法是否错误


package有层次感  oo.day03
建议：域名反写.项目名称.模块名称.类名
	cn.tedu.manager(可移植性).studentmanager(个人负责的部分).Aoo

类的全称：包名.类名

不同包的类的使用方式：
1）先import声明类，

封装：
数据私有化（不可以被调用，private），行为公开化(可以被调用，public)
1)降低代码出错的可能性
2）代码的更改，不影响用户的行为的实现	 
protected  受保护的
适用条件：本类、子类、同包类（不能被import）
默认的
适用条件：本类、同包类

注意：
1）类的访问修饰符：public和默认，若写默认，则只能在同包中使用



2016.09.18
成员变量：
1）实例变量：int row ;属于对象，存在堆中，有几个对象就有几份
			  对象点来访问
2）静态变量：int static row ;属于类，存在方法中，有几个对象就有一份
			  类名点来访问
			使用情况：对象的数值是相同的

静态方法特点：没有隐式this的传递，静态方法中不能直接访问实例变量
		   使用情况：方法的操作仅与参数相关而与对象无法。
静态方法是类的属性，而不是对象的。静态方法中只应用静态变量

静态块特点：类被加载期间自动执行，因类只被加载一次，所以静态块也只执行一次
		   使用情况：常常用于初始化静态资源（图片、音频、视频）

final；
1）修饰方法：不可被重写
2）修饰类   ：不可被继承
3)修饰变量：不可被改变
成员变量初始化的两种方法：
1.1声明的过程中给值
1.2构造方法中给值
局部变量：用之前给值即可

static final:常量
使用情况：在编译时自动替换成具体的值，常量的效率更高

抽象方法：只有方法的定义，没有方法的实现（没有方法体）

抽象类：1）包含抽象方法的类必须也是抽象类
		2）抽象类是不能被实例化的，是不完整的对象，就不能被实例化
		3）限制

abstract 和 Final 不能同时修饰类  ：因为继承性


abstract的使用
抽象方法和继承的差别：
继承是对象方法具有共同的属性；抽象方法是方法不同，需要修改
static的使用
对象的参数和方法，则不用；非对象的属性则使用
static final的使用：常量
接口：
/*********
static，可以被继承，但是不能重写
1  实现接口的类的方法中不能写static----统一性
2  抽象方法中的抽象类不能写STATIC------用来继承的
3  接口中的方法不能写STATIC-----------用来继承的
4  抽象类 的变量 如果赋初值，还会有构造方法吗？

static 只能修饰变量、方法、块

父类 与 子类的向上造型
1 构造方法只能被调用，不能被继承。super(int m,int n)
2 父类的变量可以被继承？？？？

银行卡系统
抽象方法和 接口的区别
**********/


2016.09.19
接口是对继承的单根性的扩展   继承一个父类，实现多个接口，符合即使也是
抽像类是对父类的普通类的扩展 抽象类必须重写抽象方法

多态
行为多态  继承父类  造型为父类
对象多态  实现接口  造型为接口
/***********
引用类型强制类型转换，成功的条件
1）引用所指向的对象，就是该类型
1）引用所指向的对象，实现了该类型
具体+抽象的理解？？？？？
用instance of 来测试是否符合强转条件，返回值为ture or false
					   *****************/
内部类：
内部类有一个隐式的引用可以访问外部类的对象	外部类.this.
在匿名内部类中想访问外部的 数据，需要加final


public class SuperClass {
	public static void main(String[] args) {
		SuperClass sup=new SuperClass();
		SubClass sub=new SubClass();
		SuperClass supSub=new SubClass();
	}
}
class SubClass extends SuperClass{
}
根据上述代码，判断下列选项中，赋值语句错误的是：
A. sup=sub;
B. sub=sup;
C. supSub=sub;
D. supSub=sup;
——————————————————————————
等号相当于指针，等号左边相当于栈里面的引用，引用的类型是等号左边的引用类型；等号右边是堆里面的对象，对象的类型是等号右边的对象的类型。
/***************
对于静态方法的重写问题
如果要调出重写方法   T t=new T();
如果要调出重写前的方法	  Tetrimino t=new T();
			   
外部类的访问修饰要么是public 要么是默认的
内部类 的四种访问修饰符都可以

 **************************************/
/*******
英雄机  的属性  生命值、火力值----怎样想
分数属于  敌机器和小蜜蜂的属性
共有和特有 决定 继承和接口
英雄机的 静态图片的切换
			  **********************/

对象：英雄机、敌机、蜜蜂、炸弹
抽象类：飞行物、奖励、分数****敌人
对象的具体化
英雄机：生命值、火力值、图片的切换
敌人：速度，重写得分数
小蜜蜂：上下、左右的速度，奖励的类型
炸弹：速度

重构方法，但是无法给图片赋值

画面板
定义面板的大小
定义面板的图片
静态图片
面板上画 小图片

主方法里面画 面板到框架上
框架的各种格式的固定

class FlyingObject{
Bufferimage image;
protected int width;
protected int height;
protected int x;
protected int y;
}
Interface Award{
   protected int LIFE=1;
   protected int DOUBLE_FIRE=0;
   int award();}
Interface Enemy{
   publuic  int getScore();}



class Hero extends FlyingObject{
	 private int life=3;
	 private int doubleFire=0;
	 ButterImage[] images;


}
class Airplane extends FlyingObject{}
class Bee extends FlyingObject{}
class Bullet extends FlyingObject{}

首先设置对象

然后实现风行物体的 运行
形成数组
1）flying 随机变化， 赋值到风行物的数组中
2）计时器 Action 设置间隔 行为{重画}
3）向下飞行 写在对象里面


this. 是指当前的类所 NEW 的对象，只能用在当前类
super.是只能用在子类，所代替的对象是继承的类，或者实现的接口。
/*********
  向上造型
   匿名内部类
**********/
F5：跳入方法
F6：向下逐行调试
F7：跳出方法
F8：直接跳转到下一个断点分享


2016.09.23
SE 数据库
API需要记住功能，而不需要记忆方法
C语言：驱动，机顶盒，硬件相关，是面向过程，写起来复杂
C++：本地应用程序，可以跟C汇编，
JAVA：服务器   
OC：苹果系统
做网站。企业  手机的安卓系统 
1、注释
2、导出
3、API查阅

http://doc.tedu.cn/  API文档
可以在网上下载

String 不适合频繁的修改字符串
课程整理：
1、文档的注释：
			 只可以注释 类、方法、常量
 类的文档注释 可以注明  项目完成的任务 、作者、项目版本、JDK版本
 方法的文档注释 可以注明 方法完成的任务、接收的形参、返回值的类型
2、文档注释的导出
   右击- >export- >以文件类型导出 - >查找DOC 文件里的index，单击打开
3、API的查找地址
4、String的使用（记住用法，具体的操作可以查阅资料）
   1）字符串的对象的不变性，
   即字符串一旦创建，就以对象的形式存在，改变字符串会创建新的对象。
   2）字符串建议遵守字面量的命名规则
   JAVA的String提供了一个优化的措施，即遵循字面量的命名规则的对象，对象的内容一样的情况下，不会再创建新的对象，而是调用之前创建的对象。
   但是一旦 进行NEW出来的，就会创建新的对象。
   如果链接符两边都是字面量，则也不会再创建新的对象。因为计算只执行一次，所以在编译期就进行了计算，形成的.class中的跟字面量定义的形式是一样的。
   3）字符串的长度的计算
	  int str.length
   4) 查找某个字符串在现有的字符串的位置
	  int str.indexOf("in");查找第一次出现的位置
	  int str.indexOf(str.indexOf("in")+1,"in");查找下一次出现的位置
	  int str.lastIndexOf("in");查找最后一次出现的位置
   5）字符串 某个位置所对象的字母
	 char str.charAt(5);
  6)查找字符串是否是以某个字符串为结尾的，或者为开头的
	 boolean str.endsWith("end");
	 boolean str.startsWith("start")
  7)字符串的前后空白的删除功能
	  str.trim			  
  8)字符串某段文字的截取功能
	   str.	//str.subString(start,end);
  9)字符串的增、删、改、替 、倒序输出的功能
	StringBuilder s=new StringBuilder("skldjfie")
	 s.append();
	 s.delete();
	 s.replace();
	  s.reverse();
	s.toString();
	  s.insert();
  10)字符串的变大，或者变小
	str.toUpperCase();
	str.toLowerCase();
  11)将其他类型转换为字符串
	String.valueOf(123);


String用法
1）对象不变性
2）更改 对象会创建新对象
3）用StringBuilder可以更改对象
4）长度
5）某个字母的位置
6）某个位置对应的字母
7）把字母改成大、小写
8）检测字符串是否是以某个字符串开头或者结尾
9）截取字符串
10）去除字符串前后的空白
**********************
11）将其他类型转换成字符串
12)字符串的增加、删除、替代、插入、转向


2016.09.26
量词
[]   方括号表示一个字
 ^   表示除此之外
-	表示从什么到什么  必须是左小右大
 /d /w /s
分组
（）整体
边界匹配
^开头
$结尾
.* 中间可以添加任意字符
在仅JAVA中，[abc]{3}  aaa  不写也全匹配
正常的其中有一个就是对的？？？？
12378216489abcei9r 只要有三个 在正则表达式中
[abc]{3,19} 

多态：父类引用指向子类对象，只能看到父类的行为，对象调用方法，看似调用父类方法，其实是调用的子类的方法。
	  特征：子类所拥有的；
	  行为：父类所拥有的，子类所共有的


Object是无认知的时候存在的事物。




equals
包装类是为了把基本类型转换成对象，参与运算。

抽象方法：行为上的规矩




沟通的基础：
短时间认识到我的长处，而回避短版
积极主动的沟通，找共同的话题，找话说。学习别人是如何沟通的

HR判断简历用15S
1、主题关键字 抓住需求
1）目标明确
2）感情交流
3）达成共识
四种能力
1)说清楚	5w2H
金字塔的表达形式：
1）先说结论，再说过程：
2）抓住关键点，最重要的问题放在前面讲。

听为说之母：

问彻底：
用询问代替猜测
1）确定工作任务是上级安排的
2）了解每一个环节的过程。带着倾听和谈判来沟通

语言的艺术
第一原则：明确角色
第二原则：“投其所好”  领导喜欢数字说话，下级一般都是一个风格。
第三原则：“老板心态”   把公司的部门的利益为出发点

1、事先提议：不做事后诸葛亮
2、进展汇报：让上司知道你在做什么，过程
3、会后建议：给上级留面子，私下里提建议
4、目的陈述：提案之前说明提案的目的
5、不找借口：找解决办法




同级沟通：
信息资源共享，需要帮忙要支持

了解业务流程


沟通的形式：
电话沟通：微笑的状态，每次沟通是闭环 

缺点不能写原则性的问题
《职场交谈这样就对了》
 微信：xiumei95

课程整理：
一、正则表达式：记录文本规则的代码
1）规则制定的要求：
字符集合：[] ^ -  && .代表一个字符 \d \s \w \D \S \W
数量词：X？  X* X+
	  X{n} X{n,} X{n,m} 方括号的要求不高，只要有连续的就行，但是加上^和$ 则就对长度有限制了
分组：（）用“|”来表示或
注意：在正则表达式中，“+”“.”“\”都具有特殊含义，转换的时候需要注意，"-"是否加两个转移符，无影响；
	  在JAVA中，正则表达式的第一区别在于“/”的表示方法
	  第二个区别：^$的表达 在JAVA中即使不写，也表示有

二、正则表达式的方法
1）格式匹配 match  返回值Boolean类型		str.matches(正则表达式)
2）分离方法 split   返回值String[]		str.split(正则表达式）
  注意：当字符串连续匹配两次时，中间可以拆分出一个空字符串
		但是若在当前字符串末尾连续匹配，则所有拆分出来的字符串被忽略
3）字符串替换方法 replaceAll  返回值String 
						str.replaceAll(正则表达式，替换的字符串） 
  
三、Object 的两种用法
1）对象.toString的方法  自己定义的类需要重写方法输出特征的属性
1、原方法：输出	类名@散列码		
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



2）.equals   也需要重新写方法
1、判断两个对象是不是同一个对象
2、字符串对象的字符序列是否相等
3、默认的方法跟==相同的用法

四、包装类  把基本数据类型转换为对象
1、包装类是final的，不允许更改包装类对象的值
2、抽象类Number是6中基本类型的父类，子类提供方法将数值转换为byte
3、Double i=Double.valueOf(100)
   父类对象.intValue()
   父类对象.MAX_VALUE()
   父类对象.MIN_VALUE()
   double d = Double.parseDouble(str);
   自动装箱与拆箱 将基本类型封装成对象
   Integer in = i;	
	//编译器补全代码	  Integer in = Integer.valueOf(1);
	int i = in;
  //编译器自动补全代码	int i = in.intValue()
   



2016.09.27
date 过时的类
输出的时间格式
1)输出当前系统的英文格式的时间										System.out.println(Date的对象);
2)输出当前时间距离规定的原点时间的毫秒值 
 Date的对象.getTime()
3)设置距离 1970年的元年 的毫秒值，可以输出相应的时间
Date的对象.setTime(距离元年的毫秒值)

 SimpleDateFormat的Date的格式转换
1)对象.format(Date的对象）
2)对象.parse(str);

Calender  日历类，操作和计算时间
1）获得当前系统时间
   Calendar calendar = Calendar.getInstance()
2）Calender<->Date
   Date date = calendar.getTime();
   calendar.setTime(date);//设置日历的时间为Date的时间
3）获取时间分量所对应的值
   int month = calendar.get(Calendar.MONDAY)+1;
4） 设置时间分量以对应的值
   calendar.set(Calendar.DAY_OF_WEEK, 3);//相当于写周二
   calendar.set(Calendar.DAY_OF_WEEK, 2);//本周的周一
5） 对时间分量累加给定值
   calendar.add(Calendar.DAY_OF_YEAR, 25);

2016.09.28
Collection
 java.util.List:可重复集，且有序
 java.util.Set:不可重复集，大部分实现是无序的
 元素是否重复的判定的标准是依靠元素自身的equals的方法比较的结果。
 集合只能存放引用类型元素,并且集合存放的也是元素的引用（地址）
1）集合内的操作：
  c.add(E e) c.size() c.isEmpty() c.clear
  c.contains(E e)   c.remove(E e);

2）集合遍历集合元素使用迭代器模式
   Iterator it = c.iterator();

3） 增强for循环，又名：新循环、for each
	新循环是用来遍历数组或者集合的。
   for(String str:arr){
4） 泛型在集合中用来约束元素的类型
	泛型<不能存放基本类型，必须为引用类型>
   Point<Integer> p1 = new Point<Integer>(1,2);

5）集合间的操作：
  集合合并* boolean addAll(Collection c)
  集合包含* boolean containsAll(Collection c)
  删除集合交集* boolean removeALL(Collection c)
6） 
 * List是有序集，且元素可重复
 * 特点是可以通过下标来操作元素
 * 常用实现类：
 * ArrayList:内部使用数组实现，查询速度快
 * LinkedList:内部由链表实现，增删元素更快，尤其首尾增删元素效率更高
7）List相比较与Set所特有的方法
  查	   * E get(int index)
  改、取   *E set(int index,E e)
  增	   * void add(int index,E e)
  删、取   * E remove(int index)
  获取子集 * List subList(int start,int end)
8）数组<->List集合
  List<String> list = Arrays.asList(array);
  String[] arr =c.toArray(new String[c.size()]);

9）“复制构造器”
 * 所有集合都有一个含有Collection作为参数的构造方法
 * 这个构造方法在创建当前集合的同时会将给定集合中所有的元素包含进来
  /*
   List<String> list1 = new ArrayList<String>();
   list1.addAll(list);
  */
   List<String> list1 = new ArrayList<String>(list);

10）List集合排序
 *collection是集合的接口，collections是集合工具类
   排序：Collections.sort(list);
   乱序：Collections.shuffle(list);

11）泛型的原型就是Object
   int x1 = p1.getX();//类造型异常
   /*
	p1为Integer的包装类   p1.getX().Integer()
	p1.getX() 指向的元素为String类型的
   */

2016.09.29
/**********
 * fistpoll (poll) lastOffer(offer) lastpoll firstOffer   <Deque>
 * pop替换lastpoll	push替换firstOffer  < 栈>
翻译
**********/

/*******
sort方法的重写
comparatable
************/
hashMap 查找表，不需要遍历数组
内部是一个数组，调用put 经过散列算法 就会调用 K的hashcode(),返回一个数值

6 8 12 19 24 28 29 30 34 36 39 43

34


课堂笔记：
比较方法一：元素具有比较性
 * 若向使用Collections的sort方法排序集合，要求集合元素必须可以比较大小
 * sort方法要求元素必须实现Comparable 接口
 *实现Comparable方法的时候，返回值为比较结果，该返回值不关注具体取值
比较方法二：较常用，
 * Collections 提供了重载sort的方法
 * 可以根据给定的比较器的比较规则来比较

队列结构：

1）Queue遵循先进先出原则
 * boolean offer(E e)入队操作，向队列末尾追加元素
 * E poll() 出队操作，从队首获取元素，获取后，该元素即从队列中被移除
 * E peek() 引用队首元素，获取队首元素后，该元素仍然在队列中
2） 栈使用双端队列实现 双端队列：两端都可以进出对的队列
 * poll offer  <Queue>
 * fistpoll (poll) lastOffer(offer) lastpoll firstOffer<Deque>
 * pop替换lastpoll	push替换firstOffer  < 栈>
3)stack遵循先进后出原则
 * void push(E e)入栈操作，最后入栈的元素在栈顶
 * E pop() 出栈操作，获取栈顶元素，并且该元素从栈中被移除
应用：栈常用于 浏览器的 文件的查找，实现后退功能
4）Map:查找表
 *  以key-value对的形式存储元素
 *  其中key不可以重复（equals比较）
 *  常用的实现类：HashMap(散列表，散列算法实现）
   1）V put(K k,V v)信息存入Map
	 * 若给定的key在map中已经存在，则是替换value操作
	 * 那么返回值就是被替换的value值。否则返回值为null.
	*map不关心顺序
   2）* V get(K k) 根据K获取对应的value
	   * 若给定的Key在Map中不存在，则返回值为Null
	   * 当Value是包装类类型时，尽量不要用对应的基本类型变量接收。
	 避免因自动拆箱导致的空指针出现。
 *遍历map中的元素的三种方法
	   1)遍历Key			Set<key> keySet()
	   * 该方法会将当前Map中所有的key存入一个Set集合后返回。
	   * 那么遍历该集合的所有元素就相当与遍历当前Map中所有的Key
	   2) * 遍历每组键值对	 Set<Entry> entrySet()
	 * 该方法会将每组键值对存放在一个Set集合后返回
	 Entry是Map的内部类，每一个实例用于表示Map中的一组键值对。	
	   3) 遍历所有的value	Collection values()
	 * 将所有的value存入一个集合后返回	

 * 作为HashMap的key的元素equals方法与hashcode方法
 * 返回的结果直接影响着散列表的查询性能
 * 当我们重写equals方法就是应当连同重写hashcode，
2016.09.30
一、file
 * 当前项目目录中创建新文件test.txt
 * 若是在当前目录下，“/.”可以忽略不写
 * 用途：自动生成
 File file = new File("text.txt");
 判断文件是否存在	boolean exists()	
 创建文件			file.createNewFile();
 删除文件		 file.delete();
 创建目录		 dir.mkdir();
 * 在当前目录下创建目录
 File dir = new File("a/b/c/d/e/f");
 dir.mkdirs();
 删除目录			 dir.delete();
 * 删除目录有一个要求，就是该目录必须是一个空目录
 * 判断当前File表示的是文件还是目录
 File[] subs = dir.listFiles();
 * boolean isDirectory
 * boolean isFile()
 * 根据文件过滤器来获取一个目录中满足要求的所以子项
  if(dir.exists()){
	FileFilter filter = new FileFilter(){
		public boolean accept(File f){
			System.out.println("查询中"+f);
			return f.isFile();}};
	File[] files = dir.listFiles(filter);
二、RandomAccessFile
基于指针形式读写文件数据
 * 创建RandomAccessFile有两种常用的模式
 * 只读模式与读写模式
 * 有两种常用的模式:
 *1, RandomAccessFile(String path,String mode)
 *2,RandomAccessFile(File file,String mode)
 * 模式对应的字符串：
 * r:只读模式
 * w:读写模式	
	  读写模式，若raf.dat不存在，会新建一个;
	  只读模式，若raf.dat不存在，则会报错，
	  //一个字节等于8位的二进制
* 位置 .seek();
*  得到指针的位置
* void write(int d);
  * 向硬盘写出数据只能写2进制信息；
  * 因为java不能直接得到二进制，所以给我们的替代方案是写一个int值，该方 法会将该int值对应的2进制写出，
  * 但是该方法只会写出1个字节，写的是该int值对应的2进制的“低八位”
  * 整数int有4个字节，32进制，
  raf.close();//用完之后一定要关
* int read();
  * 从文件中读取1个字节，并以10进制的int值形式返回，若该方法返回值是-1，
  * 则表示读取到了文件末尾（EOF end of file）,永远不可能读到-1 *
  * -1的二进制为：11111111 11111111 11111111 11111111 
  * 只取后8位 11111111变成为255 
* RandomAccessFile提供了便于读写基本数据类型的相关方法，以及指针的操作
  raf.write(max>>>24);
  raf.write(max>>>16);
  raf.write(max>>>8);		raf.writeInt(max);
  raf.write(max);
		




2016.10.08
流是单向的，读和写只能是其中一个,输入流是用来读的，输出流是用来写的
节点流:低级流的数据源是明确的,是真实帮助搬运数据的,读写数据必须有节点流.
处理流:高级流不能独立存在,并且可以不存在.高级流可以简化处理操作.
一、低级流
文件流
* 文件流创建时有两种方式：
  1：覆盖写操作，即：创建针对文件的输出流后，会先将该文件中所有数据
	 清除，然后再通过该流写出数据
  2：追加写操作，多传入一个boolean值参数，当该参数为true时，则为追加
   写操作。false则还是覆盖写操作，追加写操作是接着文件末尾开始本次写操作。
FileOutputStream :从文件中写出数据
  * byte[] getBytes(String csn) ：String能将字符串转换为字节数组
   * 流用完一定要关闭，释放底层资源（native c语言来做）
FileInputStream :从文件中读取数据
  *String str = new String(data,0,len,"UTF-8");
	将字节数组转换为字符串
   * 使用文件流复制文件
   	byte[] data  = new byte[1024*10];
	int len  = -1;
	while((len=src.read(data))!=-1){
		desrc.write(data,0,len);}



二、高级流（功能记忆）
1)缓冲流：功能：加快读写效率  复制
BufferedOutputStream
 * flush方法会强制将当前缓冲区中的数据一次性写出。
BufferedInputStream
 * 缓冲流，是一对高级流，作用是可以提高读写效率
2)对象流：
 * 第一，对象流输出  需要实现Serializable的签名接口
 * 第二，对象流输入  需要写serialVersonUID有利于反序列化
 * 第三，对象流的瘦身  transient将非关键属性忽略
ObjectOutputStream:可以将任意对象写出
 * 先将对象按照其结构转换为一组字节后通过其处理的流写出
   经过两个过程
   对象序列化和持久化（写到硬盘上）
ObjectInputStream ：可以将一组字节还原为对象
 * （前提是读取的这组字节应该是通过OOS将一个对象转换的）
 * 将一组字节欢迎为对象的过程称为：对象反序列化

3)字符流中的转换流 格式转换，转码工作
备注：转码工作只针对字符流的txt类型文件，这种流可以直接转码，或单纯的缓冲字符流也可以直接转码。
PrintWriter pw = new PrintWriter("pw.txt","GBK");
OutputStreamWriter：以字符为单位读写数据，简化了字符串与字节之间的转换工作，可以根据指定字符集读写字符串。
InputStreamReader：可以案子指定字符集读取字符
一次只读一个字符、一次读一组字符
4)字符流中的缓冲字符流 
PrintWriter：缓冲字符输出流，可以按行输出字符串，并且PW具有自动行刷新功能，其内部的缓冲效果是靠BufferedWriter实现的，提供了多种构造方法，可以方便创建。
pw可以传入字节流，也可以传入字符流。直接传入字节流按照系统默认的字符集写出字符，不能进行字符类型的转换，例如UTF-8不能转换为GBK
* 创建PrintWriter时，若构造方法的第一个参数为流（字节流，字符流均可）
* 就支持第二个参数，该参数为boolean值，若该值为true,则当前pw具有自动行刷新功能。即，每当使用println方法写出字符串时都会自动flush.
 * 注意，print方法不会自动刷新

BufferedReader：缓冲字符输入流，特点是可以按行读取字符串
*使用类加载路径不能读取原程序，JVM运行时读取的是bin目录下的文件，而非src下面的文件。
 *一次性读取若干字符，直到读取到换行符为止
 *然后将这些字符以一个字符串返回
 *返回字符串中是不含有最后的换行符的
 *如果本次读取时发现是文件末尾，则返回null


2016.10.09
			 
2016.10.9
一、异常的定义及处理
*自定义异常  ：用来说明业务逻辑错误
  继承Exception或子类,不能继承RuningTimeException,并非常识性异常
  Exception继承了serializable的类，自定义异常需要序列号
/********
 为什么要序列化？在字符流的时候也需要序列化，方便转译
						***************/
*使用throw抛出异常
 必须在该方法上使用throws声明，并且调用该方法的代码必须处理这个异常。
 否则编译不通过。
 只有RuntimeException及其子类异常抛出时不要这样做。
*处理异常的方式有两种
 1、try-catch捕获并处理，避免闪退
 2、继续在该方法上使用throws抛出这些异常
二、异常的重写  父类throws的重写原则
  * 重写可不抛出异常、可抛出的部分异常、可抛出子类异常
  * 不允许抛出额外异常、不允许抛出父类型异常
三、异常API
   e.printStackTrace();//错误位置
   System.out.println(e.getMessage());//错误内容
四、自己处理异常
 * try-catch
   JVM在执行下面代码中若出现空指针时会实例化一个NullPointerException
	的实例，并将代码从开始到出错的全部执行过程设置到该异常实例中（
	相当于错误报告）然后将该异常抛出。
   try块中出错以下代码均不再被执行，所以下面的输出并不会被执行
   catch用来捕获try块中出现的异常
   catch块里面用来定义解决异常的代码
   catch可以定义多个，针对不同的异常有不同，
	最后一个catch中捕获Exception，这可以避免try块中的代码出现可一个
	未捕获的异常导致程序中断
	当捕获的异常中存在父子类继承关系时，子类异常应当先捕获， 
	父类异常后捕获。
 * finally块：定义释放资源等操作
	必须定义在catch的最后，可以保证无论try块中的语句是否出现异常一定
	会执行其内部的代码。
   备注：
 1）fianalize是Object中定义的方法，作用是当GC即将回收一个对象时，
	会调用其finalize方法。	
   fianlize通常不会重写，除非特别关注一个对象被回收。finalize方法
	不应当有耗时操作。
/*
 2）return 有两种方法：1、跳出方法 2、中止方法体return后面的程序
  不对啊！！！！！
*/
2016.10.10 
day10
Thread
1) 获取线程状态   
   获取姓名.getName  获取地址.getId  获取优先级 .getPriority
   判断是否活跃 .isAlive  判断是否是守护进程.isDaemon 
   判断是否中断  .isInterrupted
2) 方法的功能
	Thread.currentThread  获取当前运行的线程
	.start  启动线程
   .setPriority 设置线程优先级，可使线程提前运行完程序
   .setDemo 前端线程运行结束后，守护线程都退出进程 ，必须在启动之前设置
   .sleep  使线程 中断 指定的时间间隔
   .join 当前线程阻塞，执行另一个线程，当另一个线程执行结束，开始运行当前线程
   备注：如果当前的变量要被其他局部内部类引用，需要定义成final类型的
		 变量不可以用public来修饰
3）创建线程的两种方式
	* 方式一：继承Thread并且重写run方法
	  缺点：耦合性强、继承性差
	* 方式二：单独定义线程任务，实现Runnable接口
	* 使用匿名内部类完成线程的两种方式创建
4）synchrionized的使用情况，相当于“一把锁”的功能
	* 解决并发安全问题，就是要将多个线程“抢”改成“排队”执行
	 （同步方法） 修饰非静态方法，调用方法的对象被锁住  Thread.yield
	  (同步块）   修饰 方法里面容易出错的语句  用this代表多线程调用的
					同一个对象。
	 （同步静态方法）修饰静态方法，任何时候都同步，锁住的是类对象
	* 互斥锁 
	   当synchronized修饰两段不同代码，但是同步监视器对象相同时，
	   这两段代码就具有互斥性，多段代码（除静态方法）也可以。
	* 死锁
	   两个线程都在等待对象先释放锁
5)集合的方法转为  线程安全的方法
  Collections 下的方法将其转换为线程安全的：
  map = Collections.synchronizedMap(map);
  注意：
   * 所有线程安全的集合都要注意一个事项 使用迭代器遍历集合不与集合
	 增删元素等操作互斥
   * （在一个类中时，遍历集合的方法与增删元素的方法不同时
	 synchonized, 所以不互斥） 所以多线程情况下需要自行维护互斥关系。
6）线程池  类公交总站
   线程池只要解决两个问题
   1、控制流程数量
   线程过多会导致CPU过度切换，资源消耗大，拖慢系统严重时可能导致系统崩溃
   2、重用线程
   线程频繁创建与销毁会给系统带来很大的负担。所以应当重用线程。
   *创建线程池
 ExecutorService threadPool = Executors.newFixedThreadPool(2);
   *运行线程
 threadPool.execute(run);
   *告知线程池运行完毕，关闭线程池中的线程
 threadPool.shutdown();
   *立刻暂停线程池中的线程
 threadPool.shutdownNow();


		 



大数据行业
IT行业 教育 银行 航天 美团、京东  生物科学

大数据：数据分析、数据挖掘、数据架构
软件：数据库管理、数据库开发

2016.10.12	
TCP 可靠传输协议
UDP 不可靠传输协议

聊天客户端
Socked   * 使用构造方法初始化对象时
			通过Ip可以链接到服务器段的计算机，通过端口链接到运行在
			服务器端计算机上的服务端应用程序
ServerSocked  
		   *使用构造方法初始化对象时
		创建时申请服务端口，不能与系统中其他应用程序已经使用端口冲突
	   *.accept()
		监听申请的服务端口直到一个客户端通过端口与服务端建立链接




2016.10.14
1）Maven导入.jar
   找到pom.xml，双击打开
   1  如果有Maven，则在Dependenties中的add中查找，并导入
   2  在阿里云 的maven下载配置，
2）手工导入.jar包
   在项目下new folder,建立一个lib
   并且把.jar的文件复制到lib里面
   在项目下右击选择  properties 中选择 Java Builder Path 
   在libraries中Add JARS……
   
用到.txt文件的两种情况
1、为了使程序变得灵活，需要把变量放在.txt文档中，方便读写
2、网页传输文件都是.txt形式的文件

用java读取.txt文档的方法
1、存在.txt文档
2、输入流读取.txt文档
3、用DOC中的XML方法将.txt文档从头到尾解析成Document文档
4、寻找Document的root
5、在root中寻找下一级的内容
6、创建一个Object的对象
7、创建一个集合存放这种对象
8、遍历的时候就仅遍历集合啦
一、使用DOM解析XML的过程
   1.创建SAXReader
   2.使用SAXReader读取xml文档并生成Document对象
	 这一步就是DOM耗时耗资源的地方
	 因为DOM在读取XML文档时就会将XML文档所以的内容读取
   并且加载到内存，所以这个预处理较慢，并且内容存入内存所以消耗系统资源。
   3.通过Document获取根元素
	* Document提供了获取根元素的方法
	* Element getRootElement(） 
	* Element 的每一个实例都用来表示XML文档中的一个元素（一个标签）
   4.通过根元素根据XML文档结构逐级获取子元素，以达到获取XML文档信息的目的。
  * Element 提供了获取元素的相关方法
  * List elements(); 获取当前元素中的所有元素
  * List element(String name)获取当前元素下指定名字的所有同名子元素
  * Element element(String name) 获取当前元素下指定名字的子元素

二、使用XPath检索XML文档信息

   1.创建SAXReader
   2.使用SAXReader读取xml文档并生成Document对象
	 这一步就是DOM耗时耗资源的地方
	 因为DOM在读取XML文档时就会将XML文档所以的内容读取
   并且加载到内存，所以这个预处理较慢，并且内容存入内存所以消耗系统资源。
   3.通过Document的selectNodes方法的路径获取元素
   String xpath = "/list/emp[age<23 and gender='女']/salary";
   List<Element> list = doc.selectNodes(xpath);

三、 生成XML文档的大致步骤
   1、创建一个Document表示一个xml文档
   2、向文档中添加跟元素
   * Element addElement(String name)
	  添加给定名字的元素，并将该元素返回，以便追加操作
	  需要注意，Document的添加根元素方法只能调用一次
	  因为一个文档只能有一个根元素
   3、案子预订的格式从根元素开始逐渐添加子元素
   4、创建XMLWriter
   5、将Document对象通过XMLWriter写成xml文档

JAVA编程思想
计算机编程艺术
JAVA核心技术

数据库基础

背景

输出流写入文件存档的瓶颈：
文件中含有大量的数据，在文件中进行 增、删、改、查时需要调动所有的数据
改动比较困难
数据库将数据的改动方法固化在里面了
Oracle  SQL
DB2	 IBM
SQL Server
MySQL 开源免费
java开发环境	 web bean \ IDE \ JBuilder\eclipse

表的数据库遇到的瓶颈：
表与表之间建立关系  ，通过t_id作为参照关系。
表与表之间关系类型：（数据关系）两张表出现三种关系，一对一、一对多、多对多
Structured Query Language 数据库共有语言
用来查询数据、操纵数据、定义数据、控制数据

注意：oracal在服务端，在安装时必须记住名字和密码，这是进入服务端数据库的入口
问题：与oracal的服务器传递命令进行沟通，需要通过代码打开服务器的系统，并且打开服务端的oracal服务端
 方法：SQL developer的图形化界面，方便与ORACLE系统进行沟通，进行数据的写入。

数据类型不参考JAVA的数据类型
NUMBER 定长数字
CHAR 定长字节的字符串，最大2000字节，查询速度快
VARCHAR2 只在oracle中用，变长的字符串，最大4000字节，空间利于好
DATE 最多精确到s,长度为7字节，默认为DD-MON-RR，非字符串，而是字节
创建表DDL
方括号里面的内容可写可不写

一、DDL
 数据定义语句，作用是增删改数据库对象
 数据库对象包括：表、视图、索引、序列
 CREATE语句：创建数据库对象
 DEFAULT 关键字为字段添加默认值NULL,只用DEFAULT为字段单独设置默认值。
 NOT NULL 约束要求指定的字段值不允许为空
 DROP语句：删除数据库对象
 DESC 语句：查看表结构
 RENAME TO 语句：修改表名
 ALTER语句：修改数据库对象
			2.1为表添加新字段
			  添加的新字段只能被追加在表的最后，不能在表中插入新字段
		   ALTER TABLE myemp_hehy
		   ADD(
			 hiredate DATE DEFAULT SYSDATE   )
			2.2删除字段
			删除表字段时间长，修改表结构尽量在表格没有数据的时候进行
		  ALTER TABLE myemp_hehy
			DROP(hiredate)
			2.3修改表中现有字段
		   当表中已有数据时，尽量不要修改数据类型，且长度尽可能是扩大而
		   不是缩小否则可能修改失败，修改只能修改字段的类型、长度、默认
		   值与否而不能修改字段名
		 ALTER TABLE myemp_hehy
		  MODIFY(
		  job VARCHAR2(40) DEFAULT 'CHERK')

创建表需要注意的问题：
1、不是大括号包围，而是小括号包围
2、语句之间需要写小分号
3、不能有中文的逗号，程序全部用英文格式
4、同一个用户名创建的是同一个数据库，所以表的名字要跟其他同学的区别开
5、数据库中字符串的字面量是使用单引号（'')括起来的字符串内容是区分大小写的
6、SQL语句不区分大小写，但是通常为了提高可读性，会将所有关键字全部大写，非关键字全部小写来定义。
7、DEFAULT不可视，但是NOT NULL是可视的

案例
CREATE TABLE employee_hehy(
  name VARCHAR2(2) NOT NULL,
  gender CHAR(1) DEFAULT 'M',
  )
DROP TABLE employee_hehy
DESC myemp_hehy
RENAME employee_hehy to myemp_hehy



二 DML语句 
表中数据的操作 伴有TCL 后悔机会，类似Excel
DML是对表中的数据进行操作的语句，包含 增、删、改 三个操作，是伴有事务的。

1、INSERT语句 插入数据
   INSERT 时可以不指定字段名，若不指定则是全列插入
   插入日期数据通常使用TO_DATE插入指定格式的日期
   在SQL中MM跟mm是相同的意思，分钟使用MI表示的
2、UPDATE语句用于修改表中数据
   UPDATE通常要使用WHERE子句添加过滤条件
   若不添加WHERE子句，则是表中所有记录都进行修改
3、DELETE语句，用于删除表中数据
  通常也要使用WHERE来限定删除的记录
  有两种删除表的方式
  1.DELETE 是逐行删除，有后悔的机会
  2.TRUNCATE TABLE+表名 是DDL的方法，直接删除表
查询表中信息SELECT * FROM myemp_hehy
提交COMMIT
案例

INSERT INTO  myemp_hehy(id,name,job,salary) 
				 VALUES(1,'J','MANAGER',5000)
INSERT INTO myemp_hehy
				 VALUES(1,'a','F',SYSDATE,5000,'CLERK',10)
				 TO_DATE('1992-08-02','YYYY-MM-DD')
UPDATE myemp_hehy SET name ='jackson',gender='F'
				  WHERE id = 2;
DELETE FROM myemp_hehy WHERE id = 1

UPDATE t_air_rate SET rat_percent ='0.999'
				  WHERE biz_code='100000000000002' and type_id = '2' and pay_flg = '0101';



DQL 查询不更改数据，查询的花样比较多，需求多
DCL 管理数据库，给数据库加新用户
DBA不花钱可以考，在Oracal
语句的功能和写法


2016.10.21
DQL:  SELECT语句,用于查询数据
注意：
1）SELECT 语句至少包含两个子句
2）SELECT子句：指定要查询的字段，这里可以包含表中字段、表达式、函数
3）FROM子句：用于指定查询的表
4）dual：伪表，不是真实的表，当查询的内容不与任何实际表中数据有关时，
可以使用伪表满足SELECT中FROM的格式要求必须写



一、字符串函数
1）查看每个员工的年薪   sal*12  
2）合并字符串  
合并字符串		   CONCAT(CONCAT(enname,':'),sal) 
"||"用于连接字符串   enname||':'||sal  
3)求字符串长度		 LENGTH(enname)   查看每个员工名字的字母长度
4)转换大小写
转换字符串大写	   UPPER（'helloworld'),
转换字符串小写	   LOWER（'HELLOWORLD'),
转换字符串首字母大写 INITCAP('HELLO WORLD')
5）去除指定字符
去除字符串两边的指定字符，必须是单一字符
				 TRIM（'e' FROM 'eeeeeeliteeeee')
去除左边指定字符，可以是多个字符
				 LTRIM('esdessdselitsedesd','esd')
去除右边指定字符，可以是多个字符
				 RTRIM('esdessdselitsedesd','esd')
6）补位函数
左对齐			  RPAD（sal,5,'  ')
右对齐			  LPAD（sal,5,'  ')
7)截取字符串		SUBSTR（char,m[,n])
m的值可以为负数，含义是从字符串的后面倒数，但是n的值不能为负数,数据库中下标都是从1开始的！
8）查看char2在char1中出现的位置   INSTR(char1,char2[,m,n])
m为从指定位置开始查找，不写默认为1，n为第几次出现，不写默认为1
9）DQL中使用WHERE子句	   
WHERE中使用函数作为过滤条件		WHERE LENGTH(enname)>=5
查看名字中含有'a'的员工信息
SELECT *
  FROM emp_hehy
  WHERE  INSTR(enname,'A')>0

二、数值函数
1）四舍五入			  ROUND（n,[,m])
对n进行四舍五入，保留小数点后m位，m不写默认为0，即保留到整数位
							 m为负数则是十位以上的数字
2)TRUNC函数，截取数字  TOUNC（n,[,m])
3)求余				   MOD(m,n)
4)向上与向下取整		CEIL(45.67),FLOOR(45.67)  
三、日期类型函数
1）DATE 与TMIESTAMP
时间戳前7个字节与DATE一致，后4个字节存秒以下的精度，最多可以表示到纳秒
2）SYSDATE：返回一个表示当前系统时间的DATE类型值
3）SYSTIMESTAMP：返回一个表示当前系统时间的时间戳类型的值
4）转换函数	 将字符串按照给定的日期格式解析成DATE	  
				   TO_DATE(char,format)
在日期格式字符串中，不是英文，符号，数字的字符都需要使用双引号括起来
TO_DATE('2008年08月08日 22:08:08','YYYY"年"MM"月"DD"日HH24:MI:SS')
5）DATE比较大小
可以比较大小，早的小晚的大；两个日期可以相减，差为相差的天数
日期也可以进行加法，加上一个数等于加上指定的天数
6)将给定的日期按照指定的格式转换为字符串
				   TO_CHAR(DATE,format)
	 TO_DATE('87-08-08','RR-MM-DD'),'YYYY-MM-DD'
	 TO_CHAR(TO_DATE('49-08-08','RR-MM-DD'),'YYYY-MM-DD'))
7)返回给定日期所在月的月底日期   LAST_DAY(date)
8)对给定日期加上指定的月，若i为负数，则是减去指定的月
							ADD_MONTHS(date,i)
9)计算两个日期之间相差的月	   MONTHS_BETWEEN(date1,date2)
10)返回给定日期之后7天内的周几的 NEXT_DAY(date,i)
   日期i取值1-7,分别表示周日，周一...
11)求最小值与最大值			  LEAST,GREATEST
		 LEAST（SYSDATE，TO_DATE('2008-08-08','YYYY-MM-DD'))
12)EXTRACT提取给定日期指定时间分量对应的值
				  EXTRACT（YEAR FROM SYSDATE）
四、NULL
1）插入NULL  
--显示插入NULL	VALUES(1001,'林平之',NULL);
--隐式插入NULL	VALUES（1002，'张无忌');
2）更新为NULL
UPDATE student_hehy	SET gender = NULL
3）NULL作为判断条件的注意事项
判断是否为空要使用：IS NULL 和IS NOT NULL
DELETE FROM student_hehy
WHERE gender IS NULL
4）NULL的运算
NULL与字符串连接结果等于什么也没做；NULL与数字链接结果还是NULL
5）空值函数	  
NVL（n1,n2)
若n1的值为NULL函数返回n2的值，否则返回n1本身
所以NVL函数的作用是将NULL值替换为非NULL值
NVL2(n1,n2,n3)
当n1不为NULL时，函数返回n2；当n1为NULL时，函数返回n3
SELECT enname,comm,NVL2（comm,'有绩效','没有绩效')


2016.10.22

字段的别名:增加“查询字段”可读性、替代和简化表的名称
注意：当别名中希望出现空格或者区分大小写时，可以使用双引号括起来
SELECT enname,sal*12 "Annual Salary"
一、WHERE相关过滤条件的写法：
1）
--不等与通常使用<>
2）
AND和OR 链接多个条件
AND的优先级高于OR，所以要想提高OR的优先级，需要使用括号。N'
3）
LIKE关键字用于添加模糊匹配字符串的条件，支持两个通配符：
“_”:表示任意一个字符
“%”：表示任意个字符（0—多个）
4）
IN(list) 判断是否在列表中或者不在列表中
IN常用在子查询的判断中使用
5）
BETWEEN ...AND....
--大于等于小的 小于等于大的
WHERE sal BETWEEN 1500 AND 3000
6）
ANY（list),ALL(list)
当需要判断>,<,>=,<=一个别表中的数据时，
要搭配ANY与ALL使用
通常判断的内容不是确定值，而是用于判断子查询的结果
>ANY:大于最小的
<ANY：小于最大的
>ALL:大于最大的
<ALL:小于最小的
WHERE sal>ANY(3500,4000,4500)
7）
DISTINCT 可以将结果集中指定字段值重复的记录去除，
DISTINCT应当紧跟在SELECT之后
DISTINCT对于多个字段去重
去重原则：多字段值的组合没有重复
SELECT DISTINCT job,deptno

二、结构集排序
ORDER BY子句
ORDER BY可以根据其后指定的字段按照升序或者降序进行排列
ORDER BY子句只能写在SELECT语句的最后一个子句上
DESC 是降序；ASC或默认 是升序
查看公司工资的排名
ORDER BY deptno,sal DESC

三、聚合函数
用来统计结果集指定字段的值
1）
MAX，MIN：求最大值与最小值
SELECT MAX（sal),MIN(sal)
2）
AVG，SUM：求平均数与总和
SELECT AVG（sal),SUM(sal)
3）
聚合函数忽略NULL
4）COUNT函数
COUNT统计的是指定字段不为NULL的记录总数
COUNT不是对值的统计，而是对记录的统计
通常可使用COUNT（*）统计记录数
SELECT AVG(NVL(sal,0))
四、分组
GROUP BY子句
GROUP BY子句可以将查询结果集按照其后指定的字段值相同的记录划为一组
分组的目的是配合聚合函数做细化的统计工作
当SELECT子句中使用了聚合函数，那么凡是不在聚合函数中的单独字段必须出现在GROUP BY子句中，反过来则不是必须的
查看每个职位的平均工资
SELECT AVG（sal),job
FROM emp_hehy
GROUP BY job

WHERE子句中不能使用聚合函数作为过滤条件，原因在于过滤时机不对。
WHERE是在查询表获取结果集的过程中对表中数据逐条过滤，以形成结果集。
聚合函数是建立在结果集基础上进行的，所以使用聚合函数的结果过滤是在WHERE
之后进行。

HAVING子句
HAVING子句必须跟在GROUP BY子句之后
HAVING可以使用聚合函数作为过滤条件
HAVING决定着GROUP BY分组的取舍

五、关联查询
结果集中的字段来自多张表关联查询
在查询的字段在多张表中都有时，需要明确指定字段来自哪张表，表可以定义别名，来简化SQL语句的复杂度
查询每个员工的信息以及其所在部门的信息
SELECT e.enname,e.deptno,d.dname
FROM emp_hehy e,dept_hehy d
WHERE e.deptno = d.deptno
多表关联查询通常要添加链接条件，否则会产生迪卡儿积，这是一个无意义的结果，并且开销巨大。

过滤条件要与链接条件同时成立
查看SALES部门的员工？
SELECT e.enname,e.sal,e.job,d.dname
FROM emp_hehy e,dept_hehy d
WHERE e.deptno = d.deptno
AND d.dname = 'SALES'
N张表联合查询，至少要有N-1个链接条件
内链接
FROM emp_hehy e JOIN dept_hehy d
ON e.deptno = d.deptno
关联查询忽略不满足链接条件的记录

外链接在进行关联查询时除了可以将满足条件的记录查询出来之外，
还可以将不满足链接条件的记录查询出来。
外链接分为：
左外链接： LEFT OUTER JOIN
		  以JOIN左侧的表作为驱动表 驱动表中的数据都要显示出来，
		  那么当某条记录不满足链接条件时，那么来自JOIN右侧表的
		  字段全部补为NULL值
右外链接：RIGHT OUTER JOIN
	   以JOIN右侧的表作为驱动表 驱动表中的数据都要显示出来，
	   那么当某条记录不满足链接条件时，那么来自JOIN左侧表的
	   字段全部补为NULL值
全外链接：FULL OUTER JOIN
自链接
设计用于解决保存性质相同的数据但是又存在上下级关系的树状结构数据时使用



2016.10.24
一、子查询
子查询是嵌套在其他SQL语句中的，为外层SQL语句提供数据。
1）DDL中使用子查询
可以基于一个结果集快速创建一张表-----复制一张表
CREATE TABLE employee_hehy
AS
SELECT e.empno,e.enname,e.sal,e.deptno,d.dname,d.loc
 FROM emp_hehy e,dept_hehy d
 WHERE e.deptno = d.deptno(+)
 当使用子查询创建表时，若SELECT中的字段含有函数或者表达式，必须指定别名
 -----如果不指定别名，在查询此类字段的时候，会影响语句的可读性，这是为了语句的严谨规定的
2）DML中使用子查询2
 1）WHERE、HAVING 中子查询情况
 WHERE deptno = (SELECT deptno
				 FROM emp_hehy
				 WHERE enname = 'JONES')
多行单列子查询要配合IN，ANY，ALL进行过滤查询
WHERE deptno IN (SELECT deptno
				FROM emp_hehy
				WHERE job = 'SALESMAN')
	  AND job<> 'SALESMAN'
 2）EXISTS 关键字 NOT EXISTS
 EXISTS 后面跟一个子查询，当该查询可以查询出至少一条记录时返回真
 SELECT deptno,dname FROM dept_hehy d
 WHERE  NOT EXISTS (SELECT * FROM emp_hehy e
			   WHERE d.deptno = e.deptno)
 3）FROM 中子查询情况
 FROM 当中使用子查询，就是将子查询的结果集看成一张表看待
	  FROM  emp_hehy e,
			  (SELECT AVG(sal) avg_sal,deptno
					FROM emp_hehy
					GROUP BY deptno) t
	  WHERE  e.deptno = t.deptno
	  AND e.sal>t.avg_sal
 
 4）子查询在SELECT子句中的应用
	 SELECT e.enname,e.sal ,(
				SELECT d.dname
				FROM dept_hehy d
				WHERE d.deptno = e.deptno) deptno
	 FROM  emp_hehy e
----子查询可以放在WHERE 、HAVING 、 FROM 、 SELECT
----出现函数、表达式的时候 ，要写别名
----子查询可以按照查询的结果进行划分：多行多列、多行单列、单行单列

二、分页查询
分页解决问题：
资源消耗多，传输速度慢，需求数量少
分页的问题：
未规定SQL语言标准，属于方言

分页查询
当数量库中查询的数据量过大时，会使用分页查询，
一次查询出部分数据，这样做可以降低系统资源消耗，
提高数据库响应速度，减少网络传输等
分页查询标准SQL中没有为其定义语法，所以不同数据库中分页语句写法不同。

ROWNUM：伪列
ROWNUM不存在于任何表，但是任何表都可以查询该字段，
该字段的值随着查询的结果集的产生而动态生成值。
当查询语句从表中查询出一条记录时，该记录的ROWNUM字段值从1开始，
每当查出一条记录ROWNUM自增1.
在使用ROWNUM为结果集编号的查询过程中，不应当使用ROWNUM>1以上数字的判断作为过滤条件，否则得不到任何结果。
ROWNUM需要起一个别名，为了避免跟父查询 冲突

查看公司工资排名6-10
排序、编号、分页
SELECT *
FROM （SELECT ROWNUM rn，t.*
	   FROM  (SELECT enname,sal
			  FROM emp_hehy
			  ORDER BY sal DESC) t  
	   WHERE ROWNUM<=10	   )------增加了查询的效率
WHERE rn >=6
 

每页所显示的条数:pageSize
页数：page
例如：
pageSize :5
page :2
算法：
start = (page-1)*pageSize+1
end = pageSize*page
 
三、DECODE 分支函数 参数替换
DECODE函数,可以实现分支效果
当第一个参数等于第二个参数值，函数返回第三个参数值，
否则判断是否等于第四个参数值，
若相等返回第五个参数值，以此类推。
最后可以单独指定一个参数，若当前的所有判断都不成立时返回最后单独的参数，
若不指定，函数返回NULL。函数要求至少传入三个参数。
方法一、
SELECT enname,sal,job,
	  DECODE(job,
		  'MANAGER',sal*1.2,
		  'ANALYST',sal*1.1,
		  'SALESMAN',sal*1.05,
		  sal) bonus
FROM emp_hehy
 方法二、
SELECT enname,sal,job,
	  CASE job 
			  WHEN 'MANAGER' THEN sal*1.2
			  WHEN 'ANALYST' THEN sal*1.1
			  WHEN 'SALESMAN'THEN sal*1.05
			  ELSE sal END
			  bonus
FROM emp_hehy
 
DECODE在GROUP BY中的应用可以将一个字段不同值的记录划分为一组
SELECT COUNT（*）,DECODE(job,
				'MANAGER','VIP',
				'ANALYST','VIP',
				'OTHER') 
FROM emp_hehy
GROUP BY DECODE(job,
				'MANAGER','VIP',
				'ANALYST','VIP',
				'OTHER') 
别名只能用于SELECT子句和FROM子句，不能用其他语句
解决问题：排序一般都是按照字母的顺序或者数字的大小排序的
如果想要按指定规则排序，需要重新定义
SELECT deptno ,dname,loc
FROM dept_hehy
ORDER BY DECODE(dname,
			   'OPERATIONS',1,
			   'ACCOUNTING',2,
			   'SALES',3);
			   

四、排序函数
排序函数可以将结果集按照指定的字段分组在按照指定字段对组内记录排序，
最终生成组内编号。
1）
ROW_NUMBER :生成组内连续且唯一的数字
SELECT enname,sal,deptno,
ROW_NUMBER() OVER(
   PARTITION BY deptno
   ORDER BY sal DESC) rank
FROM emp_hehy
2）
RANK函数：生成组内不连续也不唯一的数字
SELECT enname,sal,deptno,
RANK() OVER(
   PARTITION BY deptno
   ORDER BY sal DESC) rank
FROM emp_hehy
3）
DENSE_RANK:生成组内连续且不唯一的数字
SELECT enname,sal,deptno,
DENSE_RANK() OVER(
   PARTITION BY deptno
   ORDER BY sal DESC) rank
FROM emp_hehy
五、集合函数
普通并集A并B：UNION
全并集：UNION ALL 重复的元素会重复两次
交集A交B：INTERSECT
差集A非B：MINUS 
SELECT enname,job,sal
FROM emp_hehy
WHERE job = 'MANAGER'
UNION
SELECT enname,job,sal
FROM emp_hehy
WHERE sal>2500
六、高级分组函数
SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_tab_hehy
GROUP BY  year_id,month_id,day_id
ORDER BY year_id,month_id,day_id
查询每天、每月、每年、总共的销售额
方法一：分别求销售额，然后猜取并集
方法二：使用 ROLLUP函数
一、
ROLLUP函数：参数逐个递减 
SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_tab_hehy
GROUP BY ROLLUP(year_id,month_id,day_id)
二、
CUBE函数
CUBE会将每个参数的组合都进行一次分组，分组次数2的参数个数次方2^n
a,b,c；a,b；a,c；b,c；a；b；c；全集
SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_tab_hehy
GROUP BY CUBE(year_id,month_id,day_id)

灵活的高级分组
GROUPING SET（函数）
GROUPING SET 的每一个参数是一种分组方式，该函数会将这些分组统计的结果并为一个结果集显示
SELECT year_id,month_id,day_id,SUM(sales_value)
FROM sales_tab_hehy
GROUP BY
GROUPING SETS
((year_id,month_id,day_id),
(year_id,month_id))
ORDER BY year_id,month_id,day_id


2016.10.25
一、其他数据库对象，视图、序列、索引
1、视图
视图在SQL语句中体现的角色与表一致，但是视图不是表，只能对应一条SELECT语句查询结果集。
视图的作用：简化操作、设置访问权限
1）视图在创建或者修改的时候，“不需要删除”，只需要添加“OR REPLACE”f
2）删除视图不会影响基础表中的数据，但是删除视图中的数据（DML操作）会影响基础表数据
备注：1）主要功能是为了 可以避免重复写代码。
	  2）视图的创建是需要权限的，需要找DBA开权限
CREATE OR REPLACE VIEW v_emp_10_hehy
AS
SELECT empno id,enname name ,sal salary,deptno
FROM emp_hehy
WHERE deptno = 10;
3）查看视图的结构、视图数据 跟普通视图相同
4）*****
  当对应的子查询的某个字段是函数或者表达式时，那么该字段必须使用名。   
5）视图的分类
视图根据对应的查询语句的不同分为
简单视图:查询单一的一张表，且查询字段不包含函数、表达式，去重，分组等对数据进行加工的操作
复杂视图：与简单视图相反的就是复杂视图
链接视图：查询的数据来自多张表，链接视图算作复杂视图的一种
备注：可以对视图进行DML操作，但是仅能对简单视图进行。、
对视图进行DML操作就是对视图数据来源的基础表进行的，所以还不能违反基础表的约束条件*****如果某个字段非空，插入数据为空，则会显示插入不成功
6）对简单视图进行DML操作后，影响的数据若视图看不到，则会对基础表数据污染！ ******
   污染：视图和表不是同步增、改记录，删除不会影响
增加记录现象：对表，表中先增加记录，视图查询的是10号部门，无法显示记录。
修改记录现象：对表，表中先修改记录，视图修改的是20号部门，无法显示记录。
DELETE现象：对视图，视图对其有过滤作用，它是直接从视图中删除的。
 措施：
为视图添加检查选项后可以避免对视图进行DML操作后污染基础表
WITH CHECK OPTION--检查选项
为视图添加只读选项后，该视图仅能查询不能进行任何DML操作
WITH READ ONLY --只读选项
7）复杂视图：出现表达式、函数必须用别名
DROP VIEW v_emp_10_hehy
8）数据字典
user_objects
user_views
user_tables
SELECT object_name FROM user_objects
WHERE  object_name  LIKE '%_HEHY'
注意：在数据库里所有的字符串都是大写的
SELECT text FROM user_views
WHERE view_name = 'V_EMP_10_HEHY'
可以查询视图对应的SQL语句
SELECT table_name FROM user_tables
WHERE table_name LIKE '%_HEHY'
查询数据字典中表中的数据
二、序列
1、序列是根据指定的规则生成一系列数字
通常使用序列生成的数字为表的主键字段提供值使用
CREATE SEQUENCE seq_emp_id_hehy
START WITH 1----从1开始
INCREMENT BY 1----每次递增1
2、序列提供了两个伪列：
NEXTVAL：获取序列下一个数字
若是刚创建的序列，从START WITH 开始获取，然后每次获取时是根据步长运行计算得到的。
NEXTVAL会导致序列步进，且序列不能回退。
CURRVAL：获取序列当前值（最后一次使用NEXTVAL生成的数字）
新创建的序列至少调用一次NEXTVAL后才可以使用CURRVAL
1）SELECT seq_emp_id_hehy.CURRVAL
   FROM dual
   现象：不显示值，因为未使用NEXTVAL
2）SELECT seq_emp_id_hehy.NEXTVAL
   FROM dual
3）为EMP表主键添加序列
INSERT INTO emp_hehy
(empno,enname,sal,job,deptno)
VALUES
(seq_emp_id_hehy.NEXTVAL,'ROSE',3000,'CLERK',20)
3、删除序列
修改步长等需要重新创建
DROP SEQUENCE seq_emp_id_hehy
三、索引
所有的数据库都不需要指定索引算法
索引用于提高查询效率
索引的内建工作对用户是透明的，由数据库自行维护，我们只需要指定是否添加索引
索引是为表中的字段添加的。当一个字段经常出现在WHERE中作为过滤条件，或者ORDER BY或者 DISTINCT中时可以为其添加索引提高查询效率
为什么没有GROUP BY呢？？？
1、建立索引
1）字段索引
CREATE INDEX idx_emp_enname_hehy
ON emp_hehy(enname)

SELECT enname,job,deptno
FROM emp_hehy
WHERE enname = 'SCOTT'
2）复合索引
CREATE INDEX idx_emp_job_sal_hehy ON emp_hehy(job,sal);

SELECT empno, enname,sal,job FROM emp_hehy
ORDER BY job,sal;
3）函数索引
CREATE INDEX idx_emp_enname_upper_hehy
ON emp_hehy(UPPER(enname));

SELECT * FROM emp_hehy
WHERE UPPER(enname) = 'KING';

2、修改索引
重构：建立索引的表格在使用一段时间后，会增加数据，新增加的数据可能没有索引，所以需要重新构建索引
ALTER INDEX idx_emp_enname_hehy REBUILD
3、删除索引
DROP INDEX idx_emp_enname_hehy
4、如何提高查询效率
1）不要在小表上建索引
2）经常出现在WHERE、ORDER BY 、DISTINCT创建
3）经常关联条件
4）不要经常DML操作的表上建索引
四、约束
1、创建非空约束：NOT NULL 字段不能为NULL
去除：可以直接删除姓名
方法一、
name VARCHAR(30) NOT NULL,
方法二、
hiredate DATE
		CONSTRAINT employees_hehy_hiredate_nn NOT NULL);
2、NOT NULL约束是一个列级约束，
即：为某个字段添加该约束时必须是在定义该字段的同时进行。表创建后再为某个字段添加非空约束时，也要在修改字段的时候进行。
3、修改非空约束
ALTER TABLE employees_hehy
MODIFY (eid NUMBER(6) NOT NULL);
4、取消非空约束
ALTER TABLE employees_hehy
MODIFY (eid NUMBER(6) NULL);
五、唯一约束：
唯一性约束可以保证该字段的每一条记录的值都不重复，NULL值除外。
1、定义
方法一：
eid NUMBER(6) UNIQUE,
方法二：
email VARCHAR2(50),
hiredate DATE,----列级的约束，需要加‘，’唯一性约束支持列级约束、表级约束
 CONSTRAINT employees1_hehy_email_uk UNIQUE(email));
2、修改
表级约束支持,唯一性约束可以修改表的过程中可以直接添加约束条件
ALTER TABLE employees1_hehy
ADD CONSTRAINT employees1_hehy_name_uk UNIQUE(name);
3、删除后重新创建
DELETE FROM employees1_hehy
六、
主键约束：对系统无意义的数据，定义在一列上，非空且唯一,不能在动态数据上建立DATE
主键约束只能定义在表的一个字段上，并要求该字段的值非空且唯一
主键字段的目的是可以通过该值唯一定义表中的一条记录
1、定义
eid NUMBER(6) PRIMARY KEY,
2、删除、添加约束？？？？
七、
外键约束：主键对应的是外键
主键约束外键，外键要么是NULL要么是主键中有的
外键约束主键，只有先删除外建的相关信息，才能够删除主键
外键一般都不用，增删数据的限制表较复杂
八、检查约束：
可以定义多个CHECK约束，每个都写一条；用AND进行链接，写多个约束
ALTER TABLE employees2_hehy
ADD CONSTRAINT employees2_hehy_salary_check 
CHECK (salary>2000)



2016.10.26
李洪鹤   lihaha@tadu.cn
1、JDBC相关要点：
1）SUN定义接口，JDBC接口
   1)sun 统一提供了接口
	2）我们要学得就是这些接口
2）厂商实现接口，接口的实现类称为驱动（Driver）
	1）驱动：实现类
	2）由数据库厂商提供
3）SUN提供驱动的管理者：DriverManager
	1)是驱动的管理者
	2）有SUN提供
	3）帮我们实例化实现类
2、使用JDBC步骤：
1）调用DriverManger创建驱动
2）创建链接 Connection,实例化这个接口
3)创建对象Statement
   1)DQL executeQuery()
   2)DML executeUpdate()
	3)任何方法 execute()
4）关闭链接******
3、配置用DOM4J技术
  xml :相关、复杂
  properties:独立、简单
 driver、url、user、pwd
思路：get()、定义变量、static{}、properties的文件
4、连接池
1）DriverManager的问题
没有对链接数进行有效的管理和规划，当高并非时会导致数据库性能下降甚至崩溃
2）连接池的用途
它可以管理链接数，当连接数达到上限时，它会让调用者排队等待
它的内部可以存放一些链接，并可以让链接复用，提高效率
3）有哪些链接池？--由其他公司开发，而非SUN公司创建
DBCP
C3P0
4）连接池的6个工作场景
1》创建连接池会自动初始化一批（可配，初始连接数）链接，
 这些链接的状态都是空闲的
2》调用连接池获取链接方法，他会返回一个链接，状态变为占用
3》调用链接关闭的方法，是将其归还给连接池，状态变为空闲，内容清空
*****
4》连接池发现链接快不够用（可配，最小空闲链接）时，会再次初始化一批（可配，每次增加连接数）空闲链接
5》连接池发现内部有太多（可配，最大空闲连接数）空闲链接时，会将一批（可配，每次增加的连接数）链接关闭，保留一部分链接（最小连接数）
6》当连接池内占用链接达到数据库的极限（可配，最大连接数）时，下次请求连接池会让其等待		 

1、DBCP中连接池的类型是BasicDataSource
2、它设置参数的方法是setXXX（）
3、要使用此类需单独导入jar包
   使用maven搜索commons-dbcp

1、Statement和PreparedStatement
 1）Statement
	 适合执行静态（无条件）SQL
 2)PreparedStatement
	 适合执行动态（有条件）SQL


一、JDBC
day01
1)JUnit测试类：
  * 每个方法都可以像main那样单独运行，又互补影响，便于做测试。
  * 测试DBTool：必须是公有的，且没有返回值
   @Test
   public void test04(){
2)演示如何使用Properties工具类读取db.properties的中的参数
 *  这个类本质上就是Map，SUN设计它是专门用来读Properties文件的
	Properties p = new Properties();
 *  从p中湖区一个参数
	p.getProperty("driver")
3)文件流通用方法
   1.任何类都可以获取ClassLoader
  2.ClassLoader默认从编译路径（classes）下读取文件
  3.load()方法是将流中的数据读取到对象P里
   p.load(TestDay01.class.getClassLoader().getResourceAsStream("db.properties"));
4） * 1、演示如何创建链接
	* 2、演示如何执行DML语句
   1、加载驱动，告诉DriverManger要使用哪个厂商开发的哪个驱动（jar）
  Class.forName("oracle.jdbc.driver.OracleDriver");
   2、创建链接
 conn=DriverManager.getConnection("jdbc:oracle:thin:@172.176.0.42:1521:orcl","oracle","oracle");
  3、创建Statement
  Statement smt = conn.createStatement();
  4、执行SQL
   JDBC执行的SQL不能以分号结束	
	返回该SQL所影响（增加/修改/删除）的行数
	int rows = smt.executeUpdate(sql);

day02
一、项目
* 模拟转账的业务
* 1、为了巩固今天的内容
* 2、为了引出新知识点：事务。
* 
* 假设用户（付款）已经登录了网银，
* 要给别人（收款）转帐N元，目前已经输入收款方帐号和金额
* 
* 转账的实现流程：
* 1）查询付款方余额，看够不够
* 2）查询收款放，判断帐号对不对
* 3）修改付款方余额，减N元
* 4）修改收款放余额，加N元
二、解决方案：
1）转账是一个完整的流程，整个过程应该在一个事务之内，所以只能使用一个链接。  conn = DBUtil.getConnection();
2）事实上JDBC默认会自动提交事务，在调用excuteUpdate()时，
要保证当前业务在一个事务内，需要取消自动提交事务，改为手动提交事务。
	 conn.setAutoCommit(false);
3)抛出异常，让程序中断
	 if(payMny<money){
		throw new SQLException("余额不足");}}
4)代码正常执行结束后，提交一次事务
	  conn.commit();
5)发生异常时将数据回滚
	try {
		conn.rollback();
		} catch (SQLException e1) {
		e1.printStackTrace();
		throw new RuntimeException("回滚失败",e1);}
三、演示如何获取结果集元数据，以及如何从该对象中获取相关信息
	ResultSet rs =ps.executeQuery();
	通过结果集获取其元数据，包含了对结果集的描述信息
	即多少列，列名，列类型等
	ResultSetMetaData  md =rs.getMetaData();
	md.getColumnCount()
	md.getColumnName(1)
	md.getColumnType(1)
	md.getColumnTypeName(1)
四、演示如何使用PS执行查询，避免注入攻击
   String password ="123' or 'a'='a";
   String sql = "SELECT * FROM users_hehy WHERE password = ?";
   smt.setString(1, password);
五、演示如何使用PS执行DQL语句
   ResultSet rs = ps.executeQuery();
   if(rs.next()){
	System.out.println(rs.getString("ename"));
	System.out.println(rs.getDouble("sal"));}
六、 演示如何使用PreparedStatement执行DML语句
	Date hiredate = Date.valueOf("2016-10-27");//实例化日期
	 创建PS，他会立刻发送SQL
	PreparedStatement ps =conn.prepareStatement(sql);
	 设置参数值
	1）ps.set类型（？的序号，？的值）
	 2）注意保证个数和顺序
	ps.setString(1,ename );
	ps.setString(2, job);
	 3）让PS发送参数，并且让DB执行参数
	ps.executeUpdate();
七、1、测试DBUtil
	2、演示如何执行DQL
	查询方法返回封装结果的对象ResultSet
	它内部包含多行数据，每行含有多列
	该类是采用了迭代器模式设计的，所以通常采用WHILE进行遍历。
   ResultSet rs =smt.executeQuery(sql);
   while(rs.next()){
	//每次遍历得到一行数据，这一行数据含有多列
	//1.rs.get类型（列索引）
	  //2.rs.get类型（列名）
	  rs.getInt("empno")
	  rs.getString("ename")

day03
一、测试EmpDao.save()封装这些数据，然后保存
   Emp emp = new Emp();
	 emp.setComm(comm);
	 emp.setDeptno(deptno);
   Empdao dao = new Empdao();
   dao.save(emp);
二、测试EmpDao.findByPage()
   Empdao dao = new Empdao();
   List<Emp> list =dao.findByPage(3, 10);
		for(Emp e:list){
			System.out.println(e.toString());}}
三、演示如何做真分页查询
四、演示如何使用PS记录刚刚生成的ID
 * 场景：增加部门，然后立刻给此部门增加一个员工。
   1）先插入部门
  String sql ="INSERT INTO depts_hehy VALUES (depts_hehy_seq.nextval,?,?)";
   1、第二个参数是一个数组，存需要PS帮忙记录的字段的名字。******
			PreparedStatement ps = conn.prepareStatement(sql, new String[]{"deptno"});
   2、从PS中获取它记录的数据，返回的结果集中存了需要它记录的数据
	ResultSet rs =ps.getGeneratedKeys();
	  获取这些数据必须通过字段索引(字段序号deptno)获取,不能写字段
	int deptno = rs.getInt(1);
五、 演示如何使用PS批量插入108个员工。
	* 重点是如下3个方法的使用：
   * addBatch(),excuteBatch(),clearBatch()
	*这是固定的套路
	事务一般都是一次性插入数据，用一个链接
	这是一项业务，要保证在一个事务内，创建一个链接
六、emp包装类，与数据库进行交互
 * 1、建议采用封装类型Integer，支持NUll
 * 2、日期使用java.sql下的日期
七、创建DBUtil用来链接数据库
   1、使用静态块
	  只读取一次；驱动只需要加载一次
   2、返回值为Connection类型
	 static 不需要实例化对象，用起来方便
   3、创建一个新链接
	  抛出异常强制调用者CATCH，避免忘记关闭链接
   4、这个类引入了连接池管理链接，连接池代替了DriverManager.
	  它是DBTool的升级版
	  1）只读取一次链接参数
	  2）只创建一个连接池
	BasicDataSource bds = new BasicDataSource();  
	  3）将链接参数设置给连接池
   5、由连接池创建的链接，其close()被连接池改为归还的作用，而不是真正关闭链接。并且归还时，该链接内的数据被清空，状态重置为空闲态。






2016.11.4
day06
一、内置对象
1、String 
--JS的String 有length属性，而JAVA的String有length();
--JS比JAVA多了一个方法str.charCodeAt(n);
--JS比JAVA都少了一个方法x.replaceAll();
2、NUMBER
--四舍五入的方法：num.toFixed(n);
3、Boolean
--没有什么方法需要了解
4、Array
--1、如何创建数组
   方法一、JS中的数组都是Object数组，可以写任意值
	var arr1=["张三",25,true];
   方法二、JS中没有集合，数组跟集合类似
	var arr2 = new Array();
	arr2.push("李四");
	arr2.push(23);
	arr2.push(false);
--2、二维数组：数组中的元素也是数组
	var arr3 = [[1,"yi",true],[2,"two",false],[3,true]];
	console.log(arr3[0][2]);
--3、数组倒转
	var arr4 =[11,21,1,4,2,6,7,8];
	arr4.reverse();//可以不写返回数组，该方法直接在原来的数组中倒序
	console.log(arr4[0]);
--4、数组排序（important）
	 数组排序默认按照字符串比较排序
	arr4.sort();
	console.log(arr4);
	 *改变数组的排序方式
	调用方法既可以传数据，也可以传方法。
	 JAVA需要创建类、对象进行传递；JS中一切都是对象，可以直接传方法
	 Array.sort()的底层两两比较规则：
	  1、
	  2、
5、Math
--跟JAVA类似
  console.log(Math.PI);
--parseInt是取整，round()是四舍五入的取整,num.toFixed(n)
  console.log(Math.round(8.7));//9
6、Date
获取：浏览器的日期是从服务器获取的，并且接受的是字符串形式的日期
计算：对获取的字符串进行计算。
--获取客户机的当前时间
   var date1 = new Date();
   console.log(date1);
--创建固定时间（一般由服务器提供）
   var date2 = new Date("2016/11/11");
   console.log(date2);
--日期对象的方法
   console.log(date2.toLocaleDateString());//2016年11月11日 
   console.log(date2.toLocaleTimeString());//上午12:00:00 
   console.log(date2.getFullYear());//2016
   console.log(date2.getMonth()+1);//11
   console.log(date2.getDate());  //11
7、RegExp
--如何创建正则对象
   var reg=/\d/g;
   var reg=new RegExp("");
--检测模式：flags标识一下几个
   1、g: global,全局模式
   2、i: ignore,忽略大小写
--正则对象提供的方法
   1) reg.test(str);*important*
	  检测str中是否存在和reg相匹配的子串
   2)reg.exec(str);
	  在非全局模式下，是从str中找出和reg匹配的第一个子串
--字符串支持正则的方法
   1）str.replace(reg,"") *important*;
	   将str 中与reg匹配的子串替换成目标（
							 不写正则，匹配第一个，写正则可以匹配全局）
	   字符串是不可变的，一切修改字符串的方法返回的都是新字符串，
	   并没有改变原字符串
   2)str.match(reg);
	  从str中找出与reg匹配的所有的子串
   3)str.search(reg)
	  从str中找出和第一个reg匹配的第一个子串的位置
8、Function
   浏览器加载网页到此处时，仅仅是根据声明创建了函数对象，并没有调用此函数
  Function 对象；function是关键字
-- arguments  *important* 本身具有重载性能
  1）函数参数可以是任意个
  2）将参数传给arguments,分次传给函数的参数
  3）通过argument数组下标进行存值  
   function sum(){
	   var s=0;
	if(arguments !=null && arguments.length>0){
		for(var i=0;i<arguments.length;i++){
			s += arguments[i];}}
	return s;}
   页面加载时，立刻调用函数
  console.log(sum(2,9,34,3));
  console.log(sum(2,9));
--匿名函数
--全局函数
  1、eval:计算器运用直接计算字符串
	 取值：input.value 赋值input.value=“”
	 在使用eval时建议在字符串前后加括号，
	 可以避免该字符串内特殊字符导致执行出问题，可以避免不必要的麻烦
	 案例：
	try{var result = eval("("+ss+")");	
	 input.value = result;			
	}catch(e){//是变量，类型是var,所以可以不写
	   input.value = "Error";}}
表单事件：
1、form元素有onsubmit事件，一触发事件数据就提交了。
2、submit按钮作用就是触发了这个事件
3、在事件内 return false 可以取消事件
--验证帐号格式
   ^\w{5,10}$开头结尾必须相同
   \w{5,10}\ 只要str其中有就可以
4、条件与返回值的区别：
 1）写条件表达式时，可以用任何值做条件，任何空值都等价于false;
 2）return语句不是条件表达式，上面规则不适用，
	即想取消事件必须返回false，返回其他任何值都无法代替false;
<form  action="http://www.tmooc.cn"
	  onsubmit="return alert(checkcode()&checkpwd());">
  <!-- onsubmit="return checkcode()+checkpwd()==2;" -->	

2016.11.5
day07
内置对象是本身所拥有的；JAVA的封装是私有化
BOM 后退、前进、链接功能  window.alert
DOM代表浏览器显示的网页   window.document.getElementByTagId()
	document 的对象根据网页内容不断变化
第一步：在控制台查 window.screen 查出相关的代码
第二步：在代码区可以调用控制台的属性，传给浏览器
screen的属性不能改，只能读
navigator:领航员：相当于浏览器的身份证
定时器：定时执行，本质上就是线程
1)setInterval(exp,time)  *important 定时的多线程*
  clearInterval(id)  *important 定时的多线程*
  exp:方法	time:毫秒单位
  exp 是 函数的引用 test;不能写test()因为会返回一个返回值结果
   用法：
2）setTimeout(exp,time)  *important 定时的多线程*
   clearTimeout(exp,time)  *important 定时的多线程*
   time毫秒后只执行一次exp
	用法：延迟一会就消失
	先写HTML网页、再写CSS样式、再写JS函数：可以将显示效果和逻辑分离

二、DOM 的根元素是document,从document进入
	DOM是html在浏览器中加载的结果
	网页是静态的，网页在浏览器运行的状态是DOM
	浏览器的对象是固定的，但是网页换了,嵌套关系就变啦
   document修改的是浏览器的功能，提供了各种增删改查的功能
--节点信息
   1）nodeName
   2)nodeType:元素节点：0 ；文档节点：9 ；文本节点：3
   增加元素 innerHTML/innerText
   删除元素 div.innerHTML="";
   使用所有属性 getAttribute；setAttribute;removeAttribute
   样式专用属性 className  node.style.color  node.style.fontSize

JavaScript day07
--外部对象介绍
1）由JS的运行环境提供的对象(API), 
  JS的运行环境是浏览器, 也就是由浏览器提供的对象.
2）浏览器提供两组对象: BOM 和 DOM
   BOM 浏览器对象，代表当前浏览器本身
--浏览器对象:对象引用 window
   window对象是访问 BOM 和 DOM的入口
	使用window对象的属性和方法时候可以省略 window.
--window对象BOM的结构(属性/方法)
属性：window、history、location、screen、navigator、document
	 DOM对象(document)是window对象的一个属性
方法：alert()、confirm()
	 setInterval()、 clearInterval()
	 setTimeout() 、clearTimeout();

1)screen 屏幕
这个属性代表 当前浏览器屏幕信息,如分辨率等.
案例:
//显示当前屏幕的分辨率:
	var w = window.screen.width;
	var h = window.screen.height;
提示:
如果需要检查当前屏幕的分辨率, 动态的调整显示内容, 就可以使用这个属性.
2)location 位置
代表当前浏览器的地址栏, 用于切换地址栏
包含属性 href
包含方法 reload()
案例:
//显示当前的地址栏URL信息
	var url=location.href;
//跳转到指定的网页
	location.href="http://doc.tedu.cn";
//刷新网页
<input type="button" value="刷新" onclick="location.reload()">
//前进网页
3）history 历史记录
代表浏览器地址栏中的历史记录。
包含属性 length  ，length历史记录数量
包含方法 go() back() forward()
back() 回退，forward() 前进，go(相对记录号) 跳转到某个记录位置
案例:
<input type="button" value="前进" onclick="history.forward()">
4）navigator 领航员
包含当前浏览器的元数据信息, 如: 厂商, 版本等
常用属性 userAgent
案例:
//在js中检查当前的浏览器版本信息
	var ua = navigator.userAgent;
	var chromeReg = /chrome/i; 
	if(chromeReg.test(ua)){
		console.log("这是谷歌浏览器");  }} 
每种浏览器的UserAgent都不相同, 是浏览器的身份证, UserAgent 经常用于检查JS所在的浏览器版本.
5）confirm() 确认方法
用与显示模态确认对话框, 其返回值是true/false
语法://使用确认框	用法：只有两个选项，是否确认付款
var value = confirm("今天你吃了吗?");
模态对话框显示时候, 会挡在浏览器窗口之前, 只能在处理对话框以后才能继续.
6）定时器
浏览器提供了定时器功能, 其底层本质是线程. 定时器是并发执行的, 可以在网页中利用定时器处理并发问题.
有两种定时器:间隔执行定时器、一次性执行定时器
<1>间隔执行定时器
   按照一定固定间隔时间执行的方法.
   window提供了两个方法用于处理固定间隔执行
   setInterval() 启动定时器、clearImterval() 取消定时器
语法:var timerId = setInterval(方法, 间隔时间)
	clearInterval(timerId);
案例:
var id=[];//用于存储定时器的ID
function startTimer(){
	//保存每个定时器ID
	id[id.length] = setInterval(run, 1000);
	console.log(id); }
function stopTimer(){
	//利用定时器ID清除定时器
	for(var i=0; i<id.length; i++){
		clearInterval(id[i]);}
	id=[];//清除没意义的定时器ID}
<2>执行一次的定时器
window提供了执行一次定时器, 用于处理延迟功能
API方法:
setTimeout() 启动   clearTimeout() 清除
语法:var timerId = setTimeout(函数, 延迟时间);
	clearTimeout(timerId);
案例, 提示消息自动隐藏功能:
	var div = document.getElementById("info");
	div.className="show";
	//一次性定时器
	setTimeout(function(){
		var div = document.getElementById("info");
		div.className="hide";}, 2000)
提示: 为了解决页面内容耦合度问题(解耦)将显示样式和脚本以及页面内容进行了分类处理.
DOM 文档对象模型
文档对象DOM:当网页被加载时，浏览器会创建页面的文档对象模型
文档对象是HTML在浏览器中的解释结果. 文档对象在浏览器中存在.
文档对象的引用是document, 文档对象是window对象的属性
文档对象结构:
DOM提供了如下操作
查找节点、读取节点信息 、 修改节点信息 、创建新节点 、 删除节点

<1>查找节点、读取节点信息
通用属性：文档对象的每个节点(Node)都包含的属性
nodeName：节点名称
元素节点和属性节点：标签或属性名称
文本节点：永远是 #text
文档节点： 永远是 #document
nodeType：节点类型
返回数值
元素节点：返回 1
属性节点：返回 2
文本节点：返回 3
注释节点：返回 8
文档节点：返回 9

<2>修改节点信息
元素的innerText 和 innerHTML 属性,可以读取和改变节点的内容:
innerText:设置或获取位于对象起始和结束标签内的文本
innerHTML:设置或获取位于对象起始和结束标签内的 HTML
innerHTML 可以用于向元素添加子元素或者清除元素内容

*修改元素的属性
Dom API提供了通用的属性修改方法, 可以读写任何元素的任何属性.
API 方法:getAttribute() 获取元素的属性
		setAttribute() 修改/添加元素的属性
		removeAttribute() 删除元素的属性
案例:
	var a = document.getElementById('doc');
	a.setAttribute('href','http://www.tmooc.cn');
*修改元素节点的样式
dom提供了便捷的修改样式的属性
style （内联样式属性）、className （class属性）
通用属性修改方法完全能够替代两个属性, 但是这两个属性使用更加简洁.
利用class绑定样式效果时候, 可以实现样式与脚本的分离, 可以降低样式与代码的耦合度.
	//利用class属性修改元素的显示样式
	div.className="alert";
	//改变元素的内联样式
	div.style.color="red";
	div.style.border="1px solid #ddd";
	div.style.borderRadius="4px";
  


2016.11.07
day08
一、定义全局变量和方法
任何时候定义的全局变量，都是window对象的属性。
创建的新变量和方法 无法删除，当更新浏览器的时候，就自动消除了
window定义方法的方式：
1）直接定义方法
2）定义属性的时候，赋值匿名的方法，就是定义了方法
window.whoru=function(){console.log("Hello aaaa");}
whoru()；
没有报错的时候，怎样debug?
在控制台，输入index，看是否按照正确的方式变化

二、查询节点的方式：
1）按照ID查
2)按层次查  
parentNode :不用parentElement有兼容性问题
childNodes：children不能显示文本，具有兼容性问题，
			   而childNodes不能忽略空格文本
			ul.getElementsByTagName("li")可以不显示中间的换行文本
			getElementsByTagName 弱点：会孩子、孙子一起抓，抓元素
			getElementsByName：处理表单的元素，class相同的元素
			   用处：购物车的项目多，且动态
创建新节点：是游离的节点：
document.createElement(elementName)
创建子节点
parentNode.appendChild() 加节点
parentNode.insertBefore(新节点，E)在什么前面插入
删除子节点
node.removeChild(childNode)
三、事件
1.自定义对象
  1)直接量(JSON)
	var obj = {"name":"zs","age":25}
	 {}代表一个对象，内含键值对
	 通常key是字符串，value是任意类型的数据
	 采用这种方式创建对象简单
  2)构造器(new的函数)
	2.1内置构造器(js)
		特定：Date、String、Array、RegExp
		通用：Object
		优点：简单。缺点：不够直观。
	2.2自定义构造器
		写一个函数来充当构造器
		函数名首字母大写，加参数接收传入的数据
		优点：直观。缺点：麻烦。
  3)使用建议
	封装出来的对象给别人使用，建议用2.2
	若封装的对象中没有方法，建议用1
	若封装的对象中有方法，建议用2.1
2.事件
  2.1 事件概述
	  事件：是操作、动作；是JS被调用的时机。
	  分为：鼠标事件、键盘事件、状态事件
	  状态事件：某条件达成时自动触发的事件。
  2.2 定义事件
	 1)直接定义
	   直接在标签上通过属性定义事件 ：标签和JS耦合度高
	 2)后绑定
	   在页面加载之后，获取到要绑定事件的那个元素节点
	  input.onclick = function(){}
	   注：实现JS与HTML的分离
	   案例：
	   绑定网页加载以后执行的事件
	  window.onload=init;//注意，init是方法的引用变量
	  function init(){
	  var btn = document.getElementById('btn');
	   //为按钮绑定鼠标单击事件
	  btn.onclick=function(){
	  //this引用调用方法的当前对象
	  //this.value访问当前按钮的value属性
	  console.log('Hello!'+this.value);
	 3)取消事件
	   在事件函数内return false
	   案例：
	  var doc=document.getElementById('doc');
	  doc.onclick=function(){
				console.log('doc');
//事件方法返回false时候，取消执行后续动作，如：取消网页跳转，表单提交等
				return false;}
  2.3事件对象
	 1)什么是事件对象
	   事件发生时浏览器针对此事件创建的一个对象
	   该对象中封装了本次事件的详细信息，如鼠标的位置
	 2)如何获得事件对象
	   2.1直接定义事件:在调用函数时直接传入event
	  onclick="f1(event);" 在开发f1时需要加参数接收event即可
	   2.2后绑定事件:浏览器在调用函数时会自动传入event
		在函数上增加参数接收event即可
		 <事件对象>
		在IE中event是window对象的属性；
		在Firefox、chrome中，在事件中写事件函数中，传到参数中
		案例：
	  <div onclick="func(event);">Hello!</div>
	  function func(e)
		 {console.log(e.clientX +','+e.clientY);
	   <事件源对象>：发生事件的对象
   //IE 浏览器：event.srcElement;在Firefox、chrome:event.target
		 var object = e.target||e.srcElement;//??????}

   2.4事件处理机制
	  1)冒泡机制
		多层元素都定义相同的事件,点击内层元素则外层元素事件也会触发
		此时事件触发的顺序是由内向外的，此规律叫作冒泡机制
	  2)冒泡机制的作用
		 用来简化事件的定义.
		 可以在父元素上定义一次事件,代替众多子元素上的事件
	  3)使用冒泡时的问题
		需要知道事件的来源，即事件源
		通过事件对象可以获取事件源
	   var obj = e.srcElement || e.target;
	  4)阻止事件的继续传播
	   if(e.stopPropagation){
			  e.stopPropagation();//Firefox、谷歌的方法
		   }else{e.cancelBubble=true;//IE浏览器的属性}




2016.11.8
javascript:代码繁琐，兼容性问题
js框架：把基本内容给予了简单的框架
#1 JQuery基础
##（1）JQuery是什么？
	是一个javascript框架，语法借鉴CSS语法。
	最大的特点是利用选择器查找要操作的节点（DOM对象），
	并且将找到的节点封装成一个JQuery对象，通过调用JQuery对象提供的方法
	来操作底层的节点。
	好处：a.简化了代码   b.兼容性更好
##（2）编程的步骤
	   2.1利用选择器查找要操作的节点。
	   2.2调用JQuery对象提供的方法。
1）浏览器读取html
2)浏览器生成DOM树
3）jQuery的方法通过节点的选择器查找dom树，并将dom对象封装成jQuery对象 4）调用jQuery的方法
	   注1：这些节点会被封装成一个jQuery对象，不再是div对象
	   注2：变量以$开头，只是一个习惯，表示这是一个jQuery对象,可以不写
案例： <a href="javascript:;" onclick="f2();">ClickMe</a>
	   //调用jQuery对象提供的方法,不能用javascript的方法
	  $('#d1').css('font-size','90px').css('color','red');
##（3）jQuery与dom对象之间的转换
	3.1 dom对象转换成jQuery对象
		var $obj=$(dom对象);
		案例：var obj = document.getElementById('d1');
		 var $obj = $(obj);
		 $obj.html('Hello ,JAVA');
	3.2 jQuery对象转换成dom对象
		案例:var $obj = $('#d1');
		 var obj = $obj.get(0);或者 var obj = $obj[0];
jQuery对象
1、通过选择器获取的对象是jQuery对象			   $('div[id!=d3]')
2、通过$()所创建的对象是jQuery对象
3、若方法返回的是元素，则它就是jQuery对象		 $('p').parent
4、若方法是用于赋值的，那么它返回的是jQuery对象   $('p').attr(,)
5、若方法返回的是具体的值，那么它返回的是内置对象  $('p').html()

#2、选择器
##
jQuery借鉴css选择器的语法，用来查找要操作的节点。
##2、选择器的分类
  2.1基本选择器<*import*>
  #id , .class ,element , （selector1 ,selector2） ,*
  注意：id选择器执行速度最快，因此优先使用它
	   无论找到多少个节点，都会封装成一个JQuery对象
  2.2层次选择器: 
<*import*>selector1 selector2:查找所有后代节点（满足selector2）
	selector1>selector2：查找所有子节点（满足selector2）
	selector1+selector2：查找下一个兄弟（满足selector2）
	selector1~selector2 ：查找下面所有兄弟（满足selector2）
  2.3过滤选择器
	   基本过滤：:first、:last、:even(偶)、:odd、
	  :eq（index）、:gt（index）大于、:lt（index）小于、
	  :not(selector)排除符合selector要求的节点
	   内容过滤  :contains(text)包含有指定文本的节点
			  ：empty 空节点	  :parent 不为空的节点
			  ：has(selector) 包含有selector要求的节点的节点
	   可见性过滤  *import*
			  :visible 可见的节点
			 ：hidden  隐藏的节点
	案例：
	<div style="display:none;">HELLO , java</div>
	$('div:hidden').show('slow');	

	属性过滤 *import* 给除了id、class之外的其他属性用的
			 [attr] 具有这个属性的节点
			 [attr=value] 属性值等于value的节点
			 [attr!=value] 属性值不等于value的节点
	案例：
	<div id="d3">HELLO,C</div>
	$('div[id!=d3]').css('font-size','60px');

	状态过滤 (表单属性过滤选择器)
		：enabled 可用
 		:disabled 禁用
		:checked  选中（单选框、多选框）
		:selected  选中（下拉列表）
	案例：
	<form id="form1">
	addr:<input name="addr" disabled="disabled"/>
	</form>
	$('#form1 input:disabled').attr('disabled',false);

	子元素过滤
		:nth-child(index/even/odd)
			   注意：子元素过滤选择器的下标从1开始
	案例：
	$('ul li:eq(1)').css('font-size','60px');不能DOM，只修改一个
	$('ul li:nth-child(2)').css('font-size','60px');修改多个
  2.4表单选择器：（因为HTML中大部分都是表单）
	  ：test   表单中的元素是文本输入框	$(#form1:test)
	   ～$('input'['test']
	:password :radio :checkbox :file :button :submit
	:reset	:image :input
2016.11.9	
3.DOM操作
3.1读取或者修改节点的html内容，文本内容，value和属性。改、查
  html() 可以读html文档   text()只能读文本
  val() attr()
注：进一步简化,用自定义对象
$('#d1').attr({'style':'font-style:italic','class':'s1'});
html()和val（）的区别
1、双标签读写内容，用来看的时候（<a>内容</a>）-html()
其他的都适用
2、表单控件控件读写值-val（）用来输入的时候
-input/select/textarea

###3.2创建新的节点
$(html)
###3.3添加新的节点
append() 作为最后一个孩子添加进来
注意：方法一：	
创建一个节点		 var $obj = $('<div>世间最后一个妖神</div>');
添加节点到dom树里面  $('body').append($obj);
方法二：创建、添加合二为一
$('body').append('<div>世间最后一个妖神</div>');
prepend() 作为第一个孩子添加进来
before() 作为上一个兄弟添加进来
after() 作为下一个兄弟添加进来
###3.4删除节点
remove() 彻底清空  empty() 只清空内容，但是保留格式
###3.5如何将html与javascript分离
$(fn);
注：fn是一个函数，当整个页面加载完成（也就是说，dom书已经生成完毕），会执行fn这个函数。
###3.6拷贝
clone() 简单的赋值
clone(true) 除了拷贝，还会复制行为（将事件处理代码一块复制）
注：this是js对象，调用方法之前，需要把它包装成jq对象
   $(function(){$('ul li:eq(2)').click(function(){
	$(this).css('font-style','italic');});
###3.6样式操作
css() 直接修改样式的属性 *import*
addClass() 添加某个样式  removeClass() 删除某个样式 *import*
注意：
1）可以增加两个类 $('#d1').addClass('s1 s2');
2）不添加任何参数 代表 删除“所有的”	$('#d1').removeClass();
3）需要事先定义好样式，在定义类选择器
toggleClass() 样式的切换
解释：如果节点有此类样式，则删除此样式；如果没有，则追加此样式
hasClass()
解释：判断某个节点有没有某个样式，如果有，则返回true,否则，返回false;
###3.7遍历
适用条件：
当调用其他人的方法的时候，返回的是JQuery对象，无法使用选择器，只能用方法
如果可以用选择器，应该尽量用选择器

children()/children(selector) 字节点
注意：可以加选择器  var $obj = $('#d1').children('div');
parent() 父节点
siblings()/siblings(selector) 其他兄弟
next()/next(selector) 下一个兄弟
prev()/prev(selector) 上一个兄弟
find(selector) 后代所有

4、事件处理
   4.1如何绑定事件处理代码？
   方式一（正式）：$obj.bind(事件类型，事件处理函数);更灵活
   方式二（简写）：$obj.click(f1);
   4.2如何获得事件对象？
	<a href="" onclick="f1(event)"/>
	 只需要给事件处理函数传递一个参数即可。
案例：$(function(){$('a').click(f1)});
	 function f1(e){
//通过事件对象可以找到事件源，e表示时间对象，也可以用其他变量名
//e严格来说是jQuery对底层事件的一个封装，e.srcElement可以不写
	 var obj = e.tagret;//注意：返回值是dom对象
	 $(obj).css('font-style','italic');};
   4.3事件对象的作用？
	作用1：通过事件对象获得事件源。var obj = e.tagret
	作用2：获得鼠标点击的坐标。	e.pageX e.pageY
   4.4事件冒泡？
   e.cancelBubble=true;
	取消冒泡  e.stopPropagation() 停止传播
   4.4合成事件？*import*
	 toggle(f1,f2,f3……)：模拟鼠标连续单击事件
	第一次单击执行f1,第一次单击执行f2,依次类推，执行到末尾，又从头开始。
	  hover(f1,f2) :模拟鼠标悬停事件。
	  f1处理mouseenter事件，f2处理mouseleave事件
   4.4模拟操作？
	  $obj.trigger	 浏览器代替人的行为，帮助人点击、移动光标
	案例：
	$(':text').eq(i).trigger('focus');	


5、动画
   5.1显示、隐藏动画效果：.show()	   .hide();
					 效果：改变元素的宽度和高度
   5.2上下滑动动画效果：  .slideDown()  .slideUp() ;
					 效果：改变元素的高度
   5.3淡入淡出动画效果：  .fadeIn()	 .fadeOut()
					 效果：改变元素的透明度
   .show(执行时间，回调函数)
   显示和隐藏动画的本质就是：
   它采用了定时器，在一段时间内不断的修改元素的样式（透明度）
   使其逐渐的隐藏或显示,
   第2个函数是回调函数，即在动画完成后，由JQuery自动调用的函数
   案例：
  $('img').hide(3000,function(){console.log('hi')});	
  console.log(1);//先显示1 ，再动画隐藏， 再显示hi
   5.4自定义动画
   自定义动画是基于定位的，即它采用定时器，在一段时间之内，
   不断的修改元素的偏移量，使其运动起来，至于基于哪个基准，
   要看实际的场景。
   定位基准：
   -相对定位：以自己原来位置为目标产生偏移。（鼠标放上，图片会抖动一下）
   -绝对定位：以父元素为目标产生偏移
   -固定定位：以窗口为目标产生偏移（拖动滚动条，广告不动）
  5.5自定义对象：(JS)
	1、直接量（JSON）
	   var student = {'name':'zs','age':23};
		{}代表一个对象，内含多组键值对
		key是字符串，value是任意类型的数据
备注：
	特殊的字段名(首字母为数字)的赋值方式
	   obj = {'if-4':10};字段名必须是字符串，是严谨格式
							   字段名不是字符串，是宽松格式	
	特殊的字段名的赋值方式			
	   obj['if-4']

	案例：
	//创建对象
	var student ={'name':'zhangsan','age':23,
					 'job':function(){alert("我学JAVA.");}
	//使用对象
	alert(student.name);alert(student.age);student.job();

	2、构造器（new的函数/首字母大写）
	 直接调用的函数 f1(); 需要new 的函数首字母需要大写 new F1();
	 2.1 内置构造器
	 特殊：Date,String,RegExp,Funcion
	 通用：Object
	案例：
		创建对象
	var teacher = new Object();
	teacher.name="cang";teacher.age=18;
	teacher.job=function(){alert('主要教JAVA');}
	
	备注：
	1）
	特殊的字段名(首字母为数字)的赋值方式teacher['123']=145
	特殊的字段名的赋值方式			  teacher['123']
	2）js的对象的方法中引用属性，必须用this引用
	   obj.who=function(){console.log(this.name);}
	3）js中直接写方法名 是查询方法；方法名（） 是执行方法


	使用对象
	alert(teacher.name);alert(teacher.age);teacher.job();
	 2.2 自定义构造器	
	-自己写一个函数充当构造器，首字母大写
	 自己封装的程序更加直观，如果用别人的对象，需要看源代码
	-new这个函数，并传入相关的数据
	案例：
	采用自定义构造器创建自定义对象
	function Coder(name,age,job){
	//将传入的数据存入此对象，this是当前创建好的对象
	 //this.work是给此对象增加work属性，=job是将参数的值赋予work属性
	this.name=name;this.age=age;this.work=job;}
	function f3(){
	//创建对象
	var coder = new Coder("wangwu",23,function(){
			alert("我在写JAVA！");});
	//使用对象
	alert(coder.name);alert(coder.age);coder.work();}
	3、总结
	 -无论用哪种方式创建的对象都一样
	 -若创建函数给别人用，建议用2.2
	 -若创建的对象有函数，建议用2.1
	 -若创建的对象没有函数，建议用1




Servlet
day01
一、WEB应用演变
1、演变的规律
-由单击向网络演变
-由CS向BS演变
2、CS和BS的区别
1）CS Client Sever 客户机服务程序 客户需要单独开发和安装
2）BS Browser Server
   浏览器服务程序，用浏览器充当客户端，不必单独开发及安装
二、Servlet
1、服务器如何保存并返回一个网页？
	1）静态网页：任何人看到的都一样，没有差异 
	  -例如百科，新闻
	  -服务器保存一份HTML，并直接将它返回给浏览器
	2）动态网页  每个人看到的内容有差异
	  -例如：微信，贴吧，淘宝
	  -服务器保存一个组件，由它根据用户需求动态拼一个网页
	  -组件就是满足规范的对象，在JAVA中，这个组件叫做Servlet
2、Servlet的特征
   -保存在服务器上
   -满足Sun的规范
   -它可以动态拼任何资源（网页、图片、文档）
   》术语：可以处理HTTP协议
3、什么是Servlet？
   -是Sun推出的，用于在服务器端处理HTTP协议的组件；
三、服务器
1、名词：JAVA服务器、WEB服务器、JAVA WEB服务器 Servlet容器
2、本质：-是一个软件
		 -它能够用来运行其他的软件
		 -它和浏览器对等，是平级的关系
3、举例
-Tomcat（Apache 推出的开源的）
-JBOSS	-WebLogic   -WebSphere
四、Tomcat的使用
1、单独使用（上线时）
   1）配置JAVA_HOME -个人电脑需要配置
	 计算机右击-选属性-高级系统设置-环境变量-变量名：JAVA_HOME变量值：
   2）下载并安装   从Apache官网下载
   3）直接解压缩（释放）就可以使用，是绿色版软件
   4）启动Tomcat
   linux:打开/Tomcat/bin,在终端中输入chmod +x *sh
   linux:打开/Tomcat/bin,在终端中输入 ./startup.sh
   window:打开/Tomcat/bin,双击输入startup.bat
   5）访问Tomcat
	打开浏览器并输入http://localhost:8080
	回车后看见一只猫则代表访问成功啦
   6）关闭Tomcat
   linux:打开/Tomcat/bin,在终端中输入./shutdown.sh
   window:打开/Tomcat/bin,双击shutdown.bat


2、用Eclipse来管理Tomcat(开发时)
1)使用步骤：参考doc.tedu.cn
2)配置失败时的处理
1、单击window->preference->sever->runtime
2、右侧选择tomcat,点击remove
3、Eclipse左侧项目列表下选择Servers项目
4.右键delete将此项目删除
5、按照文档提示重新配置tomcat

3、容易出现的错误
1）报错信息
-Address already in user, JVM_BIND:8080
-端口冲突导致的错误
2）解决方案1
-有可能是连续启动多次tomcat导致的端口冲突
-打开/tomcat/bin,强制shutdown即可
3）解决方案2
-有可能是其他软件(Oracle)占用了8080端口
-修改tomcat端口，在conf/server.xml的第65行
-修改完后要重启tomcat
-建议改为8089,8090


2016.11.11
day02
Servlet的底层逻辑：
SUN要求必须实现Servlet接口，
HttpServlet是一个实现类，实现了Servlet接口。
创建类只需要继承HttpServlet，重写service方法即可。
一、Servlet开发步骤：
1、创建WEB项目
-WEB项目必须具备标准的WEB目录/webapp/WEB-INF/web.xml
2、导入jar包
1)使用maven
-在maven下搜索javaee
-在结果中选择javaee-api/5 jar
2)使用tomcat内置的jar包
-点击项目,右键properties
-弹出窗口左侧选择targeted runtimes
-右侧勾选tomcat
-点击apply
3、开发Servlet
-创建一个类,一般叫XXXServlet
-该类要继承于HttpServlet,间接实现Servlet接口
-重写service(),在其内部给浏览器拼一个网页
注意:Servlet接口才是Sun的规范
4、配置
-在web.xml中,根据规定配置Servlet
1）创建web.TimeServlet类重写service方法
案例：
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {//告诉浏览器发送的是什么格式的数据，格式不能更改
  res.setContentType("text/html");
//获取输出流，该流由服务器自动创建，并且它的输出目标就是浏览器。
PrintWriter pw = res.getWriter();
//获取服务器的当前时间
Date date = new Date();
SimpleDateFormat sdf= new  SimpleDateFormat("HH:mm:ss");
String now = sdf.format(date);
//此处偷懒了，将网页的基本格式给简化掉了
pw.println("<p>"+now+"</p>");
//关闭流pw.close();}
2）配置xml文件，让tomcat能够访问
案例：
 此文件十分重要，tomcat启动时会首先就会读取它，若它不存在，或者它内部有任何错误将会导致tomcat加载项目失败。
（如果tomcat启动报错了，请检查web.xml）
1、声明Servlet类(一定有严谨)，并给它取个别名
  <servlet>
  <servlet-name>erdan</servlet-name>
  <servlet-class>web.TimeServlet</servlet-class>
  </servlet>
2、根据别名引用Servlet，并给它取一个网名，也叫做网络访问路径，
   在网络上必须通过此网名访问一个Servlet (网名需以“/”开头)
  <servlet-mapping>
  <servlet-name>erdan</servlet-name>
  <url-pattern>/cang</url-pattern>
  </servlet-mapping>
3）将文件部署到tomcat上
打开servers,右击打开Add and Remove……，将"servlet包"部署到服务器上   
部署成功的现象：在apache-tomcat文件下wtpwebapps中存在"servlet包",
4）浏览器查找内容
1、浏览器向服务器提供目录\servlet\cang
2、服务器根据第一级目录 会找到servlet目录，并在此目录下找到web.xml
3、在web.xml中找到\cang，再找到对应的类，并且自动调用service方法
报错的情况：
404 -找不到资源
500 -类名写错 - 方法有误
405 -方法声明有误（例如：将public 写成private）
二、HTTP协议
1、什么是HTTP协议？
-就是一个规范(w3c)
-约定了浏览器和服务器如何通信以及通信的数据格式
2、如何通信？（浏览器角度）
-建立连接
-发送请求
-接收响应
-关闭连接
》一次请求需要一次连接,尽量减少服务器压力
-通信需要断开链接：降低服务器的压力
3、数据格式
1）请求数据包(浏览器向服务器发送的数据)
-请求行：请求数据的基本信息（存储了关键的信息）
-消息头:请求数据的描述信息
-实体内容:请求的具体数据
2）响应数据包(服务器向浏览器发送的数据)
-状态行:响应数据的基本信息
-消息头:响应数据的描述信息
-实体内容:响应的具体数据
4、对开发的要求
1）不需要做的事情
-浏览器向服务器发送数据已经由他们实现了
-服务器向浏览器发送数据已经由他们实现了
-浏览器发送的请求数据由浏览器自动组装
-服务器发送的响应数据由服务器自动组装
2）需要做的事情
-开发需要提供请求的具体数据
-开发需要提供响应的具体数据
》通过request处理请求数据,通过response处理响应数据
协议案例：（服务器角度）
1、如何通过Request获取请求数据
1.1如何获取请求行的数据
System.out.println("协议类型："+req.getProtocol());//HTTP/1.1
System.out.println("访问路径："+req.getServletPath());///cang
System.out.println("请求方式："+req.getMethod());/GET		
1.2如何获取消息头的数据
getHeaderNames()返回消息头中所有的数据的名称的迭代器，Enumeration是比较古老的迭代器.返回值类似于键值对
JDBC中的resultSet、集合中的Iterator、
Enumeration e =req.getHeaderNames();
while(e.hasMoreElements()){
String name = (String)e.nextElement();
String value = req.getHeader(name);
System.out.println(name+":"+value);}
1.3如何获取实体内容的数据，在本案例中实体内容为空
2、如何通过Response发送响应数据
2.1如何获取状态行的数据（由服务器自动填写）
2.2如何获取消息头的数据
告诉浏览器发送的是什么格式的数据，格式不能更改
res.setContentType("text/html");		
2.3如何获取实体内容的数据		
此处偷懒了，将网页的基本格式给简化掉了
pw.println("<p>"+now+"</p>");

网页表单提交的逻辑：
1、通过form的action属性声明表单提交的目标。
<form action="http://localhost:8080/servlet2/register">
1）绝对路径格式：/项目名/访问路径   举例：/servlet2/register
2）相对路径：写出当前网页和访问目标之间的相对关系
当前网页的路径/servlet2/register.html
访问目标的路径/servlet2/register
简写为：<form action="register">

2、通过name属性为框中的数据命名。
3、单选或者多选要通过value属性设置一个值，替代提交的checked的缺憾
4、获取传过来的数据的方法：
   获取单个数据 req.getParameter("userName");
   获取多个数据 req.getParameterValues("interest");

servlet完整的运行原理：
浏览器和服务器都存在处理HTTP协议的对象，称为通信组件，其专门负责处理请求。
action="register“可以更换名字吗？能在服务器内找到对应的网页吗？
1、按提交按钮，浏览器端的通信组件与服务器端的通信组件建立链接
2、浏览器的通信组件打包页面提交的数据
3、浏览器的通信组件向服务器端的通信组件发送数据
4、服务器端的通信组件对数据进行拆包
5、服务器将拆包的数据new成两个对象request（包含提交的信息）和response
6、通信组件new 了一个Servlet，找到对应的类的service方法
7、调用request和response的方法
8、将数据返回给服务器的通信组件
9、通信组件再将数据进行打包
10、将数据传给浏览器端的通信组件
11、浏览器通信组件拆包数据
六、请求方式（浏览器向服务器的相关操作）
1、什么是请求方式
-浏览器向服务器发送数据的方式
-请求方式有好多种,要掌握2种:GET和POST
2、GET和POST的区别
1）GET
-采用路径传参
-参数在传递过程中可见
-隐私性差,只能传递少量参数
2）POST 案例：<form action="register" method="post">
-采用实体内容传参
-参数在传递过程中不可见
-隐私性好,传参没有限制
3、如何选择请求方式
-默认所有的请求都是GET请求
-通常查询时用GET,因为查询时只需要传少量的条件
-通常保存时用POST,因为保存时一般需要传较多的数据
七、网络传输数据都是通过byte,如果打包、解码的方式不一致，会造成乱码
1、服务器端乱码问题
1）针对get/post方式
将String按照iso8859-1还原成byte,再将byte按照UTF-8转换成String
优点：万能	 缺点：麻烦
案例：
//在service获取数据之后，处理数据之前，处理中文乱码
byte[] bs = name.getBytes("iso8859-1");
//默认的打包、解码都是按照iso8859-1格式
name= new String(bs,"UTF-8");
2）针对get方式
-修改tomcat配置文件
修改的是服务器的通信组件的编码方式吗？？？？？配置文件怎么安装的呢？？
-在server.xml第65行加URIEncoding="UTF-8"
-可以对get的路径中的参数修改编码方式 
优点：简单	缺点：只对get有效
3）针对post方式
-在服务器的servlet接收参数之前写req.setCharacterEncoding("UTF-8")
-声明实体内容的编码
优点：简单   缺点：只对post有效
注意：一般的常用方法是 2）和3）联合应用，不会形成冲突

2、客户端乱码问题
告诉服务器的打包的方式，告诉浏览器的解码方式
服务器端：res.setCharacterEncoding("UTF-8")
浏览器端：res.setContentType("text/html;charset=UTF-8");
两处编码只写一处即可，另外一处会保持默认值


2016.11.14
day03
一、
重定向是一种特殊的响应
采用重定向的方式访问查询功能，也就是告诉浏览器下一步可以访问查询功能
1、重定向的典型的使用场景
   解决互联网上2个不相关的网站之间的跳转问题，不是一个tomcat
2、后来大家也这样用
   用来解决同一个项目内2个不相关组件之间的跳转问题
   服务器向浏览器返回 “302的状态码+访问路径”；一般返回“200的状态码”
3、重定向的一般使用场景
   增加，修改，删除后要重定向到查询
案例：
//当前：EmpManager/addEmp
//目标：EmpManager/findEmp
res.sendRedirect("findEmp");

二、路径
源代码（workspace）
保存时自动编译
1）src/main/java 自动保存在 target/classes
2）src/test 自动保存在 target/test-classes
部署代码（tomcat）
1）src/main/webapp 拷贝在 tomcat
2）改名：将webapp修改为EmpManager
3)把target/classes拷贝到WEB-INF下面
注意：拷贝的是class不是java,并且test的文件会被抛弃掉

我们所说的路径，都是部署代码的访问路径。
1、静态资源（HTML/CSS/JS/图片等），就是该资源在tomcat内存放的位置
2、动态资源（Servlet），就是web.xml中配置的网名
应该将路径理解为网络上的资源的名称
//获取访问路径
1）项目名/servlet3 
System.out.println(req.getContextPath());
2） 网名 /hi
System.out.println(req.getServletPath());
3）绝对路径 /servlet3/hi 
System.out.println(req.getRequestURI());
4）完整路径  http://localhost:8080/servlet3/hi 
System.out.println(req.getRequestURL());
不输出响应的信息并不会报错，只是浏览器上会看到一片空白

2、URI和URL的区别
1）狭义的理解
-只在Java项目内理解
-URI:资源的绝对路径
-URL:资源的完整路径
-URL包含了URI
2）广义的理解(*)
-在所有的WEB项目内理解
-URI:资源的名字
-URL:资源的真名
-URI包含了URL 
3、如何配置Servlet访问路径
1）精确匹配(/findEmp)
-只有这一个路径能够访问这个Servlet
-这个Servlet只能处理这一个请求
<url-pattern>/hi</url-pattern>
2）通配符(/*)

*/


-一切路径都能够访问这个Servlet
-这个Servlet能处理所有的请求
<url-pattern>/*</url-pattern>
*/
3）后缀(*.abc)(不能以/开头)
-以abc为后缀的路径都可以访问这个Servlet
-这个Servlet能处理多个请求
<url-pattern>*.duang</url-pattern>
4、如何让一个Servlet处理多个请求？
1）先写路径规范
2）根据规范判断及处理路径
3）在web-xml进行配置<url-pattern>*.x  或  /*</url-pattern>
4) 发出请求，在servlet中对网名进行判断，并执行

5、通配符和后缀的区别
-通配符:一个类处理所有请求,比较固定
-后缀:一个类处理任意多个请求,比较灵活
》后缀的方式更为灵活,建议用这种方式

问题：
只有传入的值非空的时候才有必要转
if(sal != null && !sal.equals("")){
		emp.setSal(new Double(sal));}
解决：
情况(1)String sal = req.getParameter("salxsd");		
当不能找到sal的时候，sal=null;
情况(2)当sal中未输入值的时候sal.equals("")

2016.11.15
day04
一、Servlet的生命周期
1、默认情况下，第一次访问servlet时，tomcat会实例化
2、我们可以改为在tomcat启动时就实例化servlet
   案例：
  启动时加载（实例化和初始化）此servlet,中间的数字代表多个servlet间加载的顺序 
  <load-on-startup>1</load-on-startup>

3、new 、init（）、destroy()只执行一次，调用执行多次
4、HiServlet类只被实例化一次，它是单例（单个实例）的
总结：new出生 、init（）初始化、调用 工作、destroy()消亡
二、
1、参数存储的设置方式
1）自己想办法预置参数 
   Proprties读取a.proprties;dom4j读取b.xml
2）从web.xml中读取数据给Servlet服务器使用
   用默认的配置文件及对象预置参数
   ServletConfig：Servlet=1：1 (类似局部变量)
   ServletContext：Servlet=1：n(类似全局变量)

2、ServletConfig和ServletContext区别：
1）config
-config和Servlet是1对1的关系
-tomcat初始化Servlet前会给它先创建1个config对象
-HiServlet是一个实例,有对应的1个config
-HelloServlet是一个实例,由对应的1个config
-Servlet私有的数据存入它对应的config
2）context
-context和Servlet是1对多的关系
-tomcat启动时会自动创建唯一的1个context
-所有的Servlet公用的数据存入context

3、它们典型的使用场景
1）config
假设要做一个网页游戏,要限制最大在线人数
当在线人数过多时,超出的人需要排队
登录时就要判断是否达到最大在线人数
写登录功能: LoginServlet
最大在线人数(maxOnline)需要可配置
该参数仅仅在登录时使用,存入config即可
场景：
第一步：配置文件
1、在servlet内部配置的参数只对这一个servlet有效，该参数由这个servlet对应的config对象自动读取
2、每个配置参数只有都需要这么一套格式-->
<init-param>
  	<param-name>maxOnline</param-name>
  	<param-value>2000</param-value>
</init-param>
第二步：servlet初始化时，可以省略不写
   tomcat在实例化此servlet后，会创建一个config对象，
	并且通过inti()传入config对象，此Servlet会保存config对象，
	后续阶段获取的config都是这个config对象
public void init(ServletConfig config) throws   
	ServletException {
		super.init(config);}
第三步：在service方法中获取参数
1、获取最大在线人数以判断是否超出
   该参数需要配置在web.xml中
 此get方法返回的就是由servlet所对应的那个config,对应关系由tomcat保障
 ServletConfig cfg = getServletConfig();
 System.out.println(cfg.getInitParameter("maxOnline"));

2）context
一个项目往往包含多个查询功能
每个查询功能都要分页(已知:page,size)
每页显示条目数(size)可以配置
模拟: FindDeptServlet, FindEmpServlet
在这2个查询功能内都读取size
size是多个Servlet之间公用的数据,存入context

场景：
第一步：配置文件
参数size写在所有参数之外，可以被所有的Servlet公用，在tomcat启动时自动创建了context对象并调用该对象读取这些公用参数，所以最终这些参数存入了context对象内部 
  <context-param>
  <param-name>size</param-name>
  <param-value>10</param-value>
  </context-param>
第二步：在service方法中获取参数
1）读取分页查询的条件
   context在tomcat启动时就创建了，通过父类的get方法可以随意的获取到这个唯一的对象
ServletContext ctx = getServletContext();
System.out.println(ctx.getInitParameter("size"));

4、context的特殊用途
1）用途
-不但能读取常量(web.xml中配置的参数)
-也可以用来存取变量,被所有Servlet公用
2)案例
-统计项目的流量(访问量)
-流量是变量,无论访问哪个功能,它都要+1 
第一步：创建用于初始化数据的  servlet
		该方法设计的初衷就是用来初始化数据的
public void init(ServletConfig config) throwsServletException {	super.init(config);
	 tomcat启动时会优先创建context对象，然后按照顺序创建servlet
	 ServletContext ctx = getServletContext();
	 ctx.setAttribute("count", 0);}
第二步：在web.xml中配置
		该servlet仅仅用于初始化数据，不用于处理任何请求，所以不需要给它配置访问路径 
  <servlet>
  <servlet-name>init</servlet-name>
  <servlet-class>web.InitServlet</servlet-class>
  <load-on-startup>1</load-on-startup>
  </servlet>
第三步、在其他的servlet中设置count值的更改
	统计项目的访问量
Integer count = (Integer)ctx.getAttribute("count");
ctx.setAttribute("count", ++count);
System.out.println("当前流量是："+count);

三、Servlet线程安全问题
1、什么时候可能出现线程安全问题?
1)多个线程同时修改局部变量
   局部变量存于栈内
   每个线程有自己的栈帧
2)多个线程同时修改成员变量
   成员变量存于堆内
   多个线程共享堆内数据
   此时会存在线程安全问题

2、案例

3、解决方案
-加锁

四、servlet的结构
1）纵向分析
UpServlet-->继承HttpServlet-->继承GenericServlet-->实现Servlet
2）横向分析
Servlet有两个声明ServletRequest和ServletResponse的接口，但是传入的是实体类
3）横向分析
HttpServlet有两个声明HttpServletRequest和HttpServletResponse的接口，但是传入的是实体类
4）
HttpServletRequest和HttpServletResponse分别继承
ServletRequest和ServletResponse的接口（接口可以继承接口）

这样设计的目的：
将来万一http协议不流行了，sun只需要置换以http开头的类和接口，其他与http无关的因素就不许要更改了

ctrl+T:查看该类层次,,
		父类、相关子类和及相关方法
ctrl+O:查看该类结构 
		查看类的方法   绿色：public方法  黄色：protected方法

1、接口HttpServletRequest和HttpServletResponse由tomcat提供实现类
2、tomcat在调用service()时，传入的是它提供的实现类的实例
3、tomcat提供的实现类如下：
HttpServletRequest的实现类：
org.apache.catalina.connector.RequestFacade@1040186
HttpServletResponse的实现类：
org.apache.catalina.connector.RequestFacade@1040186
4、tomcat在调用public void service(){}方法，
而不是调用 UpServlet 的protected void service(){}方法，
public void service(ServletRequest req，ServletResponse res){
   HttpServletRequest request =(HttpServletRequest)req;
   HttpServletResponse response =(HttpServletResponse)res;
   service(request,response);
}
下一步：
protected viod service
			(HttpServletRequestreq,HttpServletResponse res){
String m = req.getMethod();
if(m.equals("get")){doGet(req,res)}
		   else if(m.equals("post")){doPost(req,res)}
其中：
protected viod doGet
			(HttpServletRequestreq,HttpServletResponse res){
		   throw new Exception();}
protected viod doPost
			(HttpServletRequestreq,HttpServletResponse res){
		   throw new Exception();}
Sun设计目的：
1、根据不同的业务场景有不同的选择，给程序员更多选择的空间
2、doXXX()中抛异常是为了强制程序员重写它
	一般重写protected void service()
	并且会去掉super.service()
	目的是避免调用doXXX(),避免抛异常 




JSP
day01
简介：
JSP：java服务器端的页面技术
jsp和servlet一样，但是拼动态资源要简单一些
servlet是在java里面拼网页
jsp是在网页里面拼java

1、jsp脚本：完整的java代码段 ,可以写分号结束
	 <%for(int i=0;i<10;i++){%>
2、jsp脚本：写出要输出的变量 ，不可以写分号结束
	 <li><%=Math.random() %></li>
3、jsp脚本：声明成员或者方法 
  <%!public double lf(double d){
	 return d*d*d;}%>
   尽量减少java语言，所以可以另写一个类，通过导入包的形式
1）jsp不需要编译，可能出现语法错误，但是不属于JSP的错误
2）jsp不需要配置文件，部署结束后，可直接用tomcat调用

搜索java包的方式:ctrl+shift+T
1、pageEncoding:声明此文件的编码，翻译成Servlet之前使用
   contentType:告诉浏览器给它发送的是什么格式的内容，
		作用同res.setContentType("texthtml,charset="utf-8");	
		默认为text/html,charset默认同pageEncoding，可以不用写
<%@page pageEncoding="UTF-8" contentType="text/html" import="java.util.*,java.text.*"%>
2、引入一个jsp,相当于将此jsp的内容复制到此处
  <%@include file="date.jsp" %>
（ 理解：拆分
		 类似于在类外定义了一个方法，在此类中调用此方法。
		 可以把复杂的程序进行分解，分解为好几了类，方便管理
   导包：跟此处的功能类似，导包写成.java包，而此处写成.jsp
   MVC的解耦合：依据共用req,把有关java的程序提取出来）

二、jsp运行原理
jsp本质上就是Servlet，jsp第一次调用的时候进行翻译，以后就不需要翻译了
hello.jsp是指导tomcat生成hello.java和hello.class
所以本质上运行的不是jsp，而是java中的Servlet
更改规则：标签一律write(字符串)，脚本一律保存java类型
		  脚本表达式一律println(变量)
（write和println之间的区别：输出流对传入变量的就是这样定义的
	write 只针对字符、字符串；println针对变量和字符串）
jsp转换成Servlet的步骤
1、创建java（启动tomcat的时候会创建）
2、翻译  （浏览器通过tomcat访问jsp的时候会翻译）
   声明变量 、write标签、保存脚本、print表达式
   声明变量:内置对象jsp中的java可以直接用
	 1）这些变量是在翻译之前声明的，可以在脚本和表达式里可以直接使用
	2）jsp中可以直接使用这些变量，因为在JSP中java代码执行前，变量已经声明好了
	 3)因为这些变量可以直接使用，顾称之为隐含（内置）对象
3、编译成.class


三、隐含（内置）对象（面试题）
1、request(*)  HttpServletRequest
2、response	HttpServletResponse
3、out		 JSPWriter  和PrintWriter一样
4.config	  ServletConfig
5.application ServletContext
6.exception   Throwable
				 是jsp翻译生成的Servlet所抛出的异常
				 只有jsp上有错误时才会出现,才能使用
7.session(*)  HttpSession   将来再讲
8.page		Object
				 指代当前调用的那个翻译生成的Servlet
				 相当于在Servlet中的this
9.pageContext(*)PageContext
				   管理其他的内置对象
				   通过此对象可以获得其他8个内置对象

 在jsp上如何使用内置对象?
<%String user = request.getParameter("user");%>
<%=session.getAttribute("code")%>

四、开发模式：java的web项目的发展阶段
第一阶段：model-1
过程：
浏览器访问服务器的Servlet/JSP，调用DAO来访问DB，将数据给Servlet/JSP,服务器对浏览器作出响应。
缺点：-使用一个组件，既处理请求，又展现业务
	  -将java和html高度耦合在一起
	  -该组件不好维护
第二阶段：model-2
过程：
将一个组件Servlet/JSP分成两个组件Servlet（接收请求、处理请求的java），JSP（展现业务的html）浏览器访问服务器的Servlet，调用DAO来访问DB，将数据给Servlet进行处理,将处理的结果发JSP，拼成网页，再对浏览器作出响应。
（解偶,它们共用request可以在一个Servlet中进行查询，在多个jsp中调用
  M：DAO调用DB V：JSP C：Servlet）

MVC模式：（面试题）
-引入了MVC模式对代码进行了分层(解耦)
-MVC是经典的设计模式,是代码的分层思想:
-M:Model,业务层,用来处理业务（对数据的增删改查）
-V:View,视图层,用来展现数据
-C:Controller,控制层,负责调度,是业务和视图层的桥梁
-目的是要将代码解耦,便于团队开发及维护 


五、转发和重定向的区别和联系
  1、它们的共同点
	 -都是解决2个WEB组件之间的跳转问题
	-WEB组件: Servlet / JSP
  2、它们的区别（面试题）
  1）通俗的理解转发与重定向的区别
	 组件相互依赖，并且解决的是同一个问题--》转发
	 组件不依赖，替代，从另一方面解决问题--》重定向
  2）专业的理解转发和重定向的区别（面试题时这样回答）
	 转发的特点：
	 1》浏览器一次请求
	 2》浏览器的地址不变
	 3》2个组件共用一个request,可以通过request共享数据
	 4》只能转发给项目内部的组件(不能转发给外部，无法共用request)
	 重定向的特点：
	 1》二次请求
	 2》地址改变
	 3》2个组件使用2个request，不能通过它共享数据
	 4》可以重定向到项目之外的组件

3、一般的使用场景
-查询时使用转发
-增加，修改，删除后重定向到查询

EL和JSTL简介
目的：为了使JSP中不出现JAVA代码，加速项目的效率
EL作用：取数/显示数据，类似jsp的表达式
JSTL作用：处理数据，类似jsp的脚本
关系：EL--》JSTL--》EL
JSP中的关系：脚本---》表达式

EL的作用：
 1、获取Bean属性 ：访问的是类的方法，而不是私有属性
方法一：  <p>姓名：${stu.name}</p>
等价于	request.getAttribute("stu").getName()
方法一：  <p>年龄：${stu["age"]}</p>
等价于	request.getAttribute("stu").getAge()	
方法三：  <p>性别：${requestScope.stu.sex}</p>	 
		El默认从四个内置对象中取值，这些对象是EL默认的取值范围：
				  page,request,session,application 
		  并且EL会按照次序依次从4个对象中取值
	  若想打破此规则，一定要从某对象中取值：
			   sessionScope.stu.sex
原理：
对象属性和Bean的属性可以不一样
对象属性：private Integer courseId;
Bean的属性：去掉get并将首字母小写所得到的单词就是Bean属性
		 public Integer getId() {return courseId;}
EL语句：
	<p>课程：${stu.course.id }</p>
2、进行运算
	算数：	<p>年龄：${stu.age+3}</p>
	比较和逻辑<p>年龄范围：${stu.age>20 && stu.age<30}</p>
   empty:空字符串、空集合、值为null、找不到对应的值 结果都是true
		   <p>判断：${empty stu}</p>
3、获取请求参数 
   1)单个参数 	
	<p>参数：${param.user }</p>
	等价于   ：req.getParameter("user");
   2)多个参数：
	<p>参数：${paramValues.user }</p>   
	等价于   ：req.getParameterValues("user");

JSTL：jsp标准标签库
Step1:导包 ，因为这个包是Apach提出的，而不是Sun创建的，后来给了Sun
		在pom.xml中 jstl--》jstl jstl--》1.2[jar]
	   在导入的包的  META-INF的c.tld文件，实际上是xml文件
	在c.tld文件的内容：
	   前缀：<short-name>c</short-name> 
	   名字：<uri>http://java.sun.com/jsp/jstl/core</uri> 
导包方式：
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

Step2:声明使用的标签
1、IF 
<p><c:if test="${stu.sex=='M' }">男</c:if>
   <c:if test="${stu.sex=='F' }">女</c:if>	</p>
2.choose 可以写多个when
<p><c:choose>
	<c:when test="${stu.sex=='M'}">男</c:when>
	<c:otherwise>女</c:otherwise>		
							  </c:choose></p>
3. forEach
<p><c:forEach var="i" items="${stu.interests }">${i}
   </c:forEach></p>

一、标签的运行原理：一个标签就会引用一个类
JSP中的源码：
声明：<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
IF标签：<c:if test="${stu.sex=='M' }">男</c:if>
流程：
根据IF标签的c:-->声明中的prefix="c"，url-->c.tld中的uri
根据IF标签的if-->tag中的if-->class:ifTag-->Servlet:ifTag.doTag()
1、tomcat在翻译JSP的时候会翻译JSTL标签
2、它是将JSTL中的标签翻译成Servlet中的一句Java代码
3、就是调用该标签所对应的类的doTag()

二、自定义标签
step1:编写java类，继承SimpleTagSupport类
step2:在方法中添加处理逻辑
step3:配置标签说明文件
传参的方式3种：
方法1：通过方法的参数传递参数
方法2：定义全局变量，通过构造方法传递参数
方法3：定义全局变量，在set方法中传递参数
案例：
 * 自定义JSTL标签类，用来输出服务器时间。
   时间有默认的格式，也可以指定一个格式。

step1:编写java类，继承SimpleTagSupport类
step2:在方法中添加处理逻辑，放在web下

package web;//java文件存放的位置
public class SysdateTag extends SimpleTagSupport {
//时间的格式，有默认值。可以通过set方法修改其值。
private String format = "yyyy/MM/dd HH:mm:ss";
public String getFormat() {return format;}
public void setFormat(String format){this.format = format;}
public void doTag() throws JspException, IOException {
	Date date = new Date();//创建服务器时间
	SimpleDateFormat sdf = new SimpleDateFormat(format);
	String now = sdf.format(date);
	//将时间输出给浏览器，PageContext extends JspContext
	//该方法声明返回JspContext，该方法实际返回的是PageContext，
	PageContext ctx = (PageContext) getJspContext();
	JspWriter out = ctx.getOut();
	out.println(now);
	//此处的流不能关闭，因为JSP上还有其他的标签要使用这个流。}}

step3:配置标签说明文件，自己写的tld需要放在wabapp下面
<body-content>empty</body-content>
此处设置的是bean属性，tomcat通过set方法设置值。<name>format</name>
	 EL标签可以通过get、set方法获得值
该属性是否必须设置<required>false</required>
是否允许使用EL为该属性赋值<rtexprvalue>true</rtexprvalue>
应用：
<s:sysdate format="yyyy年MM月dd日"/>

day05
异常的处理
声明发生哪种异常时跳转到哪个错误页面
1、按照异常类型声明 
<error-page>
	 <exception-type>java.lang.Exception</exception-type>
  注意：此处错误页面的路径应该写绝对路径，tomcat会主动帮我们加上项目名
		 所以此处绝对路径就不要再自己写项目名了，避免重复 
  路径：请求路径、转发和重定向的路径、按钮路径、include的路径、异常路径 
	 <location>/WEB-INF/error.jsp</location>
</error-page>
1)请求路径:动态的，站在浏览器的角度
	当前：
		目标：
  <url-pattern>*.do</url-pattern>
2)转发路径:转发到静态的JSP
	当前：/netctoss/findCost.do
  这是动态的路径变化，不能用静态状态写，读取的是web.xml中的路径
		不为：/netctoss/WEB-INF/classes/web/MainServlet
  当前实际为：/netctoss/web/MainServlet
		目标：/netctoss/WEB-INF/cost/find.jsp
req.getRequestDispatcher("WEB-INF/cost/find.jsp").
											forward(req, res);
3)重定向路径:动态的，从增加页面跳转到查询页面
	   当前：/netctoss/addCost.do
	   目标：/netctoss/findCost.do
	res.sendRedirect("findCost.do");
4)按钮路径:动态的
	   当前：/netctoss/findCost.do
	   目标：/netctoss/toAddCost.do
<input type="button" value="增加" class="btn_add"
				   onclick="location.href='toAddCost.do';" />
5)include路径:
当前不确定使用绝对路径
<li><a href="/netctoss1/findCost.do" class="fee_off"></a></li>
	   当前：/netctoss1/WEB-INF/Cost/find.jsp
	   目标：/netctoss1/WEB-INF/logo.jsp
<c:import url="../logo.jsp"></c:import>

6)异常路径 :
	   当前：不确定
	   目标：/netctoss/WEB-INF/error.jsp
  	<location>/WEB-INF/error.jsp</location>
  备注：在web.xml中，会自动添加netctoss,当前不缺定，使用绝对路径
2、按照异常编号声明 ，只能写一个编号
  <error-page>
  		<error-code>404</error-code>
  		<location>/WEB-INF/error.jsp</location>
  </error-page>
   <error-page>
  		<error-code>405</error-code>
  		<location>/WEB-INF/error.jsp</location>
  </error-page>
   <error-page>
  		<error-code>500</error-code>
  		<location>/WEB-INF/error.jsp</location>
  </error-page>
二、cookie和session简介
1、业务场景
-登录时要记住账号,在查询/增加/修改时显示此账号
2、前提条件
-浏览器和服务器是多对一的关系
3、错误的做法
-将账号存入下面的对象:
-request:多个请求之间无法通过request共享数据.
		登录请求中将账号存入-reqeust,在查询时换了新的request,数据丢失.
-config:多个Servlet之间无法通过config共享数据.
		登录Servlet将数据存入登录的config,在查询时调用了新的Servlet,换了新的config,无法访问登录config.
context:tomcat里只有一个对象,存储同名的数据有冲突.
4、正确的做法（*）
-使用cookie或session来存储账号:
-多个请求之间可以共享这2个对象中的数据
-多个Servlet之间可以共享这2个对象中的数据
5、它们的区别（*）
-cookie保存在浏览器上,服务器压力小,但安全性低
-session保存在服务器上,服务器压力大,但安全性高
（request为请求服务，confi为单个服务器服务，context为所有的浏览器服务）
6、使用建议
重要的数据存入session
一般的数据存入cookie

Cookie的使用
1、浏览器接收到cookie会自动保存
//接收帐号
String code = req.getParameter("code");
//登录检查
System.out.println("检查帐号、密码");
//验证通过后，保存帐号；
//一个Cookie只能存一份数据（key/value）
Cookie c1 = new Cookie("code",code);
//将cookie发送给浏览器，浏览器会自动保存cookie,将其存入浏览器的内存空间
//声明cookie的生存时间,单位是秒
//默认的seconds<0,存在内存上；seconds>0,存在硬盘上；可以设置时间
c1.setMaxAge(600000);

//此处省略响应内容，但是服务器还是会自动响应，仅仅是内容为空而已。
//并且响应时它会把绑定在response上的cookie自动发送浏览器。
res.addCookie(c1);
2、再次访问服务器时，浏览器会主动传入cookie
Cookie[] cookies = req.getCookies();
if(cookies !=null){
	res.setContentType("text/html;charset=utf-8");
	PrintWriter out = res.getWriter();
	for(Cookie c :cookies){
	out.println(c.getName()+" ,"+c.getValue());}
	out.close();}

3、cookie不能读取汉字,只能读取ASIIC码
编码：
Cookie c2 = new Cookie("city",URLEncoder.encode("北京","utf-8"));
解码：
out.println(c.getName()+" ,"+URLDecoder.decode(c.getValue(),"utf-8"));
4、code ,liubei city ,北京——————没有换行的原因
res.setContentType("text/html;charset=utf-8");
因为换行相当于空格，行内具有折叠作用
5、在main/login下创建的cookie，只对/main及其下级路径有效
//修改cookie的生效路径
c1.setPath("/cost");
//为了   /cost和/main都生效，写上一级路径
c1.setPath("/jsp4");
6、对浏览器的cookie进行设置
   可以删除cookie和禁用cookie
   清除指定时间段内的数据:Cookie及其他网站和插件数据
   Cookie:允许设置本地数据（推荐）\只在我退出浏览器之前保留本地数据
7、EL默认从4个对象中取值pageContext,request,session,application
也可以从cookie中取值，方式：cookie.key.value 
	 <span>${cookie.adminCode.value }</span>

cookie学习要点：
-cookie的创建与获取方式
-cookie的生存时间如何设置
-cookie中如何保存中文
-cookie的生效路径如何设置

Session
1)浏览器第一次访问服务器，服务器会创建一个session，以后就不会创建了
2）创建的session会存入request对象中
3）LoginServlet调用request中的session，浏览器将Session的ID通过Cookie作出响应。服务器会将Session自动存入cookie，并将cookie送给浏览器
4)浏览器再次访问时，会通过cookie提交ID，服务器通过ID寻找Session
5）将旧的session装入新的request中
6）通过IndexServelt调用request中的session，对浏览器作出响应。
   案例：
   接收帐号
  String code = req.getParameter("code");
   存入Session,给后续页面使用
   1、session存到服务器的内存里，默认存的
   2、session中可以存任意类型的数据，也可以直接存中文
   3、session对该项目内所有路径的请求都有效
	4、此session就是jsp内置对象中的session
  HttpSession s = req.getSession();
   s.setAttribute("code", code);
   服务器响应时会自动创建一个cookie，并将session的id存入此cookie，
   再把cookie发送给浏览器。
   获取登录时就创建好的session，并从中读取登录时保存的数据；
	HttpSession s = req.getSession();
	String code = (String) s.getAttribute("code");

7)在退出的时候，销毁session的数据。
  就近原则，在服务器端销毁帐号，
/********
  什么时候创建session？
帐号登录的时候就创建session并赋予ID,并且存入request中,获取session存入浏览器的数据，再把ID传给浏览器。
  session的寿命：
   存在：浏览器帐号登录的时候存在
   关闭：浏览器关闭时消失；
		 如果想让浏览器未关闭的时候，
		 浏览器空闲30分中；更改session,就需要强制销毁session
  session和浏览器是一一对应的关系。
**********/
   session.invalidate();
8）session空闲时间超过30分钟，会自动调用invalidate()，销毁帐号
9）session空闲时间（未关闭浏览器的状态）的设置
   声明session超时时间（单位：分钟）
  当用户空闲时间超出这个时间的时候，tomcat会自动将它的session销毁
  <session-config>
  <session-timeout>1</session-timeout>
  </session-config>//tomcat检测时间超过2min，等待超过1min
10）解决cookie禁用
	URL重写：在原来的地址后面加上了SessionId

二、session的学习要点
-如何获取session,如何存取数据
-如何销毁session
-如何配置session的超时时间
-cookie禁用时如何使用session

生成随机的验证码及图片		
Object[] objs = ImageUtil.createImage();
String imgcode = (String)objs[0];
将验证码存入session
req.getSession().setAttribute("imgcode", imgcode);	
将图片输出给浏览器
BufferedImage img =(BufferedImage)objs[1];
res.setContentType("image/png");
服务器自动创建输出流，目标指向浏览器
OutputStream os = res.getOutputStream();
/*代替如下
OutputStream os = new FileOutputStream("/home/soft01/1.png");
*/
ImageIO.write(img, "png", os);
os.close();

/**************
JS内容
 <td><img src="createImg.do" onclick ="this.setAttribute('src','createImg.do')";  alt="验证码" title="点击更换" /></td> 
现象：有些浏览器的路径不变，就不会触发刷新
解决办法：路径后增加的参数仅仅是用来欺骗浏览器的，目的是让它以为路径发生了变化，以重新获取图片
<td><img src="createImg.do" onclick ="this.setAttribute('src','createImg.do?x='+Math.random());";  alt="验证码" title="点击更换" /></td>  

JS内容



***************/
四、cookie和session的作用
1.通俗的理解
-它们可以按照如下的规则来保存数据:
-多个请求之间可以共用此对象中的数据
-多个Servlet之间可以共用此对象中的数据
-服务器会给每个浏览器单独创建一份对象
2.专业的理解(背)
-HTTP协议是无状态协议(服务器没有记住浏览器)
-cookie和session是用来管理状态的(让服务器记住浏览器)
-状态:用来证明浏览器访问过服务器的数据

五、过滤器（具有单例性，tomcat创建的时候，创建）
1、过滤器的作用
-用来处理项目中的公共的业务:
-如:记录日志,过滤敏感词,登录检查
-公共业务:很多请求都要实现的业务
2、过滤器的使用步骤
-创建一个类,实现Filter接口
-在web.xml中配置这个过滤器

1）filter由tomcat自动调用，tomcat会在接收请求后，调用servlet前调用filter.
2）tomcat在调用filter之前就会创建好request和response.
3）tomcat实例化的是接口的实现类：
   RequestFacade implements HttpServletRequest
   HttpServletRequest extends ServletRequest
4）public void init(FilterConfig cfg){}中的cfg中的参数想在public void doFilter{}中被调用
操作方法：在init{}方法中将cfg的值赋值给成员变量
ServletConfig的调用方法与之不同
可以直接利用request调用此service的父类方法，掉取此值
 ServletConfig cfg = getServletConfig();
 ServletContext cfg = getServletContext();

案例：	
System.out.println("在过滤之前记日志");		
//请求继续，去向目标servlet
//tomcat在初始化fliter时，将权利交给了.doFilter
chain.doFilter(request, response);
System.out.println("在过滤之后记日志");		
配置文件：
  声明此filter能够过滤哪些请求，即哪些请求需要交给它处理一下
  <url-pattern>/*</url-pattern>
注意：
配置了多个filter,它们之间的调用顺序以filter-mapping的顺序为准	
查询结果：
tomcat初始化：
初始化GuolvFilter、初始化LogFilter
查询页面：
在过滤之前记日志、在前面过滤敏感词
增加……
在后面过滤敏感词、在过滤之后记日志
  
监听器
监听器是监听request,session,context创建与销毁的事件，监听器是指对象
request
session
context
监听request,session,context数据改变的事件

具体案例
第一步：写一个类，实现相应的接口
第二步：在实现类中实现对应的方法
request
* 监听器由tomcat自动实例化
public MyListener(){
	System.out.println("实例化监听器MyListener");}
Tomcat在请求结束时，会自动销毁request,销毁它之后会自动调用该方法
public void requestDestroyed(ServletRequestEvent arg0) {
	System.out.println("request已销毁");}
Tomcat在请求开始时，会自动初始化request,初始化它之后会自动调用该方法
public void requestInitialized(ServletRequestEvent e) {
  System.out.println(e.getServletRequest());			
	System.out.println("request已初始化");	}
第三步：配置web-xml文件
声明监听器，tomcat会在事件发生时，自动调用此监听器的方法 
  <listener>
  <listener-class>web.MyListener</listener-class>
  </listener>


















项目笔记：
1.netctoss
  net:网络 c:China t:Telecom 电信 o:Operation 运营 
  s:Support 支持  s:System 系统
  名词解析：中国电信运营支持系统-网络版 
2.导包
 1)jdbc:用maven搜ojdbc,选择
 2)dbcp:用maven搜commons-dbcp,选择1.4
 3)javaee:导入tomcat自带的包
 4)jstl:用maven搜jstl,选择1.2
项目中手动导入4个包后，还需要在tomcat下的项目中的Lib中部署相应的包
3.开发思路(*)
 1)根据操作分析出该功能具备几个请求
 2)画图/写字分析每个请求的执行过程
 3)按照调用关系的倒序逐个开发每个组件

前提1：浏览器访问服务器，获取并加载一个网页的过程内，包含了多个请求
第一个请求	访问网页返回：text/html
第二个请求	加载网页head-link返回:css
第三个请求	加载网页body-img返回:image
前提2：WEB-INF具有保护功能，放在其内部的资源受到保护，避免直接被访问，
	   必须通过转发访问。
	   为什么jsp要放在WEB-INF下？
	  1、如果jsp不放在WEB-INF下，则别人可以直接访问它。
	  2、由于我们采用MVC模式，jsp数据来源与Servlet，直接访问它会报错。
	  3、将其放在WEB-INF下，就是要保护它，避免报错。
静态资源是浏览器加载Html时，直接访问的。不存在转发，所以不能将它们放在WEB-INF里，否则就访问不到了。		   //setInt()/setDouble() 不支持Null,但是业务上这些字段确实可以为Null.
		   //此时按照Object对其进行处理即可
		   ps.setObject(2, cost.getBaseDuration());

1、浏览器访问/findCost.do获得一个网页，在加载此网页时需要获得一张图片
2、是此网页和此图片之间的相对关系
3、（浏览器不知道转发的存在，只是网址的改变）
该网页的访问路径是：/netctoss/findCost.do
4、该图片的访问路径是：/netctoss/images/log.png
总而言之，此场景是我们站在浏览器的角度上分析问题
所有网页都是动态的：
netctoss和其他软件一样，也有权限管理的功能。即，不同的用户来看，能看到
不同的功能（图标）。所以此项目中所有的网页都是动态的。
注意事项：
1、setInt()/setDouble() 
	  不支持Null,但是业务上这些字段确实可以为Null.
	  此时按照Object对其进行处理即可
  ps.setObject(2, cost.getBaseDuration());
2、jquery外置对象的使用  location修改地址
<input type="button" value="增加" class="btn_add"	onclick="location.href='toAddCost.do';" />
3、获取的字符串在转换的时候，值不能为空
String unitCost = req.getParameter("unitCost");
if(unitCost != null && !unitCost.equals("")){
c.setUnitCost(new Double(unitCost));}
4、重定向的表单的修改点
   1）表单的action
   2)name 3）value 4) button 的返回方式
5、提取代码的方式
选中要提取的代码  ，ALT+SHIFT+m ，输入createCost
会自动生成方法private Cost createCost(ResultSet rs) {}
6、jsp中修改的相关内容
1）图片等静态资源的路径---》影响网页的显示
2）按钮的onclick功能-----》提交请求
3）form中的action   ---》提交请求
4）form中value、name---》提交数据
5）table中td		---》接收反馈数据
7、数据类型的变化
由JDBC向DB中存数据，需要是包装类的类型，可以为NULL
接收表单数据为string   String id = req.getParameter("id");




8、EL可以写在标签上
<input type="radio" name="radFeeType" id="monthly"
${cost.costType==1?'checked':' '}
 onclick="feeTypeChange(1);" />
java代码运行的时间比HTML早，可以写在JSP中的任意位置
java代码运行在服务器上，html运行在浏览器上

9、表单没有submit按钮的处理办法
<a href="index.html"><img src="images/login_btn.png" /></a>
submit按钮的本质就是触发表单的onsubmit事件，而该事件内部直接调用表单的submit方法
<a href="javascript:document.forms[0].submit()"><img src="images/login_btn.png" /></a>
href="javascript:"告诉它不是网页而是js
document.forms[0]:获取提交的表单，0代表提交的第一个表单
提交信息错误后，出现提示信息，在toLogin的更改内容${error}
servlet没有error的时候，不会显示
<td><span class="required">${error}<span><td>				
10、登录失败后返回的页面仍然显示错误的帐号和密码
方法一：转发的时候绑定参数
方法二：EL能获取提交的数据
 <td><input name="adminCode" type="text" value="${param.adminCode }" /></td>
11、menu被重复应用，可以单写也一个jsp,链接的路径是绝对的
	此处适合写绝对路径，原因如下：
	 1）假设当前浏览器打开资费查询页面，用户点击主页要跳转过去。此时对于浏览器而言，当前的路径是findCost.do,目标路径是toIndex.do.
	 2）对于浏览器而言，当前路径和目标路径都是   *.do
	 3）在写某链接的时候，目标路径是可以确定的，但是当前路径是无法确定的，可能是任何路径。
	 4）此时只能写绝对路径
12、jsp页面中间不能出现  非标签  的文本   
	将<%@include file="../menu.jsp" %>替换为
<%@taglib uri="http://java.sun.com/jsp/jstl/core"prefix="c" %>
<c:import url="../menu.jsp"></c:import>
13、服务器在翻译index.jsp时，会连带翻译它所引入menu.jsp,
	所以应当站在服务器的角度分析路径。
14、EL的写法纠正
错误：location.href="deleteCost.do?id=${cost.costId};";
正确：location.href="deleteCost.do?id="+id;

























语言基础：飞机大战
API、SE:上网记录传输、聊天空间
数据库：工具、对象类 读取数据
HTML、CSS：公司的查询网页
JS:没有项目 Jquery
Servlet+jsp:netctoss的登录页面 、资费管理的增删改查
spingmvc







http://maven.tedu.cn/

Spring 
day01
课程概要
*********************
1.spring 是什么？
特点:1)简化开发 2)管理对象  3)集成
2. spring容器
spring容器是什么? 如何启动spring容器？
一、创建对象
	方式一：利用无参构造器(重点)
	方式二 静态工厂方法(了解)
	方式三 实例工厂方法(了解)
二、管理对象
1)作用域  2）生命周期(重点)  3）延迟加载(了解)
3、IOC(Inversion Of Controll 控制反转)
什么是IOC？  什么是DI? (Dependency Injection 依赖注入)
1）set方法注入 2）构造器注入
课程详情
*********************
spring  框架 软件的半成品
目的：代码好维护、好扩展
1.spring 是什么？
开源的，轻量级的应用开发框架。
特点:1)简化开发
	spring对常用的一些api做了简化(比如，对jdbc做了简化，我们使用spring jdbc来访问数据库，就不再 需要考虑获取连接，关闭连接了)。
	 2)管理对象
	spring提供了一个容器，可以帮我们管理对象及对象之间 的关系，这样一来，对象之间的耦合度降低了，方便 代码的维护。
	 3)集成
	spring可以集成其它的一些框架（比如，可以集成用于 任务调度的框架Quartz）。
2. spring容器
spring容器是什么?
	spring框架中的一个核心模块，用于管理对象及对象之间 的关系。
如何启动spring容器？
	step1. 导包。spring-webmvc 
	step2. 添加一个配置文件。
	step3. 启动容器。

//启动spring容器
 * 容器：用来管理对象和对象之间的关系
 * 过程：导包 spring-webmvc、
		 安装配置文件applicationContext.xml、
		 启动容器
	   ApplicationContext是一个接口。	
	   ClassPathXmlApplicationContext是ApplicationContext接口
											   的一个实现类。
	   applicationContext.xml是spring的配置文件的位置
案例：
ApplicationContext ac = 
new ClassPathXmlApplicationContext("applicationContext.xml");

一、创建对象
	方式一：利用无参构造器(重点)
	step1. 类应该提供有无参构造器（或者缺省构造器)。
　　　　	step2. 在配置文件当中，配置bean元素。
	step3. 启动spring容器，调用容器提供的getBean方法。

案例：
利用无参构造器创建对象,xml文件大小写敏感 
id属性：设置bean的名称，要求唯一。
class属性：类的完整的名称(要求包含包名)。
	方法一：<bean id="stu1" class="first.Student">	</bean>
	方法二：<bean id="stu1" class="first.Student"/>	
通过spring容器获得对象,根据id获取，返回值为student
Student.class避免Object的转换，实际是传入类的对象
	Student stu1 = ac.getBean("stu1",Student.class);
	方式二 静态工厂方法(了解)
	 调用类的静态方法来创建对象。 

案例：
利用静态工厂方法创建对象   factory-method属性：要调用的静态方法的名称
含义：让Spring容器会调用指定的静态方法来创建对象。返回静态方法的返回值
<bean id = "cal1" class="java.util.Calender" factory-method="getInstance"></bean>
	
	方式三 实例工厂方法(了解)
	调用对象的方法来创建对象。

案例：
利用实例工厂的方法创建对象
factory-bean属性：要调用的对象的id
factory-method属性：该对象的方法。
注：Spring容易会调用该对象的方法来创建对象。
	<bean id="time1" factory-bean="cal1" 
					 factory-method="getTime"></bean>
二、管理对象
1)作用域
	  默认情况下，针对一个bean的配置，spring容器只会创建一个实例(即作用域为singleton)。可以设置scope属性值为prototype。此时，会创建多个例。

案例：
配置作用域
scope属性：默认值是"singleton"单例
即容器针对一个bean的配置，只会创建一个实例
如果值是prototype（原型，会创建多个实例）
	<bean id="eb1" class="basic/ExampleBean"   
					  scope="prototype"></bean>
2）生命周期(重点)
初始化方法:通过init-method属性指定。
销毁方法:通过destroy-method属性来指定。
注：只有作用域为单例的bean,销毁方法才会执行。
初始化方法、销毁方法
//配置生命周期相关的两个方法
	init-method属性：初始化方法名称。
	destroy-method属性：销毁方法的名称。
<bean id="mb1" class="basic.MessageBean" init-method="init"
	destroy-method = "destory"></bean>
//因为applicationContext没有定义关闭容器的方法close()，
  所以需要用其子接口
	AbstractApplicationContext ac = new   
	  ClassPathXmlApplicationContext("basic.xml");
//关闭bean
	ac.close();

3）延迟加载(了解)
   默认情况下，当spring容器启动之后，会将所有作用域为单例（singleton）先创建好。可以设置lazy-init属性值为true,这样，容器启动之后，对于作用域为单例（singleton）的 bean,就不再创建了。

单例可以配置----配置延迟加载
<bean id="lz1" class="basic.LazyBean" lazy-init="true" >
备注：创建spring的时候，会自动创建 singleton和lazy-inti=false的对象

3、IOC(Inversion Of Controll 控制反转)
什么是IOC？
	对象之间的依赖关系由容器来建立。
什么是DI? (Dependency Injection 依赖注入)
	容器通过调用对象提供的set方法或者构造器来建立对象之间的依赖关系。
	注：IOC是目标，DI是手段。
1）set方法
容器调用对象提供的set方法来建立依赖关系。
step1. 类应该提供有对应的set方法。
step2. 在配置文件当中，使用property元素来 配置依赖关系。

案例：
<bean id="b1" class="ioc.B"></bean>
配置依赖注入（set） ：
property元素：表示采用set方法来注入。
			name属性用来指定属性名。
			ref属性指定属性值。
<bean id="a1" class="ioc.A">
name的属性名大写，在调用setB()方法，并传入对象ref指向的id=b1 
	<property name="b" ref="b1"/>
</bean>

注入关系建立的流程：
step1:创建spring容器
step2:读取spring配置文件，创建A、B两个对象
step3:读到A中的property ，将B注入A的set方法中，建立依赖关系

注入的类型的更换：
让更换的类型实现 接口；多态的应用；泛型

2）构造器注入
案例：
配置依赖注入（构造器） index：指定参数的位置（从0开始）
<bean id="wt1" class="ioc.Waiter"/>
<bean id="rest1" class="ioc.Restaurant">
 	<constructor-arg index="0" ref="wt1"/>
</bean>






day02
自动装配
容器依据某种规则，自动建立对象之间的依赖关系。
注：默认情况下，容器禁止自动装配。
可以设置autowire属性值，让容器自动装配。

byName:以属性名作为bean的id,查找配置文件，找到文件后，使用set方法注入
备注：找不到会注入空值。不会找到多个符合条件的bean
autowire="byName"相当于
				 Waiter wt0 = ac.getBean("wt",Waiter.class);
byType:以属性类型作为bean的类型，查找配置文件，找到之后，会使用set方法来注入。
备注：找不到会注入空值。如果找到多个符合条件的bean，会报错
constructor:与byType类似，只不过会使用构造器来注入。
案例：
<bean id="wt1" class="ioc.Waiter" scope="prototype"/>
<bean id="wt2" class="ioc.Waiter" scope="prototype"/>
<bean id="rest" class="ioc.Restaurant" autowire="byType"/>
情况：在 id="wt"中添加lazy-init="true" scope="prototype"
分析：在Restaurant中创建的Waiter，跟我们getBean的Waiter是一样的。
创建了wt1、wt2、w3、w4,但是在Restaurant中创建的是wt0
情况：在id="rest"中添加lazy-init="true" 
分析：lazy-init并不会影响 ，在启动spring时，
  getBean创建Restaurant就会创建对象waiter,而不是getBean("waiter")
  autowire="byName"相当于	
				  Waiter wt0 = ac.getBean("wt",Waiter.class);

注入基本类型的值 
1）基本类型：使用value属性来注入。
案例：
<bean id="eb1" class="value.ExampleBean" >
	<property name="name" value="小月"/>
	<property name="age" value="18"/></bean>
2）集合类型
 List Set Map Properties 
 List<String> 、Set<String> 、Map<String,Double> 、Properties 
案例：
<property name="interest" >
	<list><value>钓鱼</value></list></property>		
<property name="cities" >
	<set><value>北京</value> </set></property>
<property name="score" >
	<map><entry key="english" value="95"/></map></property>
<property name="db" >
<props><prop key="username">Sally</prop><props><property>	

3）封装类型
 以引用的方式注入集合类型的值	 
（冒号前面的util）命名空间（namespace）：
									 为了区分同名元素，在元素前添加的限定
<util:list id="interestBean">
	<value>钓鱼</value></util:list>
<util:set id="citiesBean">
	<value>北京</value></util:set>
<util:map id="scoreBean">
	<entry key="english" value="95"/></util:map>
<util:properties id="dbBean">
	<prop key="username">Sally</prop></util:properties>
注入：
<bean id="eb2" class="value.ExampleBean" >
	<property name="db" ref="dbBean"></property></bean>	 

4）读取
读取properties文件 
		  location:指定要读取的文件的位置
		 classpath:依据类路径来查找
<util:properties id="configBean"  
		   location="classpath:config.properties">
</util:properties>
测试：
System.out.println(ac.getBean("configBean"));



2016.11.29
day03
Spring表达式
Spring 提供了 Spring表达式，用于读写取Bean属性，
利用Spring表达式可以将一些Bean的属性读取出来，赋值给另外的Bean属性。
好处：减低Bean属性赋值的耦合性，
	  不需要java编码只使用配置文件就可以读写Bean属性。
常见用途：读取Properties文件


注入Spring表达式值
1、使用Spring表达式注入Bean属性
   从db Bean  #{BeanId.属性} 中读取属性，写到 driverClass属性中
  <bean id="dbUtil" class="spring1.DBUtil">
  <property name="url" value="#{db.url}"/>
2、@Before  可以在@Test执行之前执行，可以放共用的程序
注入null或者空字符串
1、Spring将属性的空参数当作空String
	<property name="name" value=""/>
2、如果需要注入null值，可以使用<null/>元素
	<property name="name" ><null/></property>

基于注解的组件
1)
配置文件中配置扫描包：
在Spring启动时候，自动扫描 spring1.demo 包中所有类的注解
<context:component-scan base-package="spring1.demo"/>
类中修改：
Spring可以编译的相关组件：
 	Component :组件;
	Repository:持久化层组件；
	Service:业务层组件；
	Controller：控制层组件；
	named:是javax.inject的包中的方法

Spring在扫描到这个类的注解Component,
Spring会将DemoBean实例化为对象Bean Id为demoBean
类TestBean 没有被Spring扫描到，就不会在Spring中创建对象

@Component
public class DemoBean implements Serializable {}
@Component
public class TestBean implements Serializable {}

2)采用自定义的BeanId
* 修改默认的Bean ID,指定为特定的ID myBean
  ctx.getBean("myBean",DemoBean.class);

@Component("myBean")
public class DemoBean implements Serializable {}	
3）Scope范围
* 默认情况下，Spring在的Bean组件，都是单例的，也就是说，任何时候获取的Bean对象都是同一个。在增加@Scope("prototype")以后，则变成多例，每次getBean都会创建新实例
 * 在Bean类上使用@Scope（“prototype”）使用，每次调用getBean都会创建新的Bean对象，也就是Bean有多个实例
4）初始化和销毁方法
@PostConstruct
@PreDestroy

public void gameOver(){
	//关闭Spring 容器
	ctx.close();}//用于测试销毁方法
5）指定依赖注入关系
一、属性注入
1、Setter注入推荐@Resource
* 在运行期间，Spring会将Bean ID 为girl的Bean对象注入到girlfriend属性中
	@Resource(name="girl")
	private Girl girlfriend;
备注：JAVA Bean 中有无参构造方法（创建Bean对象）、set方法（注入对象）
2、构造器注入推荐@Autowired
 默认情况下，Spring自动将Bean ID为girl的Bean注入到相同变量名的girl中
 类似：自动装箱
	@Autowired
	private Girl girl;
 将Bean ID为girl的Bean注入到girlfriend中
	@Autowired	
	@Qualifier("girl")
	private Girl girlfriend1;
3、需要导包，名字不一样需额外加注解	
	@Inject
	@Named("girl")
	private Girl girlfriend2;
二、方法注入：在注入对象之前需要执行一段逻辑，会执行set方法
	Bean 属性注入：set方法注入
	private Girl girlfriend3;
	@Resource(name="girl")
	public void setGirlfriend(Girl girlfriend3) {
	this.girlfriend3 = girlfriend3;
	System.out.println(girlfriend3+"：多说无意");}
三、表达式注入
在运行期间Spring将读取BeanID为db中的driver属性，注入到driverClass中
	@Value("#{db.driver}")
	private String driverClass;
 * 测试表达式注入
 * 同时使用不同包中的同名类的时候，必须写类的全名！
spring1.demo.DBUtil d = ctx.getBean ("dataBaseUtil",spring1.demo.DBUtil.class);						   
四、Spring-mvc
1）Spring-mvc是什么?
   一个用来简化web开发的mvc框架。
   注：springmvc属于spring框架的一部分。
2）五大组件
. DispatcherServlet (前端控制器) 
. HandlerMapping 
. Controller (处理器)
. ModelAndView 
. ViewResolver 视图解析器
step1,
DispatcherServlet收到请求之后，依据 HandlerMapping的配置，调用相应的Controller 来处理。
step2,
Controller将处理结果封装到ModelAndView对象。 然后将该对象返回给DispatcherServlet来处理。 
注：ModelAndView对象包含有两部分数据，一是处理结果， 另外，还包含有视图名(就是一个字符串，比如"hello")。 
step3,
DispatcherServlet依据ViewResolver的解析，调用相应的视图对象(比如jsp)来生成相应的页面。

3）编程步骤
step1,导包 spring-webmvc 
step2,添加spring的配置文件。
step3,配置DispatcherServlet。(web.xml)
step4,写Controller类。
step5,写jsp。
step6,配置HandlerMapping和ViewResolver。



案例：
1、配置Spring MVC的主控制器 
  <servlet-name>springmvc</servlet-name>
  <servlet-class>
	  org.springframework.web.servlet.DispatcherServlet
  </servlet-class>
--DispatcherServlet官方要求必须写配置文件
	<init-param>
	<param-name>contextConfigLocation</param-name>
--表示放在编译后的包里，并且给spring-mvc使用
	<param-value>classpath:spring-mvc.xml</param-value>
	</init-param>
	<load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
	  <servlet-name>springmvc</servlet-name>
	  <url-pattern>*.form</url-pattern>  
  </servlet-mapping>
2、配置XML
1）HandlerMapping的配置在spring-mvc.xml
-- setMappings(Properties p) 
-- key:web的url value:BeanId
--  创建helloBean的Bean对象
<bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
-- 类上包含setMappings方法，因为setMappings方法的参数是Properties,则需要注入props 
	<property name="mappings">
		<props>
-- url和控制器bean之间的关系
-- 请求/demo.form时候，执行控制器 的demoBean对象的方法
		<prop key="/demo.form">demoBean</prop>
		</props>
	</property>
</bean>
<bean id="demoBean" class="spring1.DemoBean"></bean>

2）视图处理器 
<bean id="" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
-- 前缀 + 视图ID +后缀 = 视图的url
	<property name="prefix" value="/WEB-INF/jsp/"/>
	<property name="suffix" value=".jsp"/>	
</bean>

3、创建类day01.HelloController
1） 继承：HelloController implements Controller 
2）创建对象ModelAndView
 view是一个jsp页面的名称;代表用户看到的界面模板
	String view ="msg";
model 表示需要在页面上显示的数据,传递到用话界面的数据，可以是各种类型的
	Map<String,Object> model = new HashMap<String,Object>();
	model.put("message","hello world");
	ModelAndView mv = new ModelAndView(view,model);
3）创建msg.jsp
4、ViewResolver：用msg.jsp作出响应需要有view的Bean
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	<property name="prefix" value="/WEB-INF/"></property>
	<property name="suffix" value=".jsp"></property>	
</bean>


2016.11.29
day04
基于注解的springmvc应用
1.编程步骤
step1. 导包。
step2. 添加spring配置文件。
step3. 配置DispatcherServlet。
step4. 写Controller。
	   a. 不用实现Controller接口。
	   b. 可以添加多个方法。
	   c. 方法名称不作要求，返回值的类型可以是 ModelAndView，
			也可以String。
	   d. 在类名前添加@Controller。
	   e. 在类名前或者方法前添加@RequestMapping。
		注：@RequestMapping的作用相当于HandlerMapping。
step5. 写jsp。
step6. 配置视图解析器，配置组件扫描, 配置springmvc注解扫描(让spring容器能够识别 @RequestMapping)。 
2.读取请求参数值
方式一：request对象:只要将request对象作为方法的入参即可。
方式二：@RequestParam:将@RequestParam添加到参数前。
方式三：封装成一个javabean
	  step1.写一个java类，要求：
			 a. 属性名与请求参数名一致。
			 b. 属性有对应的get/set方法。
	  step2.将该java类作为方法的入参即可。
3.向页面传值
方式一: 将数据绑订到request对象。
		注：springmvc默认使用转发机制来跳转。
方式二: 返回ModelAndView对象。
方式三: 将ModelMap作为方法的入参。
方式四: 将数据绑订到session对象。
4.重定向
方式一：如果方法的返回值是String,在重定向地址前添加"redirect:"即可。
		比如 return "redirect:toIndex.do"; 
方式二：如果方法的返回值是ModelAndView：


1、使用步骤：
导入Spring MVC相关的包，并且配置主控制器
添加Spring配置文件，并且在配置文件中设置开启注解版本MVC 和 注解版Bean扫描。
编写注解版本控制器
使用 @Controller 和 @RequestMapping 注解
编写界面JSP组件，并且配置 视图处理器支持JSP组件




简化Springmvc中XML的书写方式
1）spring-mvc.xml中的更改：
-- 开启注解扫描，支持组件注解  @Controller @Service……
<context:component-scan base-package="day02.web"/>
-- 开启注解版spring MVC 支持@RequestMapping 注解-->
<mvc:annotation-driven/>
2）java 的controller中的更改：
   注解版本的Spring MVC 的控制器可以是任何Java Bean, 在类上使用   
   @Controller 和 @RequestMapping 注解即可：
   其中 @Controller 用于声明Bean组件对象，
	   @RequestMapping 用于映射URL请求路径
注意：控制器包所在的路径必须是Spring组件扫描的目标路径，
	  否则不能正常实例化Bean对象。 在请求 /day02/hello.from 时候，
	  自行控制HelloController 的 execute() 方法。

案例：
@Controller
@RequestMapping("/day02")
	public class HelloController {
@RequestMapping("/hello.form")
方法一： public String excute(){
		 System.out.println("Hello World");
		return "msg"; //返回视图名称 jsp的名称}
方法二：public ModelAndView bye(){
		   return new ModelAndView(view,model);}
方法三：public String demo1(HttpServletRequest req){
			  return "demo1";}
差别分析：
紧耦合：控制器方法紧紧的绑定了servlet API，
		紧耦合时，只能在web容器中进行测试
好处：  可以调用Servlet底层的API	
松耦合：返回ModelAndView方式，是控制器与ServletAPI无关，就可以脱离web容器单独测试，可以实现平台无关的测试	

day05
2016.11.30
一、浏览器向服务器传递数据
1）浏览器传递
 * 显示登录页面
   因为Login.jsp保存在/WEB-INF文件中不能直接显示，所以利用控制器转发才能显示
   	@RequestMapping("/toLogin.form")
	public String form(){return "login";}
2）服务器接收数据
* 利用request对象接收浏览器提交的数据
   缺点：数据的编码，数据类型都需要手工类型，Servlet与控制器紧耦合，
		  不方便独立测试。
   优点：可以直接访问Servlet底层API，可以获取通信的底层详细信息  
		  如：读取请求头信息 
	@RequestMapping("/login1.form")
	public String login1(HttpServletRequest request) {
	request.setCharacterEncoding("utf-8");//编码
	String us = request.getHeader("User-Agent");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
		return "login";}
* 表单参数自动注入
   控制器方法参数名与表单中输入框name属性一致，SpringMVC就会自动将表单数据解码，并且转换数据类型然后注入到变量中，需要配置filter处理乱码问题
   @RequestParam("for")String pwd
	 当表单中的name 与 参数不一样的时候，需要加标签
	@RequestMapping("/login2.form")	
	 public String login2(
	 String username,@RequestParam("for")String password) {
		System.out.println(username+","+password);	
		return "login";}
*web.xml中配置filter：处理编码异常的问题 
<filter>
	<filter-name>Encoding</filter-name>
	<filterclass>
	   org.springframework.web.filter.CharacterEncodingFilter
	</filter-class>
<init-param>
	<param-name>Encoding</param-name>
	<param-value>UTF-8</param-value>
</init-param>
</filter>
<filter-mapping>
	<filter-name>Encoding</filter-name>
	<servlet-name>springmvc</servlet-name>//必须写servlet的名称
</filter-mapping>

值对象：用于封装一组值的对象
避免方法中传入过多的参数，或者参数值跟浏览器的name属性一致
1、浏览器向服务器 传递数据
1)需要写一个封装浏览器属性的类
值对象，用于封装用户名和密码
public class UserInfo implements Serializable {}
2) 利于值对象，打包接收表单中的数据
   @RequestMapping("/login3.form")
   public String login3(UserInfo user){return "login";}
2、
 1） 服务器向浏览器 传递数据
   @RequestMapping("/login4.form")
   public String login4(UserInfo user,ModelMap model){
	model.addAttribute("nameError", "用户名错误");
	return "login";}	
  <span class="error">${nameError}</span>
 2）服务器向浏览器 传递 浏览器传递的数据
  注意：@ModelAttribute("参数") 必须是username
   public String login2(@ModelAttribute("username") 
			 String username,String password) {}
 3）利于session共享数据
   public String login5( UserInfo user,
	HttpServletRequest req){
		//获取seeion对象
		HttpSession session = req.getSession();
		session.setAttribute("loginUser", user);
		//login 界面中使用${user}读取Session中的数据
		return "login";}
二、重定向
方法一：
public ModelAndView checkLogin1(){		
	  RedirectView view =
		   new RedirectView("../demo/toLogin.form");
		return new ModelAndView(view);}

方法二：使用字符串前缀redirect: 返回重定向结果
public String checkLogin2(){
	return "redirect:../demo/toLogin.form";}
	
方法三：跨站重定向到http://doc.tedu.cn
public String doc(){
	return "redirect:http://doc.tedu.cn";}

三、系统分层（了解）
1.如何分层?
表示层：表示逻辑(数据展现/操作界面)和控制逻辑(请求分发)
业务层：封装业务处理逻辑
持久层：封装数据访问逻辑
2.优点
上一层通过接口调用下一层提供的服务，这样，当 下一层实现发生了改变,不影响上一层。这样有利于 系统的维护。
3、登录案例的步骤 
step1.导包。
step2.添加spring配置文件。
step3.配置DispatcherServlet。
step4.Admin实体类。
step5.AdminDAO接口和实现类。
	  public Admin findByAdminCode(String adminCode); 
step6.LoginService接口和实现类。
	  public Admin checkLogin(String adminCode,String pwd); 
step7.login.jsp,index.jsp,error.jsp和 LoginController。
step8.配置spring配置文件。
		应该包含以下配置信息:组件扫描,mvc注解扫描,视图解析器,连接池配置




day06
2016/12/1
/******
过滤器、处理器、控制器、拦截器、异常处理器
private static final long serialVersionUID=1;//???

User user = new User();//???????bean
注释的方法 ：对象注入，使用的的set方法或者构造器的方法，所以必须写在类的全局变量里面，并且类里面的全局变量是单例的
*******/

1.表单中文参数值的乱码问题
在web.xml文件当中，配置springmvc提供的一个过滤器(CharacterEncodingFilter)。
需要注意：
a.表单提交方式必须设置为"post"。
b.过滤器的编码设置与表单的编码要一致。

一.让spring框架来处理异常
方式一： 使用简单异常处理器。
	   step1. 配置简单异常处理器。
	   step2. 编写异常处理页面。
案例：
1、异常处理器
<bean class="org.springframework.web.servlet.handler.SimpleMappingExceptionResolver">
	<property name="exceptionMappings">
	<props>
		<prop key="java.lang.ArrayIndexOutOfBoundsException">error1</prop>
		<prop key="java.lang.NullPointerException">error2</prop>	
	</props>	
	</property>
</bean>
方式二: 使用@ExceptionHandler。
step1. 在处理器类当中，添加一个用来处理异常的方法， 该方法必须添加@ExceptionHandler是控制器内部的处理方法，是局部的
step2. 在异常处理方法里面，依据异常类型，分别进行 不同的处理。


二、拦截器
什么是拦截器?
	前端控制器DispatcherServlet在调用处理器Controller之前，如果发现有拦截器存在， 则会先调用拦截器，然后再调用处理器。
注：
过滤器属于servlet规范当中定义的组件，而拦截器 属于spring框架定义的件。


servlet过滤器的定义方式
过滤器（具有单例性，tomcat创建的时候，创建）
1、过滤器的作用
-用来处理项目中的公共的业务:
-如:记录日志,过滤敏感词,登录检查
-公共业务:很多请求都要实现的业务
2、过滤器的使用步骤
-创建一个类,实现Filter接口
-在web.xml中配置这个过滤器

1）filter由tomcat自动调用，tomcat会在接收请求后，调用servlet前调用filter.
2）tomcat在调用filter之前就会创建好request和response.
3）tomcat实例化的是接口的实现类：
   RequestFacade implements HttpServletRequest
   HttpServletRequest extends ServletRequest
4）public void init(FilterConfig cfg){}中的cfg中的参数想在public void doFilter{}中被调用
操作方法：在init{}方法中将cfg的值赋值给成员变量
ServletConfig的调用方法与之不同
可以直接利用request调用此service的父类方法，掉取此值
 ServletConfig cfg = getServletConfig();
 ServletContext cfg = getServletContext();
案例：	
System.out.println("在过滤之前记日志");		
//请求继续，去向目标servlet
//tomcat在初始化fliter时，将权利交给了.doFilter
chain.doFilter(request, response);
System.out.println("在过滤之后记日志");		
配置文件：
  声明此filter能够过滤哪些请求，即哪些请求需要交给它处理一下
  <url-pattern>/*</url-pattern>




注意：
配置了多个filter,它们之间的调用顺序以filter-mapping的顺序为准	
查询结果：
tomcat初始化：
初始化GuolvFilter、初始化LogFilter
查询页面：
在过滤之前记日志、在前面过滤敏感词
增加……
在后面过滤敏感词、在过滤之后记日志


如何写一个拦截器?
step1. 写一个java类，实现HandlerInterceptor接口。
step2. 将拦截处理逻辑写在相应的接口方法里面:
	 preHandle方法：前端控制器先调用拦截器的preHandle方法， 如果该方法返回值为true,则拦截器继续向后调用；如果 该方法返回值为false,则拦截器不再向后调用，请求处理 完成。
	 postHandle方法：处理器方法已经执行完成，正准备将 ModelAndView对象返回给前端控制器之前执行。可以在该方法里面，修改ModelAndView对象。
	 afterCompletion方法：最后执行的方法，要注意，如果 preHandle方法返回值为false,该方法不会执行。
step3. 配置拦截器。

案例：
1、写拦截器类的方法
1)在控制器之前执行的方法，返回true,控制器继续执行，false则拦截控制器
	public boolean preHandle(){return true;}
2)控制器执行以后，执行此方法
	  public void postHandle(){}
3)jsp执行之前，视图处理器执行之后
	public void afterCompletion(){}
2、 配置拦截器
   将请求路径 /user/*拦截到DemoInterceptor中执行
<mvc:interceptors>
	<mvc:interceptor>
		<mvc:mapping path="/user/*"/>
		<bean class="dayo4.dao.DemoInterceptor"/>
	</mvc:interceptor>
</mvc:interceptors>




2016.12.2
spring jdbc

spring jdbc是什么?
spring框架对jdbc的封装。
(封装了常见的JDBC访问算法，提供了简介的API)
JdbcTemplate封装了常用的CRUD（create,retrieve检索,update,delete增删改查）操作
主要API JdbcTemplate
执行DML语句方法： 
	插入，删除，更新
   	int update(sql, sql参数)
执行DQL语句方法:
  	List<对象> query(sql, sql参数, RowMapper)
		 对象	queryForObject(sql, sql参数，RowMapper)
	使用 JdbcTemplat时候, 需要使用Spring IOC创建对象，	 		JdbcTemplate必须依赖于dataSource.



如何使用spring jdbc?
spring框架提供了一个JdbcTemplate类，提供了大量的 实现的方法，我们只需要配置好该对象，然后调用其方法 即可。
step1.导包	 spring-webmvc,ojdbc,dbcp,junit,spring-jdbc
step2.添加spring配置文件,配置JdbcTemplate。
step3.调用JdbcTemplate的方法来访问数据库。

案例：
配置使用spring-jdbc 
<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
必须注入dataSource用来链接数据库
<property name="dataSource" ref="dataSource"></property>
</bean>
对应的DML使用的方法：
利于jdbcTemplate执行插入语句
jt.update(sql, 7,"max","123","123243254","小桥流水人家");
对应的DQL使用的方法：
1）查询多个对象：
//封装将结果集的一行，如何封装成一个user对象,重用会更简单
//RowMapper接口的匿名内部类的方法，是作为数据库查询结果的映射方式
RowMapper<User> rm = new RowMapper<User>(){
	public User mapRow(ResultSet rs, int index){
//将当前ResultSet中的一行数据映射到User对象中
   	  User user = new User();
		 user.setId(rs.getInt("id"));
	  return user;}};
List<User> list = jt.query(sql, rm);
2）查询一个对象：
  String[] param5 = {"tom"};
  User user = jt.queryForObject(sql5, param5, rm);
3)查询一条记录中的一个字节片段	
RowMapper<Integer> rm = new RowMapper<Integer>(){
	public Integer mapRow(ResultSet rs, int index) {
	  return rs.getInt("id");}	};
	  String sql6 = "Select id from user_hhy WHERE name=?";
	  String[] param6 = {"tom"};
	int user6 = jt.queryForObject(sql6, param6, rm);
 方法2
  public List<Map<String,Object>> findUser(){
	String sql = "SELECT id,name FROM user_hhy ";
	return jt.queryForList(sql);}

注意：
map跟实体对象的用法是一致的，所以两种方法写的网页是一样的
user代表users中的每个元素Map，user的类型是map,所以user.id可以获取ID值，user.name 可以获取username的值 
例如：map(id,1) 网页获取1 的语法 ${}

利用Map封装查询结果
Spring JDBC 提供了用Map封装查询结果，这样就可以按需获取少部分数据列。 减少了数据量提高了性能。
使用实体对象封装查询结果， 浪费数据；
使用Map对象封装查询结果， 需要多少查询多少，节省资源。


反射和二进制
二进制

什么是2进制？
逢2进一的计数规律



补码
利用高位为1的2进制数模仿负数的一种算法。
Java 中支持补码的算法： - Integer.parseInt() - Integer.toString()
使用2进制
16进制：2进制的简写！！

反射
Java 中动态的执行API，可以用于：动态加载类，动态创建对象，动态获取类型信息，动态访问属性，动态执行方法等

动态、静态
静态：固定的执行规则。
动态：运行期间动态的确定调用规则。

应用
反射可以用于解析注解
@Retention(RetentionPolicy.RUNTIME)
//深度：
 * SOURCE 在编译后的文件中不会出现test
 * CLASS 在运行期间的  在方法区的方法  文件中不会出现test
 * RUNTIME在运行期间的文件中会出现test 
@Target({ElementType.METHOD})//方法对象




2016.12.5
MyBatis框架

mybatis是什么?
是一个开源的持久层框架。
注：(了解)
  jdbc: 速度快 代码量大 需要写sql。
  hibernate: 不用写sql 代码量少 速度慢 学习难度大。 
				 会生成复杂的sql，不好优化。
  mybatis:速度适中，需要写sql,代码量少，学习难度小。
编程步骤
step1. 导包。   mybatis,odjbc
step2. 添加配置文件SqlMapConfig.xml。
		注：连接池的配置environment,映射文件的位置mapper。
	  <mapper resource="dao/DeptMapper.xml" /> 
		目的：在dao的xml文件中创建连接，链接到数据库
step3. 写一个实体类。
step4. 写一个映射文件。注：里面主要是sql语句。
step5. 调用SqlSession提供的方法来访问数据库。

基本原理
1、读取  sql会话工厂通过连接池配置文件读取映射文件中的sql语句
2、创建  sql会话工厂根据映射文件sql创建Statement对象
		 Map(key是sql的ID)
3、创建  sql会话工厂创建一个sql会话
4、调用session的方法，传入参数（sqlID，参数）
5、根据sqlID获取对应的Statement，然后执行对象的相应的方法
6、如果是查询，会封装成相应的对象

1）打开配置文件
从ClassPath(Resource)中读取文件,目的读取配置文件
Reader in = Resources.getResourceAsReader("SqlMapConfig.xml");
2）创建SqlSession
   先创建工厂的工厂，再创建工厂，再创建session
SqlSessionFactoryBuilder builder = 
							  new  SqlSessionFactoryBuilder();
3）利用配置文件创建SqlSessionFactory，	 
 SqlSessionFactory factory = builder.build(reader);
4） 再利用SqlSessionFactory链接数据库
 SqlSession session = factory.openSession();
5）session 必须关闭(包含数据库链接)
		 System.out.println(session);
		 session.close();
6）selectList(id)方法执行查询语句其中id在Mapper文件中SQL语句的ID
 List<User> list = session.selectList("findAllUser");

7）findUserByName(String username) 跟参数名一致 
  sql后不能写分号，报错很难找
	where name = #{username }
8）selectOne 用于执行查询结果只有一个对象的select语句
User user = session.selectOne("findUserByName","jerry");

1、
返回Map类型的结果
mybatis会将查询到的结果存放到Map对象里面( 一条记录对应一个Map对象，其中，字段名作为key, 字段值作为value)。
接下来，再将Map对象中的数据放到实体对象里面。
2、 Mapper映射器
2.1 什么是Mapper映射器
就是符合Mybatis特定要求(符合映射文件的要求)的接口， Mybatis会依据这些接口生成相应的实现对象。
2.2 这些接口有哪些要求
a. 方法名必须与sql语句的id一样。
b. 方法的返回类型与sql语句的返回类型一致。
c. 方法的参数类型与sql语句的参数类型一致。
此外，
映射文件的namespace必须等于Mapper映射器( 即要写这些接口的完整的名称)。


方法一：面向过程
List<User> list = session.selectList("findAllUsers");
方法二：面向对象
 利用SqlSession创建UserMapper接口的匿名实例
 session利用反射API中动态代理API
 在运行期间动态的创建了UserMapper的匿名实例
UserMapper mapper =  session.getMapper(UserMapper.class);
List<User> list =  mapper.findAllUsers();


二、 插入用户信息方法 -->
<insert id="addUser" parameterType="cn.tedu.entity.User">
insert into user_hehy(id,name,pwd,mobile,address)
values
<!-- #{调用对象的get\set方法} -->
(#{id},#{name},#{pwd),#{mobile},#{address})
</insert>

注意：
 1）对数据库的数据更改，需要提交事务
   session.commit();
2）对数据进行更改，需要查询已有数据，更改JAVA中数据，将数据更新到数据库
	User user = mapper.findById(id);
	 user.setAddress("雪国");
	 int n = mapper.updateUser(user);
	 
三、 删除用户信息方法 
方法一：
	SqlSession session = factory.openSession();
	  UserMapper mapper = session.getMapper(UserMapper.class);
	 int id = 121;
	 int n = mapper.deleteUserById(id);
方法二：
	SqlSession session = factory.openSession();
	 int id = 121;
	int n =  session.delete("deleteUserById", id);
方法三：
	SqlSession session = factory.openSession();
	  UserMapper mapper = session.getMapper(UserMapper.class);
	int id = 1;
	User user = mapper.findById(id);
	int n = mapper.deleteUser(user);
注意:MyBatis默认情况下，将结果集的列名映射到同名的实体对象的Bean属性上
如果不一致，会出现null值现象（列名--Bean属性）
解决办法一：使用别名替换到结果集的列名，自动映射
select
	empno as id,
	ename as name,
	password as pwd
from user_hhy	
解决办法二：使用结果集映射规则，手动映射
使用ResultMap，用来解决实体类的属性名与表的字段名不一致的情况。
step1. 
配置resultMap元素，告诉mybatis,表的字段名 与实体类的属性名的对应关系。
step2. 查询语句当中，结果类型要改为resultMap。

 结果集映射规则 
<resultMap type="cn.tedu.entity.Employee" id="empResultMap">
 规定结果集中的列和实体属性的对应关系 ，此方法一个属性都不能漏
<id column="empno" property="id"/>		  主键 
<result column="ename" property="name"/>	   映射普通列
<result column="salary" property="salary"/>	映射普通列 
<result column="hiredate" property="hiredate"/>映射普通列 
<result column="deptno" property="deptId"/>	映射普通列 
</resultMap>
写resultMap，就不必写 resultType	
<select id="findAllEmployee"  resultMap="empResultMap" >
	select
		empno,  ename, salary,
 		hiredate,deptno 
	from emp_hehy
	where empno=#{id}
</select>	




2016.12.6
1）sqlSessionFactory在spring的配置文件中的定义格式
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
<!--指定链接资源  -->
<property name="dataSource" ref="dataSource"></property>
<!-- 指定映射文件 -->
<property name="mapperLocations" value="classpath:mappers/*.xml"></property>
</bean>
2）在spring容器初始化的时候，自动初始化MapperScannerConfigurer
   这时扫描器对象会扫描cn.tedu.dao中全部的接口，并且自动创建此接口的匿名实例（反射）
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
<property name="basePackage" value="cn.tedu.dao"></property>
声明注解在扫描Mapper接口时候，只实例化包含MapperBean 注解的接口 
<property name="annocationClass" value="cn.tedu.util.MapperBean"></property>]
</bean>
3）声明注解，将注解保留到运行期间		
	@Retention(RetentionPolicy.RUNTIME)
public @interface  MapperBean {

二、统一数据源访问接口
问题：多个浏览器通过服务器访问数据库，但是数据库的访问是顺序的，会造成浏览器访问数据库的时间延长
方法：异步处理法，服务器将数据缓存存在 队列中，并且对浏览器作出响应	
让DAO从持久层脱离出来
统一数据源：指持久层的接口

MyBatis DAO模板类
<bean id="sqlSessionTemplete" class="org.mybatis.spring.SqlSessionTemplete">
构造器参数（数据库会话工厂）注入
<constructor-arg index="0" value="sqlSessionFactory"></constructor-arg>
</bean>

//读取缓存，然后在读取数据库
//提交到队列
return sqlSessionTemplate.selectList("findAllUsers");


SSM框架：Spring、Springmvc、MyBatis
注意：
1）实现类的BeanId最好按照接口命名
@Service("employeeService")
2）new出来的是空的，要从spring中取值
错误：UserDao dao = new UserDao(); 
正确：UserDao dao = ctx.getBean("userDao",UserDao.class);
3）利用factory插入数据的差别
方法一：
通过class会找到对<mapper namespace="cn.tedu.dao.EmployeeMapper">
的xml文件，根据class查找对应的statement
EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
mapper.addEmployee(e);

方法二：
根据id查找对应的statement
session.insert("addEmployee", e);

方法三：
从spring 中获取对象，相当于根据class查找对应的statement
EmployeeMapper mapper 
		 = ctx.getBean("employeeMapper",EmployeeMapper.class);
mapper.addEmployee(e);


2016.12.7
AJAX
Asychronous JavaSript and Xml
AJAX 就是用XMLHttpRequest对象发起对服务器的请求

1. ajax对象的重要属性
onreadystatechange:绑订一个事件处理函数，用来 处理readystatechange事件。
注：当readystate的值发生了任何的改变(比如，从0 变成了1），就会产生readystatechange事件。
readyState:有五个值(0,1,2,3,4),表示ajax对象与 服务器通信的进展。其中，4表示ajax对象已经获得了服务 器返回的所有的数据。 
responseText:获得服务器返回的文本数据。
responseXML:获得服务器返回的xml数据。
status:获得服务器返回的状态码。
2. 编程步骤
step1. 获得ajax对象。比如var xhr = getXhr(); 
step2. 通过ajax对象，向服务器发请求。
方式一 发送get请求：
(1) xhr.open('get', 'checkuname.do?username=tom',true);
(2)xhr.onreadystatechange=f1;
(3) xhr.send(null);
方式二 发送post请求:
(1) xhr.open('post','checkuname.do',true);
(2) xhr.setRequestHeader('content-type', 'application/x-www-form-urlencoded');
(3) xhr.onreadystatechange = f1;
(4) xhr.send('username=tom');
注1： true: 异步请求 false:同步请求(当ajax对象发送请求时，浏览器会 锁定当前页面，用户不能够对当前页面做任何操作)。 
注2: 按照http要求，如果发送的是post请求，请求数据包里面应该含
"content-type"消息头，但是，缺省情况 下，ajax对象不会添加该消息头，所以，需要调用 setRequestHeader方法。
step3. 编写服务器端的代码，通常只需要返回部分的数据。 
step4. 写事件处理函数
if(xhr.readyState == 4 && xhr.status == 200){ var txt = xhr.resposeText; //更新页面... }

3. 缓存问题
什么是缓存问题?
当使用ie浏览器发送get请求时，会比较请求地址是否 访问过，如果访问过，则不再发送新的请求，而是显示 之前缓存的结果。
如何解决?
在请求地址后面添加一个随机数。

4. 编码问题
发送get请求
(1)乱码问题产生的原因:
ie浏览器会使用gbk来中文参数值进行编码，其它浏览器 会使用utf-8对中文参数值进行编码。服务器端默认会使用 iso-8859-1来解码，所以会有乱码。
(2)如何解决?
step1. 可以设置服务器默认的解码方式。
URIEncoding="utf-8" 
step2. 在浏览器端，使用js内置的一个函数 encodeURI来对中文进行编码(该函数默认会使用utf-8 编码)。

发送post请求
(1)乱码问题产生的原因:
浏览器会使用utf-8对中文参数值进行编码，而服务器端会使用iso-8859-1来解码。
(2)如何解决? 
request.setCharacterEncoding("utf-8");


1)创建Xhr对象
	if(window.XMLHttpRequest)
Chrome FireFox 等标准浏览器
	return new XMLHttpRequest();
使用于早期的IE浏览器
	return new ActiveXObject("Microsoft.XMLHttp");
2)因为访问的是同一个服务器，所以可以写成	
xhr.open('get','http://localhost:8080/ajax_xhr_day01/demo');
xhr.open('get','demo');
3)name不存在向浏览器返回true;	
   HashSet<String> names;
   out.println(!names.contains(name));
4)将字符串转换成布尔类型 “true”-->true
   var pass=eval(data);
5）易写错单词
xhr.onreadystatechange 小写
xhr.readyState 大写
xhr.setRequestHeader('content-type','application/x-www-form-urlencoded');


利用AJAX发送POST请求
xhr.open('post',url);
pOST 协议必须添加的是HTTP请求头
xhr.setRequestHeader('context-type','application/x-');
xhr.send('name=World&age=5')；


2016.12.8
JSON
(1) JSON是什么?
是一种轻量级的数据交换格式。
注： 数据交换，指的是将要交换的数据转换成一种与平台无关的数据，
				然后发送给接收方来处理。
	 轻量级，指的是相对于xml，JSON文档更小，解析速度更快。 
(2) JSON的基本语法
表示一个对象	{属性名:属性值,属性名:属性值,....} 
注意:
a. 属性名必须使用双引号括起来。
b. 属性值可以string,number,null,true/false,object。 
c. 属性值如果是string,必须使用双引号括起来。
备注：表示由多个对象组成的数组[{},{},{}...] 

(3) 使用JSON做数据交换
将java对象转换成JSON字符串。
	   使用json官方提供的JSONObject,JSONArray。 
将JSON字符串转换成javascript对象。
	   使用prototype.js提供的evalJSON函数。 
服务器输出数据
	data='{"name": "tom", "age": 10, "mobile": "1213424"}'
	注意：必须有单引号、双引号的区别；如果都是双引号则需要转意
浏览器解析数据成JSON数据
	方法1）obj = JSON.parse(data)
	方法2）obj = eval('('+data+')')


JSON数组
obj=[];//空数组
obj=[{},{},{}]//3个元素，每个元素是空对象
obj=[{id:1},{id:2},{id:3}]//3个对象，每个对象1个属性
//3个对象，每个对象2个属性
obj=[{id:1,name:'tom1'},{id:2,name:'tom2'},{id:3,name:'tom3'}]

在JAVA中，将数组转换为JSON字符串
1）需要导包 json-lib 或者jackson-databind
2）创建对象类，创建对象
	Person p = new Person(1,"tom","1231");
	List<Person> list = new ArrayList<Person>();
	list.add(new Person(2,"wang","123"));
	list.add(new Person(3,"范传奇","3874238"));
	list.add(new Person(4,"Andy","32473284"));
3）转换方式
方式一：jackson-databind：
	String json1 = mapper.writeValueAsString(p);
	String json2 = mapper.writeValueAsString(list);
方式一：json-lib
	JSONObject object1 = JSONObject.fromObject(p);
	String json1 = object1.toString();
	JSONArray object2 = JSONArray.fromObject(list);
	String json2 = object2.toString();


2. jQuery对ajax的支持
ajax()方法底层封装了xhr的属性和方法
一、$.ajax()用法:
$.ajax({});其中,{}表示一个对象,用来封装选项参数。 常用的选项参数如下。
url : 请求地址 
type: 请求类型 (get/post) 
data: 请求参数,有两种格式:
	第一种: 请求字符串，比如 "username=tom&age=20" 
	第二种: 对象，比如 {"username":"tom","age":20} 
dataType: 服务器返回的数据类型,常用的有: 
	text: 文本。
	html: 文档。
	json: json字符串。
	xml: xml文档。
	script: javascript脚本。
success: 当服务器处理正确，用来处理服务器返回的 数据的函数。
error:当服务器发生异常，用来处理服务器返回的数据 的函数。
async: 同步还是异步（缺省是异步）。true表示异步， false表示同步。

二、load()作用：
向服务器发送异步请求，将服务器返回的数据直接添加到符合要求的节点之上。 
用法：
	$obj.load(url,[data]); 
	url:请求地址。
	data:请求参数。同上。

案例：
1）jascript方法处理ajax，使用XMLHttpRequest对象
var xhr = new XMLHttpRequest();
var url = 'array';
xhr.open('get',url);
xhr.onreadystatechange=function(){
	if(xhr.readyState==4 && xhr.status==200){
		var data = xhr.responseText;
		var list = eval('('+data+')');}};
xhr.send();
2）JQuery方法处理ajax
$.ajax({
	url:'array',
	type:'get',
	data:{},//请求参数
	dataType:'json',//返回值的类型,
	success:function(json){
	AJAX请求成功时会自动掉函数，
	 	将服务器返回的JSON字符串自动解析为JSON对象},
	error:function(){
		alert("AJAX请求 失败！！！");}
	});
3）JQuery方法处理ajax
案例：
var url='array';
var param={name:'范传奇',age:55};
$.getJSON(url,param,function(jason){});
备注：getJSON、jason两个单词容易写错

使用Spring MVC 支持AJAX
Spring MVC 与 MVC
在Controller类的方法上加 @ResponseBody
return object;
// mapping.writeValueAsString(obj);

处理方式
@ResponseBody将控制器方法的返回值自动处理
1)JAVA Bean/集合/数组/map，转换为JSON
  在浏览器端都将返回值 JSONObject,因为浏览器端不分数据类型的
2)如果是byte[]则变成流传递给浏览器，可以用于下载照片，下载MP3等……
备注：任何语言都认识 数组和对象（map对象）
	   get请求是从服务器抓取数据；post请求是从浏览器向服务器传递数据


将数据param发送到服务器端
$.post(url,param,function(json){});

云笔记

业务功能
略
业务分析
程序 = 数据 +算法
软件开发步骤
1、了解软件业务需求
2、分析软件功能
3、设计软件数据存储结构
   -将软件中一切状态数据存储起来

1）能看到的数据
2）id 主键基本都有
3）修改日期--不能看到
4）type 是否放入回收站--不能看到
5）state 是否收藏--不能看到

备注：1对多：外键关联关系
	  多对多：使用关联关系表	

4、架构设计
5、实现功能

设计数据表
设计工具：
1、PowerDesigner
2、ERWin
3、ERStudio
4、Visio
设计规律
	1对多：外键关联关系
 	多对多：使用关联关系表	
	1对1：就是1对多，使用业务规则约束实现
window系统使用MySQL建议使用5.7版，使用迅雷寻找国内资源
Linux 命令
mysql -uroot -p；  mysql -u root
p后面也可以加上密码，出现">"表示登录成功

Windows 命令
点击实现MySQL图标 ，下载安装软件的时候要记住密码

MySQL常用命令
MySQL中有数据库mysql是管理数据库的数据库，
				 里面有元数据（管理数据的数据）
1、show databases;显示数据库列表
2、create database 数据库名;创建数据库
例如： create database cloud_note;
3、drop database 数据库名；删除数据库
例如： drop database cloud_note;
4、use 数据库名；切换当前数据库：
例如：use cloud_note;
5、建表
create table user_hehy(
	id int,
	name varchar(100)
)；
6、显示表  show tables;
7、删除表  drop table user_hehy;


*/


		 
		 
综合案例：
  利用一个文件保存所用业务方法的性能（执行消耗时间）
  
  @Around("bean(*Service)")
  public Object test(ProceedongJoinPoint joinPoint){
	//开始时间
	//调用业务方法
	//结束时间
	return obj;
	
	
AOP底层原理：反射中的动态代理。
spring aop 
	|--AspectJ
	   |--有接口的时候，使用反射API的动态代理Proxy
	   |--没有接口的时候，使用CGLIB

简答题：
Sprint AOP底层原理：是基于（JDK反射）动态代理实现的

spring事务处理（交易处理）
  声明式事物处理：无需编码，只需要使用注解声明事物的边界即可。
  
  编码事物处理：
	Connection conn = null;
	try{
	  conn = getConnection();
	  conn.setAutocommit(false);
	  // 业务SQL1
	  //业务SQL2
	  //检查但意外，throw e;
	  //业务SQL3
	  conn.commit();
	
	}catch(Exception e){
		conn.rollback();
	}finally{
	  conn.close();
	}
  

AOP非常适合事务处理：在所有业务层实现方法上加@Transactional


<!-- 配置声明式事务处理 -->
<!-- 配置事务管理器 -->
<bean id = "txManager" class = "org.springframework.jdbc.datasource.DataSourceTransactionManager">
  <property name = "dataSource" ref = "dataSource"/>
</bean>

<!-- 用于驱动@Transactional注解 -->
<tx:annotation-driven transaction-manager = "txManager"/>

事务的传播
在一个事务方法中调用了另外一个事务方法，则自动合为一个事务.(两个方法都被@Transactional注释）

MySQL:MYISAM 数据库引擎不支持事务.InnoDB引擎支持事务

默认情况下，Spring声明事务的方法，在相互调用的时候，事务会自动传播整合为一个事务的方法

Spring的事务也有其他传播属性：
1.Propagation.REQUIRED 如果有事务，参与到当前事务，如果没有就开启新事务。
  --默认的传播属性，最常用的属性，默认值！
2.Propagation.REQUIRES_NEW ,必须创建新事务，如果当前有事务，则当前事务挂起，开启新事务。
3.Propagation.NEVER 绝不，方法从不参与事务
4.Propagation.NESTED,嵌套，事务必须嵌套到其他事务
5.Propagation.MANDATORY 不能参与事务，在事务中调用就抛异常。
5.Propagation.NOT_SUPPORTED 不支持，可以在事务中调用，但是不参与不支持事务
6.Propagation.SUPPROTS 支持事务，可以在事务中调用，但是单独调用时没有事务保护。
@Transactional(propagation = Propagation....)

事务隔离属性
在软件中多采用Isolation.READ_COMMITTED事务隔离级别，可以在并发性能和隔离安全性之间平衡，是最常用的隔离级别。
Isolation.SERIALIZABLE是完全串行操作，没有并发，但是数据安全性好
Isolation.READ_UNCOMMITTED完全不隔离，可以完全并发操作，并发性好，但是数据安全性差。

最佳实践
1.在业务方法上都使用事务注解  事务注解可以写在类上，这个类的方法全部支持事务
2.使用默认的传播属性
3.使用默认的隔离级别
4.对于只读的行为，使用 readOnly = true


 WebApplicationContextUtils spring的一个类  在web窗口中获取spring容器



都是横界面编程：
Spring MVC 拦截器：拦截SpringMVC的WEB URL请求
Servlet Filter :可以拦截任何的WEB URL 请求
	 		*.jsp,*.js,*.css,*.html,*.png....
	 		如：登录以后才能查看图片（防盗链）
Spring AOP:拦截对业务层或数据层的请求

Spring容器的初始化方式：
  1.DispatcherServlet  只是使用Spring MVC,则DispatcherServlet即可
  2.ContextLoaderListener  其他情况下，就需要使用ContextLoaderListener
  <!-- 配置listenner,用于初始化spring容器 -->
  <listener>
	<listener-class>org.springframework.web.context.ContextLoaderListener
	</listener-class>
  </listener>
  <!-- spring配置文件的位置 -->
  <context-param>
	<param-name>contextConfigLocation</param-name>
	<param-value>classpath:spring-*.xml</param-value>
  </context-param>
  
如何获取Spring的bean对象
 1.注入bean:当前Bean被Spring管理,可以直接注入
 2.get bean：当前对象不被Spring管理时，需要get
	   
MyBatis动态参数查询
  <if test = ""></if>
  <trim>
  <set>
  <where>
  <choose><when>
  <foreach>

ResultSet中没有数据，get的时候猜传送数据。但是Mysql中不是，ResultSet中包含全部查询数据，所以Mysql中提供了一个遍历的分页查询方法limit


下面是程序员电面题目的列表。这些问题可以用来考察任何程序员、开发者、软件工程师、测试和运营工程师，因为它们是基于程序设计的基础知识的。

1. 从哈希表，二叉树和链表中取元素需要多少时间？如果你有数百万记录呢？
哈希表需要O(1)时间，二叉树需要O(logN) (N是树中节点数)，链表需要O(N) (N是链表中节点数）。如果数据结构工作正常（比如哈希表没有或只有相对少量冲突，二叉树是平衡的），数百万记录并不影响效率。如果工作不正常，那么效率会随着记录数上升而下降。

2. 覆盖(Overriding)和重载(Overloading)的区别是什么？
覆盖在运行时决定，重载是在编译时决定。并且覆盖和重载的机制不同，例如在Java中，重载方法的签名必须不同于原先方法的，但对于覆盖签名必须相同。

3. fork一个进程和生成一个线程有什么区别？
当你fork一个进程时，新的进程将执行和父进程相同的代码，只是在不同的内存空间中。但当你在已有进程中生成一个线程时，它会生成一个新的代码执行路线，但共享同一个内存空间。

4. 什么是临界区？
临界区是一段代码，十分重要，在多线程中同一时间只能被一个线程执行。可以用信号量或互斥量来保护临界区。在Java中你可以用synchronized关键字或ReentrantLock来保护临界区。

5. 值类型和引用类型有什么区别？
值类型是更加优化的类型，总是不可变的(immutable)，例如Java原始的int、long、double和float。引用类型指向一个对象，可能是可变的，也可能是不变的。你也可以说值类型指向一个值，引用类型指向一个对象。

6. 什么是在进程中的堆和栈？
在同一个进程中，有两块不同的内存区域。以Java来说，栈用来存储原始值和指向对象的引用类型，但对象本身总是在堆中被创建。堆和栈的一个重要区别是，堆内存被所有线程共享，但每个线程有自己的栈。

7. 什么是版本控制？
版本控制是用来存储代码和管理代码库版本的软件，例如SVN、CVS、Git、Perforce和ClearCase。它们在对比代码、审查代码和从之前的稳定版本构造时十分高效。所有的专业开发都使用某种版本控制工具，否则你无法有效的管理代码，尤其是如果有20个开发者在同一个代码库上工作的时候。版本控制工具在保持代码库一致性和处理代码冲突上扮演着十分重要的角色。
8. 什么是强类型程序设计语言？
在强类型语言中，编译器确保类型的正确性，例如你无法在String类型中存放数字，反之亦然。Java是强类型语言，因此存在各种数据类型（如int、float、String、char、boolean等）。你只能将兼容的值存入相应的类型中。与此相反，弱类型语言不要求在编译时进行类型检查，它们根据上下文处理值。Python和Perl是两个常见的弱类型程序设计语言的例子，你可以将数字组成的字符串保存在数字类型中。

9. 可否描述一下有效(valid)的XML和格式正确(well-formed)的XML的区别？
格式正确的XML有根元素，所有标签都是正确关闭的，属性是正确定义的，它们的值正确地加上了引号。另一方面，有效的XML可以根据一个XSD文件或模式(schema)进行验证。所以一个XML可能是格式正确但不有效的（因为包含不被模式允许的标签）。

10. DOM和SAX语法分析器有什么区别？
DOM语法分析器是驻留内存的，将整个XML文件装载到内存中，并创建一个DOM树进行语法分析。SAX语法分析器是一个基于事件的语法分析器，所以它根据收到的事件（如开始标签、结束标签、属性开始和属性结束）来对XML文档进行语法分析。根据他们的分析方法，DOM语法分析器并不适用于大的XML文件，因为它会占用大量的内存空间，你的进程可能会耗尽内存。应该用SAX分析大的文件。对于小的文件，DOM往往比SAX快很多。

11. 线程和进程的关系是什么？
一个进程可以有多个线程，但一个线程总是属于唯一的进程。两个进程不能共享内存空间，除非它们有意通过共享内存进行进程间通信。但是同一进程的两个线程总是共享相同的内存。

12. 不可变(immutable)类是什么意思？
一个类，如果在创建之后它的状态就不能被改变，那么他就是不可变的。例如Java中的String。一旦你创建了一个String，例如“Java”，你就不能再改变它的内容。任何对这个字符串的改变（例如转换到大写、与另一个String连接）将创建一个新的对象。不可变的对象在并行程序设计中很有用，因为它们可以在进程间被共享，不需要担心同步。事实上，整个函数是程序设计的模型都是在不可变对象上构建的。

13. 你为何要创建模拟(mock)对象？
模拟对象在测试软件中一个独立的单元时很有用，事实上，存根(stub)和模拟都是创建自动化单元测试的有力工具。假设你在写一个显示货币兑换率的程序，但没有一个可以连通的URL，现在如果想测试你的代码，可以用模拟对象。在Java的世界中，有很多框架可以为你生成强大的模拟对象，例如Mockito和PowerMock。

14. 什么是SQL注入？
SQL注入是一种安全漏洞，它使得入侵者可以从系统中窃取数据。任何从用户那里得到输入并不加验证地创建SQL查询的系统都可能被SQL注入攻击。在这样的系统中，入侵者可以输入SQL代码，而不是数据，来获取额外的数据。有很多用敏感信息（如用户id、密码和个人信息）被人利用这种漏洞获取的实例。 在Java中，你可以用Prepared语句来避免SQL注入。

15. 在SQL中，内连接(inner join)和左连接(left join)有什么区别？
在SQL中，主要有两种连接类型，内连接和外连接。外连接包括右外连接和左外连接。内连接和左连接的主要区别是，内连接中两个表都匹配的记录才被选中，左连接中两个表都匹配的记录被选中，外加左表的所有记录都被选中。要留意包含“所有”的查询，它们往往要求左连接，例如写一个SQL查询来找所有的部门和它们的雇员人数。如果你用内连接处理这个查询，你会漏掉没有人工作的空部门。

16. MVC中的V代表什么，意味着什么？
在MVC模式中，V是视图(View)。视图是用户看到的东西，比如网页。这是一个非常重要的web应用开发设计模式，它基于关注点分离原则，目的是不同模块可以独立修改，不影响其他模块。在Java的世界中，有很多提供MVC模式的开源框架，例如Struts 2和Spring MVC。顺便说一下，M代表模型(Model)，C代表控制器(Controller)。模型是实际的业务对象，例如用户、雇员、订单，控制器用来将请求分发给正确的处理单元。

17. 类和对象的区别是什么？
类是用来创建对象的设计图。一个类包括代码和行为，一个对象包括状态和行为。要创建一个对象，你必须创建一个表达对象结构的类。类还被用来在内存中映射对象，在Java中，JVM替你完成这项工作。

18. 什么是疏耦合(loose-coupling)？
疏耦合是一种值得追求的软件特性，它使得对软件一个部分的修改不会影响到其他的部分。例如，在一个疏耦合的软件中，对UI布局的改变不应该影响后端的类结构。

19. 组合(composition)，聚合(aggregation)和关联(association)的区别是什么？
关联的意思是两个对象是相互联系的。组合是关联的一种形式，即一个对象由多个对象组成，但是它们必须共存，例如人体由各种器官组合而成，独立的器官不能生存，它们必须在身体内发挥作用。聚合也是关联的一种形式，表示对象的集合，例如城市是居民的聚合。

20. 接口和抽象类有什么区别？
这是所有程序员面试最经典的问题。接口是最纯粹的抽象形式，没有任何具体的东西。抽象类是一些抽象和具体事物的组合体。这个区别在不同语言中可能会不同，例如在Java中你可以扩展(extend)多个接口，但只能继承一个抽象类。更详细的讨论见于详细答案。

21. 什么是单元测试？
单元测试是测试独立单元（而不是整个应用程序）功能性的一种方法。在不同语言中，有很多工具可以做单元测试。例如在Java中，你可以用JUnit或TestNG来写单元测试。单元测试经常在构建时自动运行，或者在一个持续的环境（例如Jenkins）中运行。

22. 你能否描述三种不同的在应用程序发布前对其进行测试的方式？
单元测试，集成测试，冒烟测试。单元测试用来测试独立的单元是否依照预期工作，集成测试用来测试已被测试过的独立单元能否共同工作，冒烟测试用来测试软件最常用的功能是否正常工作，例如在一个飞机订票网站中，你应该能订票，取消或更改航班。

23. 迭代和递归有什么区别？
迭代通过循环来重复执行同一步骤，递归通过调用函数自身来做重复性工作。递归经常是复杂问题（例如汉诺塔、反转链表或反转字符串）的清晰简洁的解决方案。递归的一个缺陷是深度，由于递归在栈中存储中间结果，你只能进行一定深度的递归，在那之后你的程序会因为StackOverFlowError而崩溃。这就是在产品代码中优先使用迭代而不是递归的原因。

24. &和&&运算符的区别是什么？
&是位运算符，&&是逻辑运算符。&和&&的一个区别是位运算符（&）可以被用于整型和布尔类型，逻辑运算符（&&）只能被用于布尔类型变量。当你写a & b时，两个整型数的每一位都会进行与运算。当你写a && b时，第二个参数可能会也可能不会被执行，这也是它被称为短路运算符的原因，至少在Java中是这样的。我很喜欢这个问题，经常对初级开发者和毕业生问这个问题。

25. 1 XOR 1的结果是什么？
答案是0，因为XOR在两个操作数（按位）不同时返回1，相同时返回0。例如0 XOR 0仍然是零，但0 XOR 1和1 XOR 0的结果是1。

26. 如何得到一个整型数的最后一位？
用取模运算符，数字 % 10返回数字的最后一位。例如2345 % 10会返回5，567 % 10会返回7。类似的，除运算符可以用来去掉数字的最后一位，例如2345 / 10的结果是234，567 / 10的结果是56。这是值得了解的一个重要技巧，可以用来解决类似回文数、反转数的问题。

27. 什么是测试驱动开发？
测试驱动是一种常见的开发方法，在这种方法中，测试代码在功能代码之前编写。测试决定了程序的结构。测试驱动的纯粹主义者在写为应用写测试之前，不会写一行的应用代码。这能很大幅度地提高代码质量，经常被认为是巨星级开发者的品质。

28. 里氏替换原则(Liskov substitution principle, LSP)是什么？
里氏替换原则是鲍勃大叔称作SOLID的五条设计原则中的一条。里氏替换原则规定，所有的子类都能作为父类的代理(proxy)工作。例如，如果一个方法需要父类对象作为输入，那么如果你提供一个子类对象，它也应该正常工作。任何不能替代父类的类都违反了里氏替换原则。这实际上是一个难以答出的问题，如果你答出了，那么就会给面试官留下好的印象。

29. 什么是开闭(Open closed)设计原则？
开闭原则是SOLID中另一个重要的原则，它规定一个系统对扩展是开放的，但对修改是封闭的。意思是说，如果一个新的功能要被加入一个稳定的系统，那么你不需要碰已被测试过的现有代码，新的功能可以通过只添加新类来实现。

30. 二叉树和二叉查找树的区别是什么？
二叉查找树是有序的二叉树，所有节点（例如根节点）的左子树节点的值都小于或等于该节点的值，右子树节点的值都大于或等于该节点的值。它是一个重要的数据结构，可以用来表示有序的数据。

31. 你能否给出一个递归算法的实际例子？
递归算法能适用在很多地方，例如与二叉树和链表相关的算法。几个与递归算法的例子包括反转字符串，计算斐波那契数列。其他的例子包括反转链表、树遍历以及快速排序。

31. 算法的时间复杂度是什么？
时间复杂度表示的是运行时间对输入量的比率。他表示一个算法处理一定量的输入需要多长时间。它是一个估计值，但足够表示输入量从十增长到一千万时，你的算法会有什么样的表现。

33. 链表和数组有哪些重要区别？
链表和数组都是程序设计世界中重要的数据结构。它们间最明显的区别是，数组将元素存放在连续的地址中，链表将数据存放在内存中任意的位置。这使得链表有巨大的扩展自己的灵活性，因为内存总是分散的。这种情况总是可能的：你无法创建一个数组来存放一百万个整数，但可以用链表来存放，因为空间是存在的，只是不连续。其他的不同都是源于这项事实。例如，在数组中，如果你知道下标，可以用O(1)的时间得到一个元素，但在链表中要花O(n)的时间。更多不同参见详细答案。

33. 在哈希表中处理冲突的方法都有哪些？
线性探测(linear probing)，二次哈希(double hashing)和链接(chaining)。在线性探测中，如果桶已经被占据了，那么函数会线性地检查下一个桶，直到找到一个空位。在链接中，多个元素可以存储在同一个桶中。

34. 正则表达式是什么意思？
正则表达式是在文本型数据上进行模式匹配的方法。它是一种搜索的强有力方法，例如搜索长字符串中的某些字符，例如搜索一本书中是否含有某个单词。所有主流程序设计语言都支持正则表达式，但是Perl正则表达式的能力是著名的。Java的java.util.regex包也支持类似Perl的正则表达式。你可以用正则表达式检查email地址是否有效，电话号码是否有效，邮政编码是否有效，甚至社会保险号(SSN)是否有效。正则表达式最简答的例子之一是检查字符串是不是一个数。

35. 什么是无状态(stateless)系统？
无状态系统是不维护内部状态的系统。这种系统在任何时刻，对相同的输入都会给出相同的输出。编写优化一个无状态系统总是比较简单的，所以如果可能，你总是应该优先编写无状态系统。

36. 写一个SQL查询，在雇员表中查找第二高的工资。
这是SQL面试的经典题目之一，尽管已经很老了，还是很有趣，并且可以追问很多问题来测试候选人的知识深度。你可以用相关或不相关的子查询来查找第二高工资。如果你在用SQL Server或MySQL，你也可以用类似TOP和LIMIT之类的关键字，前提是面试官允许。查找第二高工资的最简答方法是：
这个查询首先查找最高工资，然后将它从列表中排除，再查找最高工资。很明显，第二次返回的是第二高工资。

37. 可否描述一下什么是关联的和不关联的子查询？
在关联的子查询中，内层查询依赖于外层查询，对外层查询的每一行执行。非关联的子查询不依赖于外层查询，可以独立执行。因此，前者慢，后者快。顺便说一下，关联的子查询有一些很棒的应用，其中包括在雇员表中查找第N高的工资，这在上一道SQL问题中也有提到。

39. 不用算术运算符，如何判定一个数是否是二的幂？
当你听到不能用算术运算符的限制时，应该立刻假定这是一道关于位运算的题。如果没有这条限制，那么你可以轻松地用取模和除运算符检查一个数是不是二的幂。用位运算符，有一个很巧妙的方法来完成任务。你可以用下面这段代码来检查一个数是不是二的幂
1
2
3	public static boolean powerOfTwo(int x) {
return (x & (x - 1)) == 0;
}
x & (x-1)是一个很棒的技巧，可以将最右边的为1的位设为0。我是从《高效程序的奥秘》这本书中学到的。

40. 如何在UNIX上找到一个正在运行的Java进程？
你可以组合使用ps和grep命令来查找UNIX机器上的任何进程。假设你的Java进程有名字，或者有任何可以用来匹配的文字，那么使用这个命令。
ps -ef | grep “myJavaApp”
ps -e将列出所有的进程（所有用户的进程，不只是你的），ps -f将显示所有细节，包括PID。如果你想要深入调查或用kill命令杀死这个进程，你会需要PID。

41. 如何在UNIX中寻找大的文件，例如1GB以上的文件？
你可以轻松地用find命令寻找大的文件，因为它提供依据大小寻找文件的选项。如果你的文件系统满了，你的Java进程因为没有空间而崩溃，那么就使用这个命令。这个命令可以列出所有大于1GB的文件。你可以很容易地改变大小，例如寻找所有100MB以上的文件，就用+100M。
find . – type f -size +1G -print

42. shell脚本是什么？
shell脚本是包含程序元素（例如if和for循环）的一组shell命令，它可以自动做一些重复的任务。例如，你可以写一个shell脚本来每天清理日志文件，为记录历史备份数据，以及其他家务活、版本发布、监视等等。

