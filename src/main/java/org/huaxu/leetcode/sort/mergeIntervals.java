package org.huaxu.leetcode.sort;

/**
 * @Author DongxuHua
 * @Date: 2022/9/23 9:25 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.sort
 */
public class mergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return null;
        }
        int cnt = 0;
        for (int i = intervals.length - 1; i > 0; i--) {
            if (intervals[i - 1][0] > intervals[i][1]){
                int[] temp = intervals[i];
                intervals[i] = intervals[i-1];
                intervals[i-1] = temp;
            }else if (intervals[i - 1][1] >= intervals[i][0]) {
                if (intervals[i - 1][1] < intervals[i][1]){
                    intervals[i - 1][1] = intervals[i][1];
                }
                if (intervals[i-1][0] > intervals[i][0]){
                    intervals[i-1][0] = intervals[i][0];
                }
                intervals[i] = null;
                cnt++;
            }
        }

        int[][] newIntervals = new int[intervals.length - cnt][intervals[0].length];

        for (int i = 0, j = 0; i < intervals.length; i++) {
            if (intervals[i] != null) {
                newIntervals[j] = intervals[i];
                j++;
            }
        }

        return newIntervals;
    }

    public static void main(String[] args) {
        //int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        //int[][] intervals = new int[][]{{1, 4}, {0, 0}};

        int[][] intervals = new int[][]{{1,4},{0,2},{3,5}};

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals[i].length; j++) {
                System.out.print(intervals[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] merge = merge(intervals);

        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge[i].length; j++) {
                System.out.print(merge[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
