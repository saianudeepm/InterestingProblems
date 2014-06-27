package com.salome.ds.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 5/20/14
 * Time: 1:15 PM
 */
public class Graph<T> {
    List<GraphNode<T>> edges[];    /* adjacency info */
    List<Integer> degree;                /* outdegree of each vertex */
    int nvertices;               /* number of vertices in graph */
    int nedges;                  /* number of edges in graph */
    boolean directed;            /* is the graph directed? */


    Graph(boolean directed){
        initialize_graph(directed);
    }

    private void initialize_graph(boolean directed){

        /*this.nvertices=0;
        this.nedges=0;*/
        this.directed=directed;
        //edges[] = new ArrayList<GraphNode<T>>()[];
        degree = new ArrayList<Integer>();

    }

    public void insert_edge(int x, int y, boolean directed){

        GraphNode<T> edgeNode = new GraphNode<T>();
        //setting the
        edgeNode.setY(y);
        edgeNode.setWeight(-1);
        //edgeNode.setNext(edges.get(x));

        //adding the new edgenode in adjacency list of x node
       // edges.add(x,edgeNode);
        //increase the degree of the x by 1
        degree.add(x,degree.get(x)+1);

        // if not directed then add a new edge between y,x
        if(this.directed){
            insert_edge(y,x,false);
        }
        else{
            this.nedges++;
            this.nvertices++;
        }

    }
}
