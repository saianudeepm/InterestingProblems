package com.salome.ds.queues;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class Queue<T> {

    private int front=-1;
    private int rear=-1;
    private T[] _queue;
    
    public Queue(){
        _queue = (T[])new Object[1];
    }
    
    public void enqueue(T data){
        // add to rear and update rear
        ++rear;
        if(front!=0 && rear>= _queue.length)
            reset();
        if(rear>=_queue.length) 
            resize(_queue.length*2);
        _queue[rear]=data;
        if(front==-1)
            front++;
    }
    public T dequeue(){
        T data=null;
        if(front==-1)
            return null;
        data=_queue[front];
        _queue[front]=null;
        front++;
        if(front>rear){
            front=rear=-1;
        }
        return data;
    }
    public T peek(){
        T data=null;
        if(front==-1)
            return null;
        data=_queue[front];
        return data;
    }
    
    private void resize(int capacity){
        System.out.println("resizing");
        Object[] temp = new Object[capacity];
        for(int i=0;i<_queue.length;i++){
           temp[i]=_queue[i];
        }
        _queue = (T[])temp;
    }
    
    private void reset(){
        System.out.println("resetting");
        int tempFront=-1;
        int newrear=-1;
        while(front<rear){
            _queue[++tempFront]=_queue[front++];
            newrear++;
        }
        rear=newrear;
        front=0;
    }
    
    public boolean isEmpty(){
        return (rear-front)==0?true:false;
        
    }

}
