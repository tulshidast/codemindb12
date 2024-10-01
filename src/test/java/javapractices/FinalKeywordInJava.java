package javapractices;

import java.util.ArrayList;

public class FinalKeywordInJava {

	final int a = 10;
	final float PI = 3.14f;
	final double empAdharNo = 2030393983823d;
	int b = 20;
	final String bankName = "icici";

	public static void main(String[] args) {
		FinalKeywordInJava finalKeywordInJava = new FinalKeywordInJava();
		finalKeywordInJava.addition();
		System.out.println(finalKeywordInJava.empAdharNo);
		ArrayList<String> a;
	}

	public void addition() {
		// bankName = "rbi";
		b = 30;
		// a = 30;
		System.out.println(b);
	}

	final public int taxDeduction(float a) {
		System.out.println();
		return 20;
	}

}

final class FinalChild extends FinalKeywordInJava {
	public void addition() {
		System.out.println(10 + 10);
	}

//	public int taxDeduction(float a)
//	{
//		
//	}
}

//class GrandFinalChild extends FinalChild {
//
//}
