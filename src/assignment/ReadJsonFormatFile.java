package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonFormatFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\NicheThyself\\API\\Assignments\\JSONfile.json");

		BufferedReader br = new BufferedReader(fr);

		String line = null;

		Person p = new Person();

		while ((line = br.readLine()) != null) {
			if (line.contains("name")) {
				StringBuffer sb = splitAndFetchData(line);
				p.name = sb.toString();
			}
			if (line.contains("address")) {
				StringBuffer sb = splitAndFetchData(line);
				p.address = sb.toString();
			}
			if (line.contains("contact")) {
				StringBuffer sb = splitAndFetchData(line);
				p.contact = Integer.parseInt(sb.toString());
			}
			if (line.contains("age")) {
				StringBuffer sb = splitAndFetchData(line);
				p.age = Integer.parseInt(sb.toString());
			}
			if (line.contains("emp_id")) {
				StringBuffer sb = splitAndFetchData(line);
				p.emp_id = Integer.parseInt(sb.toString());
			}
			if (line.contains("Salary")) {
				StringBuffer sb = splitAndFetchData(line);
				p.salary = Double.parseDouble(sb.toString());
			}
			if (line.contains("height")) {
				StringBuffer sb = splitAndFetchData(line);
				p.height = Integer.parseInt(sb.toString());
			}
			if (line.contains("weight")) {
				StringBuffer sb = splitAndFetchData(line);
				p.weight = Integer.parseInt(sb.toString());
			}
		}
		br.close();
		p.displayPersonDetails();
	}

	private static StringBuffer splitAndFetchData(String line) {
		String str[] = line.split(":");
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < str[1].length(); i++) {
			if (!(Character.toString(str[1].charAt(i)).equals(" ") || Character.toString(str[1].charAt(i)).equals(",")
					|| Character.toString(str[1].charAt(i)).equals("\""))) {
				sb.append((str[1].charAt(i)));
			}
		}
		return sb;
	}
}
