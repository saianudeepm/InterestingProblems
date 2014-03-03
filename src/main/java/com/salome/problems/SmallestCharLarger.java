package com.salome.problems;

/**
 * Created by saimachavarapu on 3/2/14.
 */

/**
 * Return the smallest character that is strictly larger than the search character,
 * If no such character exists, return the smallest character in the array
 * @param - sortedStr : sorted list of letters, sorted in ascending order.
 * @param - c : character for which we are searching.
 * Given the following inputs we expect the corresponding output:
 * ['c', 'f', 'j', 'p', 'v'], 'a' => 'c'
 * ['c', 'f', 'j', 'p', 'v'], 'c' => 'f'
 * ['c', 'f', 'j', 'p', 'v'], 'k' => 'p'
 * ['c', 'f', 'j', 'p', 'v'], 'z' => 'c' // The wrap around case
 * ['c', 'f', 'k'], 'f' => 'k'
 * ['c', 'f', 'k'], 'c' => 'f'
 * ['c', 'f', 'k'], 'd' => 'f'
 */
public class SmallestCharLarger {

    public  char findSmallestCharLarge(char[] sortedChars , char searchChar ){
        return find(sortedChars, searchChar);
    }
    private char find(char [] list , char c){
        assert list.length > 0;
        int left = 0, right = list.length - 1;
        char result = list[0];
        // we keep doing the binary search till we have left ptr lt right ptr
        while (left < right) {
            //calculate the mid
            int mid = left + (right - left) / 2;
            //if mid is equal to the target,
            //if mid is not at the end then return mid+1 since we want smthn greater than target
            if (list[mid] == c) {
                if (mid < list.length - 1) return list[mid+1];
                else return result;
            }
            //else if mid is lt c we need to go right to search
            //so set the left to mid+1 and continue the same search
            else if (list[mid] < c) {
                left = mid + 1;
            }

            //else in case if the mid is gt than c, we found a potential candidate greater than c
            //now keep searching making the right to mid -1
            else {//list[mid] > c
                result = list[mid];
                right = mid - 1;
            }
        }
        return result;
    }
}
