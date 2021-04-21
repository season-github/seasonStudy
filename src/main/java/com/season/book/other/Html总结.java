package com.season.book.other;-----------------------------------------------------------------
-----------HTML--------------------------------------------------
-----------------------------------------------------------------
0、标准文档流(normal flow 翻译有问题)：块级元素、内联元素
	应该：从上到下，左到右 
	浮动(float)、绝对定位(absolute)、固定定位(fixed)三种方式定位会脱离文档流
1、块级元素：div p h1-h6 ol ul li dl-dh-dt-dd
	孙老师说，块级元素一般不设置行高，有多少内容，行高就是多少
2、内联元素：span em strong a img
3、元素：从标签开始到标签结束的所有代码
4、div span 都没有特定的含义，span为文本容器，div为其他元素容器
5、html xml都为标签式文档
6、<img src="path" title="title" alt="exchange" width="",height=""/>
7、<a href="path" target="" >show</a>
8、锚链接a.下锚  b.链接到锚
	<a name="therename">show</a>
	<a href="(页面名)#therename">show</a>	若为本页面，则不需要填写页面名
9、5种特殊字符：&lt	&gt	&quot &nbsp &copy
10、列表ul	ol	li	dl-dt-dd(被解释说明的东西	解释说明)
11、table多用于页面布局table-th-tr-td
	aligh	valigh	rowspan	colspan
12、框架(不常用)frameset	iframe
13、表单<form method="post/get" action="action">
			show:<input type="type" name="name" value="" 
					readonly="readonly"	disabled="disabled" />
		</form>
		1	input	type:	text password radio checkbox reset submit
							file button image(图像提交按钮) hidden
		2	textarea
		3	下拉菜单<select>
					<option>请选择一个城市</option>
					<option>青岛</option>
					<option>……</option>
				</select>

----------------------------------------------------------------------
----------CSS---------------------------------------------------------
----------------------------------------------------------------------
因为有了CSS，span div都价值上升了好多
1、选择器{属性:属性值; 属性:属性值;}用的是“：”
2、选择器:
    标签选择器：p{}  		input{} tr{}  li{}
    类选择器:  	.类名{ }  应用：<p class="类名">
    ID选择器： 	#id名{ }  应用：<p id="id名">
3、复合选择器
    后代选择器:  #one li{list-style:none;}   #myid h2 a{}
    并集选择器:  p,h2,h3{margin:0px;}  #one li a,#myid h2 a{}
    交集选择器:p.myclass{}  h2#myid{}

4、样式应用分类：
	行内样式：<p style="color:red;">sdfsdfsdg;dg</p>
	内部样式：在head头部，<style type="text/css">
							p{color:blue;}
						</style>
    外部样式: 单独保存css样式文件，然后在页面导入外部样式文件

5、样式优先级：
    id选择器 > 类选择器 > 标签选择器
    行内样式 > 内部样式 > 外部样式

6、常用样式属性：
	1、字体样式：
		font-family:宋体；
		font-size: 16px;
		font-weight:bold;加粗    normal
		font-style:italic;
		缩写：font:style weight size/行高 family;
		font:italic bold 12px  宋体;
	2、文本样式属性：
		text-align:
		color:
		text-indent:2em; 			首行缩进2字符
		text-decoration:underline;  显示下划线
		line-height: 				行高

    3、超链接样式：（伪类）
		a:link{ color:red; }	超链接未访问时样式
		a:visited{ color:blue;} 超链接访问后的样式
		a:hover{ color：green;} 鼠标悬浮在超链接上时的样式
		a:active{color:black;} 	鼠标按下未放开 时的样式
	4、背景样式属性：
		background-color:	背景颜色，有背景图片会被掩盖
		background-image:url(path)	背景图片
		background-repeat:	背景图片是否平铺
		background-position:背景图片定位(挤眼睛)
		缩写：background:color image position repeat;
		background:#C00 url(../image/show.gif) 205px 10px no-repeat;
	5、列表样式：
		list-style-type:
		list-style-image:
		list-style-position:
	6、DIV样式：
		1、模型内容：border margin padding background content
		2、border
			border-color:
			border-width:
			border-style:
			bordet:width color style;
		3、margin	所有块级标签都有margin，或者说都是一个div
					其实就是2个盒子之间的间距=margin1+margin2;
					妙用网页居中	margin:0px,auto;
			margin-top:
			margin-right:
			margin-bottom:
			margin-left:
			margin：
		4、padding
			跟margin差不多
			一个不成熟的思想：span一样拥有padding只是没有margin
	7、display样式
		block inline none
		其中none可以控制div的显示与隐藏，当然加上<a>更好
	8、浮动
	9、定位


