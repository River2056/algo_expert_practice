package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.easy.BinarySearch;

/**
 * BinarySearchTest
 */
class BinarySearchTest {

    @Test
    void testBinarySearch() {
        assertEquals(3, BinarySearch.binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
    }
}
