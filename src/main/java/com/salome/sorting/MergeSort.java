package com.salome.sorting;

/**
 * Created by saianudeepm on 8/20/15.
 */
public class MergeSort {
    public static void main(String args[]){
        Integer i[]= {2,4,1,3,5,7,8,0};
        mergeSort(i,0,7);
        System.out.println(i);
        //merge(i,new Integer[i.length],0,3,7);
        
    }
    
    public static void mergeSort(Comparable a[],int low, int hi){
        if(hi<=low)
            return;
        int mid=low+(hi-low)/2;
        mergeSort(a, low,mid);
        mergeSort(a, mid+1, hi);
        merge(a, new Integer[a.length],low,mid,hi);
        System.out.println(a);
        
    }
    
    public static void merge(Comparable a[], Comparable aux[], int low, int mid, int hi){
        
         //copy over the contents in to aux and then manipulate a such that its fine.
         //copy over to aux 
        for(int k=low;k<=hi;k++){
            aux[k]= a[k];
        }
        int i=low,j=mid+1;
        for(int k=low;k<=hi;k++){
            if(i>mid){
                a[k]= aux[j++];
            }else if(j>hi){
                a[k]=aux[i++];
            }
            else if(less(aux[i],aux[j])) {
                a[k]=aux[i++];
            }

            else{
                    a[k]=aux[j++];
                }
        }
       
    }

    private static boolean less(Comparable a, Comparable b) {
        if(a.compareTo(b)==-1)
            return true;
        else
            return false;
    }
}
