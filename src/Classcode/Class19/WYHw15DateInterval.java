package Classcode.Class19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WYHw15DateInterval {
    public static void main(String[] args) {
        /**
         * Question:
         * Create a method that will take an int as input.
         * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
         */
        timeInterval(11,5);

        // sout(generateTimeline(5));
        // 9pm 11pm 1am 3am 5am

        // sout(generateTimeline(5));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm


        // sout(generateTimeline(10));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am

        /*-take int(time) as input, set it to a time format (hh), allow 2nd input to set amount of interval 2 hours after,
        create for loop (set intervals by 2 somehow and have it print every 2 hours
        * */


    }

    public static void timeInterval(int hours, int intervalRequest) { //
        Date convertedDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("hh"); //:mm:ss a
        String hourstoString = String.valueOf(hours);

        //testing + plugging variables
        int test11 = 02;
        String testLength = "asdfje";
        int test = hours;
        Date currentTime = new Date();

        if (hourstoString.length()>2) {
            System.out.println("Please put hours only");
        }

        System.out.println("String pattern: " + hourstoString);

        try {
            convertedDate = sdf.parse(hourstoString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String dateFormmated = sdf.format(convertedDate);
        System.out.println("Time is: " + convertedDate);

        for (int i=0;i<intervalRequest;i++) { //increment by 2 is i+=2
            hourstoString = String.valueOf(hours+(i*2));
            try {
                convertedDate = sdf.parse(hourstoString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dateFormmated = sdf.format(convertedDate);
            System.out.println(convertedDate);
        }

    }
}
