package javapractices;

public class Abstract_1 {

	public static void main(String[] args) {
		Abstract_2 abstract_2 = new Abstract_2();
		abstract_2.addition(10, 20);

		MyImpl myImpl = new MyImpl();
		myImpl.addition(10, 20);

	}

}

abstract class AbstractExmple {

	// instance member variable
	int a = 10;

	// member functions
	public abstract void addition(int a, int b);

	public void substraction() {
		System.out.println(10 - 5);
	}

}

class MyImpl extends AbstractExmple {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}
}
