package com.algorithm.learn;

/**
 * @author cuibaoqiang
 * @date 2021-07-14 17:49:04
 * @desc 汉诺塔游戏
 */
public class Hanoi {

    /**
     * @param n           盘子的数目
     * @param origin      源座
     * @param assist      辅助座
     * @param destination 目的座
     */
    private static void hanoi(int n, char origin, char assist, char destination) {
        if (n == 1) {
            // 输出移动过程
            System.out.println("Direction:" + origin + "--->" + destination);
        } else {
            // 将 n-1 个盘子从源座借助目的座移动到辅助座上面
            hanoi(n - 1, origin, destination, assist);
            // 将剩余的 1 个盘子从源座借助辅助座移动到目的座上面
            hanoi(1, origin, assist, destination);
            // 将 n-1 个盘子从辅助座借助源座移动到目的座上面
            hanoi(n - 1, assist, origin, destination);
        }
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
