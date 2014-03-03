package com.salome.problems;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* Permutation Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 2, 2014</pre> 
* @version 1.0 
*/ 
public class PermutationTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: permutations() 
* 
*/ 
@Test
public void testPermutations() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: _permute() 
* 
*/ 
@Test
public void test_permute() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Permutation.getClass().getMethod("_permute"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    Permutation permutation = new Permutation("111");
    List<String> result = permutation.getPermutations();
    System.out.print(result);

} 

} 
