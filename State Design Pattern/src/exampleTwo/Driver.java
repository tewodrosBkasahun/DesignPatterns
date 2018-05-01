package exampleTwo;

public class Driver {
	public static void main(String[] args) {
        /* Both Light and TV are monolithic objects (their function of state  
         * change at run-time depending on the state)
         */
		
		
		Light light = new Light();
		TV tv = new TV();

		light.action(new On());
		light.action(new Off());

		tv.action(new On());
		tv.action(new Off());

	}
}
