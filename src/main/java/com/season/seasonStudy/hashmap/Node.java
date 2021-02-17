package com.season.seasonStudy.hashmap;

import java.util.Map;
import java.util.Objects;

/**
 * HashMap的元素（哈希桶）
 * @param <K>
 * @param <V>
 */
//public class Node<K,V> implements Map.Entry<K,V> {
public class Node<K, V> {

    final int hash; // 哈希值
    final K key; // 键
    V value; // 值
    Node<K, V> next; // 表示链表的下一个结点

    Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next; // 向后维护，是否是新插入的需要放在前面
    }

     // final方法保证不可被重写
    public final K getKey() { return key; }

    public final V getValue() { return value; }

    public final int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value); // hash code 为什么需要进行异或
    }

    public final boolean equals(Object o) {
        if (o == this)
            return true;
        if (o instanceof Map.Entry) {
            Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
            return Objects.equals(key, e.getKey()) && Objects.equals(value, e.getValue());
        }
        return false;
    }

    public final String toString() { return key + "=" + value; }

    public final V setValue(V newValue) { // 写入新值，将旧值返回，为啥呢？
        V oldValue = value;
        value = newValue;
        return oldValue;
    }
}