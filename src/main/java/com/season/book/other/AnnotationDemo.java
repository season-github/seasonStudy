package com.season.book.other;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
      	@Target 表示该注解用于什么地方，可能的值在枚举类 ElemenetType 中，包括： 
          ElemenetType.CONSTRUCTOR----------------------------构造器声明 
          ElemenetType.FIELD --------------------------------------域声明（包括 enum 实例） 
          ElemenetType.LOCAL_VARIABLE------------------------- 局部变量声明 
          ElemenetType.METHOD ----------------------------------方法声明 
          ElemenetType.PACKAGE --------------------------------- 包声明 
          ElemenetType.PARAMETER ------------------------------参数声明 
          ElemenetType.TYPE--------------------------------------- 类，接口（包括注解类型）或enum声明 
           
		@Retention 表示在什么级别保存该注解信息。可选的参数值在枚举类型 RetentionPolicy 中，包括： 
          RetentionPolicy.SOURCE ---------------------------------注解将被编译器丢弃 
          RetentionPolicy.CLASS -----------------------------------注解在class文件中可用，但会被VM丢弃 
          RetentionPolicy.RUNTIME VM-------将在运行期也保留注释，因此可以通过反射机制读取注解的信息。 
           
		@Documented 将此注解包含在 javadoc 中 ，它代表着此注解会被javadoc工具提取成文档。在doc文档中的内容会因为此注解的信息内容不同而不同。相当与@see,@param 等。
       
		@Inherited 允许子类继承父类中的注解。
 */

/**
 * Season认为这一些在注解里的设置值,都可以给注解,然后注解可以拿出来,所以呢,注解可以用来反射
 * 也可以用来填写配置问价,也接下来可以进行反射了
 * 好腻害啊
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDemo {
	String name();
	int id() default 0;	//	默认值,也可以不设置默认值
	Class gid();
	/**
	 *   1. 要用好注解，必须熟悉java 的反射机制，从上面的例子可以看出，注解的解析完全依赖于反射。
     2. 不要滥用注解。平常我们编程过程很少接触和使用注解，只有做设计，且不想让设计有过多的配置时
这个网址可以给你参考一些注解的例子：http://blog.sina.com.cn/s/blog_7540bf5f0100t3mv.html
	 */
	
}
