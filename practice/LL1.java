package practice;

public class LL1 {
    private Node head;

    private int size;

    LL1() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // add node at first in linked list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add newnode at last of linked list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        newNode = null;
    }

    // print the linked list
    public void printLL() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("end");
    }

    // delete node at first
    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // size--;
        head = head.next;
        size--;
    }

    // delete node at last
    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;


        // if list has only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int Getsize(){
        return size;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("ab");
        list.addFirst("tu");
        list.printLL();
        System.out.println(list.Getsize());

        list.addLast("kya");
        list.addLast("karega!!!");
        list.printLL();
        System.out.println(list.Getsize());

        list.deletefirst();
        list.printLL();
        System.out.println(list.Getsize());

        list.deletelast();
        list.printLL();
        System.out.println(list.Getsize());
    }

}
