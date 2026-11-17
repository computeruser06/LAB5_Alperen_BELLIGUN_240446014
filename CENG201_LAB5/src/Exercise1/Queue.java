package Exercise1;

/**
 * Stack.java
 *
 * Your Name:        Alperen BELLİGÜN
 * Your Student ID:  240446014
 * Your Date:        16.11.2026
 */

public class Queue<T> {

    private T[] items;
    private int count;
    private int front; // first element
    private int rear;  // last element

    public Queue(int capacity) {
        count = 0;
        front = 0;
        rear = -1;
        items = (T[]) new Object[capacity];
    }

    public void enqueue(T value) {
        if (!isFull()) {
            rear++;
            items[rear] = value;
            count++;
        }
    }

    public T dequeue() {
        if (isEmpty()) return null;

        T removedValue = items[front];
        items[front] = null;
        front++;
        count--;
        return removedValue;
    }

    public T peek() {
        if (isEmpty()) return null;
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

    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {

            int index = front + i;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
    
}
