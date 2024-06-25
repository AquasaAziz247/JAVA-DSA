public class insertBegin {
    Node head;
    class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }
    // insertion at the end
    public void i_end(int newData){
        Node newNode = new Node(newData);
        //if linked list is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        //if linked list is not empty
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    //insertion at the beginning
    public void i_beg(int newData){
        Node newNode = new Node(newData);
        newNode.next=head;
        head=newNode;
    }

    //traverse and display the nodes
    public void displayNodes(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        insertBegin llist = new insertBegin();

        //function call
        llist.i_end(5);
        llist.i_end(15);
        llist.i_end(25);
        llist.i_end(35);
        llist.displayNodes();
        System.out.println("After insertion at end :");
        llist.i_end(35);
        llist.i_end(45);
        llist.i_end(55);
        llist.i_beg(0);
        llist.i_beg(-5);
        llist.i_beg(-10);
        llist.displayNodes();
    }

    
}
