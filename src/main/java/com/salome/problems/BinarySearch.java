package com.salome.problems;

/**
 * Created by saianudeepm on 9/3/15.
 */
public class BinarySearch {
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 1,1,2,3, 2, 3};
        System.out.println(binarySearch(arr, 4));

    }

    public static int binarySearch(int src[],int target){
        if(src==null )return -1;
        return  binSearchRotatedIter(src, 0, src.length-1, target);

    }
    //recursively
    public static int  binSearchRecursive(int src[], int lo, int hi, int target){
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(src[mid]==target) return mid;
        else if(src[mid]<target) return binSearchRecursive(src, mid+1, hi, target);
        else if(src[mid]>target) return binSearchRecursive(src, lo, mid-1, target);
        else return -1;
    }
    //iterative
    public static int  binSearchIter(int src[], int lo, int hi, int target){

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(src[mid]==target) return mid;
            else if(src[mid]<target){
                lo=mid+1;
            }
            else if(src[mid]>target){
                hi=mid-1;
            }
        }
        return -1;

    }
    
    
/* we use the sorted half to make a decision if the target element lies in the sorted half. if it does we update lo or hi accordingly other wise we know its not there in sorted half
* so we update the lo/hi pointers for it to look in the other unsorted half* **/
    public static int  binSearchRotatedIter(int src[], int lo, int hi, int target){

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(src[mid]==target) return mid;
            //if bottom half is sorted
            if(src[lo]<=src[mid]){
                
                if(src[lo]<=target && target<src[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
            //if upper half is sorted
            else{
                if(src[mid]<target && target<=src[hi]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return -1;
}

}
