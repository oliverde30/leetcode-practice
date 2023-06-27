package com.zyz.tanxin;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int i = eraseOverlapIntervals(arr);
        System.out.println(i);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });


        int total = 0, prev = intervals[0][1];
        for (int i = 1; i < intervals.length; ++i) {
            if (intervals[i][0] < prev) {
                ++total;
            } else {
                prev = intervals[i][1];
            }
        }
        return total;


    }

}
