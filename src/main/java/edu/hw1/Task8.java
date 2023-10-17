package edu.hw1;

public class Task8 {

    static final int SIZE = 8;

    static final String ERROR = "not a chessboard";

    public boolean attack1(int i, int j, int[][] board) {
        return ((i - 1 >= 0 && j - 2 >= 0 && board[i - 1][j - 2] == 1)
            || (i - 1 >= 0 && j + 2 < SIZE && board[i - 1][j + 2] == 1)
            || (i + 1 < SIZE && j - 2 >= 0 && board[i + 1][j - 2] == 1)
            || (i + 1 < SIZE && j + 2 < SIZE && board[i + 1][j + 2] == 1));
    }

    public boolean attack2(int i, int j, int[][] board) {
        return ((i - 2 >= 0 && j - 1 >= 0 && board[i - 2][j - 1] == 1)
            || (i - 2 >= 0 && j + 1 < SIZE && board[i - 2][j + 1] == 1)
            || (i + 2 < SIZE && j - 1 >= 0 && board[i + 2][j - 1] == 1)
            || (i + 2 < SIZE && j + 1 < SIZE && board[i + 2][j + 1] == 1));
    }

    public boolean knightBoardCapture(int[][] board) {
        if (board.length != SIZE) {
            throw new IllegalArgumentException(ERROR);
        }
        for (int i = 0; i < SIZE; ++i) {
            if (board[i].length != SIZE) {
                throw new IllegalArgumentException(ERROR);
            }
        }
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                if (board[i][j] == 1 && (attack1(i, j, board) || attack2(i, j, board))) {
                    return false;
                }
            }
        }
        return true;
    }
}
