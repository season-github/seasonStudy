package com.season.book.framework.mybatis;

import java.io.InputStream;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
//        URL a = Test.class.getClassLoader().getResource("a.xml");
        InputStream a = Test.class.getResourceAsStream("MybatisDemo.class");
        InputStream b = Test.class.getResourceAsStream("a.xml");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
