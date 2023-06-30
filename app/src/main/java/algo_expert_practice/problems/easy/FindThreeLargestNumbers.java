package algo_expert_practice.problems.easy;

/**
 * FindThreeLargestNumbers
 */
public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[3];
        for (int i = result.length - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int j = array.length - 1; j >= 0; j--) {
                if (array[j] != Integer.MIN_VALUE && array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            array[index] = Integer.MIN_VALUE;
            result[i] = max;
        }
        return result;
    }

    public static int[] findThreeLargestNumbersAttempt2(int[] array) {
        int[] result = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int i = 0; i < array.length; i++) {
            for (int j = result.length - 1; j >= 0; j--) {
                if (array[i] >= result[j]) {
                    for (int k = 0; k < j; k++) {
                        result[k] = result[k + 1];
                    }
                    result[j] = array[i];
                    break;
                }
            }
        }

        return result;
    }
}
