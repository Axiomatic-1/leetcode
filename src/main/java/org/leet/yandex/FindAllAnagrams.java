package org.leet.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        FindAllAnagrams findAllAnagrams = new FindAllAnagrams();
        System.out.println(findAllAnagrams.findAnagrams("cbaebabacd", "abc"));
    }


    public List<Integer> findAnagrams(String s, String p) {
        char[] sca = s.toCharArray();
        char[] pca = p.toCharArray();
        Arrays.sort(pca);
        String key = new String(pca);
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < sca.length - (pca.length - 1) ; i++) {
            char[] set = Arrays.copyOfRange(sca, i, i + (pca.length));
            Arrays.sort(set);
            String keyz = new String(set);
            if (key.equals(keyz)) {
                res.add(i);
            }
        }
        return res;
    }
}
