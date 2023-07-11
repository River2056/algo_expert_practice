package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.SweetAndSavory;

/**
 * SweetAndSavoryTest
 */
class SweetAndSavoryTest {

    SweetAndSavory sweetAndSavory;

    @BeforeEach
    void setUp() {
        sweetAndSavory = new SweetAndSavory();
    }

    @Test
    void test() {
        assertArrayEquals(new int[] {-3, 7}, sweetAndSavory.sweetAndSavory(new int[] {-3, -5, 1, 7}, 8));
        assertArrayEquals(new int[] {0, 0}, sweetAndSavory.sweetAndSavory(new int[] {3, 5, 7, 2, 6, 8, 1}, 10));
        assertArrayEquals(new int[] {-25, 5}, sweetAndSavory.sweetAndSavory(new int[] {2, 5, -4, -7, 12, 100, -25}, -20));
        assertArrayEquals(new int[] {-102, 102}, sweetAndSavory.sweetAndSavory(new int[] {17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52}, 11));
    }


    @Test
    void test2() {
        assertArrayEquals(new int[] {-3, 7}, sweetAndSavory.sweetAndSavoryAttempt2(new int[] {-3, -5, 1, 7}, 8));
        assertArrayEquals(new int[] {0, 0}, sweetAndSavory.sweetAndSavoryAttempt2(new int[] {3, 5, 7, 2, 6, 8, 1}, 10));
        assertArrayEquals(new int[] {-25, 5}, sweetAndSavory.sweetAndSavoryAttempt2(new int[] {2, 5, -4, -7, 12, 100, -25}, -20));
        assertArrayEquals(new int[] {-102, 102}, sweetAndSavory.sweetAndSavoryAttempt2(new int[] {17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52}, 11));
    }
}
