package com.river.problems.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * FirstDuplicateValue
 */
public class FirstDuplicateValue {
    
    public int firstDuplicateValue(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (set.contains(i))
                return i;
            set.add(i);
        }
        return -1;
    }

    public int firstDuplicateValueOptimal(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int idx = Math.abs(array[i]) - 1;
            if (array[idx] < 0)
                return array[i];
            array[idx] *= -1;
        }
        return -1;
    }
}
