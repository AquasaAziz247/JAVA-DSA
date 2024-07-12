import java.util.*;

public class implementation{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<10;i++){
            q.add(i);
        }

        System.out.println("Queue looks like " + q);

        System.out.println("Top element before deletion : " + q.peek());

        System.out.println("Deletion : " + q.remove());

        System.out.println("Top element after deletion : " + q.peek());

        System.out.println("Size of queue : " + q.size());



    }



}