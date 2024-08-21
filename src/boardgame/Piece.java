package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		// position = null;		-> By default java already does this

	}

	protected Board getBoard() {
		return board;
	}
}
