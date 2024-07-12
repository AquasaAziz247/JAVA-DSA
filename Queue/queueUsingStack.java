import java.util.*;

public class queueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    //insertion of data

    static void enQueue(int data){
        
        s1.push(data);
    }

    //deletion of data

    static int deQueue(){
        int ele;
        if(s1.empty() && s2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
           
            }
        
            if(s2.empty()){
                while(!s1.empty()){
                    ele=s1.pop();
                    s2.push(ele);
                }
            }

            ele = s2.pop();
            return ele;
        }
        public static void main(String[] args) {
            queueUsingStack q = new queueUsingStack();

            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);

            System.out.println("Deleted element : " + q.deQueue());
            System.out.println("Deleted element : " + q.deQueue());
        }
    }
    

