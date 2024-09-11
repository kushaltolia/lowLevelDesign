package org.example.interviewQuestions.tictactoe.simple;

import lombok.Data;

@Data
public class Player {
    private String name;
    private PieceType pieceType;

    public Player(String name, PieceType pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }
}
