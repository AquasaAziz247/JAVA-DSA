public class deletion{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data =d;
            next=null;
        }
    }
    public void end(int newData){
        Node newNode = new Node(newData);

        //ll is empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        // ll not empty
        newNode.next=null;
        //traverse
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }
    public void i_beg(int newData){
        Node newNode = new Node(newData);
        newNode.next=head;
        head = newNode;
    }
    void delete(int position){
        //ll is empty
        if(head==null){
            return;
        }
        Node temp = head;
        //deletion from beginning
        if(position==0){
            head=temp.next;
            return;
        }
        //deletion from anywhere
        for(int i=0;i<position && temp!=null;i++ ){
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
           return;
        }
        temp.next=temp.next.next;

    }
    public void display(){
        Node current = head;
        //traverse
        while(current!=null){
            System.out.println(current.data + " ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        deletion ll = new deletion();
        ll.display();

        ll.end(12);
        ll.end(24);
        ll.end(36);
        ll.end(48);
        ll.display();
        
        System.out.println("After insertion at the beg. :");
        ll.i_beg(6);
        ll.i_beg(18);
        ll.delete(3);
        
        ll.display();
        
    }
}