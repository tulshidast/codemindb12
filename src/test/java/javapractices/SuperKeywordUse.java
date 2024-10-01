package javapractices;

public class SuperKeywordUse {

	public static void main(String[] args) {
		SuperChild superChild = new SuperChild();
		superChild.superChildAdd();

	}

}

class SuperParent {

	int superParent = 10;
	int a = 20;

	public void superParentAdd() {
		System.out.println("super add");
	}

	public SuperParent(int a) {
		this(10, 20);
		System.out.println("Parent class constructor with 1 parameter");
	}

	public SuperParent(int a, int b) {
		System.out.println("Parent class constructor with 2 paramters");
	}

}

class SuperChild extends SuperParent {

	int superChild = 10;
	int a = 50;

	public void superChildAdd() {
		System.out.println(super.a + this.a);
	}

	public SuperChild() {
		super(10);
		System.out.println("Child class constructor");
	}
}
