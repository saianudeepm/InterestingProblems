package com.salome.problems;

import com.salome.ds.stacks.Stack;

/**
 * Created by saianudeepm on 8/20/15.
 */
public class Infix {
    
    public static void main(String args[]){
        
        String input = "((1-2)*3)";
        infix(input.toCharArray());
    }
    
    public static void infix(char[] input){
        Stack<Integer> operandStack = new Stack<Integer>();
        Stack<Character> operatorStack = new Stack<Character>();
        //iterate the input
        int result = 0;
        for(char ch: input){
            if(ch=='('){
                //do nothing
                continue;
            }    
            else if(ch==')'){
                int b =operandStack.pop();
                int a=operandStack.pop();
                try {
                      result=getResult(a,b,operatorStack.pop());
                       operandStack.push(result);
                    }
                catch (Exception e){
                    e.printStackTrace();
                }
                
            }
            else if(isOperatr(ch)){
                operatorStack.push(ch);
            }
            else{
                operandStack.push(ch -'0');
                
            }
        }
        System.out.println(result);
        
    }
    private static int getResult(int a, int b, char operator) throws Exception {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
        }
        throw new Exception("Illegal operator Exception");
    }
    
    private static boolean isOperatr(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                return true;
        }
        return false;
    }
}
