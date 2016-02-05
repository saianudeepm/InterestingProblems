package com.salome.ds.singlylinkedlist;

import java.util.Comparator;
import java.util.List;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class LinkedList<T extends Comparable> {
    private LinkedListNode<T> head;
    
    public LinkedList(List<T> data){ //constructor
        head = new LinkedListNode<T>(data.get(0));
        LinkedListNode<T> currentNode = head;
        for(int i=1;i<data.size();i++){
            LinkedListNode<T>nextNode = new LinkedListNode<T>(data.get(i));
            currentNode.setNext(nextNode);
            currentNode=nextNode;
            
        }
    }

    public LinkedList(T[] data) {//constructor
        head = new LinkedListNode<T>(data[0]);
        LinkedListNode<T> currentNode = head;
        for(int i=1;i<data.length;i++){
            LinkedListNode<T>nextNode = new LinkedListNode<T>(data[i]);
            currentNode.setNext(nextNode);
            currentNode=nextNode;

        }
    }
    
    public LinkedList(LinkedListNode<T> head){
        this.setHead(head);
    }

    @Override
    public String toString() {
        
        StringBuilder result= new StringBuilder("");
        LinkedListNode current = head;
        if(head !=null)
            result.append(current.getData()).append("-->");
        while(current!=null && current.getNext()!=null){
            current = current.getNext();
            result.append(current.getData()).append("-->");
        }
        result.append("NULL");
        return "LinkedList{ " + result.toString() +" }";
    }

    public LinkedListNode<T> getHead() {
        return head;
    }

    public void setHead(LinkedListNode<T> head) {
        this.head = head;
    }
}
