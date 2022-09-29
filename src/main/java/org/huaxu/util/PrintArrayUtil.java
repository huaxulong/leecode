package org.huaxu.util;

/**
 * @Author DongxuHua
 * @Date: 2022/9/29 4:11 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.util
 */
public class PrintArrayUtil {

    public static void printArray(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(Integer[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

}
