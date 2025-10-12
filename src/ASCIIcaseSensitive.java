package java1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASCIIcaseSensitive {

    public static void main(String[] args) {

        int[] asciiCount = new int[256];                                     // 256 SIZE ARRAY FOR ASCII VALUES (0 to 255) WHERE EACH INDEX OF ARRAY IS USED
        // FOR
        // COUNTING CHARACTER APPEARANCES
        try {// TRY CATCH BLOCK TO HANDLE ERRRORS
            Scanner fileReader = new Scanner(new File("business_1.txt"));// CREATING NEW SCANNER THAT READS LINE BY
            // LINE FROM THE FILE AT GIVEN FILEPATH
            while (fileReader.hasNextLine()) {                               // KEEPS LOOPING AS LONG AS THERE IS A FILE TO BE READ
                String line = fileReader.nextLine();                         //STORES THE NEXT LINE FROM THE FILE AS A STRING
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
