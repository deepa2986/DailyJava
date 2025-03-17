package java8;

import java.util.Arrays;
import java.util.List;

public class EvenSquareSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Integer evenSquareSum = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(evenSquareSum);
    }
}
