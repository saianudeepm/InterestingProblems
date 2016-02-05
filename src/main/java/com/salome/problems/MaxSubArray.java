package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */
/*
Maximum value Continuous Subsequence:
        Given array A[n] find continuous subsequence a[i]..a[j] for which sum of elements in the subsequence is maximum.

        Ex: {-2, 11, -4, 13, -5, -2} --> 11 - 4 +13 = 20
        {1, -3, 4, -2, -1, 6} --> 4 -2 -1 +6 = 7
        {2,-2, 3,-4,5,7}
        Time complexity should O(nlogn)
*/


public class MaxSubArray {

    public static void main(String args[]){
        int a[] = {-2, -2,-3,-4};
        System.out.print(maxSum(a));
    }


    public static int maxSum(int a[]){
        assert a.length!=0;
        Boolean foundPositive=false;
        int maxSum=a[0];

        //---------------
        //handling case where all the items are <=0
        //---------------
        for(int i=0;i<a.length;i++){
            if(a[i]>0)
                foundPositive=true;
        }
        if(foundPositive!=true){
            for(int i=0;i<a.length;i++){
                maxSum = Math.max(a[i], maxSum);
            }
            return maxSum;
        }
        //---------------
        //atleast one positive case
        //---------------
        maxSum=0;
        int currSum =0;
        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum <0)
                currSum=0;
        }
        return maxSum;
    }
}
