package algo_expert_practice.problems.medium;

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
}
