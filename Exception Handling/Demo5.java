class Demo{
    public void a() throws Exception{
        System.out.println("in a");
        int value=9;

        b();
    }
    public void b() throws Exception{
        int num1=9;
        int num2=0;
        try{
            int result=num1/num2;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Error" +e.getMessage());
        }
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.a();
    }

    
}
