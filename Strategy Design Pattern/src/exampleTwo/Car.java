package exampleTwo;

public class Car {
	String brand;
	/* Behavior will depend on the class extending it */
	Made made; 
	/* Return the brand of the car  */
	public String getBrand() {
		return brand;
	}
     /* set the brand of the car  */
	public void setBrand(String brand) {
		this.brand = brand;
	}
     /* Select where the car is made  at run time */
	public String getMadeIn() {
		return made.in();
	}
}