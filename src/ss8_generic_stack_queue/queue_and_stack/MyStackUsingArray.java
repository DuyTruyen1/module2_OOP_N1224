package ss8_generic_stack_queue.queue_and_stack;

import java.util.Objects;

public class MyStackUsingArray<E> {
    private Objects[] elements;
    private Objects[] emptyArray = {};
    private int size;
    private int capacity;

    public MyStackUsingArray(int capacity) {
        this.capacity = capacity;
        this.elements = new Objects[capacity];
        this.size = 0;
    }

    // Kiểm tra nếu stack rỗng
    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(E element) {
       if(elements == emptyArray){
           this.capacity = 10;
           this.elements = new Objects[this.capacity];
       }

       if (size == capacity) {
           capacity *= 2;
           if(size == capacity){
               capacity++;
           }

           Objects[] br = new Objects[capacity];

           for(int i = 0; i < size; i++){
               br[i] = elements[i];
           }
           elements = br;
       }
       size++;
    }

    public E peek() {
        if (empty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return (E) elements[size - 1];
        }
    }

    public E pop() {
        if (empty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            E topElement = (E) elements[size - 1];
            elements[size - 1] = null; // Gỡ bỏ phần tử đã pop
            size--;
            return topElement;
        }
    }

    public boolean isEmpty() {return size == 0;}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            sb.append(elements[i]).append(" ");
        }
        return sb.toString();
    }

}
