package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream<String> fruits = Stream.of("apple","banana","mango","grapes");

        String[] vegetables = {"carrot","beetroot","chilli","pumpkin"};

        Stream<String> vegs = Arrays.stream(vegetables);

        List<String> vegList = List.of("carrot","beetroot","chilli","pumpkin");

        Stream<String> vegListStream = vegList.stream();

        vegList.stream().forEach(System.out::println);
        vegList.parallelStream().forEach(System.out::println);

        boolean anyMatch = vegList.stream().anyMatch(veg -> veg.contains("carrot"));
        System.out.println(anyMatch);

        List<Integer> integerList = List.of(4,2,6,9,10,17,3);
        Stream<Integer> doubledStream = integerList.stream().map(n -> n * n);

        List<Integer> doubledList = integerList.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(doubledList);


    }
}
