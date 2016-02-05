package com.salome.ds.stacks;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class Stack<T> implements Iterable<T> {
    
    private int top=-1;
    private T[] _stack;
    
    public Stack(){
        _stack = (T[])new Object[1];
        
    }
    
    public void push(T data){
        top++;
        if(top>= _stack.length){
            resize(_stack.length*2);
        }
        _stack[top]=data;
    }
    
    public T pop(){
        if(top==-1)
        {
            return null;
        }
        T temp = _stack[top];
        _stack[top]=null;
        top--;
        if((top+1)<_stack.length/4){
            resize(_stack.length/2);
        }
        return temp;
        
    }
    
    public boolean isEmpty(){
        return (top==-1);
        
    }
    
    private void resize(int capacity){
        Object [] copy = new Object[capacity];
        int i=0;
        for(T item:_stack){
           copy[i++]=item; 
        }
        _stack=null;
        _stack= (T[]) copy;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }
    
    class StackIterator implements Iterator<T>{


        @Override
        public boolean hasNext() {
            return (top!=-1);
        }

        @Override
        public T next() {
            return _stack[top--]; //throw nosuchelement exception if no elements
        }

        @Override
        public void remove() {
            /*Not Supported*/ //throw unsupportedException
        }
    }
}
