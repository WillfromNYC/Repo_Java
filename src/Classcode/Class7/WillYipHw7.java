package Classcode.Class7;

import java.lang.reflect.Array;

public class WillYipHw7 {
    public static void main(String[] args) {

        // Due: Mar 18, 2021
        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        String sentence1 =  "hApPY nEW yeAr";
        String[] sentence1Array = sentence1.split(" ");
        String[] sentence1ArrayCap = new String[sentence1Array.length];
        String[] sentence1ArrayLowerCase = new String[sentence1Array.length];
        String[] sentence1ArrayCapAndLowerCase = new String[sentence1Array.length];
        /*for (String capitalAndLowercase : sentence1Array) {
            System.out.println("What is wrong? " + capitalAndLowercase);
        }*/
        for (int i=0;i<=sentence1Array.length-1;i++) {
            sentence1ArrayCap[i]= sentence1Array[i].substring(0,1).toUpperCase();//.substring(1, sentence1Array[i].length()-1).toLowerCase();
            sentence1ArrayLowerCase[i] = sentence1Array[i].substring(1).toLowerCase();//Don't do length()-1 as it will show 1 less index,also just leave blank
            sentence1ArrayCapAndLowerCase[i]= sentence1ArrayCap[i] + sentence1ArrayLowerCase[i];
            System.out.println(sentence1ArrayCapAndLowerCase[i]);//.toString());
            //System.out.print(sentence1ArrayCapAndLowerCase[i]); doesn't work
        }


        /**
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String sentence2 =  "Lab sessIONS clAsses";
        String[] sentence2Array = sentence2.split(" ");



        for (int i=0;i<=sentence2Array.length-1;i++) {
            String[] sentence2Cap =new String[sentence2Array.length];
            sentence2Cap[i]= sentence2Array[i].substring(0,1).toUpperCase();
            System.out.println(sentence2Cap[i]);
        }

        /*for (String[] sentence2ArrayCap : sentence2Array) { can't get this to work
            String[] sentence2Cap =sentence2ArrayCap.toLowerCase(); not able to figure out how to enter index to be adjusted
            System.out.println("");*/


        /*for (int i=0;i<=sentence2Array.length-1;i++) {
            sentence2Array[i]= sentence2Array[i].substring(0,1).toUpperCase().substring(1, sentence1Array[i].length()-1).toLowerCase();
            System.out.println(sentence2Array[i]);
        }*/


        //complex
         /*for (String sentenceIndex0Cap:sentence2Array){
             sentenceIndex0Cap=
         }*/



        /**
         * Reverse a string
         *
         */
        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("sentence3 : " + sentence3);     // happy holidays
        // code
        System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah

        String[] sentence3Array = sentence3.trim().split("");
        String[] sentence3ArrayReverse = new String [sentence3Array.length];

        for (int i=sentence3Array.length-1; i>=0;i--){
            sentence3ArrayReverse[i] = sentence3Array[i];
            System.out.println(sentence3ArrayReverse[i]);
        }

    }
}
