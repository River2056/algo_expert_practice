package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.easy.FindThreeLargestNumbers;

/**
 * FindThreeLargestNumbersTest
 */
class FindThreeLargestNumbersTest {

    @Test
    void testFindThreeLargestNumbers() {
        assertArrayEquals(new int[] {18, 141, 541}, 
            FindThreeLargestNumbers.findThreeLargestNumbers(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}));
    }

    @Test
    void testFindThreeLargestNumbersAttempt2() {
        assertArrayEquals(new int[] {18, 141, 541}, 
            FindThreeLargestNumbers.findThreeLargestNumbersAttempt2(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7}));
    }
}
