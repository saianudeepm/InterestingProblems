package com.salome.problems;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/23/14
 * Time: 10:29 AM
 */
public class Quicksort  {
    private int[] numbers;
    private int number;
    Random random;

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        random=  new Random();
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        //int pivot = numbers[low + (high-low)/2];
        int pivot = low+ random.nextInt(high-low);
        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String args[]){
        int a[]={7,5,1,2,4,6};
        Quicksort obj = new Quicksort();
        obj.sort(a);
        for(int item:a){

            System.out.println(item);
        }
        Random random =  new Random();
        System.out.print(random.nextInt());
    }
}
