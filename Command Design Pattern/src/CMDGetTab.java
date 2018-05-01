import java.util.HashMap;
import java.util.Map;

public class CMDGetTab implements CMDInterface {
	private Aggregator agg;

	public CMDGetTab(Aggregator agg) {
		this.agg = agg;
	}

	public void execute() {
		Order orderIteams = agg.getOrder();
		Map<Integer, MenuIteam> iteamToMenuIteam = priceMap();
		double sum = 0;
		for (OrderIteam iteam : orderIteams.getOrderIteams()) {
			MenuIteam temp = iteamToMenuIteam.get((Integer)iteam.getIteamNumber());
			sum += temp.getCost();
		}
		agg.cost = sum;
	}

	private Map<Integer, MenuIteam> priceMap() {
		Menu menu = agg.getMenu();
		Map<Integer, MenuIteam> iteamToMenuIteam = new HashMap<Integer, MenuIteam>();
		for (MenuIteam iteam : menu.getMenuIteam()) {
			iteamToMenuIteam.put(iteam.getIteamNumber(), iteam);
		}
		return iteamToMenuIteam;
	}

}
