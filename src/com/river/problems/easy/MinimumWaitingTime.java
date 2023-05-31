package com.river.problems.easy;

import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int[] dp = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += queries[j];
            }
        }

        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum += dp[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MinimumWaitingTime m = new MinimumWaitingTime();
        System.out.printf("1. %s\n", m.minimumWaitingTime(new int[] {3, 2, 1, 2, 6}));
    }
}
