package org.leet.yandex;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes mc = new MaxConsecutiveOnes();
        int[] arr = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(mc.findMaxConsecutiveOnes(arr));

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int num : nums) {
            if (num == 1) {
                temp++;
            } else {
                temp = 0;
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
