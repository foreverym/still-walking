package com.stillwalking.algorithms.cp2_sort;

/**
 * @Description: 插入排序
 * 索引左边的元素都是有序的，平均情况下需要N^/4次比较以及N^/4次交换。最坏需要N^/2次比较以及N^/2次交换
 * 特点：适用于大致已经有序的数组
 *
 * @Author wyb
 * @Date 2023年01月03日 0:52  
 */
public class Insertion extends Example {

    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 2, 5, 9, 3, 1, 89};
        Insertion insertion = new Insertion();
        insertion.sort(array);
        insertion.show(array);
    }

}
