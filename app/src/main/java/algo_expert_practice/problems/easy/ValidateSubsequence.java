package algo_expert_practice.problems.easy;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int k = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(sequence.get(k))) k++;
            if (k >= sequence.size()) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.printf("1. %s\n", isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(1, 6, -1, 10))); // true
        System.out.printf("2. %s\n", isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10))); // true
    }
}
