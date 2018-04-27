package exampleTwo;

public class Driver {
	public static void main(String[] arg) {
		/*
		 * The Driver class, will use Car object and getMadeIn method to demonstrate
		 * change in car behavior based on strategy it deploys or uses.
		 */

		Car carOne = new Honda();
		Car carTwo = new Hawtai();
		Car carThree = new Mazzanti();

		/*
		 * Here we are using the strategy pattern to be able to switch out different
		 * implementation for different situations using the getMadeIn()
		 */

		System.out.println(carOne.getBrand() + " -- " + carOne.getMadeIn());
		System.out.println(carTwo.getBrand() + " -- " + carTwo.getMadeIn());
		System.out.println(carThree.getBrand() + " -- " + carThree.getMadeIn());
	}
}
