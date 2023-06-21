package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.ThreeNumberSum;

/**
 * ThreeNumberSumTest
 */
class ThreeNumberSumTest {

    @Test
    void testThreeNumberSum() {
        List<Integer[]> result = ThreeNumberSum.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        List<Integer[]> expected = List.of(new Integer[] {-8, 2, 6}, new Integer[] {-8, 3, 5}, new Integer[] {-6, 1, 5});
        assertArrayEquals(expected.toArray(), result.toArray());
    }
}
