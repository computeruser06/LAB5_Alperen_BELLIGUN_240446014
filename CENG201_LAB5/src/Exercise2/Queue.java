package Exercise2;

/**
 * Stack.java
 *
 * Your Name:        Alperen BELLİGÜN
 * Your Student ID:  240446014
 * Your Date:        16.11.2026
 */

public class Queue {

    private int size;
    private Node rear;
    private Node front;

    public Queue() {
        size = 0;
        rear = null;
        front = null;
    }

    public void enqueue(String customerName) {
        Node newNode = new Node(customerName);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public String dequeue() {
        if (isEmpty()) return null;

        String removedCustomer = front.customerName;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
        return removedCustomer;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.customerName);

            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }


        System.out.println();
    }
}
