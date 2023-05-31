import HomeWork_4.Task1;
import HomeWork_4.GBqueue;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        LinkedList<Integer> linkedList = task1.createIntLinkedList(10);
        System.out.println(linkedList);
        LinkedList<Integer> reversedLinkedList = task1.reverseLinkedList(linkedList);
        System.out.printf("reversed LinkedList:\n%s\n", reversedLinkedList);
        LinkedList<Integer> reversedLinkedList2 = task1.reverseLinkedList2(linkedList);
        System.out.printf("reversed LinkedList 2:\n%s\n", reversedLinkedList2);
        GBqueue gBqueue = new GBqueue();
        gBqueue.enqueue("first");
        gBqueue.enqueue("second");
        gBqueue.enqueue("third");
        System.out.println(gBqueue.first());
        System.out.println(gBqueue.dequeue());
        System.out.println(gBqueue.first());
    }
}