package com.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cuibaoqiang
 * @date 2021-09-03 11:01:22
 * @desc 无重复字符的最长子串
 */
public class LeetCode0003 {

    public static void main(String[] args) {
        LeetCode0003 code = new LeetCode0003();
        System.out.println(code.lengthOfLongestSubstring("pwwkew"));

    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < s.length(); end++) {
            char curChar = s.charAt(end);
            if (map.containsKey(curChar)) {
                start = Math.max(map.get(curChar), start);
            }
            map.put(curChar, end + 1);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
