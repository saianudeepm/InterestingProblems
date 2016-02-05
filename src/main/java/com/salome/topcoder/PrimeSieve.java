package com.salome.topcoder;

import java.util.Arrays;

/**
 * Created by saianudeepm on 9/28/15.
 */
public class PrimeSieve {
    public static void main(String args[]){

        boolean [] result = sieve(20);
        int num=0;
        for (boolean i: result){
            
            System.out.println(num+ " "+ i);  
            num++;
        }
        
        
    }
    public static boolean[] sieve(int n)
    {
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        int m= (int) Math.sqrt(n);

        for (int i=2; i<=m; i++)
            if (prime[i])
                for (int k=i*i; k<=n; k+=i)
                    prime[k]=false;

        return prime;
    }
}
