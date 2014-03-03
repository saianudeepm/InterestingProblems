package com.salome.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saimachavarapu on 3/2/14.
 */
public class Permutation {

    private boolean[] usedFlags;
    private StringBuilder out = new StringBuilder();
    private String input;
    List<String> result;

    Permutation(String input){
        this.input=input;
        usedFlags = new boolean[input.length()];
        result =  new ArrayList<String>();
    }

    public  List<String> getPermutations(){
        _permute();
        return result;
    }
    private void _permute(){
        if(out.length() == input.length()){
            result.add(out.toString());
            System.out.println(out);
            return ;
        }
        for(int i=0; i < input.length(); ++i){
            if(usedFlags[i]) continue;
            out.append(input.charAt(i));
            usedFlags[i]=true;
            _permute();
            usedFlags[i] = false;
            out.setLength(out.length() - 1);

        }
    }

}
