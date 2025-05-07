package datastructures.arrays;

import java.util.Arrays;

public class SwapDemo {

    public static void main(String[] args) {
        String[] availableFruits = {"Mango","JackFruit","Apple","Banana"};
        String[] unAvailableFruits = {"WaterMelon","Grapes","Berries"};

        System.out.println(Arrays.toString(availableFruits));
        System.out.println(Arrays.toString(unAvailableFruits));

        int indexOfAvailableFruits = 2;
        int indexOfUnAvailableFruits = 0;

        String availableFruit = availableFruits[indexOfAvailableFruits];
        String unAvailableFruit = unAvailableFruits[indexOfUnAvailableFruits];

        availableFruits[indexOfAvailableFruits] = unAvailableFruit;
        unAvailableFruits[indexOfUnAvailableFruits] = availableFruit;

        System.out.println(Arrays.toString(availableFruits));
        System.out.println(Arrays.toString(unAvailableFruits));
    }
}
