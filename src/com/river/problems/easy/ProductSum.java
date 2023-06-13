package com.river.problems.easy;

import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    private static int productSumHelper(List<Object> array, int product) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer)
                sum += ((Integer) array.get(i));
            else
                sum += productSumHelper(((List<Object>) array.get(i)), product + 1);
        }
        return sum * product;
    }

    public static void main(String[] args) {
        System.out.printf("1. %s\n", productSum(Arrays.asList(5, 2, Arrays.asList(7, -1), 3, Arrays.asList(6, Arrays.asList(-13, 8), 4))));
        System.out.printf("2. %s\n", productSum(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(5)))))));
    }
}
