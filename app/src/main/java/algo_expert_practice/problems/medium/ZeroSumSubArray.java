package algo_expert_practice.problems.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * ZeroSumSubArray
 */
public class ZeroSumSubArray {

    public boolean zeroSumSubarray(int[] nums) {
        if (nums == null || nums.length <= 0)
            return false;
        if (nums.length == 1 && nums[0] == 0)
            return true;
        Set<Integer> set = new HashSet<>();
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        set.add(sum[0]);
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
            if (sum[i] == 0 || set.contains(sum[i]))
                return true;
            set.add(sum[i]);
        }

        return false;
    }
}
