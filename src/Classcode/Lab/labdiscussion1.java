package Classcode.Lab;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;

public class labdiscussion1 {
    public static void main(String[] args) {
        String valid = "";
        String invalid = ""; //don't need to create this as the below lines fill that purpose
        String myName = "William Yip";
        int myNameLength = myName.length();

        //Boolean validOrInvalid = myNameLength>10 ?"valid" : "invalid"; wrong bc need to use string
        String isNameLongerThan10 = myNameLength>10 ?"valid" : "invalid";
        System.out.println("Is my Name longer than 10? "+ isNameLongerThan10);

        char isMyNameCharIsLonger5 = myNameLength > 5 ? myName.charAt(0) : myName.charAt(myNameLength-1);
        System.out.println("Is my name longer than 5 char, if yes what is the first letter, if not what is the last char? " +
                isMyNameCharIsLonger5);

        String isMyNameStringIsLonger5 = myNameLength > 5 ? myName.substring (0,1) : myName.substring(myNameLength-1);
        System.out.println("Is my name longer than 5 char, if yes what is the first letter, if not what is the last char? " +
                isMyNameStringIsLonger5);

        String sentenceLong = " I am a good programmer and this is a good day to be cool";
        //StringArray afterSplit_oo = sentenceLong.split("oo");
        //System.out.println(afterSplit_oo);// Giving me results: Ljava.lang.String;@1b6d3586

        String yourFirstName = "William";
        String yourFirstNameLowerCase = yourFirstName.toLowerCase();
        int yourFirstNameLength = yourFirstName.length();
        String firstLetterName = yourFirstNameLowerCase.toUpperCase().substring(0,1);
        String firstLetterRestName = yourFirstNameLowerCase.substring(1,yourFirstNameLength);
        System.out.println("Your first name is :"+firstLetterName + firstLetterRestName);
        System.out.println("your first name length is: " + yourFirstNameLength);

        String sentence_1 = "Happy peace Grow";
        int sentence_1Length = sentence_1.length();
        //String vowels ="";
        int findIfSentence_1A = sentence_1.indexOf("a");
        int findIfSentence_1E = sentence_1.indexOf("e");
        int findIfSentence_1I = sentence_1.indexOf("i");
        int findIfSentence_1O = sentence_1.indexOf("o");
        int findIfSentence_1U = sentence_1.indexOf("u");


        //String doesSentence_1ContainVowels = sentence_1.contains("a") ||






    }
}
