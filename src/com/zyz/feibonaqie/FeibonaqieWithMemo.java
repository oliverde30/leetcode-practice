package com.zyz.feibonaqie;

import java.util.Vector;

public class FeibonaqieWithMemo {
    public static void main(String[] args) {
        Integer N = 5;
//        Vector<Integer> abc = new Vector<>(2*N);
//        System.out.println(solve(abc, N));
        int[] a = new int[N + N];
        System.out.println(helper(a, N));
    }

    private static int solve(Vector<Integer> memo, int N) {
        if (N == 1 || N == 2) {
            return 1;
        }

        if (memo.get(N) != 0) {
            return memo.get(N);
        }

        memo.set(N, solve(memo, N - 2) + solve(memo, N - 1));
        return memo.get(N);

    }

    static int helper(int[] memo, int n) {
        // base case
        if (n == 1 || n == 2) return 1;
        // 已经计算过
        if (memo[n] != 0) return memo[n];
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }
}
