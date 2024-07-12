import java.util.*;

public class stackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //insertion
    static void add(int data){
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty .");
            System.exit(0);
        }

        int ele=q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        stackUsingQueue s = new stackUsingQueue();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        System.out.println("Deleted element : "+ s.remove());
        System.out.println("Deleted element : "+ s.remove());
        
    }
    
}
