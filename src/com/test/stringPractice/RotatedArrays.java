package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ashah on 8/18/17.
 */
public class RotatedArrays {

    private static boolean determineIfRotatedArrays(String[] first,String[] second){
        if(first.length!=second.length){
            return false;
        }
        if(Arrays.equals(first,second)){
            return false;
        }
        List<String> firstList = Arrays.asList(first);
        List<String> secondList = Arrays.asList(second);
        int startingCounterForSecond=0;
        if(!secondList.contains(firstList.get(0))){
            return false;
        }else {
            startingCounterForSecond = secondList.indexOf(firstList.get(0));
            for(int i=0;i<firstList.size()-1;i++){
                if(firstList.get(i).equals(secondList.get(startingCounterForSecond))){
                    if(startingCounterForSecond == secondList.size()-1){
                        startingCounterForSecond=0;
                    }else {
                        startingCounterForSecond++;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please provide your first array");
        String firstCommaSeperatedString = scanner.nextLine();
        String[] firstArray = firstCommaSeperatedString.split(",");

        System.out.println("Please provide your second array");
        String secondCommaSeperatedString = scanner.nextLine();
        String[] seconddArray = secondCommaSeperatedString.split(",");

        System.out.println("The two arrays are rotated ? " + determineIfRotatedArrays(firstArray,seconddArray));

    }

}
