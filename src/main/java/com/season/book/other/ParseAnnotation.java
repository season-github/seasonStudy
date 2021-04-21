package com.season.book.other;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ParseAnnotation {

	public static void parseTypeAnnotation() throws ClassNotFoundException {
		Class clazz = Class.forName("test.annotation2.UserAnnotation");//反射

		Annotation[] annotations = clazz.getAnnotations();//你也可以getDeclareFields
		for (Annotation annotation : annotations) {
			AnnotationDemo t = (AnnotationDemo) annotation;
			System.out.println("id= " + t.id() + "; name= " + t.name()
					+ "; gid = " + t.gid());
		}
	}

	public static void parseMethodAnnotation() {
		Method[] methods = UserAnnotation.class.getDeclaredMethods();
		for (Method method : methods) {
			boolean hasAnnotation = method.isAnnotationPresent(AnnotationDemo.class);//看看这个方法有没有注释
			if (hasAnnotation) {
				AnnotationDemo annotation = method.getAnnotation(AnnotationDemo.class);
				System.out.println("method = " 
						+ method.getName() + " ; id = "
						+ annotation.id() + " ; description = "
						+ annotation.name() + "; gid= " 
						+ annotation.gid());
			}
		}
	}


	public static void parseConstructAnnotation() {
		Constructor[] constructors = UserAnnotation.class.getConstructors();
		for (Constructor constructor : constructors) {

			boolean hasAnnotation = constructor
					.isAnnotationPresent(AnnotationDemo.class);
			if (hasAnnotation) {

				AnnotationDemo annotation = (AnnotationDemo) constructor
						.getAnnotation(AnnotationDemo.class);
				System.out.println("constructor = " + constructor.getName()
						+ " ; id = " + annotation.id() + " ; description = "
						+ annotation.name() + "; gid= " + annotation.gid());
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		parseTypeAnnotation();
		System.out.println("---------------------------");
		parseMethodAnnotation();
		System.out.println("---------------------------");
		parseConstructAnnotation();
	}
}