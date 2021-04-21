package com.season.book.other;HTML文档结构
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

