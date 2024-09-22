public class q2_6 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] present = new boolean[26];
        int index = 0;
        
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                present[index] = true;
            }
        }

        for (boolean b : present) {
            if (!b) {
                return false;
            }
        }
        
        return true;
    }
}

