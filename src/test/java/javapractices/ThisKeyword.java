package javapractices;

public class ThisKeyword {

	public static void main(String[] args) {

		ThisUse thisUse = new ThisUse(10, 20);
		thisUse.add();
		System.out.println(thisUse.hashCode());

		System.out.println("######################################");
		
		ThisUse thisUse2 = new ThisUse(50, 50);
		thisUse2.add();
		System.out.println(thisUse2.hashCode());

	}

}

class ThisUse {

	int num1;
	int num2;

	public ThisUse(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public void add() {
		System.out.println(this.hashCode());
		System.out.println(num1 + num2);
		System.out.println(this.hashCode());
	}

}
