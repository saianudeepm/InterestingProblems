package com.salome.ds.heap;

import java.util.Comparator;

/**
 * Created by saianudeepm on 8/21/15.
 */

public class BinaryHeap<Item extends Comparable<Item>> {
    public static enum TYPE {
        MIN,
        MAX
    }

    //Data members
    Item [] data;
    public TYPE selectedType= TYPE.MAX;

    int current=-1;

    //constructor
    public BinaryHeap(int capacity){
        data = (Item[])new Comparable[capacity];
        
    }

    //private methods
    private void _bubbleup(int i){
        while(i>0&& less(getParent(i),i)){
            exchange(i, getParent(i));
            i=getParent(i);
        }
    }

    private void exchange(int i, int j ) {
        Item temp= data[i];
        data[i] =data[j];
        data[j]=temp;
    }

    private boolean less(int i, int j) {
        if(selectedType==TYPE.MAX){
            if(data[i].compareTo(data[j])<0) return true;
            else return false;
        }
        else{
            if(data[i].compareTo(data[j])<0) return false;
            else return true;
        }
            
    }

    private void _sink(int i){
        while(true){
            if(getLeftChild(i)>current) {
               break;
            }
            int big=getLeftChild(i);
            if(getRightChild(i)<=current){
                if (less(getLeftChild(i),getRightChild(i))){
                    big=getRightChild(i);
                }
                else{
                    big=getLeftChild(i);
                }
            }
            if(less(big,i))break;
            else exchange(i,big);
            i=big;

        }

    }
    
    //public methods
    public void add(Item item){
        data[++current]=item;
        _bubbleup(current);
    }
    
    public Item remove(){
        if(isEmpty())
            return null;
        Item temp =data[0];
        data[0]=data[current--];
        data[current+1]=null;
        _sink(0);
        return temp;
    }
    
    public  boolean isEmpty(){
        return current==-1;
    }
    
    public int size(){
        return current;
    }
    
    //helper methods
    private  int getParent(int i){
        if(i%2==0)
            return i/2-1;
        else return i/2;
    }
    
    private  int getLeftChild(int i){
        return 2*(i+1)-1;
    }
    private  int getRightChild(int i){
        return 2*(i+1);
    }
}
