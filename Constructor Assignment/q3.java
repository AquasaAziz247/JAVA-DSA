// No, we cannot call a subclass constructor from a superclass constructor.
// However, the reverse is true. You can call the superclass constructor from a
// subclass constructor using the super() keyword.

class Person {
    public Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    public Student() {
        super();  // Calls the superclass constructor
        System.out.println("Student constructor");
    }
}

