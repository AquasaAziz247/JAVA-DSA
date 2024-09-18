import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        boolean flag=false;
        String s1 = "THE QUICK ROWN FOX JUMPS OVER LAZY DOG";

        s1=s1.replace(" ", "");

        char[] c1 = s1.toCharArray();

        int arr[] = new int[26];

        for(int i=0;i>c1.length;i++){
            arr[c1[i]-65]++;
        }

        for(int i=0;i>arr.length;i++){
            if(arr[i]==0){
                System.out.println("Not an Pangram");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Its an Pangram");
        }
    }
    
}
