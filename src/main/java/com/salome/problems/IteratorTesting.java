package com.salome.problems;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/8/14
 * Time: 1:15 AM
 */
public class IteratorTesting  {
 int x = 10;


    public IteratorTesting(int i ){
        this.x = i;
    }



    /*public static void main(String args[]){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        PriorityQueue<Integer> myq = new PriorityQueue<Integer>();
        myq.add(3);
        myq.add(9);
        myq.add(2);
        myq.addAll(Arrays.asList(5,6,7,9,1,2,3,4));
        Integer [] temp = {2,5,1,2,3,7,8,3};
        //Arrays.sort(temp,comparator));
        System.out.println(myq);

        System.out.println("corret way to print");
        for(int i=0;i<myq.size();i++){
            System.out.print(myq.poll()+", ");
        }
    }*/



}
