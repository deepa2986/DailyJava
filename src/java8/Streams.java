package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("mia","sia","gia");
        Stream<String> namesListStream = namesList.stream();

        String[] namesArray = {"anubhav","arvind","arjun"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        Stream<String> namesStream = Stream.of("kill", "bill", "gill");


    }
}
