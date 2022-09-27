package com.algorithm.剑指offer.剑指offer50;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cuibaoqiang
 * @date 2022-09-27 17:13:30
 * @desc 第一个出现一次的字符
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.firstUniqChar("abaccdeff"));

    }

    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, !map.containsKey(c));
        }

        for (char c : s.toCharArray()) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }
}
