package com.salome.problems;

/**
 * Created by saimachavarapu on 3/17/14.
 */

/**
 * Given a binary tree where all the right nodes are either empty or leaf nodes, flip it upside down
 * and turn it into a tree with left leaf nodes.
 * In the original tree, if a node has a right child, it also must have a left child.
 *
 * for example, turn these:
 *
 *        1                1
 *       / \              / \
 *      2   3            2   3
 *     /
 *    4
 *   / \
 *  5   6
 *
 * into these:
 *
 *        1               1
 *       /               /
 *      2---3           2---3
 *     /
 *    4
 *   /
 *  5---6
 *
 * where 5 is the new root node for the left tree, and 2 for the right tree.
 * oriented correctly:
 *
 *     5                  2
 *    / \                / \
 *   6   4              3   1
 *        \
 *         2
 *        / \
 *       3   1
 *
 */

public class FlipDownBinaryTree {
    public static void main(String args[]){

    }

    public void reverse(Node<Integer> node){
        Node tempLeft = node.left;
        Node tempRight = node.right;
        reverseHelper(tempLeft, tempRight, node, tempLeft.getLeft());
    }

    public void reverseHelper(Node<Integer> root, Node<Integer> left, Node<Integer> right, Node<Integer> newRoot){
        Node<Integer> newLeft = root.getRight();
        Node<Integer> newRight = root;
        Node<Integer> tempNewRoot= newRoot.getLeft();
        root.setLeft(left);
        root.setRight(right);
        if(newRoot!=null){
            reverseHelper(newRoot, newLeft,newRight,tempNewRoot);
        }
    }
}
