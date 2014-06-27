package com.salome.problems;

/**
 * Created by saimachavarapu on 3/15/14.
 */

/**
 * Given a nested list of integers, returns the sum of all integers in the list weighted by their depth
 * For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1)
 * Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, one 6 at depth2)
 */

import java.util.List;

/**
 * This is the interface that represents nested lists.
 * You should not implement it, or speculate about its implementation.
 */
public interface NestedInteger
{
    // Returns true if this NestedInteger holds a single integer, rather than a nested list
    public boolean isInteger();

    // Returns the single integer that this NestedInteger holds, if it holds a single integer
// Returns null if this NestedInteger holds a nested list
    public Integer getInteger();

    // Returns the nested list that this NestedInteger holds, if it holds a nested list
// Returns null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

class NestedIntegerValue{

    public static int getValue(NestedInteger root, int depth){//1

        int val=0;
        if(root.isInteger()){
            val += root.getInteger()* depth;
        }
        else{
            List<NestedInteger> nlist = root.getList();
            for (NestedInteger n: nlist){
                val = val+ getValue(n, depth+1);
            }
        }
        return val;

    }

}