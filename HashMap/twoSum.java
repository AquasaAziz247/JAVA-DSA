import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        //create a hashmap to store arr(i) as keys and i as values
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
        map.put( arr[i], i);
        }
        

        //create a result arr to store result
        int[] result = new int[2];

        //if current is equal to target
        for(int i=0;i<n;i++){
            if(arr[i] == target && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(target - arr[i])){
                //if it is non repeatable
                if(map.get(target-arr[i])>i){
                    result[0]=i;
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("Results of two Sum are : " + result[0] + " and " + result[1]);


    }
    
}
