package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */
public class Solve {
    public static void main(String args[]){
       System.out.println("start");
       System.out.println("");
        log(9);
    }

    public static void log(int num){
        int result=0;
        while(num!=1){
            num= num/2;
            result++;
        }
        System.out.println(result);
    }
}
