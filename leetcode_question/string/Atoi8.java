package leetcode_question.string;

public class Atoi8 {

    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;

        long val = 0;
        int len = s.length();

        while (i < len && s.charAt(i) == ' ') {
            i++;
        }

        if (i<len && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i<len && s.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        while (i < len && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            val = val * 10 + digit;

            if (sign*val > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign*val < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)(val*sign);

    }
}
