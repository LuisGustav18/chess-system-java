package application;

import chess.ChessMatch;

public class Program {
	
	static public void main(String [] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
