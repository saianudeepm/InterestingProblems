package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */
    /*You have two arrays of integers, where the integers do not repeat and the two arrays have no common integers.
    Let x be any integer in the first array, y any integer in the second. Find min(Abs(x-y)).
    That is, find the smallest difference between any of the integers in the two arrays.
    Assumptions: Assume both arrays are sorted in ascending order.*/
public class MinAbsDiff {

    public static void main(String args[]){
        int [] arr1 = {0,1,2,3,4};
        int [] arr2 = {5,6,7,8,9};
        System.out.println(minAbsDiff(arr1, arr2));

    }

    public static int minAbsDiff(int [] arr1, int[] arr2){
        //this will be a O(n^2) if we do it using bruteforce
        // we need to iterate over one array and do a binary search in second
        // Complexity will be O(n logn)
        Integer min = Math.abs(arr2[arr2.length-1] - arr1[0]);
        for(int i: arr1){
            int temp =binaryDiffSearch(arr2,i,min);
            min = Math.min(temp,min);
        }
        return min;
    }

    public static int binaryDiffSearch(int [] arr, int target, int min){
        Integer result =min;
        int left =0;
        int right=arr.length -1;
        int mid = (left+right)/2;

        while(left<right){

            if(target ==arr[mid]){
                return 0;
            }
            //get the abs difference of values of mid, mid-1, mid+1

            int midValPrevDiff =min;
            int midValAftDiff =min;
            int midValDiff = diff(arr[mid],target);

            if(mid>1)
                midValPrevDiff= diff(arr[mid-1], target);

            if(mid<arr.length-1)
                midValAftDiff= diff(arr[mid+1], target);

            result = Math.min(result,midValDiff);
            result= Math.min(result,midValPrevDiff);
            result=Math.min(result,midValAftDiff);

            //search right
            if(target>arr[mid]){
                left=mid+1;
            }
            //search left
            else if(target<arr[mid]){
                right=mid-1;
            }
            mid = (left+right)/2;
        }
        return result;
    }
    public static int diff(int i, int j){
        return Math.abs(i-j);
    }
}
