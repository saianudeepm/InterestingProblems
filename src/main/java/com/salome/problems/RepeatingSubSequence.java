package com.salome.problems;

import java.util.HashMap;

/**
 * Created by saimachavarapu on 3/2/14.
 */

/*
Find all the repeating sub-string sequence of specified length in a large string sequence. The sequences returned i.e. the output must be sorted alphabetically.

        For e.g.

        Input String: "ABCACBABC"
        repeated sub-string length: 3

        Output: ABC

        Input String: "ABCABCA"
        repeated sub-string length: 2

        Output: AB, BC, CA
*/


public class RepeatingSubSequence {

    public static void main(String args[]){
        findSubSequence("ABCABCA", 2);


    }
    public static String[] findSubSequence(String input, int len){
        HashMap<String,Integer> cMap = new HashMap<String, Integer>();
        for(int i=0;i<input.length()-(len-1);i++){

            String subStr= input.substring(i, i + len);
            if(cMap.get(subStr)!=null)
                cMap.put(subStr,cMap.get(subStr)+1);
            else
                cMap.put(subStr,1);
        }
        for(String key:cMap.keySet()){
            if(cMap.get(key)>1){
                System.out.println(key);
            }
        }
        return null;
    }
}
