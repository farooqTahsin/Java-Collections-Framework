package exercises.stack;

import java.util.Stack;

/*

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
        1- Open brackets must be closed by the same type of brackets.
        2- Open brackets must be closed in the correct order.
        3- Every close bracket has a corresponding open bracket of the same type.

*/
public class ValidParentheses {
    public static void main(String[]args) {
        System.out.println(isValid("()[]{}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(') {
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()) return false;
                else {
                    if( (s.charAt(i)==')' && st.pop()!='(') ) return false;
                    else if( (s.charAt(i)==']' && st.pop()!='[') ) return false;
                    else if( (s.charAt(i)=='}' && st.pop()!='{') ) return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
