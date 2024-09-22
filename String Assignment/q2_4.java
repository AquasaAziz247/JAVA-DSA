public class q2_4 {
    public static void main(String[] args) {
        String str = "Hello, World!123";
        
        countCharacters(str);
    }

    public static void countCharacters(String str) {
        int vowels = 0, consonants = 0, specialChars = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(ch)) {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }
}

