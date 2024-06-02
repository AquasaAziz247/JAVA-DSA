import java.util.Scanner;


public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No. of elements in array :");
        int n = sc.nextInt();

        System.out.println("Array is :");

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        for(int i=0;i<n;i++){
            for(int j =i+1; j<n;j++){
                if( arr[i] > arr[j]){
                    
                }
                

            }
        }
        System.out.println(arr[i]);
    }
    
}
