package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.MajorityElement;

/**
 * MajorityElementTest
 */
class MajorityElementTest {

    MajorityElement m;

    @BeforeEach
    void setUp() {
        m = new MajorityElement();
    }

    @Test
    void testMajorityElement() {
        assertEquals(2, m.majorityElement(new int[] {1, 2, 3, 2, 2, 1, 2}));
    }

    @Test
    void test2() {
        assertEquals(2, m.majorityElement(new int[] {2}));
    }

    @Test
    void test3() {
        assertEquals(1, m.majorityElement(new int[] {1, 2, 1}));
    }

    @Test
    void test4() {
        assertEquals(2, m.majorityElementBitwise(new int[] {1, 2, 3, 2, 2, 1, 2}));
    }

    @Test
    void test5() {
        assertEquals(2, m.majorityElementBitwise(new int[] {2}));
    }

    @Test
    void test6() {
        assertEquals(1, m.majorityElementBitwise(new int[] {1, 2, 1}));
    }
}
