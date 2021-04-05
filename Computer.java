/**
 * 
 * @author Willis
 * @version 4.4.2021
 */
public class Computer extends User {

	private int difficulty;
	
	/**
	 * Default constructor.
	 */
	Computer() {
		// TODO
	}
	
	/**
	 * Difficulty setter.
	 * @param difficulty is new value of computer's difficulty.
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDifficulty() {
		return this.difficulty;
	}
	
}
