package HomeWork_4;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public LinkedList<Integer> createIntLinkedList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        return linkedList;
    }

    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList)
    {
        LinkedList<Integer> reverseLinkedList = new LinkedList<Integer>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reverseLinkedList.add(linkedList.get(i));
        }

        return reverseLinkedList;
    }

    public LinkedList<Integer> reverseLinkedList2(LinkedList<Integer> linkedList)
    {
        LinkedList<Integer> reverseLinkedList = new LinkedList<Integer>(linkedList);
        Collections.reverse(reverseLinkedList);

        return reverseLinkedList;
    }
}
