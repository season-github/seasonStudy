package com.season.seasonStudy;

import com.season.seasonStudy.hashmap.SeasonHashMap;
import com.season.seasonStudy.pattern.iterator.ArrayList;
import com.season.seasonStudy.test.Demo;

import java.util.*;

/**
 * 临时测试时使用
 */
public class SeasonTest {

    public static void main(String[] args) {
        SeasonHashMap<Integer,Integer> map = new SeasonHashMap<>();
        map.put(1, 11);
        map.put(2, 22);
        Set<Integer> keys = map.keySet();
        keys.size();
        System.out.println(map.keySet().size());
        map.put(3, 33);
        System.out.println(map.keySet().size());
        System.out.println(map.keySet());

    }

    private static void testMap(){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 11);
        map.put(2, 22);
        map.put(3, 33);

        Spliterator<Map.Entry<Integer, Integer>> spliterator = map.entrySet().spliterator();


    }
    private static void testList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);

        Spliterator<Integer> spliterator = list.spliterator();

    }

}
