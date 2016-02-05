package com.salome.cracking.stacksandqueues;

import com.salome.ds.stacks.Stack;
import com.salome.ds.stacks.StackUsingLinkedList;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class StackWithMin<T extends Comparable> {
    
    public static void main(String args[]){
/*        StackUsingLinkedList stk = new StackUsingLinkedList();
        stk.push(10);
        stk.push(20);
        stk.push("hello");
        System.out.println(stk.isEmpty());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.isEmpty());*/

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        for(int i: stack){
            System.out.println(i);

        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        
    }
    
}
