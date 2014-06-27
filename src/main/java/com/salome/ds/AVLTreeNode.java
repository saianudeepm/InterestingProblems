package com.salome.ds;

import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/19/14
 * Time: 7:39 PM
 */
public class AVLTreeNode<Node> implements Comparable<Node>, Enumeration<Node> {

    //left right and parent

    AVLTreeNode<Node> left;
    AVLTreeNode<Node> right;
    AVLTreeNode<Node> parent;

    public AVLTreeNode<Node> getLeft() {
        return left;
    }

    public void setLeft(AVLTreeNode<Node> left) {
        this.left = left;
        left.parent=this;
    }

    public AVLTreeNode<Node> getRight() {
        return right;
    }

    public void setRight(AVLTreeNode<Node> right) {
        this.right = right;
        right.parent=this;
    }

    public AVLTreeNode<Node> getParent() {
        return parent;
    }

    public void setParent(AVLTreeNode<Node> parent) {
        this.parent = parent;
    }

    //left height and right height
    private int leftHeight;
    private int rightHeight;


    public int getLeftHeight() {
        return leftHeight;
    }

    public void setLeftHeight(int leftHeight) {
        this.leftHeight = leftHeight;

    }

    public int getRightHeight() {
        return rightHeight;
    }

    public void setRightHeight(int rightHeight) {
        this.rightHeight = rightHeight;
    }

    // balance factor = diff between left and right node heights

    private int balanceFactor;

    public int getBalanceFactor() {
        return rightHeight - leftHeight;
    }

    private TreeState state;

    public TreeState getState() {
        if(getBalanceFactor()<1)
        return TreeState.LEFT_HEAVY;

        else if(getBalanceFactor()>1){
            return  TreeState.RIGHT_HEAVY;
        }
        else
            return TreeState.BALANCED;
    }



    @Override
    public int compareTo(Node o) {
        return 0;
    }

    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Node nextElement() {
        return null;
    }

    //tree states
    public enum TreeState{
        LEFT_HEAVY, RIGHT_HEAVY, BALANCED;
    };
}
