package com.salome.problems;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/23/14
 * Time: 11:46 AM
 */

/**
Given an array of integers, sort the array into a wave like array, namely
        a1 >= a2 <= a3 >= a4 <= a5.....
 O(n) solution
*/

public class WaveArray {
    public static void waveArray(int[] a){
        for(int i=0; i<a.length-1;i++){
            if(i%2==0){//even case
                //if not greater than next swap
                if(!(a[i]>=a[i+1])){
                    swap(a,i,i+1);
                }
            }//even case close
            else{ //odd case
                //if not less than next then swap
                if(!(a[i]<=a[i+1])){
                    swap(a,i,i+1);
                }
            }//odd case close

        }//for close

    }//waveArray() close


    public static void swap(int[]a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    /*
    * a < b > c < d > e
    * */
    public static void waveArray2(int[] a){
        for(int i=0; i<a.length-1;i++){
            if(i%2==0){//even case
                //if not less than next swap
                if(!(a[i]<=a[i+1])){
                    swap(a,i,i+1);
                }
            }//even case close
            else{ //odd case
                //if not less than next then swap
                if(!(a[i]>=a[i+1])){
                    swap(a,i,i+1);
                }
            }//odd case close

        }//for close

    }//waveArray() close


    public static void main(String args[]){
        int[] a={7,6,5,4,3,2,1};
        //int[] a={-7,-5,-4,-3,-2,-1};
        waveArray2(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
