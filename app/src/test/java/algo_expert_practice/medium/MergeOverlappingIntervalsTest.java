package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.MergeOverlappingIntervals;

/**
 * MergeOverlappingIntervalsTest
 */
class MergeOverlappingIntervalsTest {

    @Test
    void testMergeOverlappingIntervals() {
        MergeOverlappingIntervals m = new MergeOverlappingIntervals();
        assertArrayEquals(new int[][] {{1, 2}, {3, 8}, {9, 10}}, m.mergeOverlappingIntervals(new int[][] {
            {1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}
        }));

        assertArrayEquals(new int[][] {{1, 10}}, m.mergeOverlappingIntervals(new int[][] {
            {2, 3},
            {4, 5},
            {6, 7},
            {8, 9},
            {1, 10}
        }));
    }

    @Test
    void testMergeOverlappingIntervalsAtttempt2() {
        MergeOverlappingIntervals m = new MergeOverlappingIntervals();
        assertArrayEquals(new int[][] {{1, 2}, {3, 8}, {9, 10}}, m.mergeOverlappingIntervalsAttempt2(new int[][] {
            {1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}
        }));

        assertArrayEquals(new int[][] {{1, 10}}, m.mergeOverlappingIntervalsAttempt2(new int[][] {
            {2, 3},
            {4, 5},
            {6, 7},
            {8, 9},
            {1, 10}
        }));
    }
}
