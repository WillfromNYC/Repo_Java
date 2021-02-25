package Classcode.Tryout;

public class JavaHw1 {
    public static void main(String[] args) {
        /*
        Store below scenario value in an appropriate dataType variable, and print the same in console.
            1. number of hours in a day (byte)
            2. max no. of days in an year
            3. total number of employees in an organization
            4. population in a country
            5. interest rate
            6. balance in a bank account
            7. does the sun rise from the west? Store answer
            8. initials of your name (^Use: char)
         */
        byte totalHoursDay = 24;
        System.out.println("Total hours in a day is: " + totalHoursDay);
        int NoDayYear = 365;
        System.out.println("Max number of  days in a year is: " + NoDayYear);
        int employeesNumber = 300;
        System.out.println("Total employees in org is: " + employeesNumber);
        int populationCountry = 4000000;
        System.out.println("the population in the country is: " + populationCountry);
        double mortgageRate = 0.05d;
        System.out.println("the current interest rate is: " + mortgageRate);
        double balanceAccount = 16869.54;
        System.out.println("the current bank balance is: " + balanceAccount);
        boolean isSunriseWest = false;
        System.out.println("Does the sun rise from the west? " + isSunriseWest);
        char firstName = 'W';
        char lastName = 'Y';
        System.out.println("My first and last initials of my name are:" + firstName + lastName);
    }
}
