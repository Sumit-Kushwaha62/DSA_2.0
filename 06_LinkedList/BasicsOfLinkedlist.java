//package 6_LinkedList;

import java.util.LinkedList;

public class BasicsOfLinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Printing the values of LL
    public void print() {
        if (head == null) {
            System.out.println("Linkedlist is Empty!!");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int size() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;

    }

    /*
     * Operations of Linkedlist:
     * 1>> Add at First Possition of LL
     */
    public static void addAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // Add At Last Possition of LL
    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add at Middle of LL
    public void addAtIndex(int data, int index) {
        if (index == 0) {
            addAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Remove at First of LL
    public int removeAtFirst(int data) {
        if(size == 0){
            System.out.println("LL is empty:");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }


    // Remove at node

    // Remove at last


     // searching - iterative and recursive: 
    

    public static void main(String[] args) {
        BasicsOfLinkedlist ll = new BasicsOfLinkedlist();

        ll.addAtFirst(2);
        ll.addAtFirst(1);
        ll.addAtLast(3);
        ll.addAtLast(4);
        ll.addAtIndex(9, 2);

        ll.print();

        System.out.println("------------" + size());

    }
}
