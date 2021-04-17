/**
 * Type of piece and its behavior.
 * 
 * @author Willis
 * @version 4.16.2021
 */
public enum PieceType {

	ROOK,
	KNIGHT,
	BISHOP,
	QUEEN,
	KING,
	PAWN;
	
	/**
	 * Move piece depending on what type it is.
	 * 
	 * @param piece type of piece to move.
	 */
	void move(PieceType piece) throws IllegalMoveException {
		switch (piece) {
		case ROOK:
			// TODO
			break;
		case KNIGHT:
			// TODO
			break;
		case BISHOP:
			// TODO
			break;
		case QUEEN:
			// TODO
			break;
		case KING:
			// TODO
			break;
		case PAWN:
			// TODO
			break;
		default:
			throw new IllegalMoveException();
		}
	}
	
	
	/**
	 * Overrides Object toString to get name of enum constant as String.
	 * 
	 * @return name of type as String.
	 */
	@Override
	public String toString() {
		return this.name();
	}
	
}
