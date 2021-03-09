package com.season.seasonStudy.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.sound.midi.Soundbank;

/**
 * 临时测试时使用
 */
public class SeasonHashMapTest {

    public static void main(String[] args) {
        int count = 0;
        SeasonHashMap<User, Integer> map = new SeasonHashMap<>(32);
        ArrayList<User> arrayList = new ArrayList<>();
//        HashMap<User, Integer> map = new HashMap<>(32);
        System.out.println(map.getThreshold());
        for (; count < 16; ) {
            map.put(new User(49), ++count);
            System.out.println(map.getThreshold());
        }
        for (; count < 32; ) {
            if (count == 23) {
                System.out.println("--------");
                System.out.println(map.getThreshold());
                System.out.println("--------");
            }
            if (count == 24) {
                System.out.println("--------");
                System.out.println(map.getThreshold());
                System.out.println("--------");
            }
            map.put(new User(51), ++count);
        }
        for (; count < 127; ) {
            map.put(new User(51), ++count);
        }
        System.out.println(Arrays.toString(map.getTable()));
        map.entrySet().forEach(System.out::println);
        System.out.println("---------------");

        System.out.println(map.getTable().length);
        System.out.println(map.getThreshold());

        map.keySet().parallelStream().forEach(key -> {
            map.remove(key);
            if (map.getTable() !=null){

            System.out.println(map.getTable().length);
            }
        });

    }

    /**
     * 重写hashcode，只有2个值
     * 50岁以下是 32
     * 50岁以上是 64
     */
    private static class User {
        int age;

        public User(int age) {
            this.age = age;
        }

        @Override
        public int hashCode() {
            if (age < 50) {
                return 64;
            }
            return 128;
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("User{");
            sb.append("age=").append(age);
            sb.append(", this=").append(Integer.toHexString(super.hashCode()));
            sb.append('}');
            return sb.toString();
        }
    }

}

