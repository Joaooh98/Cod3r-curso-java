package collections.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings("all")
public class CStackC {
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();

        books.add("the little prince");
        books.add("the little prince");
        books.add("the little prince");

        for (String book : books) {
            System.out.println(book);
        }

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.pop());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.pop());

        books.size();
        books.clear();
        books.contains("the john");
        books.isEmpty();
    }
}