HTML文档结构
<html>
      <head>
         <title></title>
         <meta name=”keywords” content=”淘宝，网上购物”/>
         <meta http-equiv=”content-type” content=”text/html;charset=utf-8” />
</head>
<body>
</body>
</html>
常用标签：
<!-- 注释内容 -->
<meta  />
<p>  段落 </p>
<br />换行
<h1></h1>
…
<h6></h6> 
<hr />   分割线
<img src=”图像路径” alt=””替代文字 title=”提示文字” width=”” height=””/ titlt=”鼠标悬浮图片上的文字”> 
<strong>加粗文字</strong>   快捷键：选中后ctrl+b
<em>斜体文字</em>
<span> 文字</span>
<a href=”链接路径” target=”打开位置”>文字</a> 
<a href=”链接路径” >文字</a> 本页面内打开
<a href=”链接路径” target =”_bank”>文字</a> 新页面打开
锚链接：
  1：定义命名锚记<p><a href></p>
  2：链接到锚记位置<a href=”链接路径(不是本页面需加链接路径)#锚记名” target=”打开位置”>文字</a>
<p><a href></p>
<a name=”one”>第一部分</a>
<a name=”two”>第二部分</a>
特殊字符：
&nbsp;   空格
&alt;    小于号<
&gt;    大于号>
&copy;  版权符号©
//导航菜单
<ul type=”cicle(空心圆圈)|square(实心方形)(不写默认是实心圆圈)”>
  <li>选项1</li>
  <li>选项2</li>
  <li>选项3</li>
</ul>  无序列表
<ol type=”i(不加默认是数组1234)” >
<li>选项1</li>
  <li>选项2</li>
  <li>选项3</li>

</ol>  有序列表
//图文混排
<dl>
   <dt><img src=”” whith=”” height=””></dt>
<dd>商品说明</dd>
<dd>商品价格</dd>
</dl>
<table>
<tr>
    <td colspan="2" align="center">期中考试成绩</td>
  </tr>
  <tr>
    <td rowspan="2" valign="top" >90</td>
    <td>99</td>
    <td>80</td>
  </tr>
  <tr> 
   <td>70</td>
   <td>77</td>
  </tr>
</table>
//colspan 跨列
//rowspan 跨行
 
表单：<form method="post" action="reg.jsp">
         <p>用户名：<input type="text" name="username"/></p>
   <p>密码：&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password" /></p>
   <p>性别：<input type="radio" name="sex" value="男" checked="checked" />男
           <input type="radio" name="sex" value="女" />女
   </p> 
   <p>爱好：<input type="checkbox" name="hooby" value="看书" />看书
           <input type="checkbox" name="hooby" value="爬山" />爬山
           <input type="checkbox" name="hooby" value="打球" />打球
   </p>
   <p><input type="submit" name="submit" value="提交并注册" />
      <input type="reset" value="重置"/></p>
<p><input type="button" value="计算"  disabled="disabled"/>
      <input type="image" src="" /></p>
   </form>    
Method (提交方式)只能是get和post
Get:不安全（表单内容会显示在地址栏中），地址栏中网址长度有限，超过会丢弃
Disabled：按钮为不可用设置
Action(提交动作)
Type 中可以是：
Text:文本框
Password:密码框
Radio:单选按钮
Checkbox:复选框
Submit:提交按钮
Reset:重置按钮
File：文件域(文件上传用的)
Button：空按钮
Image：图像提交按钮 和submit是一样的，只是一个图像的按钮
Hidden：隐藏域
//多行文本域 rows 和cols代表文本框的大小，多的会自动出滚动条
 Readonly是只读的，不能修改
<textarea rows="6" cols="30"  readonly="readonly">协议内容</textarea>
//下拉菜单
Selected默认选中，不加默认选择第一行
<p>地区：<select name="country">
              <option>请选择所在的国家</option>
              <option value="中国" selected="selected"s>中国</option>
              <option value="美国">美国</option>
           </select>
   </p>
标签分：块级元素:p    h1-h6    ul-ui    ol-li   dl-dt-dd   form   div
        内联元素 img   strong   em(强调标签用斜体来显示)   span   a

