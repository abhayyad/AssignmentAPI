package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException  {

		FileReader fr = new FileReader("C:\\NicheThyself\\API\\Assignments\\sampletextfile.txt");

		BufferedReader br = new BufferedReader(fr); 
		
		FileWriter fw  = new FileWriter("C:\\NicheThyself\\API\\Assignments\\sampletextfileWrite2.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);

		String line = null;

		while ((line = br.readLine()) != null) {

			bw.write(line);
			bw.write("\n");
		}
		
		br.close();
		bw.close();
			
		
		FileReader fr1 = new FileReader("C:\\NicheThyself\\API\\Assignments\\sampletextfileWrite2.txt");

		BufferedReader br1 = new BufferedReader(fr1); 
		
		String line1 = null;

		while ((line1 = br1.readLine()) != null) {

			System.out.println(line1);
		}
		
		br1.close();

	}
	

}
