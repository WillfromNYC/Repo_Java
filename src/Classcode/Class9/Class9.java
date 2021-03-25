package Classcode.Class9;

import java.util.Arrays;

public class Class9 {

    public static void main(String[] args) {
    //greetUserByFirstName("  JoHN  "); //this just sets name, doesn't print or anything
        System.out.println("First Name is: " + greetUserByFirstName("jOhnaThan"));


    }

    public static void add2IntNumbers(int num1, int num2) {
        int res = num1 + num2;
        System.out.println("res --> " + res);
    }

    public static int divideIntNumbers(int numDiv1, int numDiv2) {
        int dividedNumber = numDiv1/numDiv2;
        System.out.println("The result of the two entered numbers are: " + dividedNumber);
        return dividedNumber;

    }

    public static String greetUserByFirstName (String fName) {
        String greetingFName = fName.trim().substring(0,1).toUpperCase()+fName.trim().substring(1).toLowerCase();
        return greetingFName;
    }

    public static String greetUserByFirstNameArray (String fName) {
        String greetingFName = fName.trim().substring(0, 1).toUpperCase() + fName.trim().substring(1).toLowerCase();
        return greetingFName;
    }



}



