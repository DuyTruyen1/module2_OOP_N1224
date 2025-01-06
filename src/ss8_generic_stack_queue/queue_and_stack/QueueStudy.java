package ss8_generic_stack_queue.queue_and_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueStudy {
    public static void main(String[] args) {
        Queue  queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add("T");
        queue.add(new Scanner(System.in));

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
