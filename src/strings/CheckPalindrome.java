package strings;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "madam";
        boolean palindrome = isPalindromeByReversing(s);
        System.out.println(palindrome);

        boolean palindromeByReverse = isPalindromeByReverse(s);
        System.out.println(palindromeByReverse);

        boolean palindromeOptimised = isPalindromeOptimised(s);
        System.out.println(palindromeOptimised);

        boolean palindromeByJav8 = isPalindromeByJav8(s);
        System.out.println(palindromeByJav8);
    }

    static boolean isPalindromeByReversing(String s){
        String normalized  = s.toLowerCase();
        StringBuilder reversed = new StringBuilder();
        for(int i = normalized.length() - 1; i >= 0; i--){
            reversed = reversed.append(normalized.charAt(i));
        }
        return normalized.equals(reversed.toString());
    }

    static boolean isPalindromeByReverse(String s){
        String normalized  = s.toLowerCase();
        StringBuilder reversed = new StringBuilder(normalized).reverse();
        return normalized.equals(reversed.toString());
    }

    static boolean isPalindromeOptimised(String s){
        String normalized = s.toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end){
            if(normalized.charAt(start) != normalized.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeByJav8(String s){
        String normalized = s.toLowerCase();
        return IntStream.range(0,normalized.length()/2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1));
    }
}
