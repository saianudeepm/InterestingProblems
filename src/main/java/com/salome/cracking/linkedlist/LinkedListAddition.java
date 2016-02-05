package com.salome.cracking.linkedlist;

import com.salome.ds.singlylinkedlist.LinkedList;
import com.salome.ds.singlylinkedlist.LinkedListNode;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class LinkedListAddition {
    
    /*given two linked lists 1->2->3 3->4->5 return a linked list which is addition of first two. 
    the number is stored in reverse . output for abouve will be 4->6->8. what if stored in order?*/
    
    public static <T extends Number> LinkedListNode<T> addInReverse(LinkedListNode<T> head1, LinkedListNode<T> head2){
        
        LinkedListNode<T> currentNode=null,newHead=null;
        int carry=0;
        if(head1!=null || head2!=null){
            T sum = (T)add(head1,head2);
            carry = (Integer)sum/10;
                newHead = new LinkedListNode<T>((T)(new Integer((Integer)sum%10)));
                currentNode = newHead;
        }
        while((head1!=null && head1.getNext()!=null) || (head2!=null && head2.getNext()!=null)){
            if( head1!=null && head1.getNext()!=null)
                head1=head1.getNext();
            if( head2!=null  && head2.getNext()!=null)
                head2=head2.getNext();
            Integer sum = add(head1,head2)+carry;
            carry = (Integer)sum/10;
            LinkedListNode<T> newNode;
            if(currentNode.getNext()!=null && currentNode.getNext().getNext()==null){
                newNode =new LinkedListNode<T>((T)(sum));
            }
            else
                newNode =new LinkedListNode<T>((T)(new Integer((Integer)sum%10)));
            currentNode.setNext(newNode);
            currentNode=newNode;
        }
            return newHead;
            
    }
    public static  <T extends Number> Integer add(LinkedListNode<T>node1, LinkedListNode<T> node2){
        Integer sum=0;
        if(node1!=null && node2!=null){
            sum= node1.getData().intValue()+node2.getData().intValue();    
        }else if(node1!=null){
            sum= node1.getData().intValue(); 
        }
        else {
            sum= node2.getData().intValue();
        }
        return sum;
    }
    
    public static void main(String args[]){
        LinkedList<Integer> myList1 = new LinkedList<Integer>(new Integer[]{6,5,4,3,2,1});
        LinkedList<Integer> myList2 = new LinkedList<Integer>(new Integer[]{6,5,4,3,2,1});
        LinkedListNode<Integer> result= addInReverse(myList1.getHead(), myList2.getHead());
        LinkedList<Integer> ans = new LinkedList<Integer>(result);
        System.out.println(ans);
    }

}
