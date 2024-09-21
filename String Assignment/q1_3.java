public class q1_3 {
   
        public static void main(String[] args) {
            String s1 = "Think Twice";
            String s2 = "";
            

            String[] sarr = s1.split(" ");

            for(String elem : sarr){
                for(int i=elem.length()-1;i>=0;i--){
                    s2=s2+elem.charAt(i);
                }
                s2=s2+" ";
            }
            System.out.println("Before Reversing " +s1);
            System.out.println("After Reversing "+s2);


            
           
        }
        
    
    
}
