package com.salome.cracking.heaps;

import com.salome.ds.heap.BinaryHeap;

/**
 * Created by saianudeepm on 8/21/15.
 */
public class PriorityQueue {
    
    public static void main(String args[]){
        BinaryHeap<Integer> priorityQueue = new BinaryHeap<Integer>(10);
        priorityQueue.selectedType= BinaryHeap.TYPE.MAX;
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(5);
        priorityQueue.add(23);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        
    }
}
