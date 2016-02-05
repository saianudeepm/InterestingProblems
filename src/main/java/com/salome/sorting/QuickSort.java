package com.salome.sorting;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by saianudeepm on 8/20/15.
 */

//Shuffle items in the array, then chose a pivot as first element
// then you partition
// you repeat this step for the left partition and right partition
public class QuickSort {
    
    public void sort(Comparable input[]){
        Collections.shuffle(Arrays.asList(input));
        partition(input, 0, input.length - 1);
        
    }
    
    public static void sort(Comparable input[], int lo, int hi){
        if(hi<=lo) return;
        int j = partition(input, lo,hi);
        sort(input,lo,j-1);
        sort(input,j+1,hi);
        
    }
    public static int partition(Comparable input[], int lo, int hi){
        
        int i=lo, j=hi+1;
        while(true){
            while(less(input[i++],input[lo])){
                if(i>j) break;
            }
            while(less(input[lo],input[j--])){
                if(j<i) break;
            }
            if(i>=j) break;
            exchange(input,i,j);
        }
        exchange(input,lo,j);
        return j;
    }

    private static void exchange(Comparable[] input, int lo, int hi) {
        Comparable temp = input[lo];
        input[lo]=input[hi];
        input[hi]=temp;
    }

    private static boolean less(Comparable a, Comparable b) {
        if(a.compareTo(b)==-1)
            return true;
        else
            return false;
    }
    
}
