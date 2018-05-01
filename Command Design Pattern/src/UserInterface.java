import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<OrderIteam> orders = new ArrayList<OrderIteam>();

		SystemInterface system = new SystemInterface();
		// display menu iteam.
		system.displayMenu();

		System.out.print("Enter number of selections: ");
		int selections = input.nextInt();

		while (selections > 0) {
			System.out.print("Select iteam from menu: ");
			int choice = input.nextInt();
			OrderIteam orderOne = new OrderIteam(choice);
			orders.add(orderOne);
			selections--;
		}
		system.submitOrder(orders);
		system.displayTab();
	}
}
