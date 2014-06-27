package com.salome.problems;

import java.nio.ByteOrder;

/**
 * Created by saimachavarapu on 3/16/14.
 */
public class LogarithmCalculator {

    public static void main(String args[]){

        float n = 4f;
        int b=2;
        // System.out.print(log(n, b));
        System.out.print(logWithBitManipulation(n, b));
    }

    public static int log(float num, int base){
        if(num<=0)
            return -1;
        if(num==1)
            return 0;

        int result=0;
        while(num!=1){
            num = (int)num/base;
            result++;
        }
    return result;
    }

    public static int logWithBitManipulation(float num, int base){
        int mynum = (int)num;
        int result=0;
        System.out.println(java.nio.ByteOrder.nativeOrder());
        //if little endian
        if(ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)){
            while(mynum!=1){
                mynum = mynum>>1;
                result++;
            }
        }
        else if(ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)){
            while(mynum!=1){
                mynum = mynum<<1;
                result++;
            }
        }

        return result;
    }
}
