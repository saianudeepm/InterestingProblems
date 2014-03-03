package com.salome.problems;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* IntervalsImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 2, 2014</pre> 
* @version 1.0 
*/ 
public class IntervalsImplTest { 

IntervalsImpl intervalsImpl;
@Before
public void before() throws Exception {
    intervalsImpl = new IntervalsImpl();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addInterval(int from, int to) 
* 
*/ 
@Test
public void testAddInterval() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getTotalCoveredLength() 
* 
*/ 
@Test
public void testGetTotalCoveredLength() throws Exception { 

intervalsImpl.addInterval(3,5);
intervalsImpl.addInterval(5,9);
intervalsImpl.addInterval(8,10);
System.out.println(intervalsImpl.getTotalCoveredLength());
//TODO: Test goes here...
} 


} 
