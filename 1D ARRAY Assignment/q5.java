

public class q5 {
    public static void main(String[] args) {
        int arr1[] = {1,3,2,6,5};
        int n1=arr1.length;
        int peak1 =0;
        int arr2[] = {14,7,3,2,6,5};
        int n2=arr2.length;
        int peak2 =0;


        for(int i=1;i<n1;i++){
          
                if(arr1[i]>arr1[i-1] && arr1[i]>arr1[i+1]){
                
                peak1 = arr1[i];
                
            }
            
        }
        System.out.println("Peaked element is " + peak1);


        for(int i=1;i<n2;i++){
          
                if(arr2[i]>arr2[i-1] && arr2[i]>arr2[i+1]){
                
                peak2 = arr2[i];
                
            }
            
        }
        System.out.println("Peaked element is " + peak2);
       
       
    }
    
}
