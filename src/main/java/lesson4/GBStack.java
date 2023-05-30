package lesson4;

/**
 * Реализовать стэк с помощью массива. int
 * Нужно реализовать методы:
 * size(), empty(), push(), peek(), pop().
 */
public class GBStack {
    private int[] array;
    private int top;
    private int capacity;

    public GBStack() {
        int value = 3;
        this.array = new int[value];
        capacity = value;
        top = -1;
    }

    private void addCapacity() {
        int[] copy = new int[array.length + array.length / 2];
        System.arraycopy(array, 0, copy, 0, array.length);
        array = copy;
        capacity = array.length;
    }

//    public int getCapacity() {
//        return capacity;
//    }

//    stack.add(1).add(2).add(3);

    public GBStack push(int arg) {
        if (isFull()) {
            addCapacity();
        }
//        top += 1;
//        array[top] = arg;
        array[++top] = arg;
        return this;
    }

    private boolean isFull() {
        return size() == capacity;
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Стэк пуст");
        }
        peek();
        return array[top--];
    }

    public int peek() {
        if (empty()) {
            throw new RuntimeException("Стэк пуст");
        } else {
            return array[top];
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean empty() {
        return top == -1;
    }

}
