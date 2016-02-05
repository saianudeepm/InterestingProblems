package com.salome.problems;

/* Given a collection of pair representing intervals write a function which inserts new interval into collection and merges overlapping intervals.
Example:
[-10, -1], [0,2], [4,10] - non overlapping intervals
insert [-5, 1]
output: [-10, 2], [4, 10] */

/**
 * Created by saianudeepm on 9/2/15.
 */

public class IntervalMerge {
    int start;
    int end;

    public IntervalMerge(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public String toString() {
        return "["+start +
                "," + end +
                ']';
    }

    public static IntervalMerge[] insert(IntervalMerge[] existing, IntervalMerge newInterval){
        for ( IntervalMerge interval : existing)
            if(interval!=null)
                System.out.print(interval);
        System.out.println("");
        int position=0;
        IntervalMerge mergeInterval=null;
        for(IntervalMerge existingInterval: existing){
            
            if(newInterval.start <= existingInterval.start  && newInterval.end>=existingInterval.start && newInterval.end <=existingInterval.end ){
                mergeInterval= new IntervalMerge(newInterval.start, existingInterval.end);
                newInterval=mergeInterval;
                existing[position++]=null;
                continue;
            }
            else if(newInterval.start <= existingInterval.start  && newInterval.end >existingInterval.end ){
                mergeInterval= new IntervalMerge(newInterval.start, newInterval.end);
                newInterval=mergeInterval;
                existing[position++]=null;
                continue;
            }
            else if(newInterval.start >= existingInterval.start  && newInterval.end <=existingInterval.end ){
                mergeInterval= new IntervalMerge(existingInterval.start, existingInterval.end);
                newInterval=mergeInterval;
                existing[position++]=null;
                continue;
            }
            else if(newInterval.start >= existingInterval.start && newInterval.start<=existingInterval.end && newInterval.end >existingInterval.end ){
                mergeInterval= new IntervalMerge(existingInterval.start, newInterval.end);
                newInterval=mergeInterval;
                existing[position++]=null;
                continue;
            }
            if(mergeInterval!=null){
                existing[position-1]=mergeInterval;
                mergeInterval=null;
            }
            position++;
        }
        if(mergeInterval!=null){
            existing[position-1] =mergeInterval ;
        }
        for ( IntervalMerge interval : existing)
            if(interval!=null)
            System.out.print(interval);
        return null;
    }
    
    public static void main(String args[]){
        IntervalMerge i1= new IntervalMerge(-10, -1);
        IntervalMerge i2= new IntervalMerge(0,2);
        IntervalMerge i3= new IntervalMerge(4,10);
        IntervalMerge i4= new IntervalMerge(12,15);
        IntervalMerge it= new IntervalMerge(-5,1);
        IntervalMerge[] interval = new IntervalMerge[]{i1,i2,i3,i4};
        insert(interval, it);
    }


}
