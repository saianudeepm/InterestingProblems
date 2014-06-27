package com.salome.problems;



/**
 * Created by saimachavarapu on 3/17/14.
 */
public class LowestCommonAncestor {

    public static void main(String args[]){
        int[] test = new int[] { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
        Node<Integer> root = BinaryTreeTraversal.sortedArrayToBST(test, 0, test.length - 1);
        BinaryTreeTraversal.bfs(root);
        Node<Integer> n1= new Node<Integer>();
        n1.setValue(1);
        Node<Integer> n2= new Node<Integer>();
        n2.setValue(3);

        //Node n2= root.getLeft().getRight();
        Node ancestor= getLeastCommonAncestor(root, n1, n2);
        System.out.print(ancestor.getValue());

    }

    public static Node getLeastCommonAncestor(Node<Integer> root, Node<Integer> n1, Node<Integer> n2){
        if(n1.getValue()==n2.getValue())
            return n1;
        Node<Integer> l;
        Node<Integer>r ;
        if(n1.getValue()<n2.getValue()){
            l=n1;
            r=n2;
        }
        else{
            l=n2;
            r=n1;
        }

        Node<Integer> ancestor=root;
        while(root!=null){
            if(root.getValue()< l.getValue() && root.getValue()<r.getValue())
                root= root.getRight();
            else if(root.getValue()> l.getValue() && root.getValue()>r.getValue())
                root= root.getLeft();
            else if(l.getValue()<root.getValue() && root.getValue()<r.getValue()){
                ancestor=root;
                return ancestor;
            }
        }


        /*while(l.getValue()<root.getValue() && root.getValue()<r.getValue()){
            ancestor = root;
            if(r.getValue()<root.getValue()){
                root=root.getLeft();
            }
            else
                root=root.getRight();
        }*/


        return ancestor;
    }
}
