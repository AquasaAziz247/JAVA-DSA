// No-Argument Constructor: It is explicitly defined by the programmer and can
// contain custom initialization logic.

// Default Constructor: It is automatically provided by the compiler if no
// constructors are defined in the class. It initializes instance variables to
// default values (like null for objects, 0 for integers, false for booleans).
class Student {
    String name;
    int age;

    // No-argument constructor
    public Student() {
        name = "John";
        age = 18;
    }
}




class Student {
    // Implicit default constructor provided by Java
    public Student() {
        super();  // Calls the superclass constructor
    }
}
