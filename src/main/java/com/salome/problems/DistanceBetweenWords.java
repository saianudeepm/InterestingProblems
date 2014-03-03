package com.salome.problems;

/**
 * Created by saimachavarapu on 3/2/14.
 */

/*Find minimum distance between two words (order preserved) in a big string.
        For e.g 1. "hello how are you" - distance between "hello" and "you" is 3.
        e.g 2. "hello how are hello you" - distance is 1
        e.g 3. "you are hello" - distance is -1. Order of "hello" and "you" should be preserved.
        e.g 4. "hello how are hello" - distance is -1 since "you" didnt occur even once.*/

public class DistanceBetweenWords {

    public static void main(String args[]){
        System.out.println(findDistanceBetweenWords("you are hello", "hello", "you"));
    }
    public static int findDistanceBetweenWords(String input, String pair1, String pair2) {
        if (input.isEmpty() || pair1.isEmpty() || pair2.isEmpty()) {
            return -1;
        }
        if (pair1.equals(pair2)) {
            return 0;
        }
        boolean foundFirst = false;
        int distance=0;
        for(String token: input.split(" ")){
            if(token.equals(pair1)){
                foundFirst = true;
                distance=0;
                continue;
            }
            if(foundFirst)
                distance++;
            if(token.equals(pair2))
                if(foundFirst)
                    return distance;
                else
                    return -1;
        }

        return 0;
    }

}
