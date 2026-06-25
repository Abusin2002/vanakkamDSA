package leetcode_question.Hashfunction;


//Find the single element use XOR for efficient solution
public class SingleNumber136 {

    /*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1




    * */

    public int singleNumber(int[] nums) {

        // HashMap<Integer,Integer> map=new HashMap<>();

        // for(int num  : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // int single= Collections.min(map.values());

        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     if(entry.getValue()==1) return entry.getKey();
        // }
        // return -1;

        int result =0;

        for(int num: nums){
            result ^= num;
        }
        return result;
    }
}
