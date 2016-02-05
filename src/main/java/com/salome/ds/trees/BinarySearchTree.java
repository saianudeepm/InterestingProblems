package com.salome.ds.trees;

import java.util.Iterator;

/**
 * Created by saianudeepm on 8/21/15.
 */
public class BinarySearchTree<Key extends Comparable<Key>,Value> implements Iterable<Key> {

    @Override
    public Iterator<Key> iterator() {
        return new BinaryTreeIterator();
    }
    Node root;
    private class Node {
        Node left;
        Node right;
        Key key;
        Value value;

        //constructor
        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;

        }
    }
    
    //supported methods
    
    public void put(Key key, Value value){
        root=put(root,key,value);
    }
    
    private Node put(Node node, Key key, Value value){
        if(node==null) {return new Node(key, value);}
        else {
            
            if(key.compareTo(node.key)<0){ //go left
                
                return put(node.left,key,value);
            }
            if(key.compareTo(node.key)>0){ //go right

                return put(node.right,key,value);
            }
            else
                {
                    node.value=value;
                    return node;
                }
        }
    }
    
    public Value get(Key key){
        Node current= root;
        while (current!=null){
            if(key.compareTo(root.key)<0)
                current=current.left;
            else if(key.compareTo(root.key)>0)
                current=current.right;
            else
                return current.value;
        }
        return null;
        
    }
    
    public Value delete(Key key){
        return null;

    }
    
    class BinaryTreeIterator implements Iterator<Key>{


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Key next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
    
}
