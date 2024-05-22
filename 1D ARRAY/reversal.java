public class reversal {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int n = arr.length;

        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("The reversal of array is :");
        for(int i=0;i<n;i++)


        System.out.println(arr[i] + " " );
     }
     
}
