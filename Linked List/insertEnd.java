
class insertEnd {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
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
    //display
    public void printNode(){
        Node current = head;
        while(current != null ){
            System.out.println(current.data + " ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        insertEnd instEnd = new insertEnd();

        //function call

        instEnd.insertAtEnd(2);
        instEnd.insertAtEnd(4);
        instEnd.insertAtEnd(6);
        instEnd.insertAtEnd(8);
        instEnd.insertAtEnd(10);
        instEnd.printNode();

        System.out.println("Linked after insertion at end :");
        instEnd.insertAtEnd(12);
        instEnd.printNode();
        

        
        System.out.println();
    }
    
}
