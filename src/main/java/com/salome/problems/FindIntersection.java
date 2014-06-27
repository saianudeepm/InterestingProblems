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
        int A[]={1,2,3,4,5,6,7,8,9,10,12,13};
        int B[]={5,6,7,8,9,12,13};
        intersect(A,B);
        System.out.println("\nmerge method output:");
        intersectUsingMerge(A,B);
    }

    //Using the hashSet
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

    //using merge step of merge sort
    public static void intersectUsingMerge(int[] A, int[] B){
        int aptr=0;
        int bptr=0;
        while(aptr<A.length && bptr<B.length){

            if(A[aptr]==B[bptr]){
                System.out.print(A[aptr]+ " ");
                aptr++;
                bptr++;
            }

            else if(A[aptr]<B[bptr]){
                aptr++;
            }
            else if(B[bptr]<A[aptr]){
                bptr++;
            }

        }

    }
}
