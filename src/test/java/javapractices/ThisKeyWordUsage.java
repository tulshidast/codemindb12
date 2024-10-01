package javapractices;

public class ThisKeyWordUsage {

	int a;
	int b;

	public static void main(String[] args) {
		ThisKeyWordUsage thisKeyWordUsage = new ThisKeyWordUsage();
		thisKeyWordUsage.add(100, 100);
		System.out.println(thisKeyWordUsage.a + thisKeyWordUsage.b);

	}

	public void add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public ThisKeyWordUsage(int num) {
		this(20, 47.3f);
		System.out.println("One parameter constructor");
	}
	
	public ThisKeyWordUsage() {
		this(10);
		System.out.println("Default constructor");
	}

	public ThisKeyWordUsage(int num, float num2) {
		System.out.println("Two parameter constructor");
	}

}
