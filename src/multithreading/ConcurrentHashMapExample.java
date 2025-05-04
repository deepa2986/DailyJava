package multithreading;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("first",1);
        map.put("second",2);
        map.forEach((k,v) -> System.out.println(k + " : " +v));

    }
}
