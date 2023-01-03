package com.stillwalking.algorithms.cp2_sort;

/**
 * @Description: 希尔排序。固定设置分为三段。使任意间隔h的元素都是有序的
 * @Author wyb
 * @Date 2023年01月03日 23:41  
 */
public class Shell extends Example {

    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j -h]) ; j-=h) {
                    exch(a, j, j - h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 2, 5, 9, 3, 1, 89};
        Shell shell = new Shell();
        shell.sort(array);
        shell.show(array);
    }
}
