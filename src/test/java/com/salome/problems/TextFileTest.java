package com.salome.problems;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.Iterator;

/** 
* TextFile Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 3, 2014</pre> 
* @version 1.0 
*/ 
public class TextFileTest {
    TextFile textFile;
@Before
public void before() throws Exception {
    textFile = new TextFile("/Users/saimachavarapu/Downloads/test.txt");
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: iterator() 
* 
*/ 
@Test
public void testIterator() throws Exception { 
Iterator i = textFile.iterator();
    System.out.print(i.hasNext());
    System.out.print(i.hasNext());
    System.out.print(i.hasNext());
    System.out.print(i.hasNext());
//TODO: Test goes here...
} 

/** 
* 
* Method: hasNext() 
* 
*/ 
@Test
public void testHasNext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: next() 
* 
*/ 
@Test
public void testNext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: remove() 
* 
*/ 
@Test
public void testRemove() throws Exception { 
//TODO: Test goes here... 
} 


} 
