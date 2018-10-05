package stringPractice;

import java.util.Scanner;

/**
 * Created by ashah on 8/18/17.
 */
//Compress a string if a letter repeats more than 4 times (aaaaabbc -> a5bbc)
public class CompressString {

    private static String CompressString(String str) {
        char[] charArray = str.toCharArray();
        StringBuffer resultString = new StringBuffer();
        int repition=0;
        char lastChar=charArray[0];
        char currentChar;
        int j=1;
        resultString.append(charArray[0]);
        for(int i=0;i<charArray.length;i++){

            if(i!=0){
                lastChar=charArray[i-1];
            }

            currentChar = charArray[i];

            if(currentChar==lastChar){
                repition++;
            }else if(repition>4){

                resultString.append(repition).append(currentChar);
                repition=1;

            }else{
                for(int k=0;k<repition-1;k++){
                    resultString.append(lastChar);
                }
                resultString.append(currentChar);
                repition=1;
            }
        }
        if(repition>4){

            resultString.append(repition);

        }else{
            for(int k=0;k<repition-1;k++){
                resultString.append(lastChar);
            }

        }

        return resultString.toString();
    }
    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Please provide you input here");
        Scanner s = new Scanner(System.in);
        System.out.print(CompressString(s.nextLine()));
    }
}
