package Classcode.Class17;

import java.util.Arrays;
import java.util.List;

public class Class17 {
    public static void main(String[] args) {
        String[] words = {"hApPy", "peace", "joy", "grow", "peace", "LearN", "joy", "peace", "happy", "joy", "world"};
        List<String> assignment1 = Arrays.asList(words);
        int count = 0;
        for (String word:assignment1) {

            if(word.contains("grow"))  {
                count++;
            }

        }System.out.println("Count = " + count);


    }
}
