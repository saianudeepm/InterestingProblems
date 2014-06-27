package com.salome.problems;

/**
 * Created by saimachavarapu on 3/16/14.
 */

/**


        A non-empty zero-indexed array A consisting of N integers is given. The leader of this array is the value that occurs in more than half of the elements of A.
        Write a function
        int arrLeader(int A[], int N);
        that, given a non-empty zero-indexed array A consisting of N integers, returns the leader of array A. The function should return −1 if array A does not contain a leader.
        Assume that:
        N is an integer within the range [1..1,000,000];
        each element of array A is an integer within the range [0..2147483647].
        For example, given array A consisting of ten elements such that:
        A[0] = 4 A[1] = 2 A[2] = 2
        A[3] = 3 A[4] = 2 A[5] = 4
        A[6] = 2 A[7] = 2 A[8] = 6
        A[9] = 4
        the function should return −1, because the value that occurs most frequently in the array, 2, occurs 5 times, and 5 is not more than half of 10.
        Given array A consisting of five elements such that:
        A[0] = 100 A[1] = 1 A[2] = 1
        A[3] = 50 A[4] = 1
        the function should return 1.
        Complexity:
        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
        Elements of input arrays can be modified.
*/

        /**
         * The below algorithm loops through each element and maintains a count of a[majorIndex],
            If next element is same then increments the count, if next element is not same then decrements the count,
            and if the count reaches 0 then changes the majorIndex to the current element and sets count to 1.
            First Phase algorithm gives us a candidate element. In second phase we need to check if the candidate
            is really a majority element. Second phase is simple and can be easily done in O(n).
            We just need to check if count of the candidate element is greater than n/2.
        */
public class Leader {

    public static void main(String args[]){
        int []a = {4,2,2,3,2,4,2,2,6,4};
        int []a1 = {1,1,100,50,1};
        int []a2 = {1,2,3,1,1,4};
        System.out.println(findLeadingInteger(a2));


    }

    public static int findLeadingInteger(int A[]){
        int majorIndex =0;
        int count=0;
        // we find the potential candidate using this approach
        //******** Phase 1 ***********
        for(int i=0;i<A.length;i++){
            // if the current position value is not same as our candidate leader
            if(A[i]!=A[majorIndex]){
                //decrement the counter
                count--;
                //if the count =0 then we have a new candidate leader
                if(count==0){
                    majorIndex=i;
                    count=1;
                }
            }
            else
                count++;
        }
         // if we hav a potential candidate
         //************* Phase 2 ************
         if(count>0){
            System.out.println("potential candidate for leader is : "+ A[majorIndex]);
            count =0;
            // check if the potential candidate is really a leader
            for(int i=0;i<A.length;i++){
                if(A[i]==A[majorIndex])
                    count++;
            }
            if(count>A.length/2)
                return A[majorIndex];
        }
        return -1;
    }
}
