package com.river.problems.easy;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotos {

    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        int loopLength = redShirtHeights.size() > blueShirtHeights.size() ? redShirtHeights.size() : blueShirtHeights.size();
        int i = 0;

        int previousCompare = -1;
        int compare = -1;
        while (i < loopLength) {
            if (redShirtHeights.get(i) < blueShirtHeights.get(i))
                compare = 0;
            else if (redShirtHeights.get(i) > blueShirtHeights.get(i))
                compare = 1;
            else
                compare = 2;

            if (previousCompare == -1)
                previousCompare = compare;

            if (compare == 2 || (previousCompare != -1 && previousCompare != compare))
                return false;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
