package algo_expert_practice.problems.easy;

import java.util.Arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        int j = 0, k = array.length - 1, l = array.length - 1;
        int[] output = new int[array.length];
        while (j <= k) {
            int currentMax = Math.max(Math.abs(array[j]), Math.abs(array[k]));
            if (currentMax == Math.abs(array[j]))
                j++;
            else
                k--;
            output[l--] = currentMax * currentMax;
        }
        return output;
    }

    public static void main(String[] args) {
        SortedSquaredArray s = new SortedSquaredArray();
        System.out.printf("1. %s\n", Arrays.toString(s.sortedSquaredArray(new int[] {1, 2, 3, 5, 6, 8, 9}))); // 1, 4, 9, 25, 36, 64, 81
    }
}
