import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuIteam> menuIteams;

	public Menu() {
		menuIteams = new ArrayList<MenuIteam>();
	}

	public void addIteam(MenuIteam iteam) {
		menuIteams.add(iteam);
	}

	public ArrayList<MenuIteam> getMenuIteam() {
		return menuIteams;
	}

}
