package com.salome.cracking.linkedlist;

import com.salome.ds.singlylinkedlist.LinkedList;
import com.salome.ds.singlylinkedlist.LinkedListNode;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class FindKthNode {
    
    public static void main(String args[]){
        LinkedList<Integer> myList = new LinkedList<Integer>(new Integer[]{1,2,3,4,5,6});
        //FindKthNode<Integer> obj = new FindKthNode<Integer>();
        FindKthNode obj = new FindKthNode();
        obj.findKthItemIterative(myList.getHead(),7);
        obj.findKthItemRecursive(myList.getHead(),7);

    }
    
    public void findKthItemIterative(LinkedListNode head, int k){ // K starting from index 1
        int counter =1;
        LinkedListNode runner = head;
        LinkedListNode follower = head;
        while(runner.getNext()!=null){
            if(counter>=k){
                follower=follower.getNext();
            }
            runner = runner.getNext();
            counter++;
        }
        if(counter >=k && k>=1){ // valid index
            System.out.println(follower);
        }
        else
        {
            System.out.println("ERROR: index is out of bounds");
            
        }
        
    }
    
    public int findKthItemRecursive(LinkedListNode head, int k){
        
        if(head.getNext()==null){
            return 1;//k starts from 1.
        }
        int offset= findKthItemRecursive(head.getNext(), k)+1;
        if(offset==k){
            System.out.println(head);
        }
        return offset;        
    }

}
