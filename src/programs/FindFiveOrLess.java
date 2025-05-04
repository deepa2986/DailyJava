package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFiveOrLess {

    public static void main(String[] args) {
        String source = "where there's a will there's a way";
        List<String> wordsWithFiveOrLess = getWordsWithFiveOrLess(source);
        System.out.println(wordsWithFiveOrLess);
    }

    public static List<String> getWordsWithFiveOrLess(String source){
        return Arrays.stream(source.split(" ")).filter(word -> word.length() <= 5).collect(Collectors.toList());
    }
}
