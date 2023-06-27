package com.zyz.order;

import java.util.Arrays;

/**
 * 冒泡算法
 */
public class Buddle {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 6, 9, 1, 2, 4, 7, 9};

        sort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }
    }

}
