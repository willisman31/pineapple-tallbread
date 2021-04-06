
/**
 * @author Willis
 * @version 4.4.2021
 */
public abstract class Piece {

	private String name; // name is used sparingly, ex. queen's rook
	private boolean isWhite;
	
	Piece() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return
	 */
	boolean getColor() {
		return this.isWhite;
	}
	
	abstract void move();
}
