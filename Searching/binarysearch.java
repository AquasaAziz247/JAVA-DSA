import java.util.Scanner;

public class binarysearch {
    public static int binsearch(int[] arr, int x) {
        int l = 0;
        int h= arr.length-1;
        int mid = (l+ (h-l))/2;
        int result =-1;

        while(l<=h){
            if(arr[mid] == x ){
                result=mid;

            }else if(arr[mid]< x){
                l = mid+1;
            }else{
                h  = mid-1;

            }
            
        }
        return result;
        


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of an element from the user
        System.out.println("Enter the number of elements present in an array");
        int n = sc.nextInt();

        // array elements entered from the user
        System.out.println("Enter the array elements");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // target element from the user
        System.out.println("Enter target element");
        int x = sc.nextInt();


        int result =  binsearch(arr, x);
        if(result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is present at " + result);
        }
    
}


}
