package com.stillwalking.algorithms.cp2_sort;

import javax.sound.sampled.Mixer;

/**
 * @Description: 自底向上的归并排序
 * @Author wyb
 * @Date 2023年01月07日 0:40  
 */
public class MergeBU extends Example {

    Comparable[] aux = null;

    public void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
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
        MergeBU mergeBU = new MergeBU();
        mergeBU.sort(array);
        mergeBU.show(array);
    }
}
