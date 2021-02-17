package com.season.seasonStudy;

import com.season.seasonStudy.hashmap.Node;
import com.season.seasonStudy.test.Demo;
import com.season.seasonStudy.test.User;
import com.sun.javafx.collections.MappingChange;
import java.util.*;
import sun.awt.image.IntegerComponentRaster;

/**
 * 临时测试时使用
 */
public class SeasonTest {
    
    private static List<Integer> badList = new ArrayList<>();
    private static List<Integer> betterList = new ArrayList<>();

    
    
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,2);
        hashMap.put(2,3);

        generateData(); // 生成hash值
        System.out.println(new HashSet<Integer>(badList).size());
        System.out.println(new HashSet<Integer>(betterList).size());
    }

    private static void generateData(){
        int length = (int)Math.pow(2, 12);
        for (int i = 0; i < length; i++) {
            int hash = new Demo().hashCode();
            badList.add(hash & (length-1));
            betterList.add((hash ^ (hash >>>16)) & (length-1));
        }
    }
    
    private static void swap(int a, int b){
        System.out.println(a+"\t"+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+"\t"+b);
        System.out.println("----------------");
    }

}
