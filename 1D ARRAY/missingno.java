public class missingno {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,5,7};
        int n = arr.length;

        int missno = ((n+1)*(n+2))/2;

        int sum=0;

        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        int missingele= missno-sum;

        System.out.println("The missing element is" + missingele);



        
    }
    
}
