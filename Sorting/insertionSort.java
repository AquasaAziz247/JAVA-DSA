import java.util.*;

public class insertionSort {

    public static void insertionsort(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {20,67,45,12,13,45,10};

        insertionsort(arr);

        System.out.println("Sorted Array is :" );
        System.out.println(Arrays.toString(arr));
    }
    
}
