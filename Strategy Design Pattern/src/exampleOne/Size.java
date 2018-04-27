package exampleOne;

public interface Size {
	void print();
}

class Large implements Size {
	@Override
	public void print() {
		System.out.println("Size: Larg");
	}
}

class Medium implements Size {

	@Override
	public void print() {
		System.out.println("Size: Medium");
	}

}

class Small implements Size {
	@Override
	public void print() {
		System.out.println("Size: small");
	}

}

