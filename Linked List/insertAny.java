public class insertAny {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //insertion at the end
    public void i_end(int newData){
        Node newNode = new Node(newData);
        //if linked list is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        // if not empty
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }
    //insertion at any point
    public void i_Anypoint(Node prev_Node ,int newData){
        if(prev_Node==null){
            System.out.println("Previous node cannot contain null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next=prev_Node.next;
        prev_Node.next=newNode;

    }

    public void displayNodes(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data + "  ");
            current=current.next;
        }

    }
    public static void main(String[] args) {
        insertAny llist = new insertAny();

        llist.i_end(2);
        llist.i_end(4);
        llist.i_end(8);
        

        System.out.println("Before insertion of 10, 1 and 19");
        llist.displayNodes();
        System.out.println();

        llist.i_end(10);
       

    
        System.out.println("After insertion of 10, 1 and 19");
        llist.displayNodes();
        System.out.println();

       llist.i_Anypoint(llist.head.next.next.next, 13);
       llist.displayNodes();
        System.out.println();
    }
    
}
