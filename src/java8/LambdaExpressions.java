package java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressions {

    public static void main(String[] args) {

        String s1 = "Heelo world";
        Predicate<String> predicate = s -> s.length() > 5;
        boolean test = predicate.test(s1);
        System.out.println(test);


        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("beautiful");

        doSomething(predicate);
        doSomething(s -> s.startsWith("s"));
    }

    public static void doSomething(Predicate<String> p){
        System.out.println(p.test("doSomething"));
    }
}
