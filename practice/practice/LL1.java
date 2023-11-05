package practice;

class LL1{

    private Node Head;

    private int size;

    // LL(){
    //     this.size=0;
    // }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }

        Node(String data,Node next){
            this.data=data;
            this.next=next;
        }
    }


    public void addFirst(String data){
        Node newNode=new Node(data);
        if (Head==null) {
            Head=newNode;
            return;
        }

        newNode.next=Head;
        Head=newNode;
    }

    public void printList(){
        if (Head==null) {
            System.out.println("List is empty");
            return;
        }

        Node curNode=Head;
        while(curNode!=null){
            System.out.println(curNode.data+" -> ");
            curNode=curNode.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        LL1 list=new LL1();
        list.addFirst("kaisa");
        list.printList();
    }
}