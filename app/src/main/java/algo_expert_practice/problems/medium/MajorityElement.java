package algo_expert_practice.problems.medium;

/**
 * MajorityElement
 */
public class MajorityElement {

    public int majorityElement(int[] array) {
        int candidate = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (candidate == array[i])
                count++;
            else
                count--;

            if (count == 0) {
                candidate = array[i];
                count = 1;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == candidate)
                sum++;
        }

        return sum > array.length / 2 ? candidate : -1;
    }

    /**
     *  this solution assumes there will always be a majority element
     *  think in binary:
     *  suppose your answer is a 32 bit integer
     *  0000 0000 0000 0000 0000 0000 0000 0000
     *  loop through the given array, check each number's binary representation
     *  use AND operator to check if that position is a 1
     *  e.g. ....0001 & 0001 == 0001
     *  this means position 0 is a 1
     *  each time AND operator returns non 0, increment count
     *  if count is greater than half the array, that means this bit is part
     *  of the majority elemtent
     *  in that case, set this bit to the initial majority variable
     *  using OR operator
     *  run this 32 times for each number until yuo found all majority bits
     * */
    public int majorityElementBitwise(int[] array) {
        int majority = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            int setBit = 1 << i;
            for (int j = 0; j < array.length; j++) {
                if ((array[j] & setBit) != 0)
                    count++;
            }
            if (count > array.length / 2)
                majority |= setBit;
        }

        return majority;
    }
}
