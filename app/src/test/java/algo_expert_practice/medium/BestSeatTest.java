package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.BestSeat;

/**
 * BestSeatTest
 */
class BestSeatTest {

    @Test
    void testBestSeat() {
        BestSeat bs = new BestSeat();
        assertEquals(4, bs.bestSeat(new int[] {1, 0, 1, 0, 0, 0, 1}));
        assertEquals(1, bs.bestSeat(new int[] {1, 0, 0, 1}));
        assertEquals(-1, bs.bestSeat(new int[] {1, 1, 1}));
        assertEquals(-1, bs.bestSeat(new int[] {1}));
    }

    @Test
    void testBestSeatSolution() {
        BestSeat bs = new BestSeat();
        assertEquals(4, bs.bestSeatSolution(new int[] {1, 0, 1, 0, 0, 0, 1}));
        assertEquals(1, bs.bestSeatSolution(new int[] {1, 0, 0, 1}));
        assertEquals(-1, bs.bestSeatSolution(new int[] {1, 1, 1}));
        assertEquals(-1, bs.bestSeatSolution(new int[] {1}));
    }
}
