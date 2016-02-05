package com.salome.problems;

/**
 * Created by saianudeepm on 8/19/15.
 */
public class PercentDecay {
    
    public static void main(String args[]){
        double startValue=36.2;
        int totalRuns=30;
        int percentageChurn=3;
        printDecayRecurse(startValue,percentageChurn,totalRuns);
        
    }
    
    public static void printDecayRecurse(double hundred, double lossPercent, int run){
        System.out.println(hundred);
        double newHundred= hundred -  (lossPercent/100) *hundred;
        run--;
        if(run<=0)
            return;
        printDecayRecurse(newHundred, lossPercent,run);
        
        
    }
}
