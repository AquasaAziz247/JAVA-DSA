public class q2_1 {
    public static void main(String[] args) {
        String str = "programming"; // Example string with duplicates
        
        // Call the method to remove duplicates
        String result = removeDuplicates(str);
        
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] charPresent = new boolean[256];  // Array to track characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!charPresent[ch]) {
                sb.append(ch);
                charPresent[ch] = true;
            }
        }
        
        return sb.toString();
    }
}

