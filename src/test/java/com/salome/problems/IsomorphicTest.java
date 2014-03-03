package com.salome.problems;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Isomorphic Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 23, 2014</pre> 
* @version 1.0 
*/ 
public class IsomorphicTest { 

@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isIsomorphic(String word1, String word2) 
* 
*/ 
@Test
public void testIsIsomorphic() throws Exception { 
    Isomorphic isomorphic = new Isomorphic();
    Assert.assertTrue(isomorphic.isIsomorphic("turtle","tletur"));
    Assert.assertFalse(isomorphic.isIsomorphic("bar","foo"));
    Assert.assertTrue(isomorphic.isIsomorphic("foo","app"));
    Assert.assertTrue(isomorphic.isIsomorphic("abcdef","ghijkl"));
    Assert.assertFalse(isomorphic.isIsomorphic("abcasd","asdsa"));
    Assert.assertTrue(isomorphic.isIsomorphic("abcde","abide"));
}


} 
