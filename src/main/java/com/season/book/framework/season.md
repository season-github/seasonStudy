很早就开始想写一个文档，用来记录纪杰遇到的问题，和解决方案。
一直到现在，虽然写了部分，但还是零零散散的，我觉得得把自己的所有经历写下来，供以后查阅和成长
每周五都要进行整理、归档

1. 关于获取form表单中的数据，可以用这个方法，进行ajax提交所有数据，不需要一个一个的获取
		var grade = $("#gradeForm");		//	获取form对象
		String param = grade.serialize();	//	get方法拼接数据
		var data = grade.serializeArray();	//	json数组

2. ajax提交post方法
		$('#editItem').submit();

3. <a>标签，点击执行对应的sql语句，需要知道search()方法是返回url，还是直接负责跳转。
		<a  style="width:50px" href="javascript:search();">搜索</a>

4. js类型转换，判断是否是数字
		parseFloat('034eadasd')		34
		isNaN("12")					false	
		isNaN(" ")					false
		isNaN("123asd")				true
		isNaN("asd")				true

5. js用正则判断是否是数字
		var re = /^[0-9]+.?[0-9]*$/; //判断字符串是否为数字 //判断正整数 /^[1-9]+[0-9]*]*$/ 
		var nubmer = document.getElementById(input).value;
		if (!re.test(nubmer)) {
			alert("请输入数字");
			document.getElementById(input).value = "";
			return false;
　		}


6. js重置form表单
		1. $('#formId')[0].reset();	//	这是js对象的方法
		2. 在form中加入一个隐藏的reset按钮，需要清空form表单时，触发reset按钮的click事件
			<input type="reset" style="display:none" />
			$("input[type=reset]").trigger("click");

7. get请求，中文uri编码
		js:		window.encodeURI("张三")		"%E5%BC%A0%E4%B8%89"
		java:	URLDecoder.decode("%E5%BC%A0%E4%B8%89")		//	spring会处理一下

8. 上班开发
		周一到周四快速开发，周五检查一遍，守规矩
		没那么一无是处，但是也很糟糕

9. hibernate bug
		hibernate中最外层，不能出现别名，出现别名之后会拿着别名当作列名，到表里查询。所以要么不出现别名，要么在别名前放一个函数

10. 转码：iso8859-1 -> utf8
		String className = new String(className.getBytes("ISO-8859-1"), "utf-8");

11.	spring在maven中的各个版本
		http://maven.springframework.org/release/org/springframework/spring/


12. mysql，修改数据库表设计时，在navicat中会有相应的sql语句，这时候只需要复制就行

13. @RequestMapping @Requestparam
		@RequestMapping("1","2")	这2种情况都分发到这同一个方法
		@RequestMapping(value="/authc",method=RequestMethod.GET)	必须get方法请求
		@GetMapping 一样的作用
		@GetMapping("${manager}/checkLoginName/{loginName}")	spring4之后可以在 @RequestMapping 中直接使用"${key}"获取配置文件中的属性信息

14. @Value	Spring3 支持@value注解的方式获取properties文件中的配置值，大简化了读取配置文件的代码。
		@Value("${dubbo.registry.id}")	可以获取配置文件中的数据		

15. 关于null的有意思代码
		String a = null;
		System.out.println(a);				//	null
		System.out.println((Integer)null);	//	null
		System.out.println(null+"--" );		//	null--
		System.out.println(null);			//	编译不通过

16. token：令牌，用于验证
		在用户获取token令牌时，若用户在系统中存在，则产生一个随机的token，用于该浏览器一定时间的会话。
		将token字符串于前台存储，每次访问后台，都需要将token解析，获取登陆信息，并检查token创建时间与该用户最后一次登陆时间是否一致，不一致则token失效

17. oasis 项目的部分记录：
		open开头的是提供基础服务的接口
		在oasis中的service是用于平台调用
		具体的实现需要在 福建养老（等具体的项目）中编写代码，基本调用open中的方法，需要修改、特殊的地方；则需要自己写代码

18. java中的基本注解 annotation
		@Autowired	自动注入对象(默认类名首字母小写)
		@Resource(name ="redisServiceimpl")	注入对象，但这可以通过 name 选择注入的对象
		@Component		spring中的实体类注入
		@Deperacted		废弃
		@JsonIgnore		jackson 对象->json字符串 json字符串->对象 时会用到， 属性都会产生影响/getter在转字符串的时候产生影响/setter在转换为对象的时候产生影响

19. 类型转换
		运算符左右两边为int之下的整型类型。先提升为int类型，再进行运算。
		short s1 = 2;  
		s1+=1;			//	编译正确
		s1+=1.3;		//	编译正确
		s1=s1+1;		//	编译不通过
		String str = "season";
		str += 12		//	结果：season12
		null == 0		//	报空指针错误

