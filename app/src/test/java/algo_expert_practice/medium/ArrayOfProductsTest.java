package algo_expert_practice.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import algo_expert_practice.problems.medium.ArrayOfProducts;

/**
 * ArrayOfProductsTest
 */
class ArrayOfProductsTest {

    @Test
    void testArrayOfProducts() {
        ArrayOfProducts a = new ArrayOfProducts();
        assertArrayEquals(new int[] {8, 40, 10, 20}, a.arrayOfProducts(new int[] {5, 1, 4, 2}));
    }

    @Test
    void testArrayOfProductsOptimized() {
        ArrayOfProducts a = new ArrayOfProducts();
        assertArrayEquals(new int[] {8, 40, 10, 20}, a.arrayOfProductsOptimized(new int[] {5, 1, 4, 2}));
    }
}
