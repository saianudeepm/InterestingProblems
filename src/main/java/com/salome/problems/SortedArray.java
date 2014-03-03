package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */

/*Given a sorted integer array and a number, find the start and end indexes of the number in the array.

        Ex1: Array = {0,0,2,3,3,3,3,4,7,7,9} and Number = 3 --> Output = {3,6}
        Ex2: Array = {0,0,2,3,3,3,3,4,7,7,9} and Number = 5 --> Output = {-1,-1}

        Complexity should be less than O(n)*/


public class SortedArray {
    //binary search. If found then search to left of this repeat recursively to find start
    //binary search right side if found repeat till you find the final one.
    //O(log n)

    public static void main(String args[]){
        int test[] ={0,0,2,3,3,3,3,4,7,7,9};
        int result []= findSortedArrayRange(test,7);
        System.out.println(result[0] +","+result[1]);
    }
    public static int[] findSortedArrayRange(int arr[], int target){
        //binary search to find the index;
        int low=0;
        int high=arr.length;
        int foundIndex;
        int startIndex;
        int mid;
        //binary search for 1st occurrence
        foundIndex= bsearch(arr, low,high, target);
        if(foundIndex==-1){
            int retVal []={-1,-1};
            return retVal;
        }
        startIndex=foundIndex;

        //binary search left subarray for startIndex
        int tempIndex=startIndex;
        while(tempIndex!=-1){
            tempIndex = bsearch(arr, low, startIndex-1, target);
            if(tempIndex!=-1)
                startIndex=tempIndex;
        }

        //binary search right subarray for endIndex
        int endIndex=foundIndex;
        tempIndex=foundIndex;
        while(tempIndex!=-1){
            tempIndex = bsearch(arr,endIndex+1,high, target);
            if(tempIndex!=-1)
                endIndex=tempIndex;
        }
        int retVal []={startIndex,endIndex};
        return retVal;
    }
    public static int bsearch(int arr[],int low, int high, int target){
        int index=-1;
        int mid = low+(high-low)/2;
        while(low<high && mid!=0 && target==arr[mid-1]){
            mid = low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
        }
        return index;
    }
}
