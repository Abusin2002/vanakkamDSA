package leetcode_question.Hashfunction;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctInAnArray {
/*
Input: arr[] = [2, 2, 3, 2]
Output: 2
Explanation: Distinct elements are {2, 3}

Input: arr[] = [12, 1, 14, 3, 16]
Output: 5
Explanation: Distinct elements are {12, 1, 14, 3, 16}

*/
    static int countDistinct(int arr[]) {
        // code here

        Set<Integer> set=new HashSet<>();

        for(int val: arr){
            set.add(val);
        }
        return set.size();

    }
}
