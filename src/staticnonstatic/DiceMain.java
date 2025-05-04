package staticnonstatic;

public class DiceMain {

    public static void main(String[] args) {

        System.out.println(Dice.sidesOfDice);

        Dice myFirstDice = new Dice();
        Dice myOtherDice = new Dice();



        Dice.changeNumSidesOfDice(8);
        System.out.println();

        for(int i = 0; i < 10; i++){
            System.out.println("First Dice : " + myFirstDice.roll());
            System.out.println("Second Dice : " +myOtherDice.roll());
            System.out.println();
        }

        System.out.println();

        System.out.println("First face : " +myFirstDice.getFaceValue());
        System.out.println("other face : " + myOtherDice.getFaceValue());

    }
}
