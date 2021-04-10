package Classcode.Class12;

public class PrinterCommands {

    private int maxToner =100;
    private int maxPaper =100;
    int pageInTray = 100;
    int tonerInTray = 100;
    

    public void printFile (int printNumber) { //no int after void BC no return is needed with void
        if (pageInTray-printNumber>0 && tonerInTray-printNumber>0 && printNumber>0) {
            pageInTray=pageInTray-printNumber;
            tonerInTray=tonerInTray-printNumber;
        } else {
            System.out.println("Not enough paper or toner or check numbers entered");
        }
        System.out.println("Single print successful. The number of pages in your tray is: " + pageInTray + ", toner in tray is: " + tonerInTray);

    }

    public void printFile (int printNumber, String doublePage) {
        int printDoubleNumberAdjust=0;
        if((printNumber/2)%1!=0) {
            printDoubleNumberAdjust=printNumber/2+1;
        } else {
            printDoubleNumberAdjust=printNumber/2;
        }

        if (pageInTray-printNumber>0 && tonerInTray-printNumber>0 && printNumber>0) {
            pageInTray=pageInTray-(printDoubleNumberAdjust);
            tonerInTray=tonerInTray-printNumber;
        } else {
        System.out.println("Not enough paper or toner or check numbers entered");
    }
        System.out.println("Double print successful. The number of pages in your tray is: " + pageInTray + ", toner in tray is: " + tonerInTray);

    }

    public void addPaper(int paperAddAmount) {
        if (pageInTray+paperAddAmount<maxPaper && paperAddAmount>0) {
            pageInTray=pageInTray+paperAddAmount;
        } else {
            System.out.println("Your paper adding request has exceeded the max amount");
        }
    }

    public void addToner(int TonerAddAmount) {
        if (tonerInTray+TonerAddAmount<maxToner && TonerAddAmount>0) {
            tonerInTray=tonerInTray+TonerAddAmount;
        } else {
            System.out.println("Your toner adding request has exceeded the max amount or incorrect number added");
        }
    }

    public void printerSummary() {
        System.out.println("Summary: Current page level is: " + pageInTray + ", current level for toner is: " + tonerInTray);
    }


}
