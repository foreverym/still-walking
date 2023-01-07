package com.stillwalking.algorithms.cp2_sort;

import java.util.Random;

/**
 * @Description: 快速排序
 * @Author wyb
 * @Date 2023年01月08日 0:38  
 */
public class Quick extends Example {

    public void sort(Comparable[] a) {
        sort(a, 0, a.length  - 1);
    }

    public void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    public int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 2, 5, 9, 3, 1, 89};
        Quick quick = new Quick();
        quick.sort(array);
        quick.show(array);
    }

}
