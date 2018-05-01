
public class Aggregator {
	Menu menu;
	Order orders;
	double cost = 0;

	MenuIteam iteamOne = new MenuIteam("Big Mac", 7, 1);
	MenuIteam iteamTwo = new MenuIteam("Grilled Artisan Chicken", 8, 2);
	MenuIteam iteamThree = new MenuIteam("Egg McMuffin", 3, 3);

	public Aggregator() {
		this.menu = new Menu();
		this.orders = new Order();
		populateMenu();
	}

	/**
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return orders;
	}

	public void addOrder(OrderIteam order) {
		orders.addOrder(order);
	}

	private void populateMenu() {
		MenuIteam iteamOne = new MenuIteam("Big Mac", 7, 1);
		MenuIteam iteamTwo = new MenuIteam("Grilled Artisan Chicken", 8, 2);
		MenuIteam iteamThree = new MenuIteam("Egg McMuffin", 3, 3);
		menu.addIteam(iteamOne);
		menu.addIteam(iteamTwo);
		menu.addIteam(iteamThree);
	}

}