20. 修改apache-tomcat-7.0.56\conf\server.xml的Connector属性增加编码集URIEncoding="UTF-8"，不知道windows中是否该这样修改

21. js获取model中的数据一个可行方案
		//	传递到前端，放入元素中，供js使用
		mav.addObject("deanClassTypeArray", new ObjectMapper().writeValueAsString(deanClassTypeList).replace("\"", "'") );	//	必须json格式化之后将"替换成'
		<span id="classTypeArray" value="${deanClassTypeArray }"></span>		//	html元素接收数据，这个地方很奇怪，在浏览器中自动把value=''抓换成了value=""
		var typeArray = $("#classTypeArray").attr("value");	//	获取jsp中的元素value属性数据，非input、select不能使用$().val()
		var jsonO  = JSON.parse(type.replace(/\'/g,"\""))	'//	将所有的'转换成"，获得json对象。	replace("'", "\"")只能替换第一个

22. 微信分享，需要考虑微信封杀的问题，需要在微信那里备案

23. 摸鱼网站：	微博、抗压吧、lol多玩、游民星空、ifeng、知乎、煎蛋

24. 0 == "" 在js中是true，需要用===进行比较
		true == 0	false
		true == 1	true
		true == 2	false
		true ===1	false
		1、对于string,number等基础类型，==和===是有区别的
			不同类型间比较，==之比较“转化成同一类型后的值”看“值”是否相等，===如果类型不同，其结果就是不等
			同类型比较，直接进行“值”比较，两者结果一样
		2、对于Array,Object等高级类型，==和===是没有区别的
		3、基础类型与高级类型，==和===是有区别的
			对于==，将高级转化为基础类型，进行“值”比较，因为类型不同，===结果为false

25. js循环map
		for (key in map) {
			console.log(key);
		}

26. js获取后台传递的json字符串
		var financeProductJsonStr = '${financeProductJsonStr }'	//	获取jsp中的元素value属性数据
		var financeProductMap = JSON.parse(financeProductJsonStr)

27. jsp/jstl_foreach解析model的方法
		<c:forEach items="${keyTypeList}" var="dict">	//	
			<c:if test="${var.key_name==dict.DI_ID}">${dict.DI_NAME }</c:if>
		</c:forEach>
		<c:forEach items="${keyTypeList}" var="dict">
			<option value="${dict.DI_ID}" onselect=" <c:if test='${dict.DI_ID==pd.key_name}'>selected</c:if>" >${dict.DI_NAME}</option>
		</c:forEach>

28. 重置form表单数据（清空）
			$("#mainForm")[0].reset();	//	js原生的方法


29. 关于循环
		嵌套最多3层，多了就炸，数量级太大了
		break 只能跳出一层循环


30. js获取数据的第N个元素：
		var array = $(".example");
		1. array[0]		//	获取第0个对象，得到的是dom对象，这样也可以实现JQuery对象转换dom对象
		2. array.get(0)	//	获取第0个对象，得到的也是dom对象，但是只能在JQuery上使用
		3. array.eq(0)	//	获取第0个对象，得到的是JQuery对象，但是只能在JQuery上使用

31. 重要：
		除了账户系统之外，所有的数据获取，都需要考虑数据缓存未及时更新的问题

32. input文本框内添加提示文字，填写内容时消失：用placeholder属性作为提示语
		<input placeholder="提示语..."></input>

33. js替换前后空格
		" season ".replace(/^\s*|\s*$/g,"")
		" season ".trim()	

34. js入口函数，会在html加载完成后执行。
		$(document).ready(function(){}

35. 有趣的代码
		public static void main(String[] args) {
			int a = 1;
			int b = 2;
			if (a == 1) {
				System.out.println(1);	//	输出1
			} else if (b==2) {
				System.out.println(2);	//	不执行
			}
		}

36. 关于mysql的外键约束控制
		SET FOREIGN_KEY_CHECKS=0;	//	禁用外键约束.
 		......						//	sql操作
 		SET FOREIGN_KEY_CHECKS=1;	//	启用外键约束
		SELECT  @@FOREIGN_KEY_CHECKS;	//	检查外键约束状态

37. 关于加密算法
		AES DES 对称加密，使用同一个密钥，可解密
		RSA MD5 非对称加密，不可解密
		RSA的密钥长度巨顶每轮明文的长度，所以RSA不易被破解
		BASE64是一种编码方案，不涉及到加密，或者是密钥公开/没密钥的加密方案

38. mysql 变量
	使用set时可以用"="或":="，但是使用select时必须用":="赋值
		SET @a = 0; // 可以不set，直接使用，不过得在sql中赋值，不然会一直出现null
		SELECT @a:=@a+1;
		SELECT @b:=@a+1;
		SELECT @a;
		SELECT @b;

39. sql中判断null，会导致索引失效全表扫描

40. 一个比较典型的批处理sql
	UPDATE manage_user
		INNER JOIN student_info ON student_info.userId = manage_user.userId
	SET 
		userName = student_info.NAME,
		manage_user.modifiedDate = now(),
		manage_user.content = CONCAT(
			IF (
				manage_user.content IS NOT NULL AND manage_user.content != '',
				CONCAT(manage_user.content
'; '),
				''
			),
			CURRENT_DATE (),
			':批处理，修改userName为学生姓名'
		)
	WHERE
		userName != student_info.NAME;

41. @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss"
timezone = "GMT+8")

42. hibernate 动态插入（能使用默认值）
		<class name="ConsultStudentCourse" table="consult_student_course" lazy="false" dynamic-insert="true">

43. mybatis另外一种拼接模糊查询字符串的方法
		<if test="webDeanClass.showClassName != null and webDeanClass.showClassName != ''">
			<bind name="_showClassName" value="'%'+webDeanClass.showClassName+'%'"/>
			and wdc.showClassName like #{_showClassName}
		</if>

44. spring自带日期转换，请求参数中的字符串转换成时间格式
		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss:SSS") // spring自带日期转换

45. 打印请求参数列表
		System.out.println(request.getParameterMap() );

46. $("#isOnline")[0].style.display = 'none' // 隐藏标签
	$("#isOnline")[0].style.display = 'inline' // 默认：内联元素
	$("#useRecommendCode").attr("disabled", 'true') // 展示不可修改
	$("#useRecommendCode").removeAttr("disabled") // 移除标签

47. spring 只对 RuntimeException 进行回滚

48. linux 中查看历史操作命令
		history

49. junit 测试，多个方法同时执行，如何设定执行顺序？
		1.在测试类上用这个注解修饰 @FixMethodOrder(MethodSorters.NAME_ASCENDING)
		2.test_01_listAll(); // 这样子对多个测试方法命名
		3.另外需要注意的是，@Before()@After()修饰的方法，在每一个单元测试方法执行时都会执行

50. 在spring定时任务中，如果定时任务所在的类下面有子类，那么每有一个子类就多执行一次，所以不能在父类上加定时任务
	一个定时任务起了多次，后来我发现了，父类也加上了注解，而且定时任务在父类中起的，结果一个父类，2子类，起了3次，啊哈哈

51. 如果数据库时间相对服务器时间是准确的，那就以数据库时间为准（在对数据进行操作的时候）now()/current_timestamp

52. public class Pet {
		private String name = prefix+"dog";	
		private static String prefix = "season`s";
	}
	// 这一个类不会报错，因为java在new对象时，先处理static修饰的代码（按照代码编写的先后顺序），然后再是成员变量

53. 什么是怼人？就是你说一句让别人什么也说不去了。
	有什么好玩的？有，但是不带你玩/没有

54. insert语句不能as，也就是不能使用别名

55. 错误sql样例（金石未支付人数）
	select 
			<include refid="Base_Column_List" />,
			(
				select count(course.webStcoId)
				from web_student_payment payment
				inner join web_student_course course on course.webPayId = payment.webPayId
				where payment.webPayStatus = 0 and course.onLineCosuId = onLineCosuId // 这里应该加上别名，不然这个条件失效
			) noPayNum
		from web_dean_class
		where 
			cosuId = #{cosuId,jdbcType=VARCHAR}

56. 通过mysql变量，获取排序序号
	select (@mycnt := @mycnt + 1) as rownum, t_dict.sort 
	from goldenstone_stuapp.sys_dict t_dict, (select @mycnt:= 0) b 
	order by t_dict.sort asc

1. 去掉遮盖的图片(当一个图片遮盖住内容，将上方的图片隐藏)			style="display:none"

2. spring中的事务与AOP，使用的是动态代理
   @Transactional(readOnly=true) readOnly数据库读取，能加快效率

3. spring依赖于commons-logging.jar 去打印日志，可以考虑换成自己喜欢的slf4j

4. 防范性编程，防范前端传递过来的数据存在问题，后端校验更加安全

5. 多表join是如何执行的，驱动表 被驱动表？不懂，很模糊

6. linux是树形，有根“/”,映射为挂载点。可对每个目录设置看、读的权限。
   -pwd：用于当前工作目录；	print working directory
   -ls：查看当前目录的内容	List files
   -cd:用于改变当前的目录	change directory

7. linux文件系统：
   蓝色标记为文件夹，
   黑色文件为文件，
   绿色标识为可执行文件，
   红色表示为压缩包

8. 二进制无法精确的表示1/10，如同十进制无法准确表示1/3

9. 
