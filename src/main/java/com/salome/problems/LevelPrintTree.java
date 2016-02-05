package com.salome.problems;

/*

Tree:
1
/ \
3 5
/ \ \
2 4 7
/ \ \
9 6 8

==========
Expected Output:
1
35
247
968
*/


import com.salome.ds.queues.Queue;
import com.salome.ds.singlylinkedlist.LinkedList;

/**
 * Created by saianudeepm on 9/2/15.
 */
public class LevelPrintTree {

    static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public void printTree(Node root) {
        // implementation here
        
        Queue<Node> nodeQueue = new Queue<Node>();
        Node special = new Node(0,null,null);
        if(root==null)return;
        nodeQueue.enqueue(root);
        nodeQueue.enqueue(special);
        while(!nodeQueue.isEmpty()){
            //look at the node and add its children to teh queue
            Node currentNode = nodeQueue.dequeue();
            if(currentNode.left!=null)
                nodeQueue.enqueue(currentNode.left);
            if(currentNode.right!=null)
                nodeQueue.enqueue(currentNode.right);
            //print the node value
            System.out.print(currentNode.toString());
            //peek if next char is special if so poll it and add back
            if(nodeQueue.peek()==special){
                System.out.println("");
                nodeQueue.dequeue();
                if(!nodeQueue.isEmpty())
                    nodeQueue.enqueue(special);
            }

        }
   }

}
