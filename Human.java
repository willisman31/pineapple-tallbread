/**
 * 
 * @author Willis
 * @version 4.6.2021
 */
public class Human extends User {

	private int wins;
	private int draws;
	private int losses;
	private int games;
	
	/**
	 * Default constructor.
	 */
	Human() {
		super();
	}
	
	/**
	 * 
	 * @param name
	 */
	Human(String name) {
		super();
		this.setName(name);
	}
	
	/**
	 * 
	 * @return
	 */
	int getWins() {
		return this.wins;
	}
	
	/**
	 * 
	 * @return
	 */
	int getDraws() {
		return this.draws;
	}
	
	/**
	 * 
	 * @return
	 */
	int getLosses() {
		return this.losses;
	}
	
	/**
	 * 
	 * @return
	 */
	int getGames() {
		return this.games;
	}
	
	/**
	 * 
	 * @return
	 */
	double getWinRate() {
		double rate = (double) this.wins / this.games;
		return Double.parseDouble(String.format("%.2f", rate));
	}
	
	/**
	 * 
	 * @return
	 */
	int winRatePercentage() {
		return (int) (this.getWinRate() * 100);
	}
	
}
