package com.salome.problems;

/**
 * Created by saianudeepm on 9/9/15.
 */
public class Subset{

    private int [] input;
    //Constructor
    Subset(int [] input){
        this.input= input;
    }

    public void printSubsets(){
        boolean a[] = new boolean[input.length];
        backtrack(a,-1,input.length-1);
    }

    private void processSolution(boolean a[], int k){
        System.out.print("{");
            for(int i=0;i<=k;i++){
                if(a[i]==true)
                    System.out.print(input[i]);
            }
        System.out.print("}\n");
    }
    private boolean isSolution(boolean a[], int k, int n){
        return (k==n); // if the processed place is same as target solution size
    }
    private int fillCandidateSet(boolean a[], int k, int n, Boolean[] c){
        int numPositions=2;
        c[0]=false;
        c[1]=true;
        return numPositions;
    }
    private void backtrack(boolean a[], int k, int n){
        Boolean c[]=new Boolean[2]; //candidate set
        Integer numPositions =0;

        if(isSolution(a,k,n)){
            processSolution(a,k);
        }
        
        else{
            k++;
            numPositions= fillCandidateSet(a,k,n,c);
            for(int i=0;i<numPositions;i++) {
                a[k] =c[i];
                //set something necessary
                //backtrack for rest of input
                backtrack(a,k,n);
                //unset what ever we have set before backtracking
                
            }
            
        }

    }

    public static void main(String args[]){

        int [] input = new int[]{0,1,2};
        Subset obj = new Subset(input);
        obj.printSubsets();
    }

}

