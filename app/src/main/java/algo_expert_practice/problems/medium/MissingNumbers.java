package algo_expert_practice.problems.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * MissingNumbers
 */
public class MissingNumbers {

    public int[] missingNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        
        int j = 0;
        for (int i = 1; i <= nums.length + 2; i++) {
            if (!set.contains(i)) {
                result[j] = i;
                j++;
            }
        }

        return result;
    }

    public int[] missingNumbersSolution(int[] nums) {
        int expected = 0;
        int current = 0;
        for (int i = 1; i <= nums.length + 2; i++) {
            expected += i;
            if (i <= nums.length) current += nums[i - 1];
        }

        int average = (expected - current) / 2;
        int expectedSmaller = 0;
        int expectedLarger = 0;
        int currentSmaller = 0;
        int currentLarger = 0;
        for (int i = 1; i <= nums.length + 2; i++) {
            if (i <= average)
                expectedSmaller += i;
            else
                expectedLarger += i;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= average)
                currentSmaller += nums[i];
            else
                currentLarger += nums[i];
        }

        return new int[] {expectedSmaller - currentSmaller, expectedLarger - currentLarger};
    }

    public int[] missingNumbersSolutionBitwise(int[] nums) {
        int solutionXor = 0;
        for (int i = 1; i <= nums.length + 2; i++) {
            solutionXor ^= i;

            if (i <= nums.length) solutionXor ^= nums[i - 1];
        }

        int[] result = new int[2];
        int setBit = solutionXor & -solutionXor;

        for (int i = 1; i <= nums.length + 2; i++) {
            if ((i & setBit) == 0)
                result[0] ^= i;
            else
                result[1] ^= i;

            if (i <= nums.length) {
                if ((nums[i - 1] & setBit) == 0)
                    result[0] ^= nums[i - 1];
                else
                    result[1] ^= nums[i - 1];
            }
        }
        Arrays.sort(result);
        return result;
    }
}
