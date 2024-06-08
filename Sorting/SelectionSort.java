import java.util.Arrays;

public class SelectionSort {


    public static void selectionsort(int[] arr) {

        for(int i =0;i<arr.length;i++){
            // min_idx is taking the index value of min element at every iteration.
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            // agar humaein aur chota element mil jaye usse jis hum pehle se maan kr chl rhe the
            if (min_idx != i){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        
    }

    public static void main(String[] args) {
    int[] arr = {24,32,12,2,4,1,0};

    selectionsort(arr);

    System.out.println("Sorted Array is :");
    System.out.println(Arrays.toString(arr));
    }
    
}
