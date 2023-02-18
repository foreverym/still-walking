package com.stillwalking.algorithms.cp3_tree;

/**
 * @Description: 树节点
 * @Author wyb
 * @Date 2023年02月06日 0:07  
 */
public class Node {

    private Comparable key;
    private Object value;
    private Node left;
    private Node right;
    private int N;

    public Node(Comparable key, Object value, int N) {
        this.key = key;
        this.value = value;
        this.N = N;
    }

    public Comparable getKey() {
        return key;
    }

    public void setKey(Comparable key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

}
