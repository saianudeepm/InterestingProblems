package com.salome.glass;

/**
 * Created by saimachavarapu on 2/23/14.
 */

import java.util.HashMap;

/**
 * Given two (dictionary) words as Strings, determine if they are isomorphic. Two words are called isomorphic
 * if the letters in one word can be remapped to get the second word. Remapping a letter means replacing all
 * occurrences of it with another letter while the ordering of the letters remains unchanged. No two letters
 * may map to the same letter, but a letter may map to itself.
 * <p/>
 * Example:
 * given "foo", "app"; returns true
 * we can map 'f' -> 'a' and 'o' -> 'p'
 * <p/>
 * given "bar", "foo"; returns false
 * we can't map both 'a' and 'r' to 'o'
 * <p/>
 * given "turtle", "tletur"; returns true
 * we can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' ->'r'
 * <p/>
 * given "ab", "ca"; returns true
 * we can map 'a' -> 'c', 'b' -> 'a'
 */


public class Isomorphic {

    public boolean isIsomorphic(String word1, String word2) {
        //if not same length then they arent isomorphic
        if (word1.length() != word2.length())
            return false;
        HashMap<Character, Character> wordMap = new HashMap<Character, Character>();
        for (int i = 0; i < word1.length(); i++) {
            //if the characters are not equal then we need to see if we can map
            if (word2.charAt(i) != word1.charAt(i)) {
                //check if already mapped in the map.
                //if not mapped, then map
                //else check if equals to the mapping and if true continue else return false
                if (!wordMap.containsKey(word2.charAt(i))) {
                    wordMap.put(word2.charAt(i), word1.charAt(i));
                } else {
                    if (!wordMap.get(word2.charAt(i)).equals(word1.charAt(i)))
                        return false;
                }
            }
        }

        return true;
    }
}
