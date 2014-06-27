package com.salome.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by saimachavarapu on 3/3/14.
 */
public class BinaryTreeTraversal {

    public static Node<Integer> node;

    public static Node<Integer> sortedArrayToBST(int arr[], int start, int end) {
        if (start > end)
            return null;

        int mid = start + (end - start) / 2;
        Node<Integer> node = new Node<Integer>();
        node.setValue(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }

    public static void main(String[] args) {

        int[] test = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        Node<Integer> node = sortedArrayToBST(test, 0, test.length - 1);

       /* System.out.println("preOrderTraversal >> ");

        preOrderTraversal(node);

        System.out.println("");

        System.out.println("inOrderTraversal >> ");

        inOrderTraversal(node);

        System.out.println("");

        System.out.println("postOrderTraversal >> ");

        postOrderTraversal(node);

        System.out.println("");

        searchInTree(node, 7);

        System.out.println("");

        System.out.println("Alter tree");

        reverseTree(node);



        System.out.println("preOrderTraversal >> ");

        preOrderTraversal(node);

        System.out.println("");

        System.out.println("inOrderTraversal >> ");

        inOrderTraversal(node);

        System.out.println("");

        System.out.println("postOrderTraversal >> ");

        postOrderTraversal(node);*/

        System.out.println("bfs is >>");
        bfs(node);

        System.out.println("dfs is >>");
        dfs(node);

    }

    public static void preOrderTraversal(Node<Integer> node) {

        if (node != null) {

            System.out.print(" " + node.toString());
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

    }

    public static void inOrderTraversal(Node<Integer> node) {

        if (node != null) {

            inOrderTraversal(node.left);
            System.out.print(" " + node.toString());
            inOrderTraversal(node.right);
        }

    }

    public static void postOrderTraversal(Node<Integer> node) {

        if (node != null) {

            postOrderTraversal(node.left);

            postOrderTraversal(node.right);

            System.out.print(" " + node.toString());
        }

    }

    public static void reverseTree(Node<Integer> node) {

        if (node != null) {

            Node<Integer> temp = node.left;

            node.left = node.right;
            node.right = temp;

            reverseTree(node.left);

            reverseTree(node.left);

        }

    }
    /*
    * To construct the bst back after a bfs, we can store the bfs in a array
    * eg
    * for tree
				9
			6		12
		3 	   7   11  13
	  n  n   5	n n n n  n

    array is : 9 6 12 3 7 11 13 null null 5 null null null
    *   logic to get back the tree is below:
    *
    *   currptr=0
    *   while(currptr<a.length)
        root= a[currptr]
        if(root==null){
            currptr++;
             continue
        }
        l =currptr*2+1;
        r = l+1;
        currptr++;
    * */


    public static void bfs(Node<Integer> node){
        Queue<Node<Integer>> queue = new LinkedList<Node<Integer>>();
        queue.add(node);
        int level=1;
        while(!queue.isEmpty()){
            Node localNode = queue.remove();
            level--;
            if(level==0){
                System.out.println(localNode.getValue());

            }
            else
                System.out.print(localNode.getValue());
            Node lchild = localNode.getLeft();
            Node rchild = localNode.getRight();
            if(lchild!=null)
                queue.add(lchild);
            if(rchild!=null)
                queue.add(rchild);
            if(level==0)
                level = queue.size();
        }

    }
    //iterative way
    public static void dfs(Node node) {

        if(node==null)
            return;
        // DFS uses Stack data structure
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while(!stack.isEmpty()){
            //pop the element from stack
            node= stack.pop();
            //visit the current node
            System.out.print(node.getValue());
            //push right child
            if(node.getRight()!=null)
                stack.push(node.getRight());
            //push left child
            if(node.getLeft()!=null)
                stack.push(node.getLeft());
        }

    }
    public static void searchInTree(Node<Integer> node, int key) {

        if (node != null) {

            if (node.value.equals(key)) {

                System.out.println("Found -- >>" + node.value);

                return ;

            } else {

                if (key < node.value.intValue()) {

                    searchInTree(node.left, key);
                } else {

                    searchInTree(node.right, key);
                }
            }
        }
    }

}
