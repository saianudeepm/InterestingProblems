package com.salome.ds.singlylinkedlist;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class LinkedListNode<T> {
    
    private LinkedListNode next;
    private T data;
    
    public LinkedListNode(T data){
        this.data = data;
        this.next=null;
    }
    
    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                '}';
    }
}


