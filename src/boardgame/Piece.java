package boardgame;

public class Piece {
	
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		this.board = board;
		// position = null;		-> O java ja faz isto por default
	}

	protected Board getBoard() {
		return board;
	}
}
