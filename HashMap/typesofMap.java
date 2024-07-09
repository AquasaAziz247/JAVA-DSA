import java.util.*;

public class typesofMap {
    public static void main(String[] args) {
        
        //unordered return type
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(3 , "Aafreen");
        map1.put(1 , "Somi");
        map1.put(7 , "Tillu");
        map1.put(5 , "Golu");
        System.out.println("HashMap looks like " + map1);


        //order of insertion is retained
        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(3 , "Aafreen");
        map2.put(1 , "Somi");
        map2.put(7 , "Tillu");
        map2.put(5 , "Golu");
        System.out.println("LinkedHashMap looks like " + map2);


        //sorted data according to key values
        TreeMap <Integer,String> map3 = new TreeMap<>();
        map3.put(3 , "Aafreen");
        map3.put(1 , "Somi");
        map3.put(7 , "Tillu");
        map3.put(5 , "Golu");
        map3.put(6 , "Laddoo");
        System.out.println("Tree HashMap looks like " + map3);
    }
    
}
