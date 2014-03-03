package com.salome.problems;

import java.util.Stack;

/**
 * Created by saimachavarapu on 3/3/14.
 */
public class PostFix {
    private static void evaluatePostfixExpression() throws Exception {
        String s = "345+*612+/-";
        Stack<Integer> stack = new Stack<Integer>();
        char[] array = s.toCharArray();
        int i = 0;
        while (i < array.length) {
            if (isOperatr(array[i])) {
                int b = stack.pop();
                int a = stack.pop();
                int c = getResult(a, b, array[i]);
                stack.push(c);
            } else {
                stack.push(array[i] - '0');
            }
            i++;
        }
        System.out.println(stack.pop());
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
