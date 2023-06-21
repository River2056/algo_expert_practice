package algo_expert_practice.problems.medium;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        if (array.length < 3)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length - 1; i++) {
            int sum = 0;
            int l = 0;
            int r = 0;
            int left = i - 1;
            int right = i + 1;

            while (left >= 0) {
                if (array[left] >= array[left + 1])
                    break;
                l++;
                left--;
            }

            while (l > 0 && right < array.length) {
                if (array[right] >= array[right - 1])
                    break;
                r++;
                right++;
            }

            if (l != 0 && r != 0)
                sum = l + r;

            max = Math.max(max, sum != 0 ? sum + 1 : 0);
        }

        return max;
    }
}
