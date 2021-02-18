package com.season.seasonStudy.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.CORBA.RepositoryIdHelper;

/**
 * 红黑树
 *
 * @param <E>
 */
public class RBtree<E> {
    public static final boolean RED = true;
    public static final boolean BLACK = false;
    //所有叶子节点的左右子支都指向同一个NIL节点,NIL节点的父节点指向null
    private final Node<E> NIL;
    private final Node<E> ROOT;//指向伪根节点的引用
    Comparator<? super E> cmp;//节点大小的比较器
    private int size = 0;//节点个数

    //不带比较器的构造函数
    public RBtree() {
        ROOT = new Node<E>(null, BLACK, null, null, null);
        NIL = new Node<E>(null, BLACK, null, null, null);
        NIL.left = NIL;
        NIL.right = NIL;
        ROOT.left = NIL;
        ROOT.right = NIL;
        ROOT.parent = ROOT;
        cmp = new Cmp<E>();
    }

    //带比较器的构造函数
    public RBtree(Cmp<? super E> cmp) {
        if (cmp == null) {
            throw new IllegalArgumentException();
        }
        this.cmp = cmp;
        //创建一个伪根节点，该节点的右子支才是真正的RBtree树的根,同时该节点还作为NIL节点
        //使用伪根节点节点的目的是，对插入和删除操作递归的形式能够统一 SEASON 这里我不明白伪根节点的存在意义
        ROOT = new Node<E>(null, BLACK, null, null, null);
        NIL = new Node<E>(null, BLACK, null, null, null);
        NIL.left = NIL;
        NIL.right = NIL;
        ROOT.left = NIL;
        ROOT.right = NIL;
        ROOT.parent = ROOT;
    }

    public static void main(String[] args) {
        RBtree<Integer> rbt = new RBtree<Integer>();
        rbt.insert(50);
        rbt.insert(25);
        rbt.insert(75);
        rbt.insert(10);
        rbt.insert(30);
        rbt.insert(27);
        rbt.insert(35);
        rbt.insert(40);
        rbt.insert(31);
        rbt.insert(55);
        rbt.insert(80);
        rbt.insert(90);
        rbt.insert(22);
        rbt.insert(5);
        rbt.insert(5);
        rbt.insert(1);
        rbt.insert(2);
        rbt.insert(3);
        rbt.insert(4);
        rbt.insert(5);
        rbt.insert(6);
        rbt.insert(7);
        rbt.insert(8);
        rbt.insert(9);
        rbt.insert(10);
        rbt.insert(11);
        rbt.insert(12);
        rbt.insert(13);
        rbt.insert(14);
        rbt.insert(15);
        rbt.insert(16);
//        rbt.delete(5);
//        rbt.delete(51);
//        rbt.delete(80);
//        rbt.delete(50);
//        rbt.delete(75);
//        rbt.delete(27);
//        rbt.delete(10);
//        rbt.delete(25);
//        rbt.delete(10);
        rbt.inOrderTraverse(rbt.ROOT.right);
//        rbt.preorderTraverse();
//        System.out.println();
//        System.out.println("size: " + rbt.size());
//        System.out.println(rbt.contain(40));
    }


    /**
     * 左旋/逆时针，参数表示轴节点、支点
     * 实现了右升左降，右边树高降低，左边树高上升
     * 如果是支点红，不会对树高产生影响 TODO 确认下
     *
     * @param node
     */
    private void antiClockwiseRotate(Node<E> node) {
        Node<E> parent = node.parent;
        Node<E> right = node.right;

        // 右树上升做parent
        right.parent = parent;
        if (parent.left == node) {
            parent.left = right;
        } else {
            parent.right = right;
        }

        // 右树的左树，变为支点的左树
        node.right = right.left;
        if (right.left != NIL) {
            right.left.parent = node;
        }

        // 支点下降、收尾
        node.parent = right;
        right.left = node;
    }

    //顺时针旋转（右旋）,参数表示轴节点
    private void clockwiseRotate(Node<E> node) {
        Node<E> parent = node.parent;
        Node<E> left = node.left;

        // 左节点上移，作为新的父节点
        left.parent = parent;
        if (parent.left == node) {
            parent.left = left;
        } else {
            parent.right = left;
        }

        // 节点替换
        node.left = left.right;
        if (left.right != NIL) {
            left.right.parent = node;
        }

        // 支点下移
        left.right = node;
        node.parent = left;
    }

