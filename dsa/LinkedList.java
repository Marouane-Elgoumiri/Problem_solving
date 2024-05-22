class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;

    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head.next == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head.next == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void interate(int data) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "  ");
            current = current.next;
        }
    }

    public void deleteHead() {
        head.next = null;
        head = head.next;
    }

    public void delete_element(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current;
                }
                return;
            }
            current = current.next;
        }
    }
}
