package Classcode.Class12AccessOOP;

import java.util.Arrays;

public class labC12Methods {

    /**
     * Write a method to read a string and
     * returns after removing the # and its immediate left and right characters.
     *
     * The given strings is : test#string
     * Method should return : testring
     */

    String removedPoundLeftRight;
    int poundIndexes;
    int count;

    public String[] removeLeftRightChar (String[] sentenceQ1, String removeChar) {
        System.out.println("values of sentenceQ1: " + Arrays.toString(sentenceQ1) + " ,char to remove is: " + removeChar
         + " ,length is: " + sentenceQ1.length);
        for (int i =0; i<sentenceQ1.length;i++){
            //while (removedPoundLeftRight=removedPoundLeftRight+sentenceQ1[i]) {
                if (sentenceQ1[i]!="#"){
                    count++;
                    System.out.println("index is now: " + i);
            }
        }
        System.out.println("Count for appearance of # is: " + count);
        return sentenceQ1;



    }

    /**
     * Given the school Data
     * student names : {"happy", "happiness", "joy", "give"}
     * student scores : {90, 89, 91, 97}
     *
     * write a method to return the name of the student who scored max marks.
     *
     */

    public String toReturnStudentWithMaxScore(String[] studentNames,int[] studentScores) {
        String studentMax="";
        int maxScoreIndex = 0;
        int maxScore = 0;

        for (int i = 0; i<studentScores.length;i++) {
            if (maxScore<studentScores[i]) {
                maxScore=studentScores[i];
                maxScoreIndex=i;
            }
        }

        System.out.println("Max score is: " + maxScore + " , at index: " + maxScoreIndex);
        studentMax=studentNames[maxScoreIndex];


        return studentMax;
    }

    /**
     * Sort a given int array
     *
     * int[] --> [20, 10, 44, 40]
     *
     * int[] --> [10, 20, 40, 44]
     *
     */
    public int[] numToSortMethod(int[] numToSort) {
        //int[] numSorted = {numToSort.length-1};


        Arrays.sort(numToSort);

        System.out.println("After sort values are: " + Arrays.toString(numToSort));

        return numToSort;
    }

}