    /**
     * 插入
     * @param e
     * @return
     */
    public boolean insert(E e) {
        Node<E> P = ROOT; // 找到的元素位置，将新的元素作为红节点插入，所以查找到的位置变成了parent
        Node<E> X = ROOT.right; // 在这里，真正的根节点是ROOT的right

        // 查找元素的位置，从右节点开始找
        int check = 0;
        while (X != NIL) {
            check = cmp.compare(e, X.e);
            P = X;
            if (check > 0) {
                X = X.right;
            } else if (check < 0) {
                X = X.left;
            } else {
                return false;// 元素已存在，插入失败
            }
        }

        Node<E> GP; // 祖父节点
        Node<E> U;  // 叔叔节点

        // 插入红节点
        X = new Node<E>(e, RED, NIL, NIL, P);//插入的新节点涂红
        if (check >= 0) {//考虑到首次插入的情况，这个等号是必须的
            P.right = X;
        } else {
            P.left = X;
        }

        // 循环插入，
        while (true) {
            P = X.parent;

            if (!P.isRead()) { // 黑父，直接插入红节点，不影响黑的树高
                break;
            }

            //红父
            if (P.isRead()) {

                // init grandparent & uncle
                GP = P.parent;
                if (P == GP.left) { // 判断左右树，找到uncle
                    U = GP.right;
                } else {
                    U = GP.left;
                }

                //红叔
                if (U.isRead()) { // 父叔红->黑，祖父黑->红，因为不可能祖父+父叔同时为红，此时黑高不变，祖父作为判断节点，重新递归判断
                    P.color = BLACK;
                    U.color = BLACK;
                    GP.color = RED;
                    X = GP;//继续向上回溯
                } else {//黑叔
                    if (GP.left == P) {
                        if (P.left == X) { // 同左，右旋，祖父为支点，修改了P的位置
                            clockwiseRotate(GP);
                            P.color = BLACK; // 父与祖父更换位置，父变黑(祖父原为黑)，祖父变红(父原为红)
                            GP.color = RED;
                        } else { // 不同向，先parent旋转、后grandfather旋转，子右，左旋->单链，右旋->降低树高改变颜色平衡
                            antiClockwiseRotate(P);
                            clockwiseRotate(GP);
                            X.color = BLACK; // 新节点做祖父，变黑
                            GP.color = RED; // 祖父下降变红
                        }
                    } else {
                        if (P.right == X) { // 同右，左旋，祖父为支点，修改了P的位置
                            antiClockwiseRotate(GP);
                            P.color = BLACK;
                            GP.color = RED;
                        } else {
                            clockwiseRotate(P);
                            antiClockwiseRotate(GP);
                            X.color = BLACK;
                            GP.color = RED;
                        }
                    }
                    break;
                }
            }
        }
        size++; // 插入完成，大小+1
        ROOT.right.color = BLACK; // 有可能向上层进位，根节点图黑，平衡之后保证根节点为黑
        return true;
    }

    public int size() {
        return size;
    }

    /**
     * 获取最小值
     * @param X
     * @return
     */
    private Node<E> min(Node<E> X) {
        while (X.left !=NIL){
            X = X.left;
        }
        return X;
    }

