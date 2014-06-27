package com.salome.problems;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Sai Anudeep Machavarapu
 * Date: 4/24/14
 * Time: 8:03 AM
 */
public class FlattenIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> baseArrayList =new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> firstArrayList=new ArrayList<Integer>();
        firstArrayList.add(1);
        firstArrayList.add(2);
        baseArrayList.add(firstArrayList);

    }
}
