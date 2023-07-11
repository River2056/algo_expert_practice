package algo_expert_practice.problems.medium;

import java.util.Arrays;

/**
 * SweetAndSavory
 */
public class SweetAndSavory {

    public int[] sweetAndSavory(int[] dishes, int target) {
        Arrays.sort(dishes);
        int left = 0;
        int right = dishes.length - 1;
        int[] result = new int[] {0, 0};
        System.out.println(Arrays.toString(dishes));
        
        int max = Integer.MIN_VALUE;
        while (left < right && dishes[left] < 0 && dishes[right] > 0) {
            int combine = dishes[left] + dishes[right];
            if (combine == target) {
                return new int[] {dishes[left], dishes[right]};
            } else if (combine > target) {
                right--;
            } else {
                if (combine > max) {
                    max = combine;
                    result[0] = dishes[left];
                    result[1] = dishes[right];
                }
                left++;
            }
        }

        // System.out.println(Arrays.toString(result));
        return result;
    }
}
