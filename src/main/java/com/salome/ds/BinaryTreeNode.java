package com.salome.ds;

import java.util.Enumeration;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/19/14
 * Time: 7:54 PM
 */
public class BinaryTreeNode<Node> implements Comparable<Node>, Enumeration<Node> {
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
}
