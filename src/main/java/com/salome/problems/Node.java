package com.salome.problems;

/**
 * Created by saimachavarapu on 3/3/14.
 */
public class Node<T> {
    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    Node<T> left;
    Node<T> right;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }



    T value;
}
