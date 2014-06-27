package com.salome.problems;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/21/14
 * Time: 11:29 AM
 */


/**
 *
 * Distributed Sum

 Input: N text files, each with lots of numbers
 Have:
 [long total(int fileId, int machineId)]

 which schedules a job on machineId to sum up numbers in file fileId and returns the answer.

 * Unlimited number of machines, one for each integer.
 Want: sum of all numbers across all files.

 long sumAll(int n) {

 }

 N=1

 return total(0, 0)

 N=2

 return total(0, 0) + total(1, 1)

 ------------------------------
 int i;
 long sum[];

 public void run(){
 sum[this.i] = total(i,i};

 }

 //finally we need to sum up all the values inside the sum array and then return

 class LongHolder {
 long value;
 }

 public class SumClass implements Runnable{
 int i; // iteration value is stored in here
 long sum;
 //constructor
 SumClass(long iterationValue, long sum){
 this.i=iterationValue;
 this.sum=sum;
 }
 @override
 public void run(){
 // calculate the sum for this thread
 sum= total(this.i,this.i);
 }

 public Sum{
 long sum;
 //constructor
 Sum(long sum){
 this.sum=sum;
 }

 }
 public static void main(int n){


 //initialize the sum
 Sum sum[] = new Sum[n];
 List<Thread> threads = ...
 for(int i=1;i<n;i++){
 sum[i]=0;
 Thread t = new Thread(new SumClass(i,sum[i]));
 t.start();
 t.join();


 }
 //wait till all the threads are finished
 // iterate over the sum array and return the total sum




 }

 }



 Scenario 1:

 remote machine loose network connectivity.

 long total(int fileId, int machineId) throws BadMachineException;
 */

//compute the sum in a distributed manner by summiting the job to cluster of machines
    //what happens if some machines go down and how do u handle?
    // how do u do this efficiently using less resources
public class DistributedSum {
}
