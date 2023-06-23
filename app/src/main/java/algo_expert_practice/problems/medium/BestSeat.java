package algo_expert_practice.problems.medium;

/**
 * BestSeat
 */
public class BestSeat {

    public int bestSeat(int[] seats) {
        int left = 0;
        int right = 1;
        int index = -1;
        int maxSpace = 0;
        while (right < seats.length) {
            while (seats[right] == 0) {
                right++;
            }
            int space = (right - left) - 1;
            if (space > maxSpace) {
                maxSpace = space;
                index = (right + left) / 2;
            }
            left = right;
            right++;
        }
        return index;
    }

    public int bestSeatSolution(int[] seats) {
        int index = -1;
        int maxSpace = 0;
        int left = 0;
        
        while (left < seats.length) {
            int right = left + 1;
            while (right < seats.length && seats[right] == 0)
                right++;
            
            int space = (right - left) - 1;
            if (space > maxSpace) {
                maxSpace = space;
                index = (left + right) / 2;
            }
            left = right;
        }

        return index;
    }
}
