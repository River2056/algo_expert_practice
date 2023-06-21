package algo_expert_practice.problems.medium;

import java.util.Arrays;
import java.util.List;

public class MoveElementToTheEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0, j = array.size() - 1;
        while (i < j) {
            while (i < j && array.get(j) == toMove) j--;
            if (array.get(i) == toMove) {
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                j--;
            }
            i++;
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.printf("1. %s\n", moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2));
        System.out.printf("2. %s\n", moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2));
        System.out.printf("3. %s\n", moveElementToEnd(Arrays.asList(3, 3, 3, 3, 3), 3));
        System.out.printf("4. %s\n", moveElementToEnd(Arrays.asList(5, 1, 2, 5, 5, 3, 4, 6, 7, 5, 8, 9, 10, 11, 5, 5, 12), 5));
        System.out.printf("5. %s\n", moveElementToEnd(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 5, 5, 5, 5, 5, 5), 5));
    }
}
