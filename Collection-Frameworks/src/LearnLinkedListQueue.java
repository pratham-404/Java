import java.util.Queue;
import java.util.LinkedList;

// Queue -> LIFO(Last In First Out)

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        // implementing queue from linked list class
        Queue<Integer> q = new LinkedList<>();
        // LinkedList<Integer> q = new LinkedList<>();
        // offer(e)[add element in queue], poll()[remove element from queue], peek()[gives next element that will be polled]
        // add(), remove(), element() --> can be used but they might throw exceptions & above funtions return null in such scenario.
        
        q.offer(12);
        System.out.println(q);
        q.offer(15);
        System.out.println(q);
        q.offer(13);
        System.out.println(q);

        System.out.println("Peek: " + q.peek());

        q.poll();
        System.out.println(q);
    }  
}
