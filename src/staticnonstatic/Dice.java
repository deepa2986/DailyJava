package staticnonstatic;

import java.util.Random;

public class Dice {

    static int sidesOfDice = 6;
    int faceValue = 0;

    public static void changeNumSidesOfDice(int newNumOfSides){
        Dice.sidesOfDice = newNumOfSides;
    }

    public int getFaceValue(){
        return this.faceValue;
    }

    public int roll(){
     //   sidesOfDice = 9;
        Random random = new Random();
        this.faceValue = random.nextInt(Dice.sidesOfDice) + 1;
        return this.faceValue;
    }
}
