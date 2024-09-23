interface A {
    void show();

}

interface X {
    void abc();
}
class B implements A,X {
    public void show(){
        System.out.println("In show");
    }
    public void abc(){
        System.out.println("abc");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.abc();
        
    }
    
}
