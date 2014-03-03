package com.salome.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by saimachavarapu on 3/2/14.
 */
public class IntervalsImpl implements Intervals {

    List<IntervalRange> intervalList;
    PriorityQueue<IntervalRange> rangeQueue;

    public IntervalsImpl(){
        this.intervalList = new ArrayList<IntervalRange>();
        rangeQueue = new PriorityQueue<IntervalRange>();
    }

    @Override
    public void addInterval(int from, int to) {
        IntervalRange range = new IntervalRange(from,to);
        intervalList.add(range);
        rangeQueue.add(range);

    }

    @Override
    public int getTotalCoveredLength() {
        IntervalRange first = rangeQueue.poll();
        int result = 0;
        IntervalRange second;
        boolean isIntersect = false;
        for(int i=0;i< intervalList.size()-1;i++){
            if(isIntersect){
                int temp = (first.getEnd() - first.getStart() + 1);
                result = result <temp ? temp:result ;
            }
            second = rangeQueue.poll();
            IntervalRange temp= getIntersectRange(first, second);
            if(temp!=null){

                first= temp;
                isIntersect = true;
            }
            else{
                first = second;
            }
        }
        if(isIntersect){
            int finRange = Math.abs(first.getStart() - first.getEnd()) + 1;
                return finRange;
        }

        return result;
    }

    private IntervalRange getIntersectRange(IntervalRange first, IntervalRange second) {
        int begin = first.getStart();
        Integer end =null;
        if(first.getEnd() >= second.getStart() && first.getEnd() <=second.getEnd()){
            end = second.getEnd();
        }
        else if(first.getEnd() >= second.getStart() && first.getEnd() >= second.getEnd()){
            end = first.getEnd();
        }
        if(end == null){
            return null;
        }
        else return new IntervalRange(begin,end);
    }

    private class IntervalRange implements Comparable<IntervalRange>{
        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        int start;
        int end;

        IntervalRange(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(IntervalRange o) {
            if(this.getStart() == o.getStart())
                return 0;
            else if(this.getStart() > o.getStart())
                return 1;
            else
                return -1;



        }
    }
}
