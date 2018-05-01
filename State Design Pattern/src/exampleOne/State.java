package exampleOne;

public interface State {
   void execute();
}

// on state of light 
class On implements State{
	@Override
	public void execute () {
	  System.out.println("Ligth is on !");
	}
}
//off state of light 
class Off implements State{
	@Override
	public void execute () {
		System.out.println("Light is off!");
	}
}
