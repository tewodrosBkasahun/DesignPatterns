package exampleOne;

public class Driver {
   public static void main (String[] args) {
	   /*
	    * The Driver class, will use Shirt and Size objects 
	    * to demonstrate change in Shirt behavior based
	    * on strategy it deploys or uses.
	    */
	   Shirt shirtOne =new Shirt(new Large());
	   Shirt shirtTwo=new Shirt(new Medium());
	   Shirt shirtThree =new Shirt(new Medium());
	   
	  
	   //print() change in  behavior when it changes its Strategy
	   shirtOne.getSize().print();
	   shirtTwo.getSize().print();
	   shirtThree.getSize().print();
	   
	  
   }
}
