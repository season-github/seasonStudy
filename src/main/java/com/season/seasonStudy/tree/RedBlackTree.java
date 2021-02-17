package com.season.seasonStudy.tree;

public class RedBlackTree {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public static class TreeNode<K, V>{
        boolean red;
        TreeNode<K, V> parent;
        TreeNode<K, V> left;
        TreeNode<K, V> right;
        K key;
        V value;
        int hash;

        final TreeNode<K, V> root(){
            TreeNode<K,V> r = this, p;
            while (true){
                if ((p=r.parent) == null){
                    return r;
                }
                r = p;
            }
        }
    }

}
