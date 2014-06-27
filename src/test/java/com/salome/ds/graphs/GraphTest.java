package com.salome.ds.graphs;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* Graph Tester. 
* 
* @author <Authors name> 
* @since <pre>May 20, 2014</pre> 
* @version 1.0 
*/ 
public class GraphTest { 

    Graph<Integer> g;
@Before
public void before() throws Exception {
g = new Graph<Integer>(false);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insert_edge(int x, int y, boolean directed) 
* 
*/ 
@Test
public void testInsert_edge() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: initialize_graph(boolean directed) 
* 
*/ 
@Test
public void testInitialize_graph() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Graph.getClass().getMethod("initialize_graph", boolean.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
