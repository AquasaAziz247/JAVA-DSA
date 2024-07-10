import java.util.*;

public class implementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(6);
        stack.push(9);
        stack.push(12);

        System.out.println("Topmost element before deletion : " + stack.peek());

        System.out.println("Delete top element : " + stack.pop());

        System.out.println("Topmost element after deletion : " + stack.peek());

        System.out.println("Is the stack empty : " + stack.empty());

        System.out.println("Search the element : " + stack.search(3));
    }
    
}
