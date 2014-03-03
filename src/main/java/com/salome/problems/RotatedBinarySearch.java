package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */

/*There is rotated sorted array.Write the program to find any element in that array
        Original Array A={1,2,3,5,6,7,8}
        Rotated Array B={5,6,7,8,1,2,3}

        Write the program to find any element in array B*/


public class RotatedBinarySearch {

    public static void main(String args[]){
        int B[]={5,6,7,8,1,2,3};
        System.out.println(rotated_binary_search(B,1));
    }



    public static int rotated_binary_search(int A[], int key) {
        int L = 0;
        int R = A.length - 1;

        while (L <= R) {
            // Avoid overflow, same as M=(L+R)/2
            int M = L + ((R - L) / 2);
            if (A[M] == key) return M;

            // the bottom half is sorted
            if (A[L] <= A[M]) {
                if (A[L] <= key && key < A[M])
                    R = M - 1;
                else
                    L = M + 1;
            }
            // the upper half is sorted
            else {
                if (A[M] < key && key <= A[R])
                    L = M + 1;
                else
                    R = M - 1;
            }
        }
        return -1;
    }
}
