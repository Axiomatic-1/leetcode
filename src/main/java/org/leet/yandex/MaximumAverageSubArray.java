package org.leet.yandex;

public class MaximumAverageSubArray {
    public static void main(String[] args) {
        MaximumAverageSubArray ma = new MaximumAverageSubArray();
        System.out.println(ma.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    public double findMaxAverage(int[] nums, int k) {
        int maxAvg = 0;
        int windowsAvg = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            windowsAvg += nums[i];

            if ((i - start + 1) == k) {
                maxAvg = Math.max(maxAvg, windowsAvg);
                windowsAvg = windowsAvg - nums[start];
                start++;
            }
        }
        return maxAvg;
    }

}
