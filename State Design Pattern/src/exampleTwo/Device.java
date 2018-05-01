package exampleTwo;

public class Device {
	State state;
	String device;

	public void action(State lightState) {
		state = lightState;
		state.execute(device);
	}

}
