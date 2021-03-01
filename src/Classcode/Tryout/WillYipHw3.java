package Classcode.Tryout;

import java.text.DecimalFormat;

public class WillYipHw3 {

    public static void main(String[] args) {
        /**
         * Convert deg-Cel into Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 21.111;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp + "°C --> " + fTemp + "°F");

        /**
         * Homework #3:
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> F
         * K -> C
         *
         */
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("C -> F: " + df.format(fTemp));

        double cToKTemp = cTemp + 273.15;
        System.out.println("C -> K: "+ df.format(cToKTemp));

        double fToCTemp = (fTemp - 32) * 5/9;
        System.out.println("F -> C: "+ df.format(fToCTemp));

        double fToKTemp = (fTemp + 459.67)* 5/9;
        System.out.println("F -> K: " + df.format(fToKTemp));

        double kToFtemp = (cToKTemp * 9/5) - 459.67;
        System.out.println("K -> F: "+ df.format(kToFtemp));

        double kToCTemp = fToKTemp - 273.15;
        System.out.println("K -> C: " + df.format(kToCTemp) );


    }
}
