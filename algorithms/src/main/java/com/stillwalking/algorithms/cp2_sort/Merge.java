package com.stillwalking.algorithms.cp2_sort;

/**
 * @Description: 归并排序
 * @Author wyb
 * @Date 2023年01月06日 0:03  
 */
public class Merge extends Example {

    Comparable[] aux = null;

    public  void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        sort(a, 0, N - 1);

    }

    public  void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo , mid);
        sort(a, mid + 1 , hi);
        merge(a, lo, mid, hi);
    }

    public  void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 2, 5, 9, 3, 1, 89};
        Merge merge = new Merge();
        merge.sort(array);
        merge.show(array);
    }

}
