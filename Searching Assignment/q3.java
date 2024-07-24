import java.util.*;

public class q3 {
    public static void main(String[] args) {
        int[] arr1 = {0,0,0,0,1,1,1,1,1,1};
        int n1 = arr1.length-1;

        int count1=0;
        for(int i=0 ; i<=n1 ; i++){
            if(arr1[i]==1){
                count1++;
            }
        }
        System.out.println("Output : " + count1);

        int[] arr2 = {0,0,0,0,0,1,1};
        int n2 = arr2.length-1;

        int count2=0;
        for(int i=0 ; i<=n2 ; i++){
            if(arr2[i]==1){
                count2++;
            }
        }
        System.out.println("Output : " + count2);
    }
    
}
