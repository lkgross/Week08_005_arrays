package bsu.comp152;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File myfile = new File("namesSection005");
        Scanner inputFile = new Scanner(myfile);
        /*
         * Inline initialization of an array with prescribed elements.
         */
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        /*
         * We can declare and define an array with default values.
         */
        String[] names = new String[100];

        System.out.println(SUITS);
        System.out.println(names);

        /*
         * Arrays in Java are objects.
         * Arrays do NOT change size.
         */

        /*
         * numberArray is an array of 100 values of 0.0.
         */
        double[] numberArray = new double[100];

        /*
         * intArray is an array of 100 values of 0.
         */
        int[] intArray = new int[100];

        /*
         * booleanArray is an array of 100 values of false.
         */
        boolean[] booleanArray = new boolean[100];

        System.out.println(booleanArray);

        /*
         * We can process arrays by looping through index-by-index or element-by-element.
         */

        System.out.println(SUITS.length);

        for (int i = 0; i < SUITS.length; i++){
            System.out.println(SUITS[i]);
        }

        System.out.println();

        for (String item : SUITS){
            System.out.println(item);
        }

        for (boolean item : booleanArray){
            System.out.println(item);
        }

        for (int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        for (String name : names){
            System.out.println(name);
        }

        // Read names from an input file.
        /*
         * While there are names remaining in the input file, add the name to the names array.
         * While the file has a next name, add the name to the names array.
         */
        int i = 0;
        while (inputFile.hasNext()){
            names[i] = inputFile.nextLine();
            i++;
        }

        System.out.println();
        int classSize = i;
        System.out.println();

        for (String name : names){
            if (name != null) {
                System.out.println(name);
            }
        }

        System.out.println();
        System.out.printf("The class size is %d\n", classSize);
        System.out.println();

        for (int j = 0; j < classSize; j++){
            System.out.println(names[j]);
        }



    }
}