package datastructures.stack;

import java.util.Map;
import java.util.Stack;

public class MatchingParentheses {

    public static void main(String[] args) {
        String s = "()incre<>ment<>[]";
        boolean b = checkMatchingParentheses(s);
        System.out.println(b);

    }


    public static boolean checkMatchingParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> blockSymbols = Map.of(')', '(',
                ']', '[', '>', '<');
        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(blockSymbols.containsValue(current)){
                stack.push(current);
                continue;
            }
            if(blockSymbols.containsKey(current) && (stack.isEmpty() ||
                    blockSymbols.get(current) != stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();

    }
}
