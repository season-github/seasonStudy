package com.season.book.framework.spring;

import com.season.book.framework.entity.DeanSubjectEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/entity/spring-context.xml");
        DeanSubjectEntity s= (DeanSubjectEntity)ac.getBean("deanSubjectEntity");
        System.out.println(s);
    }
}
