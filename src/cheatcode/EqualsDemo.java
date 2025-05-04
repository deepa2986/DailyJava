package cheatcode;


public class EqualsDemo {

    public static boolean compareStrings(String s1,String s2){
        if(s1.equals(s2)){
            return true;
        }else return false;
    }

    public static boolean compareStringsByEqualsOp(String s1,String s2){
        if(s1 == s2){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");

        String s4 = new String(s1);

        String s5 = new String("Hello");

        boolean compareStrings = compareStrings(s1, s2);
        System.out.println(compareStrings);

        boolean compareStringsByEqualsOp = compareStringsByEqualsOp(s1, s2);
        System.out.println(compareStringsByEqualsOp);

        boolean comparedStrings = compareStrings(s1, s3);
        System.out.println(comparedStrings);

        boolean compareStringsByEqualsOp1 = compareStringsByEqualsOp(s1, s3);
        System.out.println(compareStringsByEqualsOp1);

        boolean comparedStrings1 = compareStrings(s1, s4);
        System.out.println(comparedStrings1);

        boolean compareStringsByEqualsOp2 = compareStringsByEqualsOp(s1, s4);
        System.out.println(compareStringsByEqualsOp2);

        boolean compareStrings1 = compareStrings(s3, s5);
        System.out.println(compareStrings1);

        boolean compareStringsByEqualsOp3 = compareStringsByEqualsOp(s3, s5);
        System.out.println(compareStringsByEqualsOp3);

        boolean compareStrings2 = compareStrings(s1, s5);
        System.out.println(compareStrings2);

        boolean compareStringsByEqualsOp4 = compareStringsByEqualsOp(s1, s5);
        System.out.println(compareStringsByEqualsOp4);


    }
}
