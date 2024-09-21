// In Java, a mutable string refers to a string whose content can be changed or
// modified after its creation. Unlike the String class in Java, which is
// immutable (once a String object is created, its value cannot be changed),
// mutable strings are represented by the StringBuilder and StringBuffer
// classes.

public class q1_1 {
    public static void main(String[] args) {
        // Creating a mutable string using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Appending text to the mutable string
        sb.append(", World!");
        System.out.println(sb); // Output: Hello, World!

        // Inserting text at a specific index
        sb.insert(5, " Java");
        System.out.println(sb); // Output: Hello Java, World!

    }
}
