package com.salome.problems;

/**
 * Created by saimachavarapu on 3/2/14.
 */
public class Power {

    /**
     * Returns a^b, as the standard mathematical exponentiation function
     */
    public static double pow(double a, int b) {
        double result;

        if(b==0)
            return 1;

        if(b==1)
            return a;

        if(b<0){
            return 1/pow(a,-b);
        }
        //if even
        if( b>0 && b%2==0){
            result = pow(a,b/2);
            return  result * result;
        }
        if( b>0 && b%2==1){
            result = pow(a,b/2);
            return  result * result* a;
        }

        return 0;
    }


}
