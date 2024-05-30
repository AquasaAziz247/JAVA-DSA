// Approach : Bubble Sort
// time complexity: O(n ^ 2)
// space complexity: O(1)
import java.util.*;


class BubbleSort {

    public static void bubble_sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            // for every iteration, we get the biggest element in an array in the end
            for(int j=0; j< arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    // swap between arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        // array definition
        int[] arr = {20, 50, 10, 12, 45, 67, 90};
        // function calling
        bubble_sort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
