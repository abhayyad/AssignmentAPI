package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {

	public static void main(String[] args) throws IOException {

		displayfileContent(); 
		numberOfWordsinFile();
		numberOfLinesinFile();
		countOfWordJava();
		printLinesWithJava();
	}

	private static void countOfWordJava() throws IOException {
		FileReader reader = new FileReader("C:\\NicheThyself\\API\\Assignments\\InputTextFile.txt");

		BufferedReader br = new BufferedReader(reader);

		String readline = null;

		int counter = 0;

		while ((readline = br.readLine()) != null) {

			String[] linestr = readline.split(" ");

			for (String str : linestr) {

				if (str.equals("Java")) {
					counter = counter + 1;
				}

			}

		}

		System.out.println("==========================");
		System.out.println("Count of Java in file : " + counter);

		br.close();

	}

	private static void numberOfWordsinFile() throws IOException {
		FileReader reader = new FileReader("C:\\NicheThyself\\API\\Assignments\\InputTextFile.txt");

		BufferedReader br = new BufferedReader(reader);

		String readline = null;

		int counter = 0;

		while ((readline = br.readLine()) != null) {

			String[] linestr = readline.split(" ");

			int lenOfstr = linestr.length;

			counter = counter + lenOfstr;

		}

		System.out.println("==========================");
		System.out.println("Count of words in the file : " + counter);

		br.close();

	}

	private static void printLinesWithJava() throws IOException {
		FileReader reader = new FileReader("C:\\NicheThyself\\API\\Assignments\\InputTextFile.txt");

		BufferedReader br = new BufferedReader(reader);

		String readline = null;

		System.out.println("=====Line containing text Java ======");

		while ((readline = br.readLine()) != null) {

			if (readline.contains("Java")) {

				System.out.println(readline);

			}
		}

		br.close();
	}

	private static void numberOfLinesinFile() throws IOException {
		FileReader reader = new FileReader("C:\\NicheThyself\\API\\Assignments\\InputTextFile.txt");

		BufferedReader br = new BufferedReader(reader);

		String readline;

		int countLine = 0;

		while ((readline = br.readLine()) != null) {
			countLine = countLine + 1;
		}
		System.out.println("=============================");

		System.out.println("Count of Line in file : " + countLine);

		br.close();

	}

	public static void displayfileContent() throws FileNotFoundException, IOException {
		FileReader reader = new FileReader("C:\\NicheThyself\\API\\Assignments\\InputTextFile.txt");

		BufferedReader br = new BufferedReader(reader);

		String readline = null;

		System.out.println("=====Content of the file as follows====");

		while ((readline = br.readLine()) != null) {
			System.out.println(readline);
		}
		br.close();
	}

}
