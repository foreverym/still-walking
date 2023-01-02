package com.stillwalking.algorithms.cp2_sort;

/**
 * @Description:  选择排序
 * 首先找到数组中最小的元素，其次，将它和数组的第一个元素交换位置
 * 特点：对于长度为N的数组，选择排序大概需要N^2次比较和N次交换；
 * 运行时间和输入无关
 * 数据移动是最少的
 *
 * @Author wyb
 * @Date 2023年01月02日 23:37  
 */
public class Selection extends Example{

    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 2, 5, 9, 3, 1, 89};
        Selection selection = new Selection();
        selection.sort(array);
        selection.show(array);
    }


}
