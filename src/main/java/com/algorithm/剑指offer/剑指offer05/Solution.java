package com.algorithm.剑指offer.剑指offer05;

/**
 * @author cuibaoqiang
 * @date 2021-09-07 10:41:36
 * @desc 替换空格
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.replaceSpace("We are happy."));
    }

    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
