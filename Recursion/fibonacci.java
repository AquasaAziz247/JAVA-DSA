import java.util.*;

public class fibonacci {
    public static int findFibonacci(int n) {

        int result = 0;
        if(n<=1){
            return n;
        }else{
            result = findFibonacci(n-1)+findFibonacci(n-2);
        }
        return result;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int result = findFibonacci(n);

        System.out.println("Fibonacci is " + result);
    }
    
}
