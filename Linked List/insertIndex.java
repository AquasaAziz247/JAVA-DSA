public class insertIndex {
    Node head; // head of list

    // Linked list Node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at a given position
    public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data);

        // If the linked list is empty
        if (head == null) {
            if (index == 0) {
                head = newNode;
            } else {
                System.out.println("Index out of bounds");
            }
            return;
        }

        // If the index is 0, insert at the head
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        Node previous = null;
        int counter = 0;

        // Traverse the list until the desired position or the end of the list
        while (current != null && counter < index) {
            previous = current;
            current = current.next;
            counter++;
        }

        // If the index is greater than the size of the list
        if (counter != index) {
            System.out.println("Index out of bounds");
            return;
        }

        // Insert the new node at the desired position
        newNode.next = current;
        previous.next = newNode;
    }

    // Method to print the LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertIndex list = new insertIndex();

        list.insertAtIndex(0, 1); // Inserting at index 0
        list.printList(); // Output: 1

        list.insertAtIndex(1, 2); // Inserting at index 1
        list.printList(); // Output: 1 2

        list.insertAtIndex(1, 3); // Inserting at index 1 again
        list.printList(); // Output: 1 3 2

        list.insertAtIndex(5, 4); // Trying to insert at an out of bounds index
        list.printList(); // Output: Index out of bounds, 1 3 2
    }
}

    
    
