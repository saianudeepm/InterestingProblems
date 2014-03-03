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

        System.out.println("preOrderTraversal >> ");

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

        postOrderTraversal(node);

        System.out.println("bfs is >>");
        bfs(node);


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
    public static void dfs(Node node) {
        //not implemented
        // DFS uses Stack data structure
        Stack stack = new Stack();
        stack.push(node);
        System.out.println(node.getValue());
       /* while(!stack.isEmpty()) {
            Node node = (Node)s.peek();
            Node child = getUnvisitedChildNode(n);
            if(child != null) {
                child.visited = true;
                System.out.println(child.getValue());
                s.push(child);
            }
            else {
                s.pop();
            }
        }
        // Clear visited property of nodes
        clearNodes();*/
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
