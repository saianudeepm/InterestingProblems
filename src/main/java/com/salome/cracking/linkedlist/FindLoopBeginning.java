package com.salome.cracking.linkedlist;

import com.salome.ds.singlylinkedlist.LinkedListNode;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class FindLoopBeginning {
    
    public static void main(String args[]){
        LinkedListNode<Integer> a = new LinkedListNode<Integer>(1);
        LinkedListNode<Integer> b = new LinkedListNode<Integer>(2);
        LinkedListNode<Integer> c = new LinkedListNode<Integer>(3);
        LinkedListNode<Integer> d = new LinkedListNode<Integer>(4);
        LinkedListNode<Integer> e = new LinkedListNode<Integer>(5);
        LinkedListNode<Integer> f = new LinkedListNode<Integer>(6);
        LinkedListNode<Integer> g = new LinkedListNode<Integer>(7);
        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);
        g.setNext(d);
        System.out.println(findLoopStart(a));
        
    }
    
    //returns the loop beginning node
    public static LinkedListNode findLoopStart(LinkedListNode head){
        //find if the list has a loop
        LinkedListNode collisionNode = checkLoop(head);
        int loopSize=0;
        if(collisionNode!=null){ //has a loop
            //check for the loop size
            loopSize = findLoopLength(collisionNode);
            //now to find the starting point start two pointers.. 1.head 2.kth position
            LinkedListNode ptr1 = head.getNext();
            LinkedListNode ptr2 =head;
            int offset=loopSize-1;
            while(ptr1.getData()!=ptr2.getData()){
                ptr1=ptr1.getNext();
                if(offset<=0){
                    ptr2=ptr2.getNext();
                }
                offset--;
            }
            return ptr1;
            //move ptr1 and ptr2 till they meet and the place they meet is the loop starting position
        }
        return null;
    }
    
    private static LinkedListNode checkLoop(LinkedListNode head){
        LinkedListNode collisionNode=null;
        LinkedListNode fast=head, slow=head;
        while(fast!=null && fast.getNext()!=null){
            fast=fast.getNext().getNext();
            slow = slow.getNext();
            if(slow.getData()==fast.getData()){//collision point
                collisionNode=slow;
                break;
            }
        }
      return collisionNode;  
    }
    
    //find the intersection point and then move one node at a time to arrive back at the intersection point
    // this gives us the length of the loop (call it k)
    private static int findLoopLength (LinkedListNode collisionNode){
        LinkedListNode runner1=collisionNode;
        int counter=0;
        while(true){
            runner1= runner1.getNext();
            counter++;
            if(runner1.getData()==collisionNode.getData()){
                return counter;
            }
            
        }
    }


}
