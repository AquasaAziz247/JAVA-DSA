public class cycledetection {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //insert at end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        //if Linked List is empty
        if(head == null ){
            head = new Node(newData);
            return;
        }
        //if not empty
        newNode.next = null;
        //traverse
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }
    public void midNode(){
        Node slow = head , fast = head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle node of the Linked list is : " + slow.data);
    }
    //Implementation of Cycle Detection
    public void cycle(){
        Node slow = head , fast=head;
        int flag=0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("No loop detected.");
        }else{
            System.out.println("Loop Detected.");
        }
      
    }

    //display
    public void printNode(){
        Node current = head;
        while(current != null ){
            System.out.print(current.data + " ");
            current=current.next;
        }}
    
    public static void main(String[] args) {
        cycledetection ll = new cycledetection();

        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.printNode();
        System.out.println("After insertion : ");
        ll.insertAtEnd(12);
        ll.insertAtEnd(14);
        ll.printNode();

        Node temp = ll.head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ll.head;

        ll.cycle();
        System.out.println();

       


}
}