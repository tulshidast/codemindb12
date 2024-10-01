package javapractices;

public class FullyEncapsulatedClass {

	public static void main(String args[])
	{
		AccessingPrivateMembers accessingPrivateMembers=new AccessingPrivateMembers();
		accessingPrivateMembers.setA(10);
		System.out.println(accessingPrivateMembers.getA());
	}
}

class AccessingPrivateMembers {

	private int a;
	private float b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

}
