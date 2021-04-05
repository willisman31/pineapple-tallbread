/**
 * User superclass.
 * @author Willis
 * @version 4.4.2021
 */
public class User {

	private String name; 
	private int ranking; // traditional chess ranking.
	
	/**
	 * Default constructor.
	 */
	User() {
		this.name = "";
		this.ranking = 0;
	}
	
	/**
	 * Explicit, 2-arg constructor.
	 * @param name user's name.
	 * @param ranking user's ranking.
	 */
	User(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}
	
	/**
	 * Copy constructor.
	 * @param user to be copied to new User instance.
	 */
	User(User user) {
		this.name = user.getName();
		this.ranking = user.getRanking();
	}
	
	/**
	 * Name getter.
	 * @return name of this.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Ranking getter.
	 * @return ranking of this.
	 */
	public int getRanking() {
		return this.ranking;
	}
	
	/**
	 * Ranking setter.
	 * @param newRanking replaces current ranking.
	 */
	public void setRanking(int newRanking) {
		this.ranking = newRanking;
	}
	
	/**
	 * Name setter.
	 * @param name replaces current name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Increments ranking by this amount.
	 * @param addTo add this amount to current ranking.
	 */
	public void incrementRanking(int addTo) {
		this.ranking += addTo;
	}
}
