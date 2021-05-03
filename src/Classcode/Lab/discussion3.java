package Classcode.Lab;

import java.sql.Array;
import java.util.Arrays;

public class discussion3 {
    public static void main(String[] args) {
        int [] mrArray = {11,44,22,66,44,76};

        //create empty reverse array, for loop with the length as i, set empty reverse equal to results

        int[] reverseArray = new int[mrArray.length];

        for (int i= mrArray.length-1; i>=0;i--) {
            reverseArray[(mrArray.length-1)-i]+= mrArray[i];
            System.out.println(Arrays.toString(reverseArray));
        }
        System.out.println(Arrays.toString(reverseArray));

        /**
         * Count the number of times a given string is present in a given paragraph.
         */
        String paragraph = "Are you searching for Essay Writing Topics in English for various competitions and speeches for school events? Then you are on the right page here you will get all kinds of topics for essay writing in English. As we have gathered numerous essay topics in long and short forms for all classes students. Yes, what you heard is correct, this page is filled with Long essays for class 10, 9, 8, 7, and Short essays for class 6, 5, 4, 3, 2, 1. So, anyone can check out this Essay Writing in English Article on AplusTopper for school events & competitions. Moreover, you can also find 10 lines on the selected far topic in English for the speeches in school programs. These Ten lines in English will assists students and teachers at the time of school speeches on special events. Hence, students can refer to the below provided a massive list of essays in English and participate in any kind of events conducted by schools. For the sake of class 1 to 10 students, we have also covered 10 Lines and Essay on 'My School' in English and Hindi here.";
        String wordToFind = "SCHOOL";
        String wordToFindLower = wordToFind.toLowerCase();

        int count=0;

        //string split,for loop, if loop(paraArray[i] = wordToFind; count "a string" ++; sout (count)

        String[] paragraphArray = paragraph.split(" ");

        for (String paragraphWord:paragraphArray) {
            if (paragraphWord.contains(wordToFindLower)){ // if (==) did not work, need to know why
                count++;
            }

        }
        System.out.println(count);

        String[] myWords = {"peace", "Happy", "happiness", "haPPy", "grow", "happYss", "Learn", "Help", "HappY", "Listen", "Peace"};


        String happy = "happy";
        String happyIndex = "";
        int[] happyIndexArray= new int[0];
        int count1 = 0;

        for (int i=0; i<= myWords.length-1;i++) {
            if (myWords[i].equalsIgnoreCase("happy")) { //equal will not find values that equal happy because that doesn't exist
                //in the myWords
              count1++;
            }

        }
        System.out.println("the count is: " + count1);

        int[]happyIndexArrayCount1 = new int[count1];
        int j = 0;

        for (int i=0; i<= myWords.length-1;i++) {
            if (myWords[i].equalsIgnoreCase("happy")) {
                happyIndexArrayCount1[j] = i; //logic= j is set at zero, once the index is assigned to it, how to move to next happyIndexArrayCount1?
                //
                j++;
            }
        }
            System.out.println(Arrays.toString(happyIndexArrayCount1));










    }
}
