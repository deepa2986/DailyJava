package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> reversed = getReversed(numbers);
        System.out.println(reversed);
    }

    public static List<Integer> getReversed(List<Integer> numbers){
        Collections.reverse(numbers);
        return numbers;
    }
}
