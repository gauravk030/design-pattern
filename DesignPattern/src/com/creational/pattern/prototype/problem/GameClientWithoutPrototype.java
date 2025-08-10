package com.creational.pattern.prototype.problem;

/**
 * less flexibility: if we want to add new property in object then we have to tell client.In that case client is tightly coupled.
 * Manually create the copy of object which leads the possible errors
 */
public class GameClientWithoutPrototype {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red",1));
        gameBoard.addPiece(new GamePiece("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoard copiedBoard = new GameBoard();
        for(GamePiece piece: gameBoard.getPieces()){
            copiedBoard.addPiece(new GamePiece(piece.getColor(), piece.getPosition()));
        }

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
