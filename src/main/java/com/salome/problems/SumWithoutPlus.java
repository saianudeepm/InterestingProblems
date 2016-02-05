package com.salome.problems;

/**
 * Created by saianudeepm on 8/20/15.
 */
public class SumWithoutPlus {
    
    public static void main(String args[]){
        System.out.println(add(-10,-5));
        
    }
    public static int add(int num1, int num2){
        for(int i=0;i<Math.abs(num2);i++){
            if(num2>0)num1++;
            else num1--;
        }
        return num1;
        
    }
}
