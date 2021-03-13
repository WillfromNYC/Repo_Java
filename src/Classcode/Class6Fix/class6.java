package Classcode.Class6Fix;

public class class6 {
    public static void main(String[] args) {

        /**base on month, name, print season
         * dec, jan, feb > winter season
         * mar, apr, may > summer season
         * jun, jul, aug > fall season
         * sep, oct, nov > spring season
         * if invalid month name, print "Invalid month name -XXX"
         */

        String monthName= "dECember";
        String monthThreeLetter = monthName.trim().substring(0,3).toLowerCase();
        System.out.println("testing: " + monthThreeLetter);

        switch (monthThreeLetter) {
            case "dec":
            case "jan":
            case "feb":
                System.out.println("winter season");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("summer season");
                break;
            case "jun":
            case "jul":
            case "aug":
                System.out.println("fall season");
                break;
            case "sep":
            case "oct":
            case "nov":
                System.out.println("spring season");
                break;
            default:
                System.out.println("Invalid month name -" + monthName);





        }

    }
}
