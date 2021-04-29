package Classcode.Class12AccessOOP;

public class WillYipHw11Printer {
    public static void main(String[] args) {
        /**
         * Create a Printer
         *
         * maxToner level = 100
         * maxPaper in tray = 100
         * with 1 page printing, 1 toner is being used **/
        PrinterCommands p1 = new PrinterCommands();
        //P1.printFile(5);


        /** print a files which is having 5 pages, print single sided
         * paperInTray = 95
         * toner = 95 **/


        /** print a files which is having 5 pages; print double sided
         *      paper-1     pg1,2
         *      paper-2     pg3,4
         *      paper-3     pg5
         *  paper used = 3
         *  toner used = 5
         *
         *  paperInTray = 92
         *  toner = 90 **/
        //p1.printFile(5,"double");


        /**  1. Create method 'print' which can be used to print single-sided or double-sided
         *      // If paper or toner is not enough to print, we display error msg saying, Not enough paper or toner
         * 2. Create method 'addPaper' to add papers in the tray
         * 3. Create method 'addToner' to add toner
         * 4. Create method 'printerSummary'
         *          Toner level: YY
         *          Paper in tray: XX
         */



        /**
         * Create object of Printer class.
         * Printer p1 = new Printer();
         *
         * p1.printerSummary();
         *          Toner level: 100
         *          Paper in tray: 100 **/
         p1.printerSummary();

         /** p1.print(10);        // single sided
         *
         * p1.printerSummary();
         *          Toner level: 90
         *          Paper in tray: 90 **/
         p1.printFile(10);


         /** p1.print(10, true);  // double sided **/
        p1.printFile(10,"double");

        /** p1.printerSummary();
         *          Toner level: 80
         *          Paper in tray: 85
         *
         * p1.print(9, true); **/
        p1.printFile(9,"doublePage");


         /** p1.printerSummary();
         *          Toner level: 71
         *          Paper in tray: 80 **/
         p1.printerSummary();

         /** p1.print(90);
         *     // If paper or toner is not enough to print, we display error msg saying, Not enough paper or toner **/

         p1.printFile(90);

        /** p1.printerSummary();
         *          Toner level: 61
         *          Paper in tray: 70
         *
         *
         * addToner(10)
         *    Toner level: 71 **/
         p1.addToner(10);

         /** addToner(30)
         *      // Invalid toner value **/
         p1.addToner(30);
         /** addToner(-10)
         *      // Invalid toner value **/
         p1.addToner(-10);


    }




}
