package com.season.seasonStudy.hashmap;

import com.season.seasonStudy.data.ArrayListData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> data = new ArrayListData().getData();

        Spliterator<String> spliterator = data.spliterator();
        spliterator.tryAdvance(System.out::println);
        spliterator.tryAdvance(System.out::println);
        spliterator.tryAdvance(System.out::println);
        spliterator.tryAdvance(System.out::println);





















    }
}
