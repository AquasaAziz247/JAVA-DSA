interface Car{
    void drive(int avg,int topSpeed);
}

public class AnnonymousClass {
    public static void main(String[] args) {
        Car obj = (avg,ts) -> System.out.println("Running " +avg);

        obj.drive(34, 67);
    }
    
}
