package ss8_generic_stack_queue.queue_and_stack;

public class MyStackUsingLinkedList<E> {
    private class Node {
        public E value;
        public Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyStackUsingLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Thêm phần tử vào stack
    public void push(E value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public E peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public E pop() {
        if (head == null) {
            return null;
        }
        Node current = head;
        if (size == 1) {
            head = null;
            tail = null;
        }else {
            head = head.next;
        }
        size--;
        return current.value;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        for (int i = 0; i < size; i++) {
            sb.append(current.value + " ");
            current = current.next;
        }
        return sb.toString();
    }
}
