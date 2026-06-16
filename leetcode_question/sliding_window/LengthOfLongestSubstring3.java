package leetcode_question.sliding_window;

import java.util.HashSet;

public class LengthOfLongestSubstring3 {
/*
    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==1) return len;


        int left=0;

        HashSet<Character>set=new HashSet<>();
        int result=0;

        for(int i=0;i<len;i++){
            char current=s.charAt(i);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);

            result=Math.max(result,i-left+1);
        }

        return result;
    }


    //0ms run time
    public int lengthOfLongestSubstringV2(String s) {
        int result = 0;

        // Usamos un array primitivo asumiendo caracteres ASCII estándar (128 espacios)
        int[] charIndex = new int[128];

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // En lugar de mover 'left' paso a paso, saltamos directamente a la posición
            // siguiente de donde vimos este carácter por última vez.
            left = Math.max(left, charIndex[currentChar]);

            // Calculamos la longitud máxima actual
            result = Math.max(result, right - left + 1);

            // Guardamos la *siguiente* posición del carácter actual
            charIndex[currentChar] = right + 1;
        }

        return result;
    }


}
