package javapractices;

import java.util.Scanner;

public class ReadDataFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter data");

		String s = scanner.nextLine();
		System.out.println(s);

		scanner.close();

	}

}
