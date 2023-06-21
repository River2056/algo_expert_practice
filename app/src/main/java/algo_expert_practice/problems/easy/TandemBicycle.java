package algo_expert_practice.problems.easy;

import java.util.Arrays;

public class TandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        if (fastest) {
            int j = 0, k = blueShirtSpeeds.length - 1;
            while (j < k) {
                int temp = blueShirtSpeeds[j];
                blueShirtSpeeds[j] = blueShirtSpeeds[k];
                blueShirtSpeeds[k] = temp;
                j++;
                k--;
            }
        }

        int sum = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++)
            sum += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);

        return sum;
    }

    public static void main(String[] args) {
        TandemBicycle t = new TandemBicycle();
        System.out.printf("1. %s\n", t.tandemBicycle(new int[] {3, 6, 7, 2, 1}, new int[] {5, 5, 3, 9, 2}, false));
    }
}
