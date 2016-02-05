package com.salome.search;

/**
 * Created by saianudeepm on 8/18/15.
 */
public class SimpleBinarySearch {
    
    public static int binarySearch(int a[] , int key){
        if(a.length==0)
            return -1;
        int low=0, high=a.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]<key){
                low=mid+1;
                System.out.printf("go right");
            }
            else if(a[mid]>key){
                high=mid-1;
                System.out.printf("go left");
            }
            else
                return mid;
            System.out.println("low: "+low+" high "+high);
        }
        return -1;
    }
    
    public static void main(String args[]){
        int a[] ={-2,4,5,6,7,8,12,15,18,19};
        int result= binarySearch(a,9);
        System.out.println(result);
        
    }
}
