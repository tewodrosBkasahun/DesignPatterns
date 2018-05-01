public class MenuIteam {

	private String description;
	private double cost;
	private int iteamNumber;

	public MenuIteam(String description, double cost, int iteamNumber) {
		this.description = description;
		this.cost = cost;
		this.iteamNumber = iteamNumber;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @return the iteamNumber
	 */
	public int getIteamNumber() {
		return iteamNumber;
	}

}
