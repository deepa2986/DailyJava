package datastructures.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListBuiltinMethods {


    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("april");
        names.add("lilly");
        names.add("mia");
        names.add("june");

        names.addFirst("john");
        names.addLast("james");
        names.add(2,"sky");

        System.out.println(names);

        String first = names.getFirst();
        System.out.println(first);

        String last = names.getLast();
        System.out.println(last);

        int indexOf = names.indexOf("mia");
        System.out.println(indexOf);

        System.out.println(names.size());

       boolean search = names.contains("mia");
        System.out.println(search);

        names.removeFirst();
        names.removeLast();
        names.remove("mia");
        names.remove(1);



        System.out.println(names);

        names.clear();
        System.out.println(names);

        List<Integer> list = Arrays.asList(1,2,34,5,4,3);
        int indexOf1 = list.lastIndexOf(3);
        System.out.println(indexOf1);
       // list.add(90);  //unsupported operation exception

        System.out.println(list);


    }
}
