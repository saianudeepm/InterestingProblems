package com.salome.problems;

import java.util.Collection;

/**
 * Created by saimachavarapu on 3/2/14.
 */
public interface PointsOnAPlane {

    /**
     * Stores a given point in an internal data structure
     */
    void addPoint(PointsOnAPlaneImpl.Point point);

    /**
     * For given 'center' point returns a subset of 'm' stored points that are
     * closer to the center than others.
     *
     * E.g. Stored: (0, 1) (0, 2) (0, 3) (0, 4) (0, 5)
     *
     * findNearest(new Point(0, 0), 3) -> (0, 1), (0, 2), (0, 3)
     */
    Collection<PointsOnAPlaneImpl.Point> findNearest(PointsOnAPlaneImpl.Point center, int m);

}