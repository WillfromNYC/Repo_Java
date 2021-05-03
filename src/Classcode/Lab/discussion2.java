package Classcode.Lab;

public class discussion2 {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        int average = (test[0]+test[1]+test[2]+test[3]+test[4])/5;
        System.out.println("average of the 5 int arrays is: " + average);
        System.out.println("better info is The average of {1,2,3,4,5} or Arrays.toString(test) is: "+ average);

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN"}
         * String nameToSearch = "";
         *
         * Print the position of searched named.
         * if name not found, print "XXXX is not present in the array"
         *
         */
        String[] names = {"john", "happy", "peACe", "jOy", "LEarN"};
        String nameToSearch = "jOy";

        if (names[0].equalsIgnoreCase(nameToSearch)) {
            System.out.println("Position of searched name: " + "1");
        } else if (names[1].equalsIgnoreCase(nameToSearch)) {
            System.out.println("Position of searched name: " + "2");
        } else if (names[2].equalsIgnoreCase(nameToSearch)) {
            System.out.println("Position of searched name: " + "3");
        } else if (names[3].equalsIgnoreCase(nameToSearch)) {
            System.out.println("Position of searched name: " + "4");
        } else if (names[4].equalsIgnoreCase(nameToSearch)) {
            System.out.println("Position of searched name: " + "5");
        } else {
            System.out.println("XXXX is not present in the array");
        }
        int position = 0;

        if (names.length>=3 && names[0].contains("o")) {
            position = 1;
        } else if (names.length>=3 && names[1].contains("o")) {
            position = 2;
        } else if (names.length>=3 && names[2].contains("o")) {
            position = 3;
        } else if (names.length>=3 && names[3].contains("o")) {
            position = 4;
        } else if (names.length>=3 && names[4].contains("o")) {
            position = 5;
        } else {
            System.out.println("none exist");
        }

        //this method will not work because it doesn't search through all the index, for loop would work













    }
}
