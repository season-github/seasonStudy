0. 标准文档流(normal flow 翻译有问题)：块级元素、内联元素
应该：从上到下，左到右
浮动(float)、绝对定位(absolute)、固定定位(fixed)三种方式定位会脱离文档流
1. 块级元素：div p h1-h6 ol ul li dl-dh-dt-dd
孙老师说，块级元素一般不设置行高，有多少内容，行高就是多少
2. 内联元素：span em strong a img
3. 元素：从标签开始到标签结束的所有代码
4. div span 都没有特定的含义，span为文本容器，div为其他元素容器
5. html xml都为标签式文档
6. <img src="path" title="title" alt="exchange" width="",height=""/>
7. <a href="path" target="" >show</a>
8. 锚链接a.下锚  b.链接到锚
<a name="therename">show</a>
<a href="(页面名)#therename">show</a>	若为本页面，则不需要填写页面名
9. 5种特殊字符：&lt	&gt	&quot &nbsp &copy
10. 列表ul	ol	li	dl-dt-dd(被解释说明的东西	解释说明)
11. table多用于页面布局table-th-tr-td
aligh	valigh	rowspan	colspan
12. 框架(不常用)frameset	iframe
13. 表单<form method="post/get" action="action">
show:<input type="type" name="name" value=""
readonly="readonly"	disabled="disabled" />
</form>





原则:	网页内容越简单越好,html,Css分离

1.标签:
1.块级元素	可以自动换行,可以独占一行
div 		布局结构
p h1-h6
ul-li ol-li 导航菜单
dl-dt-dd 	图文混排
table 		局部布局
//	坏处,3层结构,太大了		结构性代码太多,内容太深,不容易被搜索引擎找到	流量大,传输时间		
//好处:整齐,没兼容性问题
form
2.内联元素	只有内容,没宽高
span a img strong em
input	typt:	text,password,radio,checkbox,submit,reset
image(图片按钮),button(空按钮,js用他),file(需要设置),hidden
//表单内容都是文本字符	上传文件的时候,用post,还有设置enctype=""	jsp需要自己判断enctype是否设置了
select
textarea
3.br hr .... 不用管他们了

2.Css
1.选择器{属性:属性值;}	不同浏览器,不兼容,把所有css都去掉,自己控制
标签选择器：p
ID选择器：
类选择器:
复合选择器:
并集选择器:
p,h1,ul,ol,dl,dd,li{margin:0px;		padding:0px;}
后代选择器:
#myid li a{}
交集选择器:		其实一般不用id,只用class,因为,自己认为id就找那一个
p#myid{color:red;}	div.myclass{}
作用:布局页面(121,131),定位网页元素,网页元素的显示样式



绝对定位,脱离文档流,
父容器变小
其他会补位

相对定位,不会影响其他


-----------------------------------------------------------------
-----------HTML--------------------------------------------------
-----------------------------------------------------------------





1	input	type:	text password radio checkbox reset submit
file button image(图像提交按钮) hidden
2	<textarea rows="7" cols="30" name="sss"></textarea>
2	<textarea rows="7" cols="30" name="sss" readonly="readonly">协议</textarea>
3	下拉菜单<select>
<option selected="selected">请选择一个城市</option>
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
行内样式：
<p style="color:red;">sdfsdfsdg;dg</p>
内部样式：在head头部，
<style type="text/css">
p{color:blue;}
</style>
外部样式:
单独保存css样式文件，然后在页面导入外部样式文件

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

<label for >
checkbox太小了,需要用label
单选	相互排斥	name相同可以做到

<input type="button" value="计算" disabled="disabled" >
<input type="radio" value="women" checked="checked"/>	设置默认值,不用判断非空了
image	跟submit一样,就是提交

css
选择器

meta	实体符号

js/JQuery
选择器:
事件:
函数:

<script src="Css.js"></script>
<script>
	//code
<script>