package org.huaxu.leetcode.sort;

import org.huaxu.util.PrintArrayUtil;

/**
 * @Author DongxuHua
 * @Date: 2022/9/29 4:00 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.sort
 */
public class InsertSort {

    /**
     * 说明： 插入排序的 时间复杂度是 O(N^2)  空间复杂度: O(1)
     * 过程： 假设前面 n-1(其中 n>=2)个数已经是排好顺序的，现将第 n 个数插到前面已经排好的序列中，然后找到合适自己的位置，使得插入第n个数的这个序列也是排好顺序的。
     */
    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j + 1] >= arr[j]) {
                    break;
                } else {
                    exchange(arr, j + 1, j);
                }
            }
        }
        return arr;
    }

    /**
     * 交换位置
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
        int[] arr = new int[]{7, 6, 9, 3, 1, 5, 2, 4};

        InsertSort insertSort = new InsertSort();
        int[] sort = insertSort.sort(arr);

        PrintArrayUtil.printArray(sort);
    }

}
