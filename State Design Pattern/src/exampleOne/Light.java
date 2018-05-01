package exampleOne;

public class Light {
   
	State state;

   public void turn(State state) {
	   this.state=state;
	   this.state.execute ();
   }
}



