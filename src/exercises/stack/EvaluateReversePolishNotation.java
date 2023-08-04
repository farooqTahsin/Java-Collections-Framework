package exercises.stack;

/*
    You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
    Evaluate the expression. Return an integer that represents the value of the expression.
    Note that:
        The valid operators are '+', '-', '*', and '/'.
        Each operand may be an integer or another expression.
        The division between two integers always truncates toward zero.
        There will not be any division by zero.
        The input represents a valid arithmetic expression in a reverse polish notation.
        The answer and all the intermediate calculations can be represented in a 32-bit integer.
*/

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[]args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s : tokens ) {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int n1=0,n2=0;
                if(stack.peek().charAt(0)=='-') {
                    n2=-1*Integer.parseInt(stack.peek().substring(1,stack.peek().length()));
                    stack.pop();
                }
                else n2 = Integer.parseInt(stack.pop());
                if(stack.peek().charAt(0)=='-') {
                    n1=-1*Integer.parseInt(stack.peek().substring(1,stack.peek().length()));
                    stack.pop();
                }
                else n1 = Integer.parseInt(stack.pop());

                switch (s) {
                    case "+": stack.push(n1+n2+""); break;
                    case "-": stack.push(n1-n2+""); break;
                    case "*": stack.push(n1*n2+""); break;
                    case "/": stack.push(n1/n2+""); break;
                }
            }
            else stack.push(s);
        }
        return Integer.parseInt(stack.pop());
    }
}
