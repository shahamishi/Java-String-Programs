package stringPractice;
import java.util.*;
import java.io.*;
/**
 * Created by ashah on 8/18/17.
 */

//Using the Java language, have the function SimpleSymbols(str) take the str parameter being passed and determine
// if it is an acceptable sequence by either returning the string true or false.
// The str parameter will be composed of + and = symbols with several letters between them
// (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol.
// So the string to the left would be false. The string will not be empty and will have at least one letter.
//Sample Test Cases
//        Input:"+d+=3=+s+"
//        Output:"true"
//
//        Input:"f++d+"
//        Output:"false"
public class SimpleSymbols {
    private static boolean SimpleSymbols(String str) {
        boolean result=false;
        int asciiOfCurrentChar;
        char[] charArray  = str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            asciiOfCurrentChar=(int)charArray[i];
            if(i==0 && ((asciiOfCurrentChar>=65 && asciiOfCurrentChar<= 90) || (asciiOfCurrentChar >=97 && asciiOfCurrentChar <=122)) ){
                return result;
            }else if((asciiOfCurrentChar>=65 && asciiOfCurrentChar<= 90) || (asciiOfCurrentChar >=97 && asciiOfCurrentChar<=122)){
                if(charArray[i-1] == '+' && charArray[i+1] == '+'){
                    result=true;
                }else{
                    result=false;
                }
            }
        }
        return result;

    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide your input here");
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleSymbols(s.nextLine()));
    }

}
