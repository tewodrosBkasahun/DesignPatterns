import java.util.ArrayList;

public class Order {
	private ArrayList<OrderIteam> orderIteams;

	public Order() {
		orderIteams = new ArrayList<OrderIteam>();
	}

	public void addOrder(OrderIteam order) {
		orderIteams.add(order);
	}

	public ArrayList<OrderIteam> getOrderIteams() {
		return orderIteams;
	}
}
