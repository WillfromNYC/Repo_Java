package Classcode.Lab;

import java.util.*;

public class discussion7 {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(101,"happy");
        myMap.put(10,"job");
        myMap.put(908,"learn");
        myMap.put(1111,"grow");
        myMap.put(76,"HappY");
        Integer checkKey = 22;
        // write code here
        // if value with given key is of length greater than 4 -->
        //      print the value
        // else -->
        //      print 'value not greater than 4'
        // if the given key is not found -->
        //      print 'key not available'

        Set<Integer> allkeys = myMap.keySet();
        for (Integer key:allkeys) {
            int length4 = myMap.get(key).length();
            if (length4 > 4 ){
                System.out.println(key);
            } else {
                System.out.println("key not available");
            }

        }

        /**
         * Student name: john
         * Student Score: 90, 89, 76, 89, 100
         *
         * Student name: harry
         * Student Score: 70, 89, 76, 89, 100
         *
         * Student name: reene
         * Student Score: 90, 77, 98, 98, 100
         *
         * Student name: domino
         * Student Score: 90, 89, 100, 89, 100
         *
         * Student name: joy
         * Student Score: 89, 89, 77, 89, 98
         *
         * Store the data in a appropriate variable.
         *
         */
        //class method
        Map<String, Integer[]>  scores = new HashMap<>();
        Integer[] studentScores = {90, 89, 76, 89, 100};
        scores.put("john", studentScores);

        Map<String, List<Integer>>  scores2 = new HashMap<>();
        Integer[] studentArray = {90, 89, 76, 89, 100};
        Integer[] studentArray1 = {70, 89, 76, 89, 100};
        Integer[] studentArray2 = {90, 77, 98, 98, 100};
        Integer[] studentArray3 = {90, 89, 100, 89, 100};
        Integer[] studentArray4 = {89, 89, 77, 89, 98};

        List<Integer> studentjohn = Arrays.asList(studentArray);
        List<Integer> studentHarry = Arrays.asList(studentArray);
        List<Integer> studentreene = Arrays.asList(studentArray);
        List<Integer> studentdomino = Arrays.asList(studentArray);
        List<Integer> studentjoy = Arrays.asList(studentArray);
        scores2.put("john", studentjohn);
        scores2.put("Harry", studentHarry);
        scores2.put("reene", studentreene);
        scores2.put("domino", studentdomino);
        scores2.put("joy", studentjoy);

        System.out.println(scores);
        System.out.println(scores2);
        /*int maxTotalScore = scores2.containsValue();


       for (String findMaxTotal:scores2.keySet()) {
           if (scores2.)

       }*/


    }


}
