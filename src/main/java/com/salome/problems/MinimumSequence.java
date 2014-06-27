package com.salome.problems;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/23/14
 * Time: 12:49 PM
 */

/* unfinished*/
public class MinimumSequence {

    public static int minSeq(int arr[], int reqSum){

        //initializations
        int num_items = arr.length;
        int sum=arr[0];
        int wl=0,wr=0;
        int minVal =Integer.MAX_VALUE;
        while(wl<=wr && wr<arr.length){
            //if sum <=0 then reset position of wl to wr and add wl increment wr
            if(sum<=0){
                wl=wr;
                wr++;
                sum=arr[wl];
                continue;
            }//sum is 0

            if(sum<=reqSum){
                //move wr to the right and add the wr to the sum
                wr++;
                sum = sum+ arr[wr];
                continue;
            }//sum lt or eq to reqSum

            if(sum>reqSum){
                //then we need to check if this is min seq number
                minVal = Math.min(minVal, wr-wl);
                //now slide the wl enugh number times to keep sum > reqSum && condition being wl <=wr
                while(wl<wr && sum>reqSum){
                    //keep moving wl to the right while removing its value from the sum
                    sum=sum-arr[wl];
                    if(sum > reqSum){
                        minVal = Math.min(minVal, wr-wl);
                    }//if sum gt reqSum
                    wl++;

                }//while wl lt wr
            if(wr>=arr.length-1)
                    break;
            }//if sum gt reqSum
        }//while
        return minVal;

    }

    public static void main(String args[]){

        int[] a ={4,3,5,6,1,8,7};
        int sum=6;
        System.out.print(minSeq(a,sum));
    }
}
