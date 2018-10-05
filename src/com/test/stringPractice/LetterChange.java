package stringPractice;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/17/17.
 */
//Using the Java language, have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. Replace every letter in the string with the letter following it in the alphabet
// (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
//Sample Output
//        Input:"hello*3"
//        Output:"Ifmmp*3"
//
//        Input:"fun times!"
//        Output:"gvO Ujnft!"

public class LetterChange {
    private static String LetterChanges(String str) {
        int ascii;
        char[] charArray = new char[]{'a','e','i','o','u'};

        StringBuffer sb = new StringBuffer();
        str=str.toLowerCase();
        String capitalizeChar="";
        for(int i=0;i<str.length();i++){
            ascii = (int) str.charAt(i);
            if(ascii == 122){
                sb.append(String.valueOf((char)97));
            }else if(ascii >=97 && ascii <=121 ){
                ascii++;
                if(new String(charArray).indexOf((char)ascii)!=-1 ){
                    capitalizeChar=String.valueOf((char)ascii).toUpperCase();
                    sb.append(capitalizeChar);
                }else{
                    sb.append(String.valueOf((char)ascii));
                }
            }else{
                sb.append(String.valueOf((char)ascii));
            }
        }
        return sb.toString();

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide your input");
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }
}
