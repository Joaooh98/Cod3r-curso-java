package collections.stacks;

import java.util.ArrayList;
import java.util.List;

public class CStackExample<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pop operation attempted on an empty stack.");
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Peek operation attempted on an empty stack.");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CStackExample<String> stack = new CStackExample<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
