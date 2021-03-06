package Classcode.Class4;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class WillYipHw4 {
    public static void main(String[] args) {
        // Due : March 8

        String sentence_3 = "hello dear, how are you?";
        boolean result;
        int sentence3Length = sentence_3.length();
        boolean isSentence3Greater10 = sentence3Length>10;
        System.out.println("Is sentence 3 greater than 10?: " + isSentence3Greater10);
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         *
         * Hint: use ternary operator
         */



        String sentence_4 = "We all ARe Good ProgRommeR";
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         */
        String sentence_4Lowercase = sentence_4.toLowerCase();
        String sentence4Replace_r_f = sentence_4Lowercase.replace("r", "f");
        System.out.println("sentence4 with r replaced with f: " + sentence4Replace_r_f);


        String fullName = "William Yip";
        /**
         * 1. Display the length of your fullname.
         * 2. Does your name start with 'K' (ignore cases)
         * 3. Does your full name contain 'a' (ignore cases)
         */
        System.out.println("My full name is: " + fullName);

        Boolean isStartWithK = fullName.startsWith("K");
        System.out.println("Does my name start with 'K'?: " + isStartWithK);

        Boolean isContain_a = fullName.contains("a");
        System.out.println("Does my full name contain an 'a'? " + isContain_a);





    }
}
