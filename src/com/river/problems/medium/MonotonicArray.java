package com.river.problems.medium;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        if (array != null && array.length <= 1)
            return true;

        int previous = -1;
        int current = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                current = 0;
            } else if (array[i - 1] < array[i]) {
                current = 1;
            }

            if (previous != -1 && current != previous)
                return false;

            if (previous == -1 && current != -1)
                previous = current;
        }

        return true;
    }

    public static boolean isMonotonicSolution(int[] array) {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                isNonDecreasing = false;
            if (array[i] > array[i - 1])
                isNonIncreasing = false;
        }

        return isNonIncreasing || isNonDecreasing;
    }
}
