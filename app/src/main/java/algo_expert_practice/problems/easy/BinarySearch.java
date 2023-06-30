package algo_expert_practice.problems.easy;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length);
    }

    private static int binarySearch(int[] array, int target, int low, int high) {
        while (low < high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] == target)
                return mid;
            else if (array[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
