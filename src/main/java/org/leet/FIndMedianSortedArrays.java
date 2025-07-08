package org.leet;

public class FIndMedianSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        int max1 = nums1.length;
        int max2 = nums2.length;
        int min = (nums1.length > nums2.length) ? max2 : max1;
        int max = (nums1.length > nums2.length) ? max1 : max2;
        int revert = 1;

        for (int i = 0; i != max; i++) {
            if (i != min) {
                if (nums1[i] < nums2[i]) {
                    sum[i] = nums1[i];
                } else {
                    sum[i] = nums2[i];
                }
            } else {
                if (revert != 0) {
                    if (nums1[i] < nums2[i]) {
                        sum[i] = nums1[i];
                    } else {
                        sum[i] = nums2[i];
                    }
                } else if (max1 > max2) {
                    sum[i] = nums1[i];
                } else {
                    sum[i] = nums2[i];
                }
            }
        }

        if (sum.length % 2 == 0) {
            return (sum[sum.length / 2] + sum[(sum.length / 2) - 1]) / 2.0;
        }
        return (sum[sum.length / 2]);
    }
}
