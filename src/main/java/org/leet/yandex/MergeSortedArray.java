package org.leet.yandex;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergeSortedArray {
    Logger logger = Logger.getLogger(MergeSortedArray.class.getName());

    public static void main(String[] args) {
        MergeSortedArray ms = new MergeSortedArray();
        int[] nums1 = {0,2,0,0,0,0,0};
        int[] nums2 = {-1,-1,2,5,6};
        ms.merge(nums1, 2, nums2, 5);
        ms.logger.log(Level.INFO, Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int c = m + n - 1;

        if (m == 0) {
            for(int i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }

        while (c >= 0) {
            int tmp = nums1[c];

            if (a > -1 && nums1[a] > nums2[b]) {
                nums1[c] = nums1[a];
                nums1[a] = tmp;
                a--;
                c--;
            } else {
                nums1[c] = nums2[b];
                nums2[b] = tmp;
                if (b == 0) return;
                b--;
                c--;
            }
        }
    }

}
