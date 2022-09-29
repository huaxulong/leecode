package org.huaxu.leetcode.sort;

/**
 * @Author DongxuHua
 * @Date: 2022/9/29 3:16 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.sort
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param arr
     * @return
     */
    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 1) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            // 下标
            int minSub = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minSub]) {
                    minSub = j;
                }
            }
            exchange(arr, i, minSub);
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
        int[] arr = new int[]{3, 6, 7, 1, 2, 4, 8, 5};

        SelectSort selectSort = new SelectSort();
        int[] sort = selectSort.sort(arr);

        printArray(sort);

    }

    public static void printArray(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

}
