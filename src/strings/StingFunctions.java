package strings;

public class StingFunctions {

    public static void main(String[] args) {

        String apples = "Apple";
        char c = apples.charAt(0);
        System.out.println(c);

        int charAtIndex = apples.indexOf('e');
        System.out.println(charAtIndex);

        String substring = apples.substring(2, 4);
        System.out.println(substring);

        boolean contains = apples.contains("App");
        System.out.println(contains);

        char[] applesCharArray = apples.toCharArray();
        System.out.println(applesCharArray);

        char charAt = applesCharArray[3];
        System.out.println(charAt);
    }
}
