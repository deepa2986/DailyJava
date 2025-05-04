package java8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("april");
        names.add("jill");
        names.add("jack");
        names.add("mia");

        names.forEach(name -> System.out.println(name));

        //consumer
        Consumer<String> printNames = name -> System.out.println(name);
        names.forEach(printNames);

        //function
        Function<Integer,Integer> squareNum = num -> num * num;
        Integer result = squareNum.apply(8);
        System.out.println(result);

        //predicate
        IntPredicate isDivisible = n -> n % 3 == 0;
        boolean test = isDivisible.test(3);
        System.out.println(test);

        //supplier
        Supplier<Double> randomNumber100 = () -> Math.random() * 100;
        System.out.println(randomNumber100.get());


    }
}
