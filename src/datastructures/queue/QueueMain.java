package datastructures.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<String> persons = new LinkedList<>();
        Queue<String> strings = new ArrayDeque<>();
        strings.add("yui");
        persons.add("sma");
        persons.add("jack");
        persons.add("jim");
        persons.add("amith");

        System.out.println(persons);

        while (!persons.isEmpty()){
            String removed = persons.remove();
            System.out.println(removed);
        }


    }
}
