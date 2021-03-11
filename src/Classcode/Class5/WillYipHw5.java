package Classcode.Class5;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class WillYipHw5 {
    public static void main(String[] args) {

        // Due: March 11th

        String fullName = "happy Dana Smith";
        /**
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */

        /**
         * 1. Does first name start with 'K' (ignore cases)
         */
        String[] fullNameArray = fullName.split(" ");
        int fullNameArrayLength = fullNameArray.length;
        boolean isStartWith_K = fullNameArray[0].equalsIgnoreCase("K");
        System.out.println("Does first name start with 'K'?: " + isStartWith_K);

        /** 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         **/

        //int fNameIndex1Length = fullNameArray[0].length();
        //String ignoreCase_a = "a";
        //String fullNameLowerCaseTwo = fullNameArray[1].toLowerCase();
        //System.out.println(fullNameLowerCaseTwo);
        //String fNIgnoreCaseEndWith_a = fullNameLowerCaseTwo.endsWith("a") ? fullNameLowerCaseTwo : "No last name entered";

        //String fullNameLowerCaseThree = fullNameArray.toString().toLowerCase();

        if (fullNameArrayLength==3) {
            String fullNameLowerCaseThree = fullNameArray[2].toLowerCase();
            String fNIgnoreCaseEndWith_a = fullNameLowerCaseThree.endsWith("a") ? fullNameLowerCaseThree : "No last name entered";
            System.out.println(fNIgnoreCaseEndWith_a);
        } else if (fullNameArrayLength==2){
            String fullNameLowerCaseTwo = fullNameArray[1].toLowerCase();
            String fNIgnoreCaseEndWith_a = fullNameLowerCaseTwo.endsWith("a") ? fullNameLowerCaseTwo: "No last name entered";
            System.out.println(fNIgnoreCaseEndWith_a);
        } else {
            System.out.println("No last name logged in for problem 2");
        }

        /** 3. If user has a last name, print the 1st letter of last name
                *      else print, "No last name entered"
         */
        if (fullNameArrayLength==3) {
            String fullNameLNFirstLetter3 = fullNameArray[2].substring(0,1);
            System.out.println("the 1st letter of last name is: " + fullNameLNFirstLetter3);
        } else if (fullNameArrayLength==2){
            String fullNameLNFirstLetter2 = fullNameArray[1].substring(0,1);
            System.out.println("the 1st letter of last name is: " + fullNameLNFirstLetter2);
        } else {
            System.out.println("No last name logged in for problem 3");
        }



        /** 4. Print the number of letters in the first name.
                */
        int fNameIndex1Length = fullNameArray[0].length();
        System.out.println("the number of letters in the first name is: " + fNameIndex1Length);




        //boolean fNameIndex1End_a_IgnoreCare = fullNameArray[1].endsWith("a");
        //String isfNameIndex1End_a_IgnoreCare = fullNameLowerCase[]


        //if
        //if fNLength >= 2 ?




        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */


        /**
         * Create abbreviation:
         * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String threeWordsSentence_2 =  "Lab sessIONS clAsses";
        String[] sentenceToAbbreviation = threeWordsSentence_2.split(" ");
        System.out.println(threeWordsSentence_2);
        String threeWordsSentence1 = sentenceToAbbreviation[0].substring(0,1).toUpperCase();
        String threeWordsSentence2 = sentenceToAbbreviation[1].substring(0,1).toUpperCase();
        String threeWordsSentence3 = sentenceToAbbreviation[2].substring(0,1).toUpperCase();

        System.out.println("three word sentence capital starting letters are: " + threeWordsSentence1 + threeWordsSentence2
        +threeWordsSentence3);




        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */
        String sentence_4 = "We all are here to learn good stuff";
        String[] sentence_4Array = sentence_4.split(" ");
        int sentence_4ArrayWordCount = sentence_4Array.length;
        System.out.println("the number of words in the sentence is: " + sentence_4ArrayWordCount);
    }
}
