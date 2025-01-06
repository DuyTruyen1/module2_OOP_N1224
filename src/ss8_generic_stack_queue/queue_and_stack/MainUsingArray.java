package ss8_generic_stack_queue.queue_and_stack;

public class MainUsingArray {
    public static void main(String[] args) {
        MyStackUsingArray<Integer> stack = new MyStackUsingArray<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing 5 elements: " + stack);

        stack.push(60);
        System.out.println("Stack after pushing 6th element: " + stack);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("Stack after popping one element: " + stack);

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
