package org.leet.yandex;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams gp = new GroupAnagrams();
        System.out.println(gp.s(new String[] {"eat","tea","tan","ate","nat","bat"}));
    }

    private List<List<String>> s(String[] strs) {
        HashMap<String, List<String>> dictionary = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!dictionary.containsKey(key)) {
                var list = new CopyOnWriteArrayList<String>();
                list.add(str);
                dictionary.put(key, list);
            } else {
                dictionary.get(key).add(str);
            }
        }
        return new ArrayList<>(dictionary.values());
    }
}
