package org.leet.yandex;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(i.intersection(new int[]{1,2,2,1}, new int[]{2,2})));
    }

    private int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(Integer i : nums1){
            set.add(i);
        }

        for (int j : nums2) {
            if (!set.add(j)) {
                resultSet.add(j);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