    /**
     * 判断是否包含这个元素
     * @param e
     * @return
     */
    public boolean contain(E e) {
        if (e == null){
            return false;
        }
        Node<E> X = ROOT.right;
        while (X != NIL){
            int check = cmp.compare(e, X.e);
            if (check > 0){
                X = X.right;
            } else if (check < 0){
                X = X.left;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * delete
     *
     * @param e
     * @return
     */
    public boolean remove(E e) {
        ROOT.right.color = RED; // 删除时，根先涂红，1.防止继续向上回溯  2.只有根节点时也方便删除 season: 这里为什么这样子，我也不清楚，感觉有道理的样子
        Node<E> X = ROOT.right; // 当前查找的节点

        // 查找元素的位置 season:感觉这里可以提取公共的方法
        while (X != NIL) {
            int r = cmp.compare(e, X.e); // 比对大小，找到位置
            if (r > 0) {
                X = X.right;
            } else if (r < 0) {
                X = X.left;
            } else {
                break;
            }
        }
        if (X == NIL) { // 没有找到需要删除的节点，结束删除操作，退出
            ROOT.right.color = BLACK;
            return false;
        }
        // 此时已经查找到要被删除的节点

        // 16:57
        if (X.left != NIL && X.right != NIL) {
            Node<E> tmp = min(X.right);
            X.e = tmp.e;
            X = tmp;
        }

        Node<E> P;
        Node<E> B;

        P = X.parent;
        if (X.right != NIL) {
            if (X == P.left) {
                P.left = X.right;
            } else {
                P.right = X.right;
            }
            X.right.parent = P;
            X.color = BLACK;
            ROOT.right.color = BLACK;
            return true;
        } else if (X.left != NIL) {
            if (X == P.left) {
                P.left = X.left;
            } else {
                P.right = X.left;
            }
            X.left.parent = P;
            X.color = BLACK;
            ROOT.right.color = BLACK;
            return true;
        } else {
            if (X == P.left) {
                P.left = NIL;
            } else {
                P.right = NIL;
            }

            if (X.isRead()) {
                ROOT.right.color = BLACK;
                return true;
            } else {
                X = NIL;
            }
        }

        //要删除的是叶子节点
        //四中情况调整
        while (true) {
            if (X == P.left) {
                B = P.right;
            } else {
                B = P.left;
            }

            if (!B.isRead()) {//黑兄
                Node<E> BL = B.left;//左侄子
                Node<E> BR = B.right;//右侄子
                if (B.left.isRead() || B.right.isRead()) {//红侄
                    if (X == P.left) {
                        if (BR.isRead()) {
                            antiClockwiseRotate(P);
                            BR.color = BLACK;
                            B.color = P.color;
                            P.color = BLACK;
                        } else {
                            clockwiseRotate(B);
                            antiClockwiseRotate(P);
                            BL.color = P.color;
                            P.color = BLACK;
                        }
                    } else {
                        if (BL.isRead()) {
                            clockwiseRotate(P);
                            BL.color = BLACK;
                            B.color = P.color;
                            P.color = BLACK;
                        } else {
                            antiClockwiseRotate(B);
                            clockwiseRotate(P);
                            BR.color = P.color;
                            P.color = BLACK;
                        }
                    }
                    break;//不需要继续向上回溯
                } else {
                    if (P.isRead()) {//黑侄红父
                        P.color = BLACK;
                        B.color = RED;
                        break;//不需要继续向上回溯
                    } else {//黑侄黑父,继续向上回溯
                        B.color = RED;
                        X = P;
                        P = X.parent;
                    }
                }
            } else {//红兄，变换一下红黑树的形状，继续判断
                if (B == P.right) {
                    antiClockwiseRotate(P);
                } else {
                    clockwiseRotate(P);
                }
                B.color = BLACK;
                P.color = RED;
                //X节点的P节点没有发生变化，但兄弟节点发生变化
            }
        }
        size--; //一定可以删除一个节点
        ROOT.right.color = BLACK;
        return true;
    }

    /**
     * delete
     *
     * @param e
     * @return
     */
    public boolean delete(E e) {
        Node<E> X = ROOT.right;
        X.color = RED; //删除时，根先涂红，1.防止继续向上回溯  2.只有根节点时也方便删除
        Node<E> P;
        Node<E> B;

        while (X != NIL) {
            int r = cmp.compare(e, X.e);
            if (r > 0) {
                X = X.right;
            } else if (r < 0) {
                X = X.left;
            } else {
                break;
            }
        }

        if (X == NIL) {//没有找到需要删除的节点
            ROOT.right.color = BLACK;
            return false;
        }

        size--;//一定可以删除一个节点
        if (X.left != NIL && X.right != NIL) {
            Node<E> tmp = min(X.right);
            X.e = tmp.e;
            X = tmp;
        }

        P = X.parent;
        if (X.right != NIL) {
            if (X == P.left) {
                P.left = X.right;
            } else {
                P.right = X.right;
            }
            X.right.parent = P;
            X.color = BLACK;
            ROOT.right.color = BLACK;
            return true;
        } else if (X.left != NIL) {
            if (X == P.left) {
                P.left = X.left;
            } else {
                P.right = X.left;
            }
            X.left.parent = P;
            X.color = BLACK;
            ROOT.right.color = BLACK;
            return true;
        } else {
            if (X == P.left) {
                P.left = NIL;
            } else {
                P.right = NIL;
            }

            if (X.isRead()) {
                ROOT.right.color = BLACK;
                return true;
            } else {
                X = NIL;
            }
        }

        //要删除的是叶子节点
        //四中情况调整
        while (true) {
            if (X == P.left) {
                B = P.right;
            } else {
                B = P.left;
            }

            if (!B.isRead()) {//黑兄
                Node<E> BL = B.left;//左侄子
                Node<E> BR = B.right;//右侄子
                if (B.left.isRead() || B.right.isRead()) {//红侄
                    if (X == P.left) {
                        if (BR.isRead()) {
                            antiClockwiseRotate(P);
                            BR.color = BLACK;
                            B.color = P.color;
                            P.color = BLACK;
                        } else {
                            clockwiseRotate(B);
                            antiClockwiseRotate(P);
                            BL.color = P.color;
                            P.color = BLACK;
                        }
                    } else {
                        if (BL.isRead()) {
                            clockwiseRotate(P);
                            BL.color = BLACK;
                            B.color = P.color;
                            P.color = BLACK;
                        } else {
                            antiClockwiseRotate(B);
                            clockwiseRotate(P);
                            BR.color = P.color;
                            P.color = BLACK;
                        }
                    }
                    break;//不需要继续向上回溯
                } else {
                    if (P.isRead()) {//黑侄红父
                        P.color = BLACK;
                        B.color = RED;
                        break;//不需要继续向上回溯
                    } else {//黑侄黑父,继续向上回溯
                        B.color = RED;
                        X = P;
                        P = X.parent;
                    }
                }
            } else {//红兄，变换一下红黑树的形状，继续判断
                if (B == P.right) {
                    antiClockwiseRotate(P);
                } else {
                    clockwiseRotate(P);
                }
                B.color = BLACK;
                P.color = RED;
                //X节点的P节点没有发生变化，但兄弟节点发生变化
            }
        }
        ROOT.right.color = BLACK;
        return true;
    }

    public void preorderTraverse() {
        preorderTraverse0(ROOT.right);
    }

    private void preorderTraverse0(Node<E> X) {
        if (X != NIL) {
            System.out.print(X.e + "    " + (X.isRead() ? "RED  " : "BLACK") + "   :");
            if (X.left != NIL) {
                System.out.print(X.left.e + "   ");
            } else {
                System.out.print("NIL  ");
            }

            if (X.right != NIL) {
                System.out.print(X.right.e + "   ");
            } else {
                System.out.print("NIL  ");
            }
            System.out.println();
            preorderTraverse0(X.left);
            preorderTraverse0(X.right);
        }
    }


    /**
     * 中序遍历
     * 左 -> 中 -> 右
     *
     * @param X
     */
    private void inOrderTraverse(Node<E> X) {
        List<Node<E>> list = new ArrayList<>();
        inOrderTraverse0(list, X);
        list.stream().map(eNode -> {
            return eNode.e;
        }).collect(Collectors.toList()).forEach(System.out::println);
    }

    /**
     * 中序遍历
     * 左 -> 中 -> 右
     *
     * @param X
     */
    private void inOrderTraverse0(List<Node<E>> list, Node<E> X) {
        if (X != NIL) {
            inOrderTraverse0(list, X.left);
            list.add(X);
            inOrderTraverse0(list, X.right);
        }
    }


    private static class Node<E> {
        E e;
        boolean color;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        public Node(E e, boolean color, Node<E> left, Node<E> right, Node<E> parent) {
            this.e = e;
            this.color = color;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public boolean isRead() {
            return color;
        }
    }

    // 如果调用了不带参数的构造函数，则使用该内部类作为比较器，
    // 但此时泛型E需要继承Comparable接口,否则运行时会抛出异常
    private static class Cmp<T> implements Comparator<T> {
        @SuppressWarnings({"unchecked", "rawtypes"})
        @Override
        public int compare(T e1, T e2) {
            return ((Comparable) e1).compareTo(e2);
        }

    }
}

