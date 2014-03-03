package com.salome.problems;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* SortedArray Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 23, 2014</pre> 
* @version 1.0 
*/ 
public class SortedArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findRange(List arr, int num) 
* 
*/ 
@Test
public void testFindRange() throws Exception { 
//TODO: Test goes here...

    List<Integer> numList = new ArrayList<Integer>();
    numList.add(0);
    numList.add(2);
    numList.add(2);
    numList.add(2);
    numList.add(3);
    numList.add(3);
    numList.add(3);
    numList.add(3);
    numList.add(3);
    numList.add(3);
    numList.add(3);
    numList.add(3);
    numList.add(10);
    numList.add(10);
    SortedArray sortedArray = new SortedArray();
    int[] result = sortedArray.findRange(numList,3);
    System.out.print(result[0] +"," +result[1]);
} 


} 
