package exercises.stack;

/*
    Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
    Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
*/

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[]args) {
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }
    public static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int sum = 0, sign = 1 ;
        for(int i =0; i < s.length(); i++)
            if(Character.isDigit(s.charAt(i))) {
                int temp = 0 ;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    temp = temp* 10 + (s.charAt(i) - '0');
                    i++ ;
                }
                i-- ;
                sum+=(temp*sign);
                sign=1;
            }
            else if(s.charAt(i) == '('){
                st.push(sum);
                st.push(sign);
                sum = 0 ; sign = 1;
            }
            else if(s.charAt(i)  == ')'){
                sum = sum * st.pop();
                sum += st.pop();
            }
            else if(s.charAt(i)  == '-') sign = sign * -1 ;
        return sum ;
    }
}
