package cheatcode;

public class MathDemo {

    public static void main(String[] args) {
        double num  = 2.67;
        long round = Math.round(num);
        System.out.println(round);

        double d = 2.2;
        long l = Math.round(d);
        System.out.println(l);

        double twoRaiseToThree = Math.pow(2, 3);
        System.out.println(twoRaiseToThree);

        double negativeNum = -3.6;
        long round1 = Math.round(negativeNum);
        System.out.println(round1);

        int num1 = 56;
        int num2 = 45;
        int max = Math.max(num1, num2);
        System.out.println(max);

        int min = Math.min(num1, num2);
        System.out.println(min);
    }
}
