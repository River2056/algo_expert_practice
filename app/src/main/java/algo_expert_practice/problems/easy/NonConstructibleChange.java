package algo_expert_practice.problems.easy;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        if (coins == null || coins.length == 0)
            return 1;

        int currentChange = 0;
        Arrays.sort(coins);

        for (int i = 0; i < coins.length; i++) {
            if (currentChange + 1 < coins[i])
                return currentChange + 1;

            currentChange += coins[i];
        }
        
        return currentChange + 1;
    }

    public static void main(String[] args) {
        NonConstructibleChange n = new NonConstructibleChange();
        System.out.printf("1. %s\n", n.nonConstructibleChange(new int[] {5, 7, 1, 1, 2, 3, 22})); // 20
    }
}
