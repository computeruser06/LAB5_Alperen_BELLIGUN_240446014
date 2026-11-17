package Exercise1;

/**
 * Stack.java
 *
 * Your Name:        Alperen BELLİGÜN
 * Your Student ID:  240446014
 * Your Date:        16.11.2026
 */

public class QueueUsingArrayDemo {

    public static void main(String[] args) {

        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        Queue<String> queue = new Queue<>(10);

        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        System.out.println("Original Queue: " + queue.toString());

        System.out.println("Queue Size: " + queue.size());

        System.out.println("First Student: " + queue.peek());

        System.out.println("\nRemoving three students:");


        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.dequeue());
        }

        System.out.println("\nQueue After Removal: " + queue.toString());
        System.out.println("Final Queue Size: " + queue.size());

        System.out.println("\nAnswer: It gives ArrayIndexOutOfBoundsException because rear keeps increasing and exceeds the array length. We must use circular indexing: rear = (rear + 1) % capacity to fix it.");
    }
}