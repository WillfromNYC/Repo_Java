package Classcode.Class12AccessOOP;

import java.util.Arrays;

public class labC12 {
    public static void main(String[] args) {

        /**
         * Write a method to read a string and
         * returns after removing the # and its immediate left and right characters.
         *
         * The given strings is : test#string
         * Method should return : testring
         */
        String[] sentenceQ1 = {"package#Classcode#Test#ing"};
        String removeChar = "#";
        labC12Methods LabMethods12 = new labC12Methods();
        //System.out.println("Q1 results are: " + LabMethods12.removeLeftRightChar(sentenceQ1,removeChar));


        /**
         * Given the school Data
         * student names : {"happy", "happiness", "joy", "give"}
         * student scores : {90, 89, 91, 97}
         *
         * write a method to return the name of the student who scored max marks.
         *
         */
        String[] studentNames = {"happy", "happiness", "joy", "give"};
        int[] studentScores = {90, 89, 91, 97};
        System.out.println("Student with max score is: " + LabMethods12.toReturnStudentWithMaxScore(studentNames,studentScores));

        /**
         * Sort a given int array
         *
         * int[] --> [20, 10, 44, 40]
         *
         * int[] --> [10, 20, 40, 44]
         *
         */
        int[] numToSort= {20, 10, 44, 40};
        LabMethods12.numToSortMethod((numToSort));
        System.out.println("THis better work: " + Arrays.toString(numToSort));

        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        System.out.println("After GOOGLE sort values are: " + Arrays.toString(arr));

    }
}

