package leetcode_question.Hashfunction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrayswithDuplicates {


    /*

Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
Output: [1, 2, 3]
Explanation: Union set of both the arrays will be 1, 2 and 3.

Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]
Explanation: Union set of both the arrays will be 1, 2, 3, 4, 5 and 6.

    * */

    //optimal approach
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set=new HashSet<>();

        for(int val: a) set.add(val);

        for(int val: b) set.add(val);



        return new ArrayList<Integer>(set);
    }

    //noramal
    public static ArrayList<Integer> findUnion2(int[] a, int[] b) {
        // code here
        Set<Integer> set=new HashSet<>();

        for(int val: a)set.add(val);

        for(int val: b){
            set.add(val);
        }

        ArrayList<Integer> result=new ArrayList<>();

        for(int val : set){
            result.add(val);
        }

        return result;
    }
}
