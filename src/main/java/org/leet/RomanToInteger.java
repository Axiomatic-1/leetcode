package org.leet;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */

public class RomanToInteger {

  public int romanToInt(String s) {
    int sum = 0;
    int prev = 0;
    int next;
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case 'I' -> next = 1;
        case 'V' -> next = 5;
        case 'X' -> next = 10;
        case 'L' -> next = 50;
        case 'C' -> next = 100;
        case 'D' -> next = 500;
        case 'M' -> next = 1000;
        default -> next = 0;
      }
      if (prev < next) {
        sum -= prev;
      } else {
        sum = sum + prev;
      }
      prev = next;
    }
    //corner case when only one digit we need to let sum = prev, so we add prev, not next
    sum += prev;
    return sum;
  }

  public static void main(String[] args) {
    RomanToInteger roman = new RomanToInteger();
    System.out.println(roman.romanToInt("XIV"));
  }
}
