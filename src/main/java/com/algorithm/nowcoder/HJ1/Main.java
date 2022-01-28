package com.algorithm.nowcoder.HJ1;

import java.util.Scanner;

/**
 * @author cuibaoqiang
 * @date 2022-01-28 15:45:30
 * @desc 牛客网华为机试 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str.substring(str.lastIndexOf(" ") + 1).length());
    }
}
