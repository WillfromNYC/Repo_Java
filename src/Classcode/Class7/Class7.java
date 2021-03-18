package Classcode.Class7;

public class Class7 {
    public static void main(String[] args) {
        String[] names1 = {"Happy", "Peace", "Grow", "Learn", "sleep", "share", "teach", "smile"};
        for (int i = names1.length - 1; i >= 0; i--) {
            // i=0,1,2,3
            System.out.println(names1[i]);
        }
        // print the words in reverse order
        /*
            smile
            teach
            share
            sleep
            Learn
            Grow
            Peace
            Happy
         */
        String[] helloString = {"hello", "hello", "hello", "hello", "hello"};

        for (int i = 0; i <= helloString.length - 1; i++) {
            System.out.println("string hello 5x: " + helloString[i]);


        }

       /* String[] words = {"Happy", "Peace", "Grow", "Learn", "sleep", "share", "teach", "smile"};
        for (int i=0; i<=words.length-1; i++) {
            if*//* (words[0%2==0])System.out.println("Even words" + words[i]);*/

        /**
         * Print the words present on even index
         *
         * Happy
         * Grow
         * sleep
         * teach
         *
         */

        /**
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */

        String sentence_2 = "happy holiday";  // 4
        String[] sentence_2Array = sentence_2.split("");
        int count = 0;

        for (String letter : sentence_2Array) {
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u")) {
                count++;
            }
        }
    }
















}

