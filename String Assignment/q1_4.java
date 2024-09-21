import java.util.Arrays;

public class q1_4 {
    public static void main(String[] args) {
        String s1 = "aquasa";
        

        char[] ar1 =s1.toCharArray();
        

        Arrays.sort(ar1);

        String sorted = new String(ar1);
        System.out.println(sorted);
        
    }

    
    
}
