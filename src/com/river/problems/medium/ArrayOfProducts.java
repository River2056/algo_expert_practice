package com.river.problems.medium;

public class ArrayOfProducts {

    public int[] arrayOfProducts(int[] array) {
        int product = 1;
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            left[i] = product;
            product *= array[i];
        }

        product = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            right[i] = product;
            product *= array[i];
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = left[i] * right[i];

        return result;
    }

    public int[] arrayOfProductsOptimized(int[] array) {
        int[] result = new int[array.length];
        int product = 1;

        for (int i = 0; i < result.length; i++) {
            result[i] = product;
            product *= array[i];
        }

        product = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] *= product;
            product *= array[i];
        }

        return result;
    }
}
