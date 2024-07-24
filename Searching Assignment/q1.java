import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add : ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];

        System.out.print("Enter the elements of array : ");
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements to be searched : ");
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
        
    }
    
}
