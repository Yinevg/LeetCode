package com.learn.medium;

import java.util.*;

/**
 * Created by Yinevg on 2019/6/12
 * Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
//            List<String> list = map.computeIfAbsent(new String(chars), k -> new ArrayList<>());
            List<String> list = map.get(new String(chars));
            if (list == null) {
                list = new ArrayList<>();
                map.put(new String(chars), list);
            }
            list.add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
