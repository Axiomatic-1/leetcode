package org.leet;

import java.util.Arrays;

/**
* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of
*  the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

https://leetcode.com/problems/move-zeroes/description/
* */
public class MoveZeros {

  void moveZeros(int[] nums) {
    //that counter only moves if we countered non zero element, and it always point at zeros
    int zeroAt = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[zeroAt];
        nums[zeroAt] = nums[i];
        nums[i] = temp;
        zeroAt++;
      }
    }
  }

  public static void main(String[] args) {
    MoveZeros moveZeros = new MoveZeros();
    int[] nums = new int[]{0, 1, 0, 3, 12};
    moveZeros.moveZeros(nums);
    System.out.println(Arrays.toString(nums));
  }


}
