package stringPractice;

import java.util.Scanner;

/**
 * Created by ashah on 8/21/17.
 */
//Rotate an array of n elements to the right by k steps.

//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
public class RotateArray {



    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an array to be rotated in a comma seperated form");
//        String arrayString = scanner.nextLine();
//        System.out.println("Enter a rotation factor");
//        String rotationFactor = scanner.nextLine();
//        String[] rotatedArray = rotateArray(arrayString.split(","),rotationFactor);
        int[] array = {1,2,3,4,5,6};
        rotate(array,2);
    }

//    private static String[] rotateArray(String[] array, String rotationFactor) {
//
//        return null;
//    }


    public static void rotate(int[] arr, int order) {


        System.out.println("Input: ");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]);
        }
        System.out.println("");
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if(order > arr.length){
            order = order %arr.length;
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        System.out.println("");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]);
        }
        reverse(arr, a, arr.length-1);
        System.out.println("");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]);
        }
        reverse(arr, 0, arr.length - 1);

        System.out.println("Output: ");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]);
        }
    }

    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
