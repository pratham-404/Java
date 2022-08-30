import java.util.ArrayDeque;

// deque -> Double Ended QUEue (we can push/pop/peek elements from both ends of queue)

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // by default using offer(e), poll(), peek() it works like a queue
        // but we can use offerFirst(e), pollLast(), peekLast() for opposite direction

        adq.offer(12);
        adq.offer(19); // by default: rear
        System.out.println(adq);
        adq.offerFirst(18); // inserting in front of the list
        System.out.println(adq);

        System.out.println("Peek: " + adq.peek()); // by default: front
        System.out.println("PeekLast: " + adq.peekLast()); // peeking element at the rear end of list

        adq.poll(); /// by default: front
        System.out.println(adq);
        adq.pollLast(); /// removing from front of the list
        System.out.println(adq);
    }
}
