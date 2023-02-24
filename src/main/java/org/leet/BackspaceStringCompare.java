package org.leet;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a
 * backspace character. Note that after backspacing an empty text, the text will continue empty.
 * <p>
 * Example 1:
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * https://leetcode.com/problems/backspace-string-compare/
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {
        BackspaceStringCompare back = new BackspaceStringCompare();
        System.out.println(back.backspaceCompare("bxj##tw", "bxj###tw"));
    }

    public boolean backspaceCompare(String s, String t) {
        if (s.length() == 0 && t.length() != 0) return false;
        String s1 = stringMaker(s);
        String s2 = stringMaker(t);
        return s1.equals(s2);
    }

    private String stringMaker(String s) {
        String[] split = s.split("");
        StringBuilder s1 = new StringBuilder();
        int counter = 0;

        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].equals("#")) {
                counter++;
            } else if (counter == 0) {
                s1.append(split[i]);
            } else {
                --counter;
            }
        }
        return s1.toString();
    }

}
