package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RuntimeExceptionClasses extends Exception {
	
	public RuntimeExceptionClasses(String msg)
	{
		System.out.println(msg);
	}

	public static void main(String[] args) throws FileNotFoundException, NullPointerException, RuntimeExceptionClasses {

		String s = null;
		StackOverflowError stackOverflowError = null;

		float accountBalance = 4000.4f;
		float withdrawAmount = 5000.4f;
		
	

		// stackOverflowError.test(10, 20);

		int array[] = { 10, 20, 30, 40 };

		// System.out.println(array[4]);

		String ss = "Welcome to codemind";

		// ss.charAt(20);

//		String sss="50we%7";
//		
//		int i=Integer.parseInt(sss);
//		System.out.println(i+50);

		try {
			System.out.println(20 / 0);
		}

		catch (ArithmeticException e) {
			int a = 20;
			int b = 30;
			System.out.println(a + b);
			System.out.println("Please do not try to devide by zero");
		}

		catch (Exception e) {

		}

		System.out.println("After handling exception");

		File file = new File("C:/test.txt");
		//FileInputStream fileInputStream = new FileInputStream(file);

		if (withdrawAmount > accountBalance) {
			throw new RuntimeExceptionClasses("Please maintain proper account balance");
		}

	}

}
