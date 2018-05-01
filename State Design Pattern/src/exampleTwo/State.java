package exampleTwo;
/*
 * The State interface will alter the behavior of the object 
 * that use it when its internal state change 
 */
public interface State {
   void execute(String device);
}

// on state of light 
class On implements State{
	@Override
	public void execute (String device) {
	  System.out.println(device+"is on !");
	}
}
//off state of light 
class Off implements State{
	@Override
	public void execute (String device) {
		  System.out.println(device+"is on !");
		}
}
