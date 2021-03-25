package Classcode.Class9;

import java.text.DecimalFormat;
import java.util.Arrays;

public class WillYipHw9 {
    public static void main(String[] args) {
        // Due: Mar 25, 2021
        /**
         * Write a method to convert given string into Titlecase
         */
        Titlecase("HapPy saINt paTrickS dAy");

        /**
         * Write a method that will tell grade to student for given score and MaxScore
         */
        gradeCal(900.05);


        /**
         * Write a method that will reverse any given int-array
         */
        int[] mrArray = {11, 44, 22, 66, 44, 76};
        intReverse(mrArray);
        /**
         * Write a method that return the number of words in given sentence.
         */
        wordsInSentenceCount(" Will this method be able to count words correctly     ");


    }

    public static String Titlecase(String UsersentenceToTitlecase) {

        String[] sentence1Array = UsersentenceToTitlecase.trim().toLowerCase().split(" ");
        //String[] sentence1ArrayCap = new String[sentence1Array.length];
        String[] sentence1ArrayCapAndLowerCase = new String[sentence1Array.length];
        String sentence1TitleCase="";

        for (int i = 0; i <= sentence1Array.length - 1; i++) {
            sentence1TitleCase = sentence1TitleCase + sentence1Array[i].substring(0, 1).toUpperCase()+sentence1Array[i].substring(1) + " ";
        }
        System.out.println(sentence1TitleCase);
        return sentence1TitleCase;

    }

    public static String gradeCal(double studentPoints) {
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double maxScore = 700;
        String grade = "";

        double gradeScore = (studentPoints / maxScore) * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The grade score currently is: " + df.format(gradeScore));

        if (100.00000001 <= gradeScore) {
            grade = "is incorrectly entered, please try again";
        } else if (91 <= gradeScore) {
            grade = "Your score is: Grade A";
        } else if (81 <= gradeScore) {
            grade = "Your score is: Grade B";
        } else if (71 <= gradeScore) {
            grade = "Your score is: Grade D";
        } else if (61 <= gradeScore) {
            grade = "Your score is: Grade E";
        } else if (51 <= gradeScore) {
            grade = "Your score is: Grade E";
        } else {
            grade = "Your score is: Grade F";
        }
        System.out.println("Your grade: " + grade);
        return grade;

    }

        public static int[] intReverse (int[] intToReverse){


        //create empty reverse array, for loop with the length as i, set empty reverse equal to results

        int[] reverseArray = new int[intToReverse.length];
        int reverseInt = 0;

        for (int i = intToReverse.length - 1; i >= 0; i--) {
            reverseArray[(intToReverse.length - 1) - i] += intToReverse[i];
            //reverseInt += reverseInt ;
            System.out.println(Arrays.toString(reverseArray));
        }
        System.out.println(Arrays.toString(reverseArray));
        return reverseArray;
    }

        public static int wordsInSentenceCount(String sentenceToCount) {

        String[] sentenceArrayConvert = sentenceToCount.trim().replace(" ","").split("");
        int wordCount = 0;
        String emptySpace = " ";
            System.out.println(Arrays.toString(sentenceArrayConvert));

        for (int i =0; i<=sentenceArrayConvert.length-1;i++) {
            //for (String sentenceArrayIndex:sentenceArrayConvert) {
                wordCount = wordCount + sentenceArrayConvert[i].length();
        }
            System.out.println("The word count for this sentence is: " + wordCount);
        return wordCount;



            /*for (int i =0; i<=sentenceArrayConvert.length-1;i++) { //not sure why without the replace method I would still count the " " values
                //for (String sentenceArrayIndex:sentenceArrayConvert) {
                if (sentenceArrayConvert[i]!=" ") {
                    wordCount = wordCount + sentenceArrayConvert[i].length();
                }
            }
            System.out.println("The word count for this sentence is: " + wordCount);
            return wordCount;*/
        }



}
