package algo_expert_practice.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                return new int[] { array[i], map.get(array[i]) };
            }
            int diff = targetSum - array[i];
            map.put(diff, array[i]);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.printf("1. %s\n", Arrays.toString(twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10))); // [-1, 11]
    }
}
