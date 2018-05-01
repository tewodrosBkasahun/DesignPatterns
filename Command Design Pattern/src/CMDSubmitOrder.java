import java.util.ArrayList;

public class CMDSubmitOrder implements CMDInterface {
	private Aggregator agg;
	private ArrayList<OrderIteam>  orderIteams;

	public CMDSubmitOrder(Aggregator agg, ArrayList<OrderIteam> orderIteams) {
		this.agg = agg;
		this.orderIteams = orderIteams;
	}

	public void execute() {
		for (OrderIteam iteam : orderIteams) {
			agg.addOrder(iteam);
		}
	}
}
