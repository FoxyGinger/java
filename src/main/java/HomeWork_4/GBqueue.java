package HomeWork_4;

import java.util.LinkedList;

public class GBqueue {
    private LinkedList<String> linkedList;

    public GBqueue() {
        linkedList = new LinkedList<String>();
    }

    public void enqueue(String value) {
        linkedList.addFirst(value);
    }

    public String dequeue() {
        return linkedList.pollFirst();
    }

    public String first() {
        return linkedList.getFirst();
    }
}
