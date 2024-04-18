package StacksAndQueue;

import java.util.Stack;

public class MinimumInsertionstoBalanceaParenthesesString {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int power = 0;
        for(char c : s.toCharArray()){
            if(c=='(') stack.push(c);
            else if(c==')'){
                if((!stack.isEmpty())&& stack.peek()=='('){
                    if(power==1){
                        stack.pop();
                        power = 0;
                    }
                    else power++;
                }
                else stack.push(c);
            }
        }
        System.out.println(stack);
        int open = 0;
        int close = 0;
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                open++;
                stack.pop();
            }
            else{
                close++;
                stack.pop();
            }
        }
        System.out.println(open + " " + close);

        return stack.size() + power;

    }
    public static void main(String[] args) {
        MinimumInsertionstoBalanceaParenthesesString m = new MinimumInsertionstoBalanceaParenthesesString();
        System.out.println(m.minInsertions("))())("));
        System.out.println(m.minInsertions("(((((("));
    }
}
