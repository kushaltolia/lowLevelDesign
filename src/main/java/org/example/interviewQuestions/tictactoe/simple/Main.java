package org.example.interviewQuestions.tictactoe.simple;

public class Main {
    public static void main(String[] args) {
        int boardSize = 3; // Size of the board (3x3 for classic tic-tac-toe)
        Player[] players = {
                new Player("Alice", PieceType.X),
                new Player("Bob", PieceType.O)
        };

        Game game = new Game(boardSize, players);
        game.start();
    }
}
