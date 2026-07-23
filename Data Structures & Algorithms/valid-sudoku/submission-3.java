class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    char dig = board[row][col];
                    board[row][col] = '.'; 
                    if (!isSafe(board, row, col, dig)) {
                        return false;
                    }
                    board[row][col] = dig; // Restore
                }
            }
        }
        return true;
    }

    public boolean isSafe(char[][] board, int row, int col, char dig) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == dig) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == dig) return false;
        }
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i <= srow + 2; i++) {
            for (int j = scol; j <= scol + 2; j++) {
                if (board[i][j] == dig)
                    return false;
            }
        }
        return true;
    }
}