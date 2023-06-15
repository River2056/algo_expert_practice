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

    public static List<Integer> spiralTraverseRecursive(int[][] array) {
        List<Integer> result = new ArrayList<>();
        traverseRecursive(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }

    private static void traverseRecursive(int[][] array, int startRow, int endRow, int startColumn, int endColumn, List<Integer> result) {
        if (startRow > endRow && startColumn > endColumn)
            return;
        
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

        traverseRecursive(array, startRow + 1, endRow - 1, startColumn + 1, endColumn - 1, result);
    }

    public static void main(String[] args) {
        List<Integer> result = spiralTraverseRecursive(new int[][] {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
        });
        System.out.println(result);

        List<Integer> result2 = spiralTraverseRecursive(new int[][] {
            {1, 2, 3},
            {12, 13, 4},
            {11, 14, 5},
            {10, 15, 6},
            {9, 8, 7}
        });
        System.out.println(result2);

        List<Integer> result3 = spiralTraverseRecursive(new int[][] {
            {1, 2, 3, 4},
            {10, 11, 12, 5},
            {9, 8, 7, 6},
        });
        System.out.println(result3);
    }
}
