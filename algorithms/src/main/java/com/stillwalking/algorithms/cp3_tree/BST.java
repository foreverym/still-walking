package com.stillwalking.algorithms.cp3_tree;

/**
 * @Description: 二叉查找树
 * @Author wyb
 * @Date 2023年02月06日 0:24  
 */
public class BST {

    private Node root;

    public int size() {
        return size(root);
    }

    /**
     * @Description: 获取结点总数
     * @Author: wyb
     * @Date: 2023/2/6 0:31
     * @param node:
     * @return: int
     */
    public int size(Node node) {
        return node.getN();
    }

    public Object get(Comparable key) {
        return get(root, key);
    }


    /**
     * @Description: 查询
     * @Author: wyb
     * @Date: 2023/2/6 0:51
     * @param x:
     * @param key:
     * @return: java.lang.Object
     */
    public Object get(Node x, Comparable key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.getKey());
        if (cmp > 0) {
            return get(x.getRight(), key);
        } else if (cmp < 0) {
            return get(x.getLeft(), key);
        } else {
            return x.getValue();
        }
    }

}
