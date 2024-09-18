import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "School Master";
        String s2 = "The Classroom Java";

        s1=s1.replace(" ", "");
        s2=s2.replace(" ", "");

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char[] ar1 =s1.toCharArray();
        char[] ar2 =s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2)){
            System.out.println("Its an Anagram");
        }else{
            System.out.println("Its not an Anagram");
        }
    }
    
}
