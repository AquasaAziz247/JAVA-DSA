// Constructor overloading is used when you need to provide different ways of
// initializing an object, depending on the input data. This is useful when you
// want to create objects with different sets of initial values.

class Student {
    String name;
    int age;

    // Constructor with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name
    public Student(String name) {
        this.name = name;
        this.age = 18;  // Default age
    }
}
