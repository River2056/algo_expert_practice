package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.ZeroSumSubArray;

/**
 * ZeroSumSubArrayTest
 */
class ZeroSumSubArrayTest {

    @Test
    void testZeroSumSubArray() {
        ZeroSumSubArray zs = new ZeroSumSubArray();
        assertTrue(zs.zeroSumSubarray(new int[] {-5, -5, 2, 3, -2}));
        assertTrue(zs.zeroSumSubarray(new int[] {-2, 2}));
        assertTrue(zs.zeroSumSubarray(new int[] {0}));
    }
}
