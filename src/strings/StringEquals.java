package strings;

public class StringEquals {

    public static void main(String[] args) {
        String literalA = "abd";
        String literalB = "abd";

        String objectA = new String("abd");
        String objectB = new String("abd");

        System.out.println(literalA == literalB);
        System.out.println(objectA == objectB);
        System.out.println(literalA == objectA);

        System.out.println();

        System.out.println(literalA.equals(literalB));
        System.out.println(objectA.equals(objectB));
        System.out.println(literalA.equals(objectA));

    }
}
