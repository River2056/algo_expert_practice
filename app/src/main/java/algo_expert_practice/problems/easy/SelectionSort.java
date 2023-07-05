package algo_expert_practice.problems.easy;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
