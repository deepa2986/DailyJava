package cheatcode.strings;

public class ToCharArray {

    public static void main(String[] args) {
        String s = "Hello World";

        StringManipulation manipulation = new StringManipulation(s);

        char[] chars = s.toCharArray();
        for(char c : chars) {
            System.out.println(c);
        }

        String replace = s.replace('l', 'n');
        System.out.println(replace);

        char[] charArray = manipulation.toCharArray();
        System.out.println(charArray);

        char charAtIndex = manipulation.getCharAtIndex(2);
        System.out.println(charAtIndex);

        manipulation.modifyCharAtIndex(3,'K');
        System.out.println(manipulation.toStringFromCharArray(manipulation.toCharArray()));

        String stringFromCharArray = manipulation.toStringFromCharArray(charArray);
        System.out.println(stringFromCharArray);


    }
}