CSS：
CSS用法：
选择器{属性:属性值;属性:属性值;}
选择器：
标签选择器: html标签（例子：ｐ{}   input{}  tr{}  li{} ）
类选择器：.类名{color:#0C9;} 应用<p class=”类名”> 不是只能在p中用
ID选择器： #id名字{} 应用：<div id=”id名字”></div>
常规上一个ID选择器只用在一个ID上
复合选择器：
后代选择器：#myid li{list-style:none;} #myid h2 a{}
并集选择器：(p,h2,h3{margin:0px} )  ( #one li a,#myid h2 a{})
交集选择器：前面必须是标签，后面必须是类或ID(p.myclass{})  (h2#myid{})
样式应用分类：
   行内样式：<p style=”color:red”>ssssssssss</p>
   内部样式：在head头部写
<head> 
<style type="text/css">
…
</style>
</head>
   外部样式：单独保存css样式文件，然后在页面导入外部样式文件
样式优先级：
id选择器>类选择器>标签选择器
行内样式>内部样式>外部样式
 	标签选择器直接应用于HTML标签
 	类选择器可在页面中多次使用
 	ID选择器在同一个页面中只能使用一次
链接式与导入式的区别
<link/>标签属于XHTML，@import是属于CSS2.1
使用<link/>链接的CSS文件先加载到网页当中，再进行编译显示
使用@import导入的CSS文件，客户端显示HTML结构，再把CSS文件加载到网页当中
@import是属于CSS2.1特有的，对于不兼容CSS2.1的浏览器来说就是无效的。
常用样式属性：
   字体样式：
       Font-family:字体类型 如宋体
       Font-size:字体大小
       Font-weight:bold;加粗  normal：不加粗
       Font-style:italic;斜体  normal：不斜体
       缩写：font:style weight size/行高 family;
                Font:italic bold 12px 宋体;
  文本样式属性：
   Text-align:对其方式
   Color:颜色
   Text-indent:2em;首行缩进2字符
   Text-decoration:underline;显示下划线 none:去掉下划线
   Line-height:行高

超链接样式：(伪类)
a:link{color:red;}超链接未被访问时样式
a:visited{coloe:blue}超链接访问后的样式
a:hover{color:green;}鼠标悬浮在超链接上的样式
a:active{color:black;}鼠标按下未放开时的状态
背景样式属性：
background-color  //背景颜色
background-color  //背景图像 图像和颜色都有，背景图像会在颜色前面
background-repeat  //背景平铺
no-repeat   //不平铺
repeat
repeat-x //横向平铺
repeat-y
background-position: 背景位置
center center 上下左右都居中
right bottom 右下
32px  8px; 向右偏32像素，像下偏8个像素
-10px  -8px; 向左偏移10像素，向上偏8个像素
可缩写为：
background:color image repeat position;
列表样式：
ul   li
list-style:none  //去掉前面的符号 decimal//变成有序数字
ol  li
list-style:none  //去掉前面的有序数字 disc前面变实心圆
list-stytle-image  //列表前面的图像(为防止浏览器不认识，一般配合list-style:disc使用)
盒子模型：
 margin: 外边距
 padding：填充内边距
border:边框线
width:宽度
height:高度
如：margin-top:5px
margin-bottom:8px
margin-left:10px
margin-right:5px
可缩写为：margin: 上右下左
margin:0px auto;   //使盒子居中显示
border-stytle:solid(dashed(虚线) \ dotted(实线))
border-width:2px
border-color:red
border:1px solid red; //1个像素的实心红线
border-bottom:2px dashed #0f0;
display:block;  //显示成块级
display:inline;  // 显示成内联(不占位置，只占内容)
display:none  //不显示
浮动：
float：left;
float: right
float:none;
清楚浮动：
clear:left;    //清除左侧浮动
clear:right;   //清除右侧浮动
clear:both ;   //清除两侧浮动
clear:none;   //不清除
扩展盒子高低块级元素
在容器中添加空盒子清除浮动
overflow：hidden //溢出隐藏
overflow:溢出处理(hidden  visible  scroll)
 	使用clear与overflow扩展盒子的高度
 	使用overflow属性扩充盒子高度减少代码量，也减少了空的HTML标签，使代码更加简洁，清晰，从而提高了代码的可读性和网页性能。
 	如果页面中有绝对定位（后面讲解）元素且元素超出了父级的范围，就必须使用clear属性来清除浮动来扩展盒子高度




常见标签
头信息标签<head>
主体内容标签<body>
换行标签<br>
水平线标签<hr>
居中对齐标签<center>
字体标签<font>
段落标签<p>
格式化标签<pre>
引用标签<blockquote>
HTML注释语法
字符控制标签
标题文字标签<h1>~<h6>

重要标签
列表标签<ul>、<ol>、<li>
定义性列表标签<dl>、<dt>、<dd>
table表格<table>等
图像标签<img>
超链接标签<a>
form表单及控件标签<form>等
表单分组标签<fieldset>
框架<frameset>等

?? 换行标签<br>
    语义：break（换行）
    标签特征：无属性的单一标签

?? 水平线标签<hr>
    语义：horizontal rule（水平尺）
    有属性设置的单一标签

?? 居中对齐标签<center>
    语义：center（居中）
    无属性对称标签

?? 字体标签<font>
    语义：font（字体）
    用来控制文字样式的标签，有属性的对称标签

?? 段落标签<p>
    语义：paragraph（段落）
    作用：用来将文字内容进行段落划分的标签
    注意：段落标签将不保留文字内容的格式（主要是不会保留文本的换行和空格）
    有属性的对称标签

?? 格式化标签<pre>
    语义：preformatted（预定义格式）
    作用：保留文本内容的格式化定义，和<p>段落标签要区分清楚
    无属性的对称标签

?? 引用标签<blockquote>
    语义：block quotation（区块引用）
    作用：用于引入外部文字内容，默认显示效果会在左侧缩进一段距离，与上下原文加以区分
    无属性对称标签

?? 注释标签<!-- ... -- >
    作用：用于将不需要显示在浏览器中的内容注释掉
    注意：被注释掉的内容，查看源代码的时候仍然可以看到；注释只是告知浏览器不需要对其进行解析工作，并没用从内容中进行删除
    无属性的对称标签（特殊的标签）

?? 字符控制标签
    粗体（blod）<b></b>
    加重（strong）<strong></strong>
    强调（emphasized），但显示为斜体字 <em></em>
    斜体（italic）<i></i>
    下划线（underlined）<u></u>
    删除线（strikethrough）<s></s>
    被删除的（deleted）<del></del>
    插入（inserted），但表现为下划线  <ins></ins>
    加大的字体（big）<big></big>
    减小的字体（small）<small></small>
    上标字体（superscripted）<sup></sup>
    下标字体（subscripted）<sub></sub>
    作用：用于控制字符文字的显示效果
    注意：使用时按照语义环境选择合适的标签

?? 标题文字标签<h1>~<h6>
    语义：header（标题）
    作用：用来设置文字内容中的标题，共有6种标题，依次按照标题的层级递减，显示效果的字体大小也递减
    有属性对称标签

?? 列表标签<ul>、<ol>、<li>
    语义：
    ul——unordered list（无序列表）
    ol——ordered list（有序列表）
    li——list item（列表项目）
   作用：显示列表（一系列有关联性的项目内容）
?? 英文单词含义注释：
    list：列表
    ordered：有顺序的
    unordered：无顺序的
    item：项目、条目
?? 无序/有序列表在显示时的细节特征：
   1. 有段落显示属性（即，默认从行首开始显示）
   2. 每个列表项目，各自独立一行
   3. 每个列表项目，行首有缩进
   4. 每个列表项目，内容前有项目图标或项目序号
??无序列表标签<ul>
   属性type的取值范围：
   disc：实心圆（默认）
   circle：空心圆
   square：实心方块
??有序列表标签<ol>
   属性type的取值范围：
   1：序号为阿拉伯数字1，2，3，4（默认）
   a：序号为a,b,c,d
   A：序号为A,B,C,D
    i：序号为小写希腊字母序号i,ii,iii
    I：序号为大写希腊字母序号I,II,III
??无序与有序列表的结合嵌套应用
   例：
   <ul>
      <li>PHP课程内容
         <ol>
             <li>语法知识</li>
             <li>流程控制</li>
             <li>面向对象</li>
         </ol>
      </li>
      <li>MySQL数据库</li>
      <li>项目开发</li>
   </ul>

?? 定义性列表标签<dl>、<dt>、<dd>
    语义：
    dl：definition list
    dt：definition term
    dd：definition description
    作用：显示含有定义的列表项目，与ul和ol相比，语义更侧重于 自定性 或 描述性 特征
?? 英文单词含义注释：
    list：列表
    definition：定义
    term：术语
    description：描述

??表格系列标签（重点）
   表格的构成元素：
    行
    列
   单元格
   表头
?? 表格系列标签的组成：
    <table>：表格外框，用来表明表格的开始与结束
    <tr>：行，用来设置表格的行
    <th>：表头单元格，用来设置表格标题行的列单元格
    <td>：普通单元格，用来设置表格普通行的列单元格
??表格<table>标签的常用属性
   属性名		属性值		说明
   border 		像素		表格边线宽度
   cellspacing 	像素/百分比	单元格之间的距离
   cellpadding 	像素/百分比	单元格内容与边线的距离
   width 		像素/百分比	表格宽度
   height 		像素		表格高度
   align		left、center、right 	表格对齐位置
   bgcolor 		英文（十六进制）	表格背景颜色
?? 单元格<th> 和 <td>标签的常见属性：
    属性名		属性值			说明
    width 		像素/百分比		宽度
    height 		像素/百分比		高度
    bgcolor 	英文/十六进制		数据格的背景颜色
    align		left、center、right 		文字水平对齐位置
    valign		top、middle、bottom	文字垂直对齐位置
?? 合并单元格
    跨列单元格合并： colspan
    跨行单元格合并： rowspan
??表格的嵌套使用
   注意：表格的嵌套一定要发生在单元格td里
?? 表格的另类使用——页面布局
    注意：仅了解即可，不再推荐使用，以后页面布局完全由Div+CSS完成

?? 超链接标签<a>（重点）
    语义：anchor（锚点）
    <a href="http://www.baidu.com">百度</a>
  （1）href的组成
  （2）相对与绝对地址
  （3）页内锚链接
  （4）超链接的标题
  （5）超链接打开的目标窗口
?? href超链接的组成
    基本格式：
     <a href="http://www.hfphp.org/product/index.html">中科英才</a>
     URL地址组成部分：
     http：链接类型（http；ftp；mailto）
     www.hfphp.org：服务器域名或IP地址
     [80：服务器端口号]，可选
     /product/：文件路径
     index.html：文件名
   特殊的href——#
     页内链接<a href="#">本页</a>
?? 相对与绝对地址
    相对地址
      <a href="/contact">联系我们</a>
    相对于根目录的连接，在项目整体移动时，不需要再做更改，推荐使用
    绝对地址
     <a href="http://www.hfphp.org/index.php">中科英才首页</a>
    完整的连接，在项目整体移动主机时，需要更新内容
?? 页内锚链接
    作用：用来快速在文档中进行位置定位的方法（特殊的链接：页面内部的连接）
    形象的比喻——书签
    锚点链接的使用步骤：
    1. 设置锚点：
        <a name="php"></a>
    2. 链接锚点：
        <a href="#php">本页面的锚点跳转</a>
        <a href="other.html#php">其他页面的锚点跳转</a>
?? 超链接的标题
    <a href="#" title="PHP培训">中科英才</a>
?? 超链接打开的目标窗口
      target属性：
      target="_self"：原窗口打开（默认）
      target="_blank"：新窗口打开
      target="_parent"：上一级窗口打开（后续框架章节介绍）
      target="页面名称"：指定在某个名称的页面窗口打开（后续框架章节介绍）
    实例：原窗口打开链接
      <a href="http://www.hfphp.org">中科英才原窗口打开</a>
      <a href=http://www.hfphp.org target="_self">中科英才原窗口打开</a>
    实例：新窗口打开连接
      <a href=http://www.hfphp.org target="_blank">中科英才新窗口打开</a>

?? 图像标签<img>（重点）
    <img src="spring.jpg">
    <img src="spring.jpg" />
    1、图片的属性
    2、背景图片
    3、图片链接
?? 用于在页面中引入图片：<img src="URL">
    属性名		属性值			说明
    src		url				图片路径
    alt		字符串				图片注释
    width		像素/百分比			图片宽度
    height		像素/百分比			图片高度
    border		数字				图片边框（图片链接时也用到）
    align		left、right、top、middle、bottom 	图片对齐位置
?? 常用来设置body的背景图片
    <body background="URL">
?? 也可用于Table、TD等标签
?? 用图片作为超链接的内容
    <a href="http://localhost"><img src="spring.jpg" width="100px"></a>
     注意：图片作为超链接的内容时，默认会自动给图片加上border边框
?? 无边框的图片链接：
    <a href="http://www.hfphp.org"><img src="spring.jpg" width="100px" border="0"></a>
     可以通过border属性将img标签的边框设置为0

?? 表单标签——form（重点）
    1、表单简介
    2、表单的属性
    3、表单控件
    （1）文本框、密码框
    （2）多选项、单选项
    （3）下拉框
    （4）文字区域
    （5）隐藏框
    （6）按钮、图像按钮
    （7）文件上传标签
?? form表单是用户输入数据，与网络程序进行交互的特定区域。
    语法：
	<form>
	　<input>
	　<input>
	</form>
?? 表单语法结构：
<form method="..." action="..." >
   <input>
   <select>
    <textarea>
</form>
?? 表单属性功能描述：
     method：表单提交时信息发送的方法（POST或GET）
     action：表单信息提交的传输目标
?? 表单的输入控件是用户输入数据的元素；
    表单输入控件常被称为“表单元素”；
    注意：表单本身在浏览器中并不可见，用户可见的都是控件；
??输入类型通常是由控件的类型——type属性定义的
   常见的控件类型如下：
  （1）文本框、密码框
  （2）多选项、单选项
  （3）下拉框
  （4）文字区域
  （5）隐藏框
  （6）按钮、图像按钮
  （7）文件上传标签
?? 文本框：type="text"
    用于输入较短的字符串
<form>
   用户名<input type="text" name="username">
</form>
<form>
   用户名<input type="text" name="username" value="无名氏" size="10"maxlength="20" readonly>
</form>
?? 文本框的属性设置：
value：文本框内的输入值
size：文本框的宽度大小
maxlength：文本框可输入的最大文本长度
readonly：只读的文本框（无法输入）
?? 密码框：type="password"
    用于输入密码字符串，在浏览器中以实心圆显示已输入的字符内容
    属性类似文本框
<form>
　　用户密码<input type="password" name="passwd">
</form>
<form>
　　用户密码<input type="password" name="passwd" value="123"size="10" maxlength="20" readonly>
</form>
?? 请编写给定效果的用户注册表单页面——register.html
    该表单提交给result.php处理数据
?? 多选项框：type="checkbox"
    多个选项可以选择多个
<form>
　　爱好：
　　<input type="checkbox" name="fav[ ]" value="1">读书；
　　<input type="checkbox" name="fav[ ]" value="2">体育;
</form>
注意：这里的name相同，而值不同，且为数组
<form>
　　爱好：
　　<input type="checkbox" name="fav[ ]" value="1">读书；
　　<input type="checkbox" name="fav[ ]" value="2" checked="checked">体育;
</form>
checked：设置选中状态的属性
?? 单选项框：type="radio"
    多个选项只能选择一个
<form>
　　性别：
　　<input type="radio" name="sex" value="m">男；
　　<input type="radio" name="sex" value="f" checked="checked">女；
</form>
注意：这里的name相同，而值不同，不需要设置为数组了
?? 下拉框：也常称为下拉菜单
     独立的标签（非<input>标签）
     用来选择在设定好范围内的数据
     语法：
	<select>
	　　<option></option>
	</select>
     选项用option标签设定
?? 下拉框的属性设置：
<form>
　　城市：
　　<select name="city">
　　　　<option value="hf">合肥</option>
　　　　<option value="sh">上海</option>
　　</select>
</form>
name：下拉框控件名
value：选项的值
<form>
　　城市：
　　<select name="city">
　　　　<option value="hf">合肥</option>
　　　　<option value="sh" selected=“selected”>上海</option>
　　</select>
</form> 
selected：被选中的项目
?? 可设置多选的下拉框
<form>
　　城市：
　　<select name="city[ ]" size="5" multiple >
　　　　<option value="hf">合肥</option>
　　　　<option value="sh">上海</option>
　　　　<option value="bj">北京</option>
　　　　<option value="nj">南京</option>
　　</select>
</form>
size：下拉框的大小
multiple：下拉框为多选
?? 下拉框的项目分组：
<form>
　　城市：
　　<select name="city">
　　　　<option value="hf">合肥</option>
　　　　<optgroup label="直辖市">
　　　　　　<option value="sh">上海</option>
　　　　　　<option value="bj">北京</option>
　　　　　　<option value="nj">南京</option>
　　　　</optgroup>
　　　　<optgroup label="港澳台">
　　　　　　<option value="sh">香港</option>
　　　　　　<option value="bj">澳门</option>
　　　　　　<option value="nj">台湾</option>
　　　　</optgroup>
　　</select>
</form>
optgroup：选项分组
label：分组名（不可被选中）
?? 文字区域：用来输入大段字符串内容
    独立的标签：<textarea></textarea>
<form>
　　文字内容<textarea></textarea>
</form>
<form>
　　文字内容<textarea name="cont" cols="50" rows="5"></textarea>
</form>
文字区域属性设置：
name：控件名称
cols：文字区域的宽度（列数）
rows：文字区域的高度（行数）
?? 隐藏框：type="hidden"
    用于设置隐藏的数据内容，在浏览器中不显示，但控件实际仍然
存在；因为隐藏，所以用户无法输入或修改数据。
    常用来在表单中跟随其他输入控件一起提交的敏感数据。
<form>
　　用户编号：<input type="hidden" name="userID" value="123">
</form>
?? 按钮控制了表单数据的发送、重置等动作
?? 按钮根据类型分为：
  （1）提交按钮
  （2）重置按钮
  （3）普通按钮
  （4）图像按钮
?? 提交按钮：type="submit"
   点击提交按钮后，用来发送form表单数据，页面将发生跳转
<form>
　　<input type="submit">
</form>
<form>
　　<input type="submit" value="发送表单">
</form>
value：按钮文字（默认不设置为 “提交查询内容” ）
?? 重置按钮：type="reset"
   点击重置按钮后将会将form表单内的控件内容全部清除
<form>
　　<input type="reset">
</form>
<form>
　　<input type="reset" value="重填">
</form>
value：按钮文字（默认不设置为 "重置" ）
?? 普通按钮：type="button"
    点击普通按钮将不会激发任何动作，通常与Javascript程序配合使用（详见JS单元课程）
<form>
　　<input type="button" value="激发动作">
</form>
value：按钮文字（必须设置）
?? 图像按钮：type="image"
    将图片设为提交按钮(而不是普通按钮）
<input type="image" src="buy.png">
src：图片的来源
?? 上传标签：type="file"
    上传本地文件到服务器端
<form enctype="multipart/form-data">
　　<input type="file" name="pic">
</form>
name：上传控件的名称，必设置（程序需要）
?? 表单分组——fieldset、legend
    常用来将表单分组显示
<form method="post" action="result.php">
   <fieldset>
      <legend>个人信息</legend>
      ... ...
  </fieldset>

  <fieldset>
    <legend>职务部门</legend>
    ... ...
  </fieldset>

  <input type="submit" value="保存">
</form>
?? 框架集合<frameset>、框架<frame>
    <frameset>的作用：在一个浏览器窗口中，同时显示多个网页，类似画中画
    <frame>的作用：每个框架里设定一个网页，这些网页相互独立
    语法：
	<frameset>
	　　<frame>
	　　<frame>
	</frameset>
   （1）框架集合的结构
   （2）嵌套多框架的设置
   （3）多框架与超链接
   （4）内嵌框架的设置
?? 框架集内有框架
    详细语法：
	<frameset rows="..." cols="..." [framespacing="..."] [frameborder="... "]>
	   <frame src="..." [name="..."]>
	   <frame src="..." [name="..."]>
	   ... ...
	</frameset>
    <frameset>的常见属性
	<frameset cols="200,*">
	　　<frame src="frame1.html">
	　　<frame src="frame2.html">
	</frameset>

	<noframes>
	<body>不支持框架的浏览器</body>
	</noframes>
属性名		属性值		说明
rows		像素/百分比	横排的多窗框设置
cols		像素/百分比	竖排的多窗框设置
framespacing	像素/百分比	页面与页面的边距
frameborder	1或0，yes或no	框架的边框
?? frame标签的属性
属性名称		属性值		说明



src		URL		框架窗体的URL网址
noresize		yes/no		不允许改变框架大小（不加该属性则默认为允许）
name		字符串		框架窗体的名称
		no		无论窗体大小，都不出现滚动条
scrolling		auto		根据窗体内容多少自动判断是否需要出现滚动条
		yes		无论窗体大小，都出现滚动条
?? 常见的T字后台管理页面布局
    <frameset rows="80,*" cols="*">
      <frame src="top.html" noresize>
      <frameset rows="*" cols="180,*">
        <frame src="left.html" noresize>
        <frame src="main.html">
      </frameset>
    </frameset>
?? 多框架页面的管理后台可以让我们方便的进行链接与导航
    <frameset rows="80,*" cols="*">
        <frame src="top.html" noresize>
        <frameset rows="*" cols="180,*">
          <frame src="left.html" noresize>
          <frame src="main.html" name="main">   
        </frameset>
    </frameset>
  <a href="exam_main.html" target="main">返回主页</a>
?? 内嵌在body区域的框架：<iframe></iframe>
     <frame>与<iframe>的区别：
        frame用于框架集（<frameset>），而框架集不能和body同用；iframe用于在body区域内部；
     frame不是对称标签；iframe是对称标签
   文本内容上下文<br>
   <iframe src="http://localhost"></iframe><br>
   文本内容上下文
   文本内容上下文<br>
   <iframe src="http://localhost" width="200px" height="100px" frameborder="0" scrolling="no"></iframe><br>
   文本内容上下文
?? 自动显示（跳转）网页
?? 设置作者、版权信息
了解即可！
?? 格式：
    <meta http-equiv="refresh" content="time;url=...">
       http-equiv="refresh"：页面刷新（跳转）声明
       time：刷新（跳转）前延迟的秒数
       URL：显示的网页地址（不填写具体url则刷新当前页）
    <meta name="Generator" content="EditPlus">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
      Generator：网页编辑软件
      Author：作者
      Keywords：关键字（多个用英文半角逗号分隔）
      Description：网页内容简介描述文字
?? HTML中的特殊字符
    特殊字符不是标签
    因为标签定义时用到了一些左右尖括号等特殊字符，为了在页面中能正常显示这些字符，必须将其转义为特殊字符
    常见的特殊字符：
       < 等同于 &lt;
       > 等同于 &gt;
       & 等同于 &amp;
       " 等同于 &quot;





css 层叠样式表 ： 样式名不相同时，样式叠加到该标签
    样式优先级 ： 样式同名不同值时,
		行内>ID>class>标签>默认样式>继承
  语法：
	样式名:样式值；
  
  定义样式
	定义位置：
		行内样式：在标签内定义（style属性定义）
		内嵌样式：html页面内部定义的样式，
				只对本页标签有用
			<style>
				选择器{
				}
			</style>
		外部样式表：在css文件中定义（XXX.css），只写选择器
	选择器：
		标签选择器：
		     标签名{
			  样式名:样式值；
		     }
		     .类名{
			  样式名:样式值；
		     }
		     #id名字{
  			样式名:样式值；	
		     }
	高级选择器：
		并集选择器(共同拥有相同样式)
			选择器1，选择器2{
			}
		子类选择器(精确定位)
			选择器1 选择器2{
			}
		交集选择器
			标签名.类名{
			}
  使用样式
	行内样式：在标签内使用（style属性使用）
	内嵌样式：
		在标签内添加选择器
	（一种标签）    标签选择器：写标签
		（一类）类选择器：标签内添加 class="类名"
		（一个）id选择器：标签内添加 id="cssId选择器名"
	外部样式表：
		引入css文件，通过link标签
<link href="文件地址" rel="stylesheet" type="text/css"/>
		在标签内添加选择器（与上相同）
  行内样式优点：直观，当时方便快捷
	  缺点：不易于后期维护，批量处理不好，
		样式和内容过于紧密
  内嵌样式优点：与上面相反

  外部样式表优点：样式和内容彻底分离，便于维护


-------------------------------------------------------
	具体样式：
		font:font-style值 font-weight值 font-size值 font-family值；
	    
	    字体属性

		font 简写属性。作用是把所有针对字体的属性设置在一个声明中。 
		font-family 设置字体系列。 
		font-size 设置字体的尺寸。 
		font-style 设置字体风格。 
		font-weight 设置字体的粗细。 

	    CSS 文本属性

		color 设置文本颜色 
		line-height 设置行高。 
		letter-spacing 设置字符间距。 
		text-align 对齐元素中的文本。 
		text-decoration 向文本添加修饰。 
		text-indent 缩进元素中文本的首行。 
		white-space 设置元素中空白的处理方式。 
		word-spacing 设置字间距。

	   CSS 背景属性
		
		background 简写属性，作用是将背景属性设置在一个声明中。 
		background-color 设置元素的背景颜色。 
		background-image 把图像设置为背景。 
		background-position 设置背景图像的起始位置。 
		background-repeat 设置背景图像是否及如何重复。

盒子模型：
	1 块级标签
	2 内容大小 width 和 height
	3 边框     border
	4 填充 （内 padding，外 margin）
	盒子宽度=margin*2+padding*2+border*2+width
	盒子高度=margin*2+padding*2+border*2+height

padding-top
top上  bottom下 left左  right右
	padding：0px;
	padding：上 右 下 左;
	padding：上下  左右;
	padding：上  左右  下;

margin 方式和padding一致
	注意：建议标签默认填充，尽量去掉
	      盒子标签居中必须设置宽度，使用margin：0px auto;设定

border 
	top上  bottom下 left左  right右
	color    style    width
	border:样式 粗细 颜色；
	border-color:上 右 下 左；
	border-top：样式 粗细 颜色；
	border-top-width：1px;

浮动：当前盒子飘起，后面盒子会插入到该盒子原先的位置上
	后面盒子的文字会在浮动盒子的周围不会被覆盖掉
float：left、right
	根据标签浮动先后顺序在浮动框的左或右
浮动盒子有流动性，受父容器大小影响，但是父容器一旦确定大小
该盒子就不会改变位置	

clear：both    清除浮动，让该标签不受前面浮动标签的影响。

	CSS 列表属性(list)
	    list-style 简写属性。用于把所有用于列表的属性设置于一个声明中。 
	    list-style-image 将图象设置为列表项标志。 
	    list-style-position 设置列表中列表项标志的位置。 
	    list-style-type 设置列表项标志的类型。 

















































