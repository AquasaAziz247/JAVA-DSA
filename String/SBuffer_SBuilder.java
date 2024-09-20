

public class SBuffer_SBuilder{
    public static void main(String[] args) {
        // StringBuffer sbf = new StringBuffer("Virat");
        // System.out.println(sbf);

        // // StringBuffer sb = "j"; //invalid

        // sbf.append(" Kohli");
        // System.out.println(sbf);

        // StringBuilder sbb = new StringBuilder("MS");
        // System.out.println(sbb);
        // sbb.append(" Dhoni");
        // System.out.println(sbb);

        // final int a =10;
        // System.out.println(a);

        // final StringBuffer sbf = new StringBuffer("Aquasa");
        // sbf.append(" Aziz");
        // System.out.println(sbf);

        // sbf = new StringBuffer("Sachin");
        // System.out.println(sbf);

        // StringBuilder sbb = new StringBuilder();
        
        // System.out.println(sbb.capacity());
        // sbb.append("abcdefghijklmnop");
        // System.out.println(sbb.capacity());
        // sbb.append("s");
        // System.out.println(sbb.capacity());
        // System.out.println(sbb.length());

        
    //     StringBuffer sb2=new StringBuffer("Sachin");
    //     System.out.println(sb2);
    //     System.out.println(sb2.capacity());
    //     System.out.println(sb2.charAt(1));
    //    sb2.setCharAt(1, 'A'); //SAachin or SAchin
    //    System.out.println(sb2);

    StringBuilder sb=new StringBuilder(150);
    System.out.println(sb.capacity());
    sb.append("java");
    System.out.println(sb);
    sb.trimToSize();
    System.out.println(sb.capacity());

    // StringBuilder sb=new StringBuilder("pwjava");
    // System.out.println(sb);
    // System.out.println(sb.reverse());



    }
}