package Classcode.Class17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WYHw13Methods {
    public boolean DuplicatePresentMethod (String[] wordsArray) {
        boolean isDupPresent = false;
        int j=1;
        int count =0;
        for (int i = 0; i< wordsArray.length;i++) {
            if (j<=wordsArray.length) {
                if(wordsArray[i].contains(wordsArray[j])) {
                    count++;
                    j++;
                    isDupPresent=true;
                }
            }
        }
        return isDupPresent;
    }

    public Set returnDuplicationSet (String[] wordsArray) {
        Set<String> duplicateStrings = new HashSet<>();
        //int j=1;
        int count =0;
        for (int i = 0; i< wordsArray.length;i++) {
                for (int j = i+1;j<wordsArray.length;j++) {
                    if (wordsArray[i].equals(wordsArray[j])) {
                        duplicateStrings.add(wordsArray[i]);
                    }
                }
                /*if(wordsArray[i].contains(wordsArray[j])) { //contains ArrayIndexOutOfBoundsException: 9.add(wordsArray[i]);
                    if (j<=wordsArray.length) {
                    j++;}
                    i=-1;
                }*/
        }
        return duplicateStrings;
    }

    public List returnDuplicationList (String[] wordsArray,String[] duplicateStrings) {
        List<String> duplicateWordList = new ArrayList<>();
        //int j=1;
        int count =0;
        for (int i = 0; i< duplicateStrings.length;i++) {
            for (int j = 0;j<wordsArray.length;j++) {
                if (duplicateStrings[i].contains(wordsArray[j])) {
                    duplicateWordList.add(wordsArray[i]);
                    //int duplicate
                }
            }
                /*if(wordsArray[i].contains(wordsArray[j])) { //contains ArrayIndexOutOfBoundsException: 9.add(wordsArray[i]);
                    if (j<=wordsArray.length) {
                    j++;}
                    i=-1;
                }*/
        }
        return duplicateWordList;
    }


}
