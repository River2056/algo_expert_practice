package algo_expert_practice.problems.easy;

public class MiddleNode {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
          this.value = value;
          this.next = null;
        }
    }

    public LinkedList middleNode(LinkedList linkedList) {
        int length = 0;
        LinkedList head = linkedList;
        while (head != null) {
            head = head.next;
            length++;
        }

        int middle = length / 2;
        int counter = 0;
        head = linkedList;
        while (counter != middle) {
            head = head.next;
            counter++;
        }

        return head;
    }

    public LinkedList middleNodeTwoPointers(LinkedList linkedList) {
        LinkedList slow = linkedList;
        LinkedList fast = linkedList;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}
