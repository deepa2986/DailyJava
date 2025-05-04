package programs;

import java.util.Arrays;

public class FindLargest {

    public static void main(String[] args) {
        int[] source = {12,1,5,4,22,9,2};
        int largest = getLargest(source);
        System.out.println(largest);
    }
    public static int getLargest(int[] source){
         return Arrays.stream(source).max().getAsInt();
    }
}
