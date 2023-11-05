public class LL {

    private Node head;
    // private Node tail;

    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        // normal node
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

        // insert in linked list constructor..
        Node(String data, Node next) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // add - last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // delete first

    public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last

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
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public int Getsize() {
        return size;
    }

    public void insert(String val, int index) {
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size) {
            addlast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node ll1 = new Node(val, temp.next);
        temp.next = ll1;

        size++;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // delete index of LL

    public void delete(int index) {
        if (index == 0) {
            deletefirst();
        }
        if (index == size - 1) {
            deletelast();

        }

        Node prev = get(index - 1);
        // String val = prev.next.data;

        prev.next = prev.next.next;
        size--;
        // return val;
    }

    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }
 
 
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
 

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("1");
        list.addFirst("2");
        list.addlast("3");
        list.addFirst("4");
        list.printList();

        list.addlast("5");
        // list.printList();

        list.addFirst("6");
        // list.printList();

        // list.deletefirst();
        // list.printList();

        // list.deletelast();
        // list.printList();

        // System.out.println(list.Getsize());
        // list.addFirst("this");
        list.addlast("7");
        // list.printList();
        // System.out.println(list.Getsize());

        list.insert("middle", 2);
        list.printList();

        list.delete(4);
        list.printList();

        list.reverseList();
        list.printList();

    }
}
