package algo_expert_practice.problems.medium;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * SweetAndSavory
 */
public class SweetAndSavory {

    public int[] sweetAndSavory(int[] dishes, int target) {
        Arrays.sort(dishes);
        int left = 0;
        int right = dishes.length - 1;
        int[] result = new int[] {0, 0};
        
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

        return result;
    }

    public int[] sweetAndSavoryAttempt2(int[] dishes, int target) {
        Integer[] sweetDishes = Arrays.stream(dishes).boxed().filter(i -> i < 0).sorted((a, b) -> b - a).toArray(Integer[]::new);
        Integer[] savoryDishes = Arrays.stream(dishes).boxed().filter(i -> i > 0).sorted().toArray(Integer[]::new);
        int i = 0;
        int j = 0;
        int[] result = new int[] {0, 0};

        int max = Integer.MAX_VALUE;
        while (i < sweetDishes.length && j < savoryDishes.length) {
            int combine = sweetDishes[i] + savoryDishes[j];
            if (combine <= target) {
                int diff = target - combine;
                if (diff < max) {
                    max = diff;
                    result[0] = sweetDishes[i];
                    result[1] = savoryDishes[j];
                }
                j++;
            } else {
                i++;
            }
        }

        return result;
    }
}
