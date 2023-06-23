package algo_expert_practice.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length) {
            int j = i;
            while (j < intervals.length - 1 && intervals[i][1] >= intervals[j + 1][0]) {
                intervals[i][1] = Math.max(intervals[i][1], intervals[j + 1][1]);
                j++;
            }
            result.add(intervals[i]);
            i = ++j;
        }
        return result.toArray(int[][]::new);
    }

    public int[][] mergeOverlappingIntervalsAttempt2(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length) {
            if (result.isEmpty()) {
                result.add(intervals[i]);
            } else {
                int[] current = intervals[i];
                int[] last = result.get(result.size() - 1);
                if (last[1] >= current[0]) {
                    last[1] = Math.max(last[1], current[1]);
                } else {
                    result.add(intervals[i]);
                }
            }
            i++;
        }
        return result.toArray(int[][]::new);
    }

    public static void main(String[] args) {
        MergeOverlappingIntervals m = new MergeOverlappingIntervals();
        int[][] result = m.mergeOverlappingIntervalsAttempt2(new int[][] {
            {1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}
        });
        Arrays.stream(result).forEach(arr -> System.out.println(Arrays.toString(arr)));
        System.out.println();

        int[][] result2 = m.mergeOverlappingIntervalsAttempt2(new int[][] {
            {2, 3},
            {4, 5},
            {6, 7},
            {8, 9},
            {1, 10}
        });
        Arrays.stream(result2).forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
}
