

public class q5 {
    public static void main(String[] args) {
        int arr[] = {1,3,2,6,5};
        int n=arr.length;


        for(int i=0;i<n;i++){
          
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                
                System.out.println("Peaked Element " + arr[i]);
                
                
                
                

            }
            
        }
       
       
    }
    
}
