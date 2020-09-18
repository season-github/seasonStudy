package com.season.seasonStudy.binaryTree;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树节点实体类
 */
@NoArgsConstructor
@Data
public class BinaryTreeNode {
    public BinaryTreeNode left; // 左节点
    public BinaryTreeNode right; // 右节点
    private Object data; // 数据域

    /**
     * 构造器-有左右节点
     */
    public BinaryTreeNode (BinaryTreeNode left, BinaryTreeNode right, Object data){
        this.left=left;
        this.right=right;
        this.data=data;
    }

    /**
     * 构造器-无左右节点
     */
    public BinaryTreeNode(Object data){
        this(null,null,data);
    }

    /**
     * 生成二叉树数据
     * @param objs
     */
    public BinaryTreeNode generateData (Object[] objs){
        List<BinaryTreeNode> nodeList =new ArrayList<BinaryTreeNode>();

        for(Object o:objs){ // 将一个数组的值依次转换为Node节点
            nodeList.add(new BinaryTreeNode(o));
        }

        BinaryTreeNode root= nodeList.get(0); // 根节点

        for (int i = 0; i <objs.length/2; i++) {
//            左孩子
            nodeList.get(i).left= nodeList.get(i*2+1);
//            右孩子
            if(i*2+2< nodeList.size()){//避免偶数的时候 下标越界
                nodeList.get(i).right= nodeList.get(i*2+2);
            }
        }
        return root;
    }

    /**
     * 生成二叉树数据
     */
    public void generateData (BinaryTreeNode node, List<BinaryTreeNode> nodeList){
        if (nodeList.size()>2){
            node.setLeft(nodeList.get(0));
            if (1 != nodeList.size()/2){
                generateData(node.getLeft(), nodeList.subList(1, nodeList.size()/2));
            }
            node.setRight(nodeList.get(nodeList.size()/2+1));
            if (nodeList.size() != nodeList.size()/2+1){
                generateData(node.getRight(), nodeList.subList(1, nodeList.size()/2));
            }

        }else if(nodeList.size() == 2) {
            node.setLeft(nodeList.get(0));
            node.setRight(nodeList.get(1));
        }else if (nodeList.size() == 1){
            node.setLeft(nodeList.get(0));
        }
    }

    // 前序遍历 中->左->右（上->下）
    public void preOrder (BinaryTreeNode root){
        if(root!=null){
            System.out.print(root.data);
            System.out.print(", ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历 左->中->右（左->右）
    public void inOrder (BinaryTreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data);
            System.out.print(", ");
            inOrder(root.right);
        }
    }

    //    后序遍历 左->右->中（下->上）
    public void afterOrder (BinaryTreeNode root){
        if(root!=null){
            afterOrder(root.left);
            afterOrder(root.right);
            System.out.print(root.data);
            System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode bintree=new BinaryTreeNode();
        Object []a={2,4,5,7,1,6,12,32,51,22};
        BinaryTreeNode root = bintree.generateData(a);
        System.out.print("\npreOrder:\t");
        bintree.preOrder(root);
        System.out.print("\nafterOrder:\t");
        bintree.afterOrder(root);
        System.out.print("\ninOrder:\t");
        bintree.inOrder(root);
    }
}
