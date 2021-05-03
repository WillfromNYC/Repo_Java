package Classcode.Lab;

import java.util.ArrayList;
import java.util.HashMap;

public class discussionMockTest2 {
    public static void main(String[] args) {

        /*Harry's favourite number is X and Sam's favourite number is Y.
    A non-empty array Arr consisting of N integers is given.
    Harry and Sam are interested in occurrences of their favourite numbers X and Y in array Arr.
    They are looking for the longest leading fragment (prefix) of array Arr in which there is one occurrence of X and Y.
    Formally, they are looking for the longest P such that P<=N and
    the number of occurrences of X equals the number of occurrences of Y in the array Arr.
    For example, consider:
    1 X=7 and Y=42 and Arr={6, 42, 11, 7, 1, 42}
    Ans -> 4    (bcz, upto index-4 i.e. {6, 42, 11, 7, 1} ; 7 and 42 are present equal number of times)
    2 X=6  Y=13  Arr={13, 13, 1, 6}
    Ans -> -1  (bcz, there is no portion of Arr where 6 and 13 are in equal numbers)
    3 X=100  Y=63  Arr={100, 63, 100, 6, 2}
    And -> 1 (bcz, upto index-1 i.e. {100, 63} ; 100 and 63 are present equal number of times)
    4 X=10  Y=64  Arr={10, 32, 100, 64, 2, 55, 22}
    And -> 6 (bcz, upto index-6 i.e. {10, 64, 100, 6, 2, 55, 22} ; 10 and 64 are present equal number of times)*/

        /*LOGIC: set/create as List > find argument/2 inputs X and Y > for loop 2x: with int i and for loop j
         */
        int[] Arr ={6, 42, 11, 7, 1, 42}; //X=7 and Y=42
        int[] Arr2 = {13, 13, 1, 6}; //X=6  Y=13
        int[] Arr3 ={100, 63, 100, 6, 2}; //X=100  Y=63
        int[] Arr4={10, 32, 100, 64, 2, 55, 22}; //X=10  Y=64

        System.out.println("length = " + Arr.length);
        intDoubleOccurrence(Arr2,6,13);
    }

    public static void intDoubleOccurrence(int[] intArray, int num1, int num2) {
        int num1Count =0;
        int num2Count =0;

        int num1Index =0;
        int num2Index =0;

        int indexFragment =0;

        HashMap<Integer,Integer> occurrenceMap= new HashMap<>();

        for (int i=0; i<intArray.length;i++) {
            if (intArray[i]==num1 && num1Count!=2) {
                num1Count++;
            }
            if (intArray[i]==num2 && num2Count!=2) {
                num2Count++;


            }else if (num1Count ==1 && num2Count ==1 && intArray[i]!=num1 && intArray[i]!=num2 ) {
                indexFragment = i;
            }else if (num1Count>=1 && num2Count >=1 && (intArray[i]==num1 || intArray[i]==num2)) {
                indexFragment = i-1;


            } else if ((num1Count>=2 && num2Count ==0) || (num2Count>=2 && num1Count ==0) ) {
                indexFragment = -1;
                break;
            } /*else if (num1Count>=1 && num2Count >=1 && (intArray[i]==num1 || intArray[i]==num2)) {
                indexFragment = i + 10;
                break; //break gave: num1Count is: 1, num2Count is: 0, index Fragment = 0
            }*/



        }
        System.out.println("num1Count is: " + num1Count + ", num2Count is: " + num2Count + ", index Fragment = " +
                indexFragment);//

    }



}
