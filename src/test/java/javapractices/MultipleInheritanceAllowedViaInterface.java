package javapractices;

public class MultipleInheritanceAllowedViaInterface {

	public static void main(String[] args) {
		Test test = new Test();
		test.test();
		test.testing();
	}

}

interface A {

	int a = 20;

	void test();
}

interface B {

	public abstract void testing();

}

interface C extends A, B {

}

class Test implements C {

	@Override
	public void test() {
		System.out.println("From A interface");

	}

	@Override
	public void testing() {
		System.out.println("From B interface");

	}

}