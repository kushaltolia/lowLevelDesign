package org.example.interviewQuestions.tictactoe.simple;

import lombok.Data;

@Data
public class Move {
    private int row;
    private int col;
    private Player player;

    public Move(int row, int col, Player player) {
        this.row = row;
        this.col = col;
        this.player = player;
    }
}
