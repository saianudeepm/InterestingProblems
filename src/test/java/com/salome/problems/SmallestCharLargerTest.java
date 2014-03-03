package com.salome.problems;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* SmallestCharLarger Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 2, 2014</pre> 
* @version 1.0 
*/ 
public class SmallestCharLargerTest { 

    SmallestCharLarger obj;
@Before
public void before() throws Exception {
    obj =  new SmallestCharLarger();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findSmallestCharLarge(char[] sortedChars, char searchChar) 
* 
    * ['c', 'f', 'j', 'p', 'v'], 'a' => 'c'
            * ['c', 'f', 'j', 'p', 'v'], 'c' => 'f'
            * ['c', 'f', 'j', 'p', 'v'], 'k' => 'p'
            * ['c', 'f', 'j', 'p', 'v'], 'z' => 'c' // The wrap around case
            * ['c', 'f', 'k'], 'f' => 'k'
            * ['c', 'f', 'k'], 'c' => 'f'
            * ['c', 'f', 'k'], 'd' => 'f'
 * */
@Test
public void testFindSmallestCharLarge() throws Exception { 
//TODO: Test goes here...
    char[] list = {'c', 'f', 'j', 'p', 'v'};
    char[] target = {'a', 'c', 'f', 'k', 'v', 'z'};
    for (char c : target) System.out.println(c + " -> " + obj.findSmallestCharLarge(list, c));
} 


/** 
* 
* Method: find(char [] chs, char target) 
* 
*/ 
@Test
public void testFind() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = SmallestCharLarger.getClass().getMethod("find", char.class, char.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
