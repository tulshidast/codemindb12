package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClassInJava {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Admin\\test.txt");

		// file.createNewFile();

		// file.delete();

		System.out.println(file.canExecute());

		System.out.println(file.getName());

		System.out.println(file.length());

		FileWriter fileWriter = new FileWriter(file);

		fileWriter.write("Welcome to codemind technology pune." + "\nWe are about to finish java and going to"
				+ "\nstart selenium.");
		fileWriter.close();

		FileReader fileReader = new FileReader(file);

		int i = 0;

		while (i != -1) {

			i = fileReader.read();

			char c = (char) i;

			System.out.print(c);
		}

		fileReader.close();

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(file.length());

	}

}
