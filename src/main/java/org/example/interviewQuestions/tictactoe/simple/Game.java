package org.example.interviewQuestions.tictactoe.simple;


import java.util.Scanner;

public class Game {
    private Board board;
    private Player[] players;
    private int currentPlayerIndex;

    public Game(int boardSize, Player[] players) {
        this.board = new Board(boardSize);
        this.players = players;
        this.currentPlayerIndex = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.printBoard();
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println("Player " + currentPlayer.getName() + "'s turn (" + currentPlayer.getPieceType() + ").");
            System.out.print("Enter row and column (0-based index): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Move move = new Move(row, col, currentPlayer);

            if (board.makeMove(move)) {
                if (board.checkWin(currentPlayer.getPieceType())) {
                    board.printBoard();
                    System.out.println("Player " + currentPlayer.getName() + " wins!");
                    break;
                } else if (board.isFull()) {
                    board.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }
}
