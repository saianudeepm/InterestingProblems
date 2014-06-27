package com.salome.ds.graphs;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/20/14
 * Time: 1:12 PM
 */
public class GraphNode<Type> {
    int y;   /* adjacency info */
    int weight=-1;         /* edge weight, if any */
    GraphNode<Type> next ; /* next edge in list */

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    Type value;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GraphNode<Type> getNext() {
        return next;
    }

    public void setNext(GraphNode<Type> next) {
        this.next = next;
    }
}
