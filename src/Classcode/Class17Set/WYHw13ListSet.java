package Classcode.Class17;

import java.util.HashSet;
import java.util.Set;

public class WYHw13ListSet {
    public static void main(String[] args) {

        /**
         * Question 1:
         * Create a method that can find if the given array has any duplicate data or not?
         */
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        WYHw13Methods Hw13M = new WYHw13Methods();
        System.out.println("Does the array have a duplication? " + Hw13M.DuplicatePresentMethod(words));



        /**
         * Question 2:
         * Create a method that would return the values occurring more than one time in given string-array
         *
         *
         *
         */
        String[] words1 = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        System.out.println("duplicate values in words1 are: " + Hw13M.returnDuplicationSet(words1));
        System.out.println("duplicate values in arr are: " + Hw13M.returnDuplicationSet(arr));
        Set<String> returnedDuplicationSetArr = Hw13M.returnDuplicationSet(arr);
        System.out.println("testing arr return method: " + returnedDuplicationSetArr );
        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */

        //System.out.println("duplicate List are: " + Hw13M.returnDuplicationList(arr));


    }




    /*public boolean DuplicatePresentMethod (String[] wordsArray) {
        boolean isDupPresent = false;
        int j=1;
        int count =0;
        for (int i = 0; i< wordsArray.length;i++) {
            if (j<=wordsArray.length) {
                if(wordsArray[i].contains(wordsArray[j])) {
                    count++;
                    j++;
                    isDupPresent=true;
                }
            }
        }
        return isDupPresent;
    }*/


}
