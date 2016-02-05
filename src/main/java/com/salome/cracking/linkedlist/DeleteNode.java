package com.salome.cracking.linkedlist;

/**
 * Created by saianudeepm on 8/19/15.
 */

import com.salome.ds.singlylinkedlist.LinkedList;
import com.salome.ds.singlylinkedlist.LinkedListNode;

/**
 * Delete a node from singly linked list given access to only that one node
 * * * **/

// The only way will be to actually copy over the data of next node to current (overwrite current data) and delete next node
  public class DeleteNode {
    
    public static void main(String args[]){
        LinkedList<Integer> myList = new LinkedList<Integer>(new Integer[]{1,2,3,4,5});
        System.out.println("attempting to delete node:"+myList.getHead().getNext());
        deleteNode(myList.getHead().getNext());
        System.out.println("after deletion, new list is :"+ myList);
        
    }
    public static void deleteNode(LinkedListNode node){
        // we need to copy over the next nodes contents to current node, then
        //set current next to next->next and thats it we are done
        if(node.getNext()==null)
            return; // cannot delete the last node
        LinkedListNode nextNode = node.getNext();
        node.setData(nextNode.getData());
        node.setNext(nextNode.getNext());
    }
}
