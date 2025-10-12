package java1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASCIIcaseInsensitive {

	public static void main(String[] args) {

		int[] asciiCount = new int[256];
		try {
			Scanner fileReader = new Scanner(new File("src/business_1.txt"));
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine().toLowerCase(); // ONLY CHANGE IN THE CODE : CONVERTS ALL THE LINES
																	// READ AS STRING INTO LOWERCASE ALLOWING EQUAL
																	// TREATMENT AND MAKING THIS CASE inSENSITIVE
				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);
					asciiCount[(int) ch]++;
				}
			}
			fileReader.close();
			for (int i = 0; i < 256; i++) {
				if (asciiCount[i] > 0) {
					System.out.println((char) i + " : " + asciiCount[i]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
