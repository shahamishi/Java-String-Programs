package stringPractice;

import java.util.Stack;

/**
 * Created by ashah on 8/23/17.
 */
//Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /.
// Each operand may be an integer or another expression.
//     ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//     ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

//This problem can be solved by using a stack. We can loop through each element in the given array.
// When it is a number, push it to the stack.
// When it is an operator, pop two numbers from the stack, do the calculation, and push back the result.
public class ReversePolishNotation {

    public static void main(String[] args){

        String[] input1 = {"2", "1", "+", "3", "*"};
        String[] input2 = {"4", "13", "5", "/", "+"};

        int result1 = reversePolishNotationCalculation(input1);
        System.out.println ("The result for input1 is: "+ result1);

        int result2 = reversePolishNotationCalculation(input2);
        System.out.println ("The result for input1 is: "+ result2);
    }

    private static int reversePolishNotationCalculation(String[] input) {
        String sign="+-*/";
        Stack<String> stack = new Stack<String>();
        int number1;
        int number2;
        int result=0;
        for(int i=0;i<input.length;i++){
            if(sign.contains(input[i])){
                number1=Integer.parseInt(stack.pop());
                number2=Integer.parseInt(stack.pop());
                result=calculate(input[i], number1, number2);
                stack.push(String.valueOf(result));
            }
            else{
                stack.push(input[i]);
            }
        }
        return result;
    }

    private static int calculate(String s, int number1, int number2) {
        String sign ="+-*/";
        int result=0;
        switch (s){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number2 - number1;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number2 / number1;
                break;
        }
        return result;
    }

}
