// A default constructor is the constructor provided by Java when no
// constructors are explicitly defined in the class. It initializes instance
// variables to their default values and simply calls the superclass
// constructor.

class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();  // Calls default constructor
        System.out.println(student.name);  // Output: null (default for String)
        System.out.println(student.age);   // Output: 0 (default for int)
    }
}

