package com.season.seasonStudy.hashmap;

import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Soundbank;

/**
 * 临时测试时使用
 */
public class SeasonHashMapTest {

    private static List<Integer> badList = new ArrayList<>();
    private static List<Integer> betterList = new ArrayList<>();

    public static void main(String[] args) {
        int count = 0;
        SeasonHashMap<User, Integer> map = new SeasonHashMap<>(32);
        for (; count < 16; ) {
            map.put(new User(49), ++count);
        }
        for (; count < 32; ) {
            map.put(new User(51), ++count);
        }

        map.entrySet().forEach(System.out::println);
        System.out.println("---------------");
    }

    /**
     * 重写hashcode，只有2个值
     * 50岁以下是123122
     * 50岁以上是123123
     */
    private static class User {
        int age;

        public User(int age) {
            this.age = age;
        }

        @Override
        public int hashCode() {
            if (age < 50) {
                return 123122;
            }
            return 123123;
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

