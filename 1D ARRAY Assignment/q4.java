import java.util.Arrays;

public class q4 {
    public static void i_sorting(int[] arr1,int[] arr2) {

        for(int i=0;i<arr1.length;i++){
            int j=i;
            while(j>0 && arr1[j]<arr1[j-1]){
                int temp = arr1[j];
                arr1[j] = arr1[j-1];
                arr1[j-1] = temp;

                j--;

            }
        }

        for(int i=0;i<arr2.length;i++){
            int j=i;
            while(j>0 && arr2[j]<arr2[j-1]){
                int temp = arr2[j];
                arr2[j] = arr2[j-1];
                arr2[j-1] = temp;

                j--;

            }
        }

        
    }
    public static void main(String[] args) {

        
        int[] arr1={34,21,54,65,43};
        int[] arr2={4,3,6,7,1};
        
        i_sorting(arr1,arr2);

        System.out.println("Sorted array 1 is :");
        System.out.println(Arrays.toString(arr1));


        System.out.println("Sorted array 2 is :");
        System.out.println(Arrays.toString(arr2));


        System.out.println("Second largest element : " + arr1[arr1.length-2]);
        System.out.println("Second largest element : " + arr2[arr2.length-2]);


    }
    
}
