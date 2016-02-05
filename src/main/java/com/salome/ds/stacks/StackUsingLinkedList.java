package com.salome.ds.stacks;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class StackUsingLinkedList<T> {
    
    private Node top;
    
    public class Node{
        public T data;
        public Node next;
        
        Node(T data){
            this.data=data;
        }
    }
    public StackUsingLinkedList(){
    }

    public void push(T data){
        Node newNode = new Node(data);
        Node temp = top;
        top = newNode;
        top.next=temp;
        
    }
    public T pop(){
        if(top==null)
            return null;
        Node temp = top;
        top=top.next;
        return temp.data;
    }
    
    public T peek(){
        if(top==null)
            return null;
        return top.data;
    }
    
    public boolean isEmpty(){
        return (top==null);
    }
}
