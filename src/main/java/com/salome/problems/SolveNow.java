package com.salome.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/24/14
 * Time: 9:59 AM
 */

/*
* */


public class SolveNow{

public static void main(String args[]){
    //pascalsTriangle(8);
    //System.out.println(canIWin(15, 100));
    //printPermute(new int[]{1,2,3});
    
}   
    
    
    
    
    // f(o)=0; f(1)=1; f(2)=1; f(3)=2; f(4)=3; f(5)=5 ; f(6)=8
    
    public static int fibonacci(int n){
        if(n==0) return 0;
        
        if(n==1) return 1;
        
        int cache1=0;
        int cache2=1;
        int result=0;
        for(int i=2;i<=n;i++){
            result =cache2+ cache1;
            cache1=cache2;
            cache2=result;
        }
        
        return result;
    }
    
    public static void pascalsTriangle(int n){
        int a[][]= new int[n][n];
        for(int i=0;i<n;i++){
            a[i][0]=1;
        }
        for(int i=0;i<n;i++){
            a[i][i]=1;
        }
        
        if(n>2){
            for(int j=2;j<n;j++){
                for(int k=1;k<j; k++){
                    a[j][k] = a[j-1][k-1] + a[j-1][k];

                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
            
        }
    }

//1.    
    
   static Boolean canIWin(int maxChoosableInteger, int desiredTotal) {
// Implementation here. Write yours 
        int playOneChoice = maxChoosableInteger;
        int playTwoChoice = 1;
        int sum1=0;
        int sum2=0;
        int counter=0;
       while(counter<maxChoosableInteger){
           sum1+= playOneChoice--;
           counter++;
           if(sum1>=desiredTotal)  break;
           sum2+= playTwoChoice++;
           counter++;
       }
       System.out.println(sum1);
       if(sum1>=desiredTotal) return true;
       else return false;
    }

    //Given a string array ex: [1, 2, 3], find the permutation in best time.

    static void printPermute(int [] input){
        String oldStr=String.valueOf(input[0]);
        String newStr=String.valueOf(input[1]);
        List<String> result = new ArrayList<String>();
        
        for(int i=1;i<input.length;i++){
            if(result.size()==0)
                result=permute(oldStr,newStr);
            else{
                int iterSize = result.size();
                for(int j=0;j<iterSize;j++){
                    List<String> tempResult = permute(result.get(j),Integer.toString(input[i]));
                    result.addAll(tempResult);
                }
            }
        }
        for(String item:result){
            System.out.println(item);
        }
    }

    static List<String> permute(String oldString, String newString){
        List<String> permuteStrings = new ArrayList<String>();
        for(int i=0; i<=oldString.length();i++){
            int chrptr=0;
            StringBuffer sb = new StringBuffer();
            //append old chars to sb at ith position
            while(chrptr<i){
                sb.append(oldString.charAt(chrptr++));
            }
            //append the new char
            sb.append(newString);
            //finish off the rest of the positions till we hit the end of old string
            while(chrptr<oldString.length()){
                sb.append(oldString.charAt(chrptr++));
            }
            permuteStrings.add(sb.toString());
        }
        return permuteStrings;
    }
    
    
}
