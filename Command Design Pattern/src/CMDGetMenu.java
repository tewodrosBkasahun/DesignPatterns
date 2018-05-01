
public class CMDGetMenu implements CMDInterface {
	private Aggregator agg;

	public CMDGetMenu(Aggregator agg) {
		this.agg = agg;
	}

	public void execute() {
		Menu menu = agg.getMenu();
		System.out.println("---------------- Menu Iteams ------------------");
		for (MenuIteam menuItem : menu.getMenuIteam()) {
			System.out.println("Iteam # " + menuItem.getIteamNumber());
			System.out.println("Description " + menuItem.getDescription());
			System.out.println("Price " + menuItem.getCost());
			System.out.println("_______________________________________________");
		}
	}
}
