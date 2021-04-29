package Classcode.Class19;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c19 {
    public static void main(String[] args) {
        Date currentTimePeriod = new Date();
        SimpleDateFormat sDF = new SimpleDateFormat("dd");

        String currentDateString = sDF.format(currentTimePeriod);

        for (int i=0;i<31;i++) {
            if (currentDateString.equals(String.valueOf(i))) {
                System.out.println("In first half is current date is less or equal to 15");
            } else {
                System.out.println("In second half");
            }
        }


        System.out.println(currentTimePeriod);


    }
}
