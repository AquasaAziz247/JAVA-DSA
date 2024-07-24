import java.util.Scanner;

public class q2 {
    public static int lastOccur(int[] arr , int target) {
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid= low + (high-low)/2;

            if(arr[mid]==target){
                result=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else {
                high =mid-1;
            }
        }
        return result;


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements in array : ");
        int n=sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elemets :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target :");
        int target = sc.nextInt();

        //function calling

        int result = lastOccur(arr,target);

        if(result==-1){
            System.out.println("Target not found." + result);
        }else{
            System.out.println("Target present at : " + result );
        }
        



    }
    
}
