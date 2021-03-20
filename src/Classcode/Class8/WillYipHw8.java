package Classcode.Class8;

import com.sun.xml.internal.ws.util.StringUtils;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class WillYipHw8 {
    public static void main(String[] args) {

// Due March 22

        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        DecimalFormat df = new DecimalFormat("0.00");
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double totalDouble = 0;

        //for loop > totalDouble = totaldouble + doubleArray Index > print totaldouble

        for (double doubleArrayIndex : doubleArray) {
            totalDouble += doubleArrayIndex;
        }
        System.out.println("the total value of the double array is: " + totalDouble);




        /**
         * task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */
        String word = "lEveL";
        String[] wordArray = word.trim().split("");
        String isPalindrome= "";

        /*//create empty isPalindrome > for loop to create reverse word > set to equal to isPalindrome > cannot use if else because some index will
        equal, can use boolean at the end to compare the 2 strings. Maybe can use while loop
        -so since it needs to be reverse, probably can't use enhanced loop
        */

        for (int i= wordArray.length-1; i>=0;i--) {
            isPalindrome = isPalindrome + wordArray[i];
        }
        System.out.println("the reverse string's value is currently: " + isPalindrome);

        boolean isWordAPalindrome = word.equals(isPalindrome);
        System.out.println("Is the word entered a palindrome? " + isWordAPalindrome);


        /**
         * task3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int number = 29;
        int[] primeNumbers = {};

        //prime numbers were copied into excel in one column, then a comma was pasted in the other resulting in below copy and pasting results:
        String testToIntAndArray = "2\t,\n" +
                "3\t,\n" +
                "5\t,\n" +
                "7\t,\n" +
                "11\t,\n" +
                "13\t,\n" +
                "17\t,\n" +
                "19\t,\n" +
                "23\t,\n" +
                "29\t,\n" +
                "31\t,\n" +
                "37\t,\n" +
                "41\t,\n" +
                "43\t,\n" +
                "47\t,\n" +
                "53\t,\n" +
                "59\t,\n" +
                "61\t,\n" +
                "67\t,\n" +
                "71\t,\n" +
                "73\t,\n" +
                "79\t,\n" +
                "83\t,\n" +
                "89\t,\n" +
                "97\t,\n" +
                "101\t,\n" +
                "103\t,\n" +
                "107\t,\n" +
                "109\t,\n" +
                "113\t,\n" +
                "127\t,\n" +
                "131\t,\n" +
                "137\t,\n" +
                "139\t,\n" +
                "149\t,\n" +
                "151\t,\n" +
                "157\t,\n" +
                "163\t,\n" +
                "167\t,\n" +
                "173\t,\n" +
                "179\t,\n" +
                "181\t,\n" +
                "191\t,\n" +
                "193\t,\n" +
                "197\t,\n" +
                "199\t,\n" +
                "211\t,\n" +
                "223\t,\n" +
                "227\t,\n" +
                "229\t,\n" +
                "233\t,\n" +
                "239\t,\n" +
                "241\t,\n" +
                "251\t,\n" +
                "257\t,\n" +
                "263\t,\n" +
                "269\t,\n" +
                "271\t,\n" +
                "277\t,\n" +
                "281\t,\n" +
                "283\t,\n" +
                "293\t,\n" +
                "307\t,\n" +
                "311\t,\n" +
                "313\t,\n" +
                "317\t,\n" +
                "331\t,\n" +
                "337\t,\n" +
                "347\t,\n" +
                "349\t,\n" +
                "353\t,\n" +
                "359\t,\n" +
                "367\t,\n" +
                "373\t,\n" +
                "379\t,\n" +
                "383\t,\n" +
                "389\t,\n" +
                "397\t,\n" +
                "401\t,\n" +
                "409\t,\n" +
                "419\t,\n" +
                "421\t,\n" +
                "431\t,\n" +
                "433\t,\n" +
                "439\t,\n" +
                "443\t,\n" +
                "449\t,\n" +
                "457\t,\n" +
                "461\t,\n" +
                "463\t,\n" +
                "467\t,\n" +
                "479\t,\n" +
                "487\t,\n" +
                "491\t,\n" +
                "499\t,\n" +
                "503\t,\n" +
                "509\t,\n" +
                "521\t,\n" +
                "523\t,\n" +
                "541\t,\n";
        System.out.println(testToIntAndArray);
        String removeTAndNLine = testToIntAndArray.trim().replace("\t","").replace("\n","");
        System.out.println(removeTAndNLine);
        //now that we removed \t and \n, lets convert a string to int array, but first we need to remove the last ",";
        //String removeTAndNLineAndLastComma =

        if (removeTAndNLine.endsWith(",")) {
            removeTAndNLine = removeTAndNLine.substring(0,removeTAndNLine.length()-1);
        }
        System.out.println("removeTAndNLine value is now: " + removeTAndNLine); //==removeTAndNLine value is now: 2,3,5,7,11,13,17,19,23
        //now to convert to int Array
        System.out.println("removeTAndNLine length is: " + removeTAndNLine.length());//it is 370, I think because of the empty spac created by \t and \n
        //need to try trim to remove the extra spaces
        String removeTAndNLineTrimmed = removeTAndNLine.trim();
        System.out.println("removeTAndNLineTrimmed value is now: " + removeTAndNLineTrimmed);//its 370 because 370 is the numbers and the ","; need for loop
        //to remove the extra 0, but for finding prime numbers the multiple zeros won't be a problem, but will slow the processing of the answer

        //int[] primeNumbersInt = removeTAndNLine.split(","); //wants a int string
        int[] primeNumbersInt= new int [removeTAndNLine.length()]; //need to create the length of the index first, then create String array
        String[] primeNumbersStringArray = removeTAndNLine.trim().split(",");
        System.out.println("primeNumbersInt length is: " + primeNumbersInt.length);


        for (int i=0; i <=primeNumbersStringArray.length-1;i++) {
            primeNumbersInt[i]= Integer.parseInt(primeNumbersStringArray[i]);
        }
        System.out.println("primeNumbersInt's value is: " + Arrays.toString(primeNumbersInt));

        //create for loop with primeNumbersInt, then inside the for loop create an if statement, else it is not a prime number or the value is beyond 541
        boolean isPrime = true;
        for (int i=0; i<=primeNumbersInt.length-1;i++) {
            if (number==primeNumbersInt[i]) {
                isPrime = true;
                break;
            } else {
                isPrime=false;
                /*System.out.println("isPrime is not a prime number or above 541 value calculations limit");
                * don't print here, it printed 370 times*/
            }
        }
        System.out.println("isPrime a prime number?: " + isPrime);
        System.out.println("the database is limited to prime numbers up to 541");


        /* need to establish the prime numbers,
        *
        * */


    }
}
