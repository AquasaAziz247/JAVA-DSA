import java.util.Arrays;

public class BubbleSort {

    public static void bubblesort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap=true;
                }
            }if(!swap){
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {20,13,14,45,29,98,67};

        bubblesort(arr);

        System.out.println("Sorted Array is : " );
        System.out.println(Arrays.toString(arr));
    }
    
}
