package interview.programs.string;

public class LinkedL {
    class Node{
        Node next;
        char data;

        public Node(Node next, char data) {
            this.next = next;
            this.data = data;
        }
    }

    public void create(Node n){
        Node tail=null;
        Node head=null;
        if(head==null){
            head=n.next;
            tail=n.next;

        }
        else if(head!=tail){
            tail =n.next;
            tail.next =null;

        }
    }

    public void display(Node head){
        while(head!=null){
            System.out.println();
        }
    }

    public void reverse(Node head){
        Node curr=head;
    }


    public static void main(String[] args){
        Node head=null;
        LinkedL ll=new LinkedL();
        char[] arr={'a','r','u','s','h','i'};
        for(char c:arr){
        Node n=ll.new Node(head,c);
        ll.create(n);
            ll.display(n);

    }}
}
