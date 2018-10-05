package stringPractice;

import java.util.Scanner;

/**
 * Created by ashah on 8/23/17.
 */
//Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

//The input string does not contain leading or trailing spaces and the words are always separated by a single space.

//        For example,
//        Given s = "the sky is blue",
//        return "blue is sky the".
public class ReverseString {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your input:");
        String input = scanner.nextLine();
//Inefficient way
        String output = reverseStringByBuider(input);
        System.out.println("The reverse string is:"+ output);
//Efficient way
        char[] inputArray = input.toCharArray();
        reverseWords(inputArray);
        System.out.println(inputArray);




    }


    private static String reverseStringByBuider(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString();
    }

    public static void reverseWords(char[] s) {

        //First it reverses each words' chars except the last word
        int i=0;

        for(int j=0; j<s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
            }
        }
        //Reverses the last word's chars
        reverse(s, i, s.length-1);
        //Reverses the whole array of characters.
        reverse(s, 0, s.length-1);
    }

    public static void reverse(char[] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
