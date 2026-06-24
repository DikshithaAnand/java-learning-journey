import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        // View front element
        System.out.println("Front Element: " + queue.peek());

        // Remove element
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);

        System.out.println("Front Element: " + queue.peek());
    }
}
