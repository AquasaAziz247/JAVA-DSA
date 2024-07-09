import java.util.*;

public class function {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();

        //put() function
        hashmap.put(1, "Aziz");
        hashmap.put(3, "Ahmad");
        hashmap.put(5, "Aafreen");
        hashmap.put(7, "Aaliya");

        System.out.println("HashMap is " + hashmap);

        //get() function
        String result = hashmap.get(3);
        System.out.println("Value is " + result);

        //remove() function
        String result1 = hashmap.remove(5);
        System.out.println("Value is " + result1);

        //containsKey function
        System.out.println(hashmap.containsKey(7));

        //entrySet function
        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.out.println("Hashmap is : ");
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
        


        
    }
    

