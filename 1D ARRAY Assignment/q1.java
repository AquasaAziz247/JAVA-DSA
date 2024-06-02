
public class q1 {
    public static void main(String[] args) {
        int arr1[] = {3,20,4,6,9};
        int arr2[] = {4,3,6,7,1};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int sum1=0;
            int x1;
            int sum2=0;
            int x2=0;
        

        for(int i=0;i<n1;i++){
            
            if( i % 2 == 0){
                 x1 = arr1[i];
                sum1 += x1;
            }
        }
        for(int i=0;i<n2;i++){
            
            if( i % 2 == 0){
                 x2 = arr2[i];
                sum2 += x2;
            }
        }
        
        System.out.println("Result is " + sum1);
        System.out.println();
        System.out.println("Result is " + sum2);
    }

    
}
