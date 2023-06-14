package com.river.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startColumn = 0;
        int endColumn = array[0].length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++)
                result.add(array[startRow][i]);
            
            for (int i = startRow + 1; i <= endRow; i++)
                result.add(array[i][endColumn]);

            for (int i = endColumn - 1; i >= startColumn; i--) {
                if (startRow == endRow) break;
                result.add(array[endRow][i]);
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) break;
                result.add(array[i][startColumn]);
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = spiralTraverse(new int[][] {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
        });
        System.out.println(result);

        List<Integer> result2 = spiralTraverse(new int[][] {
            {1, 2, 3},
            {12, 13, 4},
            {11, 14, 5},
            {10, 15, 6},
            {9, 8, 7}
        });
        System.out.println(result2);

        List<Integer> result3 = spiralTraverse(new int[][] {
            {1, 2, 3, 4},
            {10, 11, 12, 5},
            {9, 8, 7, 6},
        });
        System.out.println(result3);
    }
}
