// If you define a return type (e.g., void, int, etc.) for a constructor, it
// will no longer be treated as a constructor but as a regular method. This will
// cause the default constructor to be used (if one exists) or result in a
// compilation error if no valid constructor is found.

class Test {
    // Invalid constructor because of return type
    public void Test() {
        System.out.println("This is not a constructor");
    }
}
