public class q7 {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        String result = str.replaceAll("[^aeiouAEIOU ]", "");
        System.out.println("String after deleting all consonants: " + result); 
        
    }
}

