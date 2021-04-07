/**
 * 
 * @author Willis
 * @version 4.4.2021
 */
public class Board {

	private Piece[][] board;

	/**
	 * Default constructor.
	 */
	Board() {
		this.board = new Piece[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 7 == 0) {
					board[i][j] = new Rook();
					board[i][j] = new Knight();
					board[i][j] = new Bishop();
					board[i][j] = new King();
					board[i][j] = new Queen();
					board[i][j] = new Bishop();
					board[i][j] = new Knight();
					board[i][j] = new Rook();
				} else if (i == 1 || i == 7) {
					board[i][j] = new Pawn();
				} else {
					board[i][j] = null;
				}
			}
		}
	}
	
	/**
	 * Copy constructor.
	 * @param board to be copied.
	 */
	Board(Board board) {
		// TODO
	}
	
	/**
	 * Create special instance of board.
	 * @param board to be created as board.
	 */
	Board(Piece[][] board) {
		// TODO
	}

	/**
	 * Board getter.
	 * 
	 * @return current state of this board.
	 */
	public Piece[][] getBoard() {
		return this.board;
	}
	
	/**
	 * 
	 * @param row
	 * @param col
	 * @return
	 */
	public Piece getSpace(int row, int col) {
		return this.board[row][col];
	}
	
}
