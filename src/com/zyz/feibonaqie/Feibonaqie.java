package com.zyz.feibonaqie;

public class Feibonaqie {
    public static void main(String[] args) {
        System.out.println(fei(8));
    }

    private static int fei(int N) {
        if (N < 0) {
            return -1;
        }
        if (N == 1 || N == 2) {
            return 1;
        }

        return fei(N - 1) + fei(N - 2);
    }
}
