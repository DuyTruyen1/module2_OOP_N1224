package ss7_dsa_list.array_and_arraylist;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    };

    private Node head;
    private Node tail;

    private int size;

    //a.addFirst(int x)
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //b. toString: return in4 object

    public String toString(){
        StringBuilder str = new StringBuilder();
        Node current = head;
        for (int i = 0; i < size; i++) {
            str.append(current.value + " ");
            current = current.next;
        }
        return str.toString();
    }

    //c.addLast
    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
        }else{
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    //d.add
    public void add(int index, int value) {
        if(index < 0 || index > size) {
            System.out.println("Index out of bounds");
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        }else {
            Node currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }

            Node newNode = new Node(value);
            newNode.next = currentNode;
            currentNode.next = newNode;
            size++;
        }
    }

    //e.remove first

    public Integer removeFirst() {
        if (head == null) {
            return null;
        }

        Node currentNode = head;
        if(size==1){
            head = null;
            tail = null;
        }else {
            head = currentNode.next;
        }
        size--;
        return currentNode.value;
    }

    //f.remove Last
    public Integer removeLast() {
        if (head == null) {

        }

        Node currentNode = tail;
        if(size==1){
            head = null;
            tail = null;
        }else {
            for (int i = 2; i < size; i++) {
                currentNode = currentNode.next;
            }

            tail = currentNode;
            currentNode = currentNode.next;
            tail.next = null;
        }
        size--;
        return currentNode.value;
    }

    //g.remove

    public void remove(int index) {
        if(index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        }else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            size--;
        }
    }

    //h.getFirst

    public Integer getFirst() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    //i. getLast
    public Integer getLast() {
        if (tail == null) {
            return null;
        }
        return tail.value;
    }

    //j.get
    public Integer get(int x) {
        if (x < 0 || x >= size) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < x; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    //k. set

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
        }else{
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.value = value;
        }
    }

    //l. indexOf

    public Integer indexOf(int x) {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.value == x) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    //lastIndexOf

    public Integer lastIndexOf(int x) {
        int lastIndex = -1;
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.value == x) {
                lastIndex = i;
            }
            currentNode = currentNode.next;
        }
        return lastIndex;
    }
}
