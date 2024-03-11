package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExemple {

    public static void main(String[] args) {
        
        Queue<String> queuee = new LinkedList<>();

        queuee.add("joao");
        queuee.offer("joao carlos");
        queuee.add("joao marcos");
        queuee.offer("joao lucas");
        queuee.add("joao fernando");
        queuee.offer("joao mauricio");

        System.out.println(queuee.peek()); // return null 
        System.out.println(queuee.peek());
        System.out.println(queuee.element()); // Returns an exception if it is null
        System.out.println(queuee.element());

        queuee.size();
        queuee.clear();
        queuee.isEmpty();

        System.out.println(queuee.poll()); // return false
        System.out.println(queuee.remove()); // Returns an exception
        System.out.println(queuee.poll());
        System.out.println(queuee.poll());
        System.out.println(queuee.poll());
        System.out.println(queuee.poll());

        // poll and remove get the next element and remove
    }
}
