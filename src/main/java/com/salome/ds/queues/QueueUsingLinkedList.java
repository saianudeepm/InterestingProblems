package com.salome.ds.queues;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class QueueUsingLinkedList<T> {
    //members
    private Node front;
    private Node rear;
    
    //constructor
    public QueueUsingLinkedList(){

    }
    class Node{
        public T data;
        public Node next;

        Node(T data){
            this.data=data;
        }
    }
    
    //supported operations
    public void enqueue(T data){
        Node newNode = new Node(data);
        Node oldRear= rear;
        rear = newNode;
        if(front==null)
            front=rear;
        else
            oldRear.next=newNode;
    }
    
    public T dequeue(){
        if(front==null)
            return null;
        Node oldFront= front;
        front = front.next;
        return oldFront.data;
    }
    
    public T peek(){
        if(front==null)
            return null;
        return front.data;
    }
}
