package org.example.interviewQuestions.tictactoe.simple;

public class Board {
    private PieceType[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new PieceType[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = null;
            }
        }
    }

    public boolean makeMove(Move move) {
        int row = move.getRow();
        int col = move.getCol();
        if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == null) {
            board[row][col] = move.getPlayer().getPieceType();
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("_ ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean checkWin(PieceType PieceType) {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != PieceType) rowWin = false;
                if (board[j][i] != PieceType) colWin = false;
            }
            if (rowWin || colWin) return true;
        }

        // Check diagonals
        boolean diag1Win = true;
        boolean diag2Win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != PieceType) diag1Win = false;
            if (board[i][size - 1 - i] != PieceType) diag2Win = false;
        }
        return diag1Win || diag2Win;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) return false;
            }
        }
        return true;
    }
}
