package programs;

import java.util.Arrays;

public class CountOccurrenceOfWordInString {

    public static void main(String[] args) {
        String source = "Here is an example, Right here";
        String word = "here";
        int wordOccurrences = getWordOccurrences(source, word);
        System.out.println(wordOccurrences);
    }

    public static int getWordOccurrences(String source, String word){
       // String newSourceString = source.replaceAll("\\.","");
        return (int) Arrays.stream(source.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count();
    }
}
