package ss8_generic_stack_queue.queue_and_stack;

public class MainUsingLinkedList {
    public static void main(String[] args) {
        MyStackUsingLinkedList<Integer> stack = new MyStackUsingLinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Current stack: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Stack size: " + stack.size());

        System.out.println("Popping all elements:");
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("Stack after clearing: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
