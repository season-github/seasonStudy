package com.season.seasonStudy.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTemp<K,V> extends SeasonHashMap<K,V>{
    /**
     * HashMap.Node subclass for normal LinkedHashMap entries.
     */
    static class Entry<K,V> extends Node<K,V> {
        Entry<K,V> before, after;
        Entry(int hash, K key, V value, Node<K,V> next) {
            super(hash, key, value, next);
        }
    }
}
