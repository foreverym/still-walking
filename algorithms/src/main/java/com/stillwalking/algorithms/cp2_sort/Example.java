package com.stillwalking.algorithms.cp2_sort;

/**
 * @Description: 排序算法类的模板
 * @Author wyb
 * @Date 2023年01月02日 18:35  
 */
public class Example {

    public void sort(Comparable[] a) {

    }

    /**
     * @Description: 比较两个元素的大小
     * @Author: wyb
     * @Date: 2023/1/2 18:45
     * @param v:
     * @param w:
     * @return: boolean
     */
    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * @Description: 交换数组中两个元素
     * @Author: wyb
     * @Date: 2023/1/2 18:46
     * @param a:
     * @param i:
     * @param j:
     * @return: void
     */
    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * @Description: 判断数组是否有序
     * @Author: wyb
     * @Date: 2023/1/2 18:46
     * @param a:
     * @return: boolean
     */
    public boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }


}
