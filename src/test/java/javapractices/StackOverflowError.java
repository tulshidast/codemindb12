package javapractices;

public class StackOverflowError {

	public static void main(String[] args) {
		StackOverflowError s = new StackOverflowError();
		s.test(10, 20);

	}

	public void test(int a, int b) {
		System.out.println(a + b);
		test(10, 30);
	}

}
