/**
 * Creates Chess board.
 * 
 * @author Willis
 * @version 4.7.2021
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
					board[i][j] = new Piece();
					board[i][j] = new Piece();
					board[i][j] = new Piece();
					board[i][j] = new Piece();
					board[i][j] = new Piece();
					board[i][j] = new Piece();
					board[i][j] = new Piece();
					board[i][j] = new Piece();
				} else if (i == 1 || i == 7) {
					board[i][j] = new Piece();
				} else {
					board[i][j] = null;
				}
			}
		}
	}

	/**
	 * Copy constructor.
	 * 
	 * @param board to be copied.
	 */
	Board(Board board1) {
		for (int i = 0; i < board1.getBoard().length; i++) {
			for (int j = 0; j < board1.getCol(); j++) {
				this.board[i][j] = board1.getSpace(i, j);
			}
		}
	}

	/**
	 * Create special instance of board.
	 * 
	 * @param board to be created as board.
	 */
	Board(Piece[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				this.board[i][j] = board[i][j];
			}
		}
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
	 * Column getter for double array of Pieces.
	 * 
	 * @return column count.
	 */
	public int getCol() {
		return this.board.length;
	}

	/**
	 * Row getter for double array of Pieces.
	 * 
	 * @return row count.
	 */
	public int getRow() {
		return this.getRow(0);
	}

	/**
	 * Column getter for double array of Pieces.
	 * 
	 * @param i is index of column from which to get row length.
	 * @return row length for column index i.
	 */
	public int getRow(int i) {
		return this.board[i].length;
	}

	/**
	 * Gets contents of double array index row col.
	 * 
	 * @param row index of row.
	 * @param col index of column.
	 * @return contents at row, col.
	 */
	public Piece getSpace(int row, int col) {
		return this.board[row][col];
	}

}
