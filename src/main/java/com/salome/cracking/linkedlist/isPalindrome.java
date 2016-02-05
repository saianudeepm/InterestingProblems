package com.salome.cracking.linkedlist;

import com.salome.ds.singlylinkedlist.LinkedList;
import com.salome.ds.singlylinkedlist.LinkedListNode;

/**
 * Created by saianudeepm on 8/19/15.
 */
//find out if the linked list is a palindrome
   
public class isPalindrome {
    
    public static void main(String args[]){
        LinkedList<Integer> myList = new LinkedList<Integer>(new Integer[]{1,2,3,2,3,2,1});
        System.out.println(findPalindrome(myList.getHead(), myList.getHead()));
        
    }
    public static boolean findPalindrome(LinkedListNode head,LinkedListNode ptr) {
        LinkedListNode curr = ptr;
        boolean isTrue = false;
        if(head.getNext()==null){
            if(head.getData()==ptr.getData()){
                ptr.setData(ptr.getNext().getData());
                ptr.setNext(ptr.getNext().getNext());
                return true;
            }
            else return false;
        }
  
        else{
            isTrue=findPalindrome(head.getNext(),ptr);
            if(ptr.getNext()==null)
                return true;
            if(isTrue){
                if(head.getData()==ptr.getData() && ptr.getNext()!=null){
                    ptr.setData(ptr.getNext().getData());
                    ptr.setNext(ptr.getNext().getNext());
                    return true;
                }
            }
            else return false;
        }
       return false; 

    }
}
