package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.LongestPeak;

/**
 * LongestPeakTest
 */
class LongestPeakTest {

    @Test
    void testLongestPeak() {
        assertEquals(6, LongestPeak.longestPeak(new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
        assertEquals(3, LongestPeak.longestPeak(new int[] {5, 4, 3, 2, 1, 2, 1}));
    }
}
