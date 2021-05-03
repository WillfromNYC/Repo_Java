package April8Test;

import java.util.Arrays;

public class April8ExamMethod {

    public String returnedArray(int[] inputArrayQ1, int removeNumberQ1) {
        //int[] returnEditArray = {0};
        int returnEditArrayCount =0;

        for (int inputIndex:inputArrayQ1) {
            if (inputIndex!=removeNumberQ1) {
                returnEditArrayCount++;
            }
        }System.out.println(returnEditArrayCount);

        int count =0;
        int[] returnEditArray = new int [returnEditArrayCount];
        System.out.println("returnEditArray: " + Arrays.toString(returnEditArray));
        for (int i = 0; i<inputArrayQ1.length;i++) {
            if (inputArrayQ1[i]!=removeNumberQ1) {
                returnEditArray[count]=inputArrayQ1[i];
                count++;

            }
        }
        System.out.println("The values of the index are: " + Arrays.toString(returnEditArray));
        return Arrays.toString(returnEditArray);

        /**
         * Question 1:
         * Create a method to return an int-array
         * after removing a given int-value from a given int array.
         *
         * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
         * Returned array: {32, 14, 98, 56, 148, 78}
         *
         * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
         * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
         */
        //int[] inputArrayQ1 = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        //int removeNumberQ1 = 24;
    }

    public int returnMissingPositiveInt (int[] arrayQ2) {
        int missingPosInt = 0;
        int postiveIntChange =1;
        int arrayQ2Length = arrayQ2.length;
        int[] Q2PosArray =new int[arrayQ2Length];
        System.out.println("Q2PosArray length: " + arrayQ2Length);
        String[] intToStringArrayPos = new String[arrayQ2Length];
        String[] intToStringArray = new String[arrayQ2Length];

        Arrays.sort(arrayQ2);
        System.out.println(Arrays.toString(arrayQ2));
        //[1, 2, 3, 4, 5, 7]

        for (int i=1; i<=arrayQ2.length;i++) {
            if (i!=arrayQ2[i-1]) {
                missingPosInt=i;
            }
        }
        return missingPosInt;
    }

    public int[] toSortIntArray (int[] intArray) {
        int[] sortedIntArray = new int[intArray.length];
        int j=0;
        int lowArrayValue =0;
        for (int i=0;i<intArray.length;i++) {
           // if (intArray[i]>)
        }

        return sortedIntArray;
    }

    public void returnPoints(int speedInput) {
        int speedLimit = 70;
        int pointsNeededToSuspend = (5*12) + 70;
        System.out.println("pointsNeededToSuspend: " + pointsNeededToSuspend);
        double pointsViolation = (speedInput-70)/5;
        System.out.println("pointsViolation: " + pointsViolation);

        if (pointsViolation>=12) {
            System.out.println("license is suspended");
        } else if (pointsViolation>=10) {
            System.out.println("points on license is: 11");
        } else if (pointsViolation>=9) {
            System.out.println("points on license is: 9");
        } else if (pointsViolation>=8) {
            System.out.println("points on license is: 8");
        } else if (pointsViolation>=7) {
            System.out.println("points on license is: 7");
        } else if (pointsViolation>=6) {
            System.out.println("points on license is: 6");
        } else if (pointsViolation>=5) {
            System.out.println("points on license is: 5");
        } else if (pointsViolation>=4) {
            System.out.println("points on license is: 4");
        } else if (pointsViolation>=3) {
            System.out.println("points on license is: 3");
        } else if (pointsViolation>=2) {
            System.out.println("points on license is: 2, 70-75(1),80-85(1)");
        } else if (pointsViolation>=1) {
            System.out.println("points on license is: 1, 70-75(1)");
        } else {
            System.out.println();
        }
    }

    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user speed is such that system shows 12 points for a speed
     *      then print, license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */




}
