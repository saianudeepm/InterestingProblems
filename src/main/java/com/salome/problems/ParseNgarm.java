package com.salome.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by saianudeepm on 9/11/15.
 */

/**
 * Given a set of words and a dictionary
 * interpret the set of words using the corpus dictionary and tell if we have a possible query 
 * after interpreting different possible entities
 * *
 **/

public class ParseNgarm {

    String[] input;
    HashSet<String> dictionary;
    boolean hasSolution;
    NgramSolution ngramSolution;


    ParseNgarm(String[] input, HashSet<String> dictionary) {
        this.input = input;
        this.dictionary = dictionary;
        ngramSolution = new NgramSolution();
    }

    public boolean isPossible() {
        backtrack(-1); // since 0 index
        //return solution
        return hasSolution;
    }

    private void backtrack(int k) {

        if (isSolution(k))
            return;

        else {
            k++;
            //candidates here are the rest of the words after k
            for (int i = k; i < input.length; i++) {
                // adds the words  to solution from index (k, i)
                //eg: input =["where", "can", "we", "buy", "this", "stuff"]
                // when k=0 and i=0 ngram solution = {"where"}
                // when k=0 and i=1 ngram solution = {"where can"}
                // when k=1 and i=1 ngram solution = {"where", "can"}
                // when k=1 and i=2 ngram solution = {"where", "can we"}
                this.ngramSolution.add(input, k, i);
                backtrack(i);
                //undo the move for new input eg: 1 pass where 2 pass where can 3 pass "where can we"
                this.ngramSolution.removeLastAdded();
                if (this.hasSolution)
                    return;
            }
        }
    }

    //returns if there is a solution 
    private boolean isSolution(int k) {
        if (ngramSolution.getSolutions().isEmpty() || (k < input.length - 1))
            return false;
        // loop through the Ngramsolutoin and verify in dictionary if the solution exists
        for (String solution : ngramSolution.getSolutions()) {
            System.out.print("|" + solution);
        }
        System.out.print("\n");
        for (String solution : ngramSolution.getSolutions()) {
            if (!dictionary.contains(solution))
                return false;
        }
        this.hasSolution = true;
        System.out.println("hurray found solution");
        return true;

    }

    public class NgramSolution {

        List<String> arr = new ArrayList<String>();
        int index = 0;

        public void add(String src[], int start, int end) {
            StringBuilder sb = new StringBuilder("");
            for (int i = start; i <= end; i++) {
                sb.append(src[i]);
                if (i != end)
                    sb.append(" ");
            }
            arr.add(sb.toString());
            index++;
        }

        public void removeLastAdded() {
            arr.remove(index - 1);
            index--;

        }

        public List<String> getSolutions() {
            return this.arr;
        }

    }


    public static void main(String args[]) {
        String input[] = new String[]{"she", "buys", "stuff", "every", "day"};
        HashSet<String> dictionary = new HashSet<String>();
        dictionary.add("she buys");
        dictionary.add("stuff");
        dictionary.add("every day");
        dictionary.add("day");
        ParseNgarm obj = new ParseNgarm(input, dictionary);
        System.out.println(obj.isPossible());

    }

}
