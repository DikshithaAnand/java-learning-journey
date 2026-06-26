import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
