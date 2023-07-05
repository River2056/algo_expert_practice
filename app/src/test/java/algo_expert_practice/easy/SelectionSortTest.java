package algo_expert_practice.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.easy.SelectionSort;

/**
 * SelectionSortTest
 */
class SelectionSortTest {

    @Test
    void testSelectionSort() {
        assertArrayEquals(new int[] {2, 3, 5, 5, 6, 8, 9}, SelectionSort.selectionSort(new int[] {8, 5, 2, 9, 5, 6, 3}));
    }
}
