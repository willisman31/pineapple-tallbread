
/**
 * @author Willis
 * @version 4.4.2021
 */
public class Piece {

	private PieceType name; 
	private boolean isWhite;
	 
	
	/**
	 * Default constructor.
	 * Creates white pawn by default.
	 */
	Piece() {
		this.name = PieceType.PAWN;
		this.isWhite = true;
	}
	
	/**
	 * Parameterized constructor; 2-arg constructor.
	 * 
	 * @param type Piece type.
	 * @param color piece color- true is white.
	 */
	Piece(PieceType type, boolean color) {
		this.name = type;
		this.isWhite = color;
	}
	
	/**
	 * PieceType getter.
	 * 
	 * @return type of piece.
	 */
	PieceType getName() {
		return this.name;
	}
	
	/**
	 * Color getter.
	 * 
	 * @return true if white, false if black.
	 */
	boolean getColor() {
		return this.isWhite;
	}
	
}
