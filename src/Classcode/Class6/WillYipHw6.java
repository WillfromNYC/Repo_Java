package Classcode.Class6Fix;

import java.text.DecimalFormat;

public class WillYipHw6 {
    public static void main(String[] args) {
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 456;
        double maxScore = 700;
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z

        double gradeScore = (studentScore/maxScore) * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The score currently is: " + df.format(gradeScore));

        if (100.00000001<=gradeScore) {
            System.out.println("incorrect student score entered" );
        } else if (91<=gradeScore) {
            System.out.println("Your score is: Grade A" );
        } else if (81<=gradeScore) {
            System.out.println("Your score is: Grade B" );
        } else if (71<=gradeScore) {
            System.out.println("Your score is: Grade D" );
        } else if (61<=gradeScore) {
            System.out.println("Your score is: Grade E" );
        } else if (51<=gradeScore) {
            System.out.println("Your score is: Grade E" );
        } else {
            System.out.println("Your score is: Grade F" );
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */

        int numberToBeDivided = 7;
        if (numberToBeDivided%3==0 && numberToBeDivided%5==0) {
            System.out.println("divisible by both");
        } else if (numberToBeDivided%5==0){
            System.out.println("divisible by 5");
        } else if (numberToBeDivided%5==0){
            System.out.println("divisible by 3");
        } else {
            System.out.println("the value is not divisible by 3 or 5, here is your entered value: " + numberToBeDivided);
        }



        /**
         * Checking car gear (P, D, N, R)           // switch
         * if car gear is P, display "you can park the car"
         * if car gear is D,
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car gear is N, display "put car in car wash"
         * if car gear is R, display  "revere the car"
         */
        char carGear = 'e';
        String carGearIgnoreCaseCapital = String.valueOf(carGear).toUpperCase();
        String driveType = "spOrt";
        int driveTypeLength = driveType.length();
        String capitalFLetterLowerWord = driveType.trim().substring(0,1).toUpperCase()+driveType.substring(1,driveTypeLength)
                .toLowerCase();
        System.out.println("Checking for formatted drive type: " + capitalFLetterLowerWord);


        switch (carGearIgnoreCaseCapital) {
            case "P":
                System.out.println("you can park the car");
                break;
            case "D":
                if (capitalFLetterLowerWord.equalsIgnoreCase("snow")) {
                    System.out.println("You are on Snow mode");
                }else if (capitalFLetterLowerWord.equalsIgnoreCase("Sport")) {
                    System.out.println("You are on Sport mode");
                }else {
                    System.out.println("You are on Eco mode");
                }
                break;
            case "N":
                System.out.println("put car in car wash");
                break;
            case "R":
                System.out.println("revere the car");
                break;
            default:
                System.out.println("You have entered an incorrect letter, please try again thank you");
        }






    }



}
