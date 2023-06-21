package algo_expert_practice.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {
    // first number is indexed 1, so getNthFib(1) == 0
    public static int getNthFib(int n) {
        if (n <= 1)
            return 0;
        int i = 0, j = 1;
        for (int k = 0; k < n - 2; k++) {
            int l = i + j;
            i = j;
            j = l;
        }
        return j;
    }

    public static int getNthFibMemoize(int n) {
        return processFib(n, new HashMap<>());
    }

    private static int processFib(int n, Map<Integer, Integer> cache) {
        if (n <= 1)
            return 0;
        if (n == 2)
            return 1;
        if (!cache.containsKey(n)) {
            int val = processFib(n - 2, cache) + processFib(n - 1, cache);
            cache.put(n, val);
        }
        return cache.get(n);
    }

    public static void main(String[] args) {
        System.out.printf("1. %s\n", getNthFib(1));
    }
}
