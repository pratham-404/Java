import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // By default: lower the number higher the priority
        // to reverse the order i.e higher the number higher is the priority we can use Comparator.reverseOrder()
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        System.out.println(pq);
        pq.offer(6);
        System.out.println(pq);
        pq.offer(18);
        System.out.println(pq);
        
        System.out.println("Peek: " + pq.peek());

        pq.poll();
        System.out.println(pq);
    }
}
