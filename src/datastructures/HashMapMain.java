package datastructures;

import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map.get("Three"));

        System.out.println(map.values());
        System.out.println(map.keySet());

        System.out.println(map.remove("Four"));

        System.out.println(map.values());
        System.out.println(map.keySet());




    }
}
