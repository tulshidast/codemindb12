package javapractices;

public class InterfaceExample {

	public static void main(String[] args) {
		ImplClass implClass = new ImplClass();
		implClass.add();

	}

}

interface MyFirstInterface {

	// variables
	public static final int a = 20;
	float b = 30;

	// methods
	public abstract void test();

	void add();

}

class ImplClass implements MyFirstInterface {

	@Override
	public void test() {
		System.out.println("This is test method from interface");

	}

	@Override
	public void add() {
		System.out.println(30 + 20);

	}

}