import java.util.HashMap;

public class q2_2 {
    public static void main(String[] args) {
        String str = "programming";
        
        // Call method to print duplicate characters
        printDuplicateCharacters(str);
    }

    public static void printDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Print characters with frequency greater than 1
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > 1) {
                System.out.println(ch + ": " + charCount.get(ch));
            }
        }
    }
}

