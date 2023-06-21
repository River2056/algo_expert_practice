package algo_expert_practice.problems.easy;

public class RemoveDuplictesFromLinkedList {

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        if (linkedList == null)
            return linkedList;
        LinkedList previous = null;
        LinkedList current = linkedList;
        while (current != null) {
            int currVal = current.value;
            LinkedList nextNode = current.next;
            if (previous != null && previous.value == currVal)
                previous.next = nextNode;
            else if (previous == null || (previous != null && previous.value != currVal))
                previous = current;

            current = nextNode;
        }

        return linkedList;
    }
}

class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }
}
