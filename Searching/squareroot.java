import java.util.Scanner;

public class squareroot {
    public static int squareRoot(int num) {
        int low = 0;
        int high = num;
        int result=-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            long val = mid*mid;

            if(val==num){
                return mid;
            }else if(val<num){
                result= mid;
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose square root needs to be found");
        int num = sc.nextInt();

        // function calling
        int result = squareRoot(num);
        System.out.println("Square root of the number is " + result);
    }
    
}
