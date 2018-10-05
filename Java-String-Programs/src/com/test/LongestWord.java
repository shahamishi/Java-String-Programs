package com.test.stringPractice;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/17/17.
 */
//Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
// If there are two or more words that are the same length, return the first word from the string with that length.
//Ignore punctuation and assume sen will not be empty.
//Sample Test Cases
    //Input:"fun&!! time"
    //Output:"time"
    //
    //Input:"I love dogs"
    //Output:"love"
public class LongestWord {

    private static String LongestWord(String sen) {

        int lengthOfLongestWord = 0;
        String longestWord = "";
        List<String> words = new ArrayList<String>(Arrays.asList(sen.split("[\\p{Punct}\\s]+")));
        for(String word: words) {
//            System.out.println(word);
            if(word.length()>lengthOfLongestWord){
                lengthOfLongestWord=word.length();
                longestWord=word;
            }
        }
        return longestWord;

    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.println("Provide a sentense");
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
