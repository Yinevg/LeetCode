package com.learn.medium;

/**
 * Created by Yinevg on 2019/6/22
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * <p>
 * Example:
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exist(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist(char[][] board, String word, int curIndex, int row, int col) {
        if (curIndex == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return false;
        }
        if (board[row][col] != word.charAt(curIndex)) {
            return false;
        }
        board[row][col] ^= 256;
        boolean result = exist(board, word, curIndex + 1, row + 1, col) ||
                exist(board, word, curIndex + 1, row - 1, col) ||
                exist(board, word, curIndex + 1, row, col + 1) ||
                exist(board, word, curIndex + 1, row, col - 1);
        board[row][col] ^= 256;
        return result;
    }

}
