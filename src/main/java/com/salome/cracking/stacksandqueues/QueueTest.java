package com.salome.cracking.stacksandqueues;

import com.salome.ds.queues.Queue;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class QueueTest {
    public static void main(String args[]){
        Queue<Integer> queue= new Queue<Integer>();
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Peeking: "+queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("Peeking: "+queue.peek());
        queue.enqueue(60);
        System.out.println("Peeking: "+queue.peek());
        queue.enqueue(70);
        System.out.println(queue.dequeue());
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(50);
        System.out.println("Peeking: "+queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(60);
        System.out.println("Peeking: "+queue.peek());
    }
}
