package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.MissingNumbers;

/**
 * MissingNumbersTest
 */
class MissingNumbersTest {

    @Test
    void testMissingNumbers() {
        MissingNumbers missing = new MissingNumbers();
        assertArrayEquals(new int[] {2, 5}, missing.missingNumbers(new int[] {1, 4, 3}));
    }

    @Test
    void testMissingNumbersSolution() {
        MissingNumbers missing = new MissingNumbers();
        assertArrayEquals(new int[] {2, 5}, missing.missingNumbersSolution(new int[] {1, 4, 3}));
    }

    @Test
    void testMissingNumbersSolutionBitwise() {
        MissingNumbers missing = new MissingNumbers();
        assertArrayEquals(new int[] {2, 5}, missing.missingNumbersSolutionBitwise(new int[] {1, 4, 3}));
    }
}
