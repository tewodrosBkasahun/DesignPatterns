import java.util.ArrayList;

public class SystemInterface {
	// initialize aggregate object
	private Aggregator agg;
	private Invoker invoker;
	private CMDInterface cmd;

	public SystemInterface() {
		agg = new Aggregator();

	}

	// display Menu
	public void displayMenu() {
		cmd = new CMDGetMenu(agg);
		invoker = new Invoker(cmd);
		invoker.process(cmd);
	}

	// submit order to invoker
	public void submitOrder(ArrayList<OrderIteam> orders) {
		cmd = new CMDSubmitOrder(agg, orders);
		invoker = new Invoker(cmd);
		invoker.process(cmd);
	}

	// calculate tab
	public void displayTab() {
		cmd = new CMDGetTab(agg);
		invoker = new Invoker(cmd);
		invoker.process(cmd);
		System.out.println("The tab is " + agg.cost);
	}
}
