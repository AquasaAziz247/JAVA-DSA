public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,8,2,6,7,8};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if( arr[i] == arr [j]){
                    System.out.println("Duplicate Element is " + arr[i]);
                }
            }
        }


    }
    
}
