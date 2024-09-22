// Constructor chaining occurs when one constructor calls another constructor
// within the same class or calls the constructor of the superclass. This helps
// avoid redundant code.

class Student {
    String name;
    int age;

    // Constructor with both name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name, calls the above constructor
    public Student(String name) {
        this(name, 18); // Calls the first constructor
    }
}

