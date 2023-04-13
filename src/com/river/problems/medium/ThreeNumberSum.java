package com.river.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i <= array.length - 3; i++) {
            int j = i + 1, k = array.length - 1;
            while (j < k) {
                int sum = array[i] + array[j] + array[k];
                if (sum > targetSum) k--;
                else if (sum < targetSum) j++;
                else {
                    result.add(new Integer[] {array[i], array[j], array[k]});
                    k--;
                    j++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer[]> result = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        System.out.println("1.");
        result.forEach(arr -> System.out.println(Arrays.toString(arr))); // [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
    }
}
