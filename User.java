/**
 * User superclass.
 * @author Willis
 * @version 4.6.2021
 */
public class User {

	private String name, userID; 
	private int ranking; // traditional chess ranking.
	private User[] users;
	
	/**
	 * Default constructor.
	 */
	User() {
		this.name = "";
		this.ranking = 0;
	}
	
	/**
	 * Explicit, 2-arg constructor.
	 * 
	 * @param name user's name.
	 * @param ranking user's ranking.
	 */
	User(String name, int ranking) {
		// TODO
		this.userID = name;
		this.name = name;
		this.ranking = ranking;
	}
	
	/**
	 * Copy constructor.
	 * 
	 * @param user to be copied to new User instance.
	 */
	User(User user) {
		this.name = user.getName();
		this.ranking = user.getRanking();
	}
	
	/**
	 * Name getter.
	 * 
	 * @return name of this.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Ranking getter.
	 * 
	 * @return ranking of this.
	 */
	public int getRanking() {
		return this.ranking;
	}
	
	/**
	 * Ranking setter.
	 * 
	 * @param newRanking replaces current ranking.
	 */
	public void setRanking(int newRanking) {
		this.ranking = newRanking;
	}
	
	/**
	 * Name setter.
	 * 
	 * @param name replaces current name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Increments ranking by this amount.
	 * 
	 * @param addTo add this amount to current ranking.
	 */
	public void incrementRanking(int addTo) {
		this.ranking += addTo;
	}
	
	/**
	 * Decrease ranking by amount of takeFrom.
	 * 
	 * @param takeFrom amount to decrement ranking.
	 */
	public void decrementRanking(int takeFrom) {
		this.ranking -= takeFrom;
	}
	
	/**
	 * User ID getter.
	 * 
	 * @return userID.
	 */
	public String getUserID() {
		return this.userID;
	}
	
	
	/**
	 * Getter for array of all users.
	 * 
	 * @return array of all users.
	 */
	public User[] getUsers() {
		return this.users;
	}
	
	/**
	 * Adds user to array of users.
	 * 
	 * @param user to add.
	 * @return whether addition was successful.
	 */
	public boolean addUser(User user) {
		return false;
	}
	
	public int search(User user) {
		// TODO
		return -1;
	}
	
}
