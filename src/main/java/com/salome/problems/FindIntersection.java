package com.salome.problems;

import java.util.HashSet;

/**
 * Created by saimachavarapu on 3/3/14.
 */

/*There are 2 sorted sets.Find the common elements of those sets
        e.g.
        A={1,2,3,4,5,6}
        B={5,6,7,8,9}
        o/p C={5,6}

        Complexity should ne 0(n+m) where n and m is the size of the first and second set respectively

        Which data structure should be used to store the output*/
public class FindIntersection {

    public static void main(String args[]){
        int A[]={1,2,3,4,5,6};
        int B[]={5,6,7,8,9};
        intersect(A,B);
    }

    public static void intersect(int[] A, int[] B){
        HashSet<Integer> interSet = new HashSet<Integer>();
        for(int i:A){
            interSet.add(i);
        }
        for( int j:B){
            if(interSet.contains(j)){
                System.out.print(j+" ");
            }
        }
    }
}
