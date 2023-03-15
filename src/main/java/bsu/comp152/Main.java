package bsu.comp152;

public class Main {

    public static void main(String[] args) {
        /*
         * Inline initialization of an array with prescribed elements.
         */
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        /*
         * We can declare and define an array with default values.
         */
        String[] names = new String[1000];

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
    }
}