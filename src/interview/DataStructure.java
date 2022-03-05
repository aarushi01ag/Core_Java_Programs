package interview;

import org.w3c.dom.Node;

public class DataStructure {
    Node head=null;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args){
        DataStructure ll=new DataStructure();
        Node first=ll.new Node(10);
        ll.head=first;
        Node second=ll.new Node(200);
        first.next=second;
        Node third=ll.new Node(30);
        second.next=third;
        ll.display();
        ll.add(34);

    }
    public void display(){
        int count=0;
        Node n=head;
        if(head==null){
            System.out.println("empty list");
        }
        else{
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
            count++;
        }}
        System.out.println(count);
    }
    public void add(int data){
        Node tail =null;

       Node newNode=new Node(data);
       if(head==null){
           head=newNode;
           tail=newNode;
       }
       else{
           tail.next=newNode;
           tail=newNode;
       }
    }

}
