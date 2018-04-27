package exampleTwo;
/*
 * 
 * The Made interface encapsulate the details in base class 
 */
public interface Made {
	String in();
}
/**
 * The concert class implement the methods
 */
class Japan implements Made {
	@Override
	public String in() {
		return "Made in Japan";
	}
}

class Italy implements Made {
	@Override
	public String in() {
		return "Made in Itally";
	}
}

class China implements Made {
	@Override
	public String in() {
		return "Made in China";
	}
}