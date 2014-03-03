package com.salome.problems;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Collection;

/**
 * PointsOnAPlaneImpl Tester.
 *
 * @author <Authors name>
 * @since <pre>Mar 2, 2014</pre>
 * @version 1.0
 */
public class PointsOnAPlaneTest {
    PointsOnAPlaneImpl plane ;
    @Before
    public void before() throws Exception {
        plane = new PointsOnAPlaneImpl();
        plane.addPoint(plane.new Point(0,2));
        plane.addPoint(plane.new Point(0,1));
        plane.addPoint(plane.new Point(1,8));
        plane.addPoint(plane.new Point(0,3));
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: addPoint(Point point)
     *
     */
    @Test
    public void testAddPoint() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: findNearest(Point center, int m)
     *
     */
    @Test
    public void testFindNearest() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: getX()
     *
     */
    @Test
    public void testGetX() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: setX(int x)
     *
     */
    @Test
    public void testSetX() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: getY()
     *
     */
    @Test
    public void testGetY() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: setY(int y)
     *
     */
    @Test
    public void testSetY() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: getDistFromCenter()
     *
     */
    @Test
    public void testGetDistFromCenter() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: setDistFromCenter(double distFromCenter)
     *
     */
    @Test
    public void testSetDistFromCenter() throws Exception {
//TODO: Test goes here... 
    }

    /**
     *
     * Method: compareTo(Point p)
     *
     */
    @Test
    public void testCompareTo() throws Exception {
//TODO: Test goes here... 
    }


    /**
     *
     * Method: getDistance(Point point1, Point point2)
     *
     */
    @Test
    public void testGetDistance() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = PointsOnAPlaneImpl.getClass().getMethod("getDistance", Point.class, Point.class);
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/  Collection<PointsOnAPlaneImpl.Point> result = plane.findNearest(plane.new Point(0,0), 3);
        for(PointsOnAPlaneImpl.Point p : result){
            System.out.println(p.toString());
        }
    }

} 
