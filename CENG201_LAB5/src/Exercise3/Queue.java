package Exercise3;

/**
 * Stack.java
 *
 * Your Name:        Alperen BELLİGÜN
 * Your Student ID:  240446014
 * Your Date:        16.11.2026
 */

public class Queue {

    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {
        items = new char[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char value) {
        if (!isFull()) {
            rear = (rear + 1) % items.length;
            items[rear] = value;
            count++;
        }
    }

    public char dequeue() {
        if (isEmpty()) return '\0';

        char removedValue = items[front];
        front = (front + 1) % items.length;
        count--;
        return removedValue;
    }

    public char peek() {
        if (isEmpty()) return '\0';
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }
}
