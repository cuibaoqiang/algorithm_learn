package com.algorithm.剑指offer;

/**
 * @author cuibaoqiang
 * @date 2021-09-07 14:19:46
 * @desc 矩阵中的路径
 */
public class 剑指offer12 {
    public static void main(String[] args) {
        剑指offer12 code = new 剑指offer12();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCEDA";
        System.out.println(code.exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word.toCharArray(), i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != words[k]) {
            return false;
        }
        if (k == words.length - 1) {
            return true;
        }
        boolean res = dfs(board, words, i + 1, j, k + 1) || // 向下遍历
                dfs(board, words, i - 1, j, k + 1) || // 向上遍历
                dfs(board, words, i, j + 1, k + 1) || // 向右遍历
                dfs(board, words, i, j - 1, k + 1); // 向左遍历
        return res;
    }
}
