package org.huaxu.leetcode.sort;

import org.huaxu.util.PrintArrayUtil;

/**
 * @Author DongxuHua
 * @Date: 2022/9/29 4:29 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.sort
 */
public class HillSort {

    /**
     * 希尔排序 是插入排序的一种， 它是针对直接插入排序的算法的改进
     * 我们选择增量 gap=length/2 , 缩小增量 gap=gap/2 的方式。
     *
     * @param arr
     * @return
     */

    public static void sort(Comparable[] arr) {
        int j;
        for (int gap = arr.length / 2; gap >  0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                Comparable tmp = arr[i];
                for (j = i; j >= gap && tmp.compareTo(arr[j - gap]) < 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
    }

    /**
     * 交换位置--
     *
     * @param arr
     * @param source
     * @param target
     */
    public void exchange(int arr[], int source, int target) {
        int temp = arr[target];
        arr[target] = arr[source];
        arr[source] = temp;
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[]{7, 6, 9, 3, 1, 5, 2, 4};

        sort(arr);

        PrintArrayUtil.printArray(arr);
    }

}
