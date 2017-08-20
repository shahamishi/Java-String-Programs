package com.test.stringPractice;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.util.*;
/**
 * Created by ashah on 8/18/17.
 */
//Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed and
// capitalize the first letter of each word. Words will be separated by only one space.
//Sample Test Cases
//        Input:"hello world"
//        Output:"Hello World"
//
//        Input:"i ran there"
//        Output:"I Ran There"
public class LetterCapitalize {
    private static String LetterCapitalize(String str) {
        StringBuffer sb = new StringBuffer();
        String[] words = str.split("\\s");
        char[] charArray;
        char character=0;
        for(String word: words){
            charArray = word.toCharArray();

                if((int)charArray[0] >= 97 && (int)charArray[0] <= 122){
                    character = (char)((int) charArray[0]-32);
                }
                sb.append(String.valueOf(character)).append(charArray,1,charArray.length-1).append(" ");

        }
        return sb.toString();

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide you input here");
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}
