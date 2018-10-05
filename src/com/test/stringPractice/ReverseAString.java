package stringPractice;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/17/17.
 */

//Using the Java language, have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
// For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.

//    Sample Test Cases
//        Input:"coderbyte"
//        Output:"etybredoc"
//
//        Input:"I Love Code"
//        Output:"edoC evoL I"
public class ReverseAString {

        private static String FirstReverse(String str) {

            StringBuffer sb= new StringBuffer();
            for(int i=str.length()-1;i>=0;i--){
                sb.append(str.charAt(i));
            }
            return sb.toString();

        }

        public static void main (String[] args) {
            // keep this function call here
            System.out.println("Please print the string to reverse");
            Scanner s = new Scanner(System.in);
            System.out.print(FirstReverse(s.nextLine()));
        }

    }


