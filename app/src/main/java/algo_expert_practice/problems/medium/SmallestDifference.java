package algo_expert_practice.problems.medium;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int i = 0, j = 0;
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        while (i < arrayOne.length && j < arrayTwo.length) {
            int diff = Math.abs(arrayOne[i] - arrayTwo[j]);
            if (diff < min) {
                min = diff;
                result[0] = arrayOne[i];
                result[1] = arrayTwo[j];
            }

            if (arrayOne[i] < arrayTwo[j])
                i++;
            else
                j++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.printf("1. %s\n", Arrays.toString(smallestDifference(
            new int[] {-1, 5, 10, 20, 28, 3},
            new int[] {26, 134, 135, 15, 17}
        )));
         
    }
}
