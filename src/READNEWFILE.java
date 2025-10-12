package java1;

import java.io.File;
import java.io.FileNotFoundException; //CATCHES ERROR IF FILE DOES NOT EXIST
import java.util.Scanner; //THE 'Scanner' IS USED TO READ DATA(either as input from user or data from file)

public class READNEWFILE {

    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt"); // 'File'->object 'myObj'->name 'filename.txt'->target file

            Scanner myReader = new Scanner(myObj); // 'myReader' reads the file from 'myObj'

            while (myReader.hasNextLine()) // THIS LOOP CHECKS IF THERE IS ANOTHER LINE TO READ & REITERATES TILL ALL
            // LINES ARE READ

            {
                String data = myReader.nextLine(); // READS THE NEXT LINE AND STORES THE PREVIOUS LINE IN THE VARIABLE
                // 'data'

                System.out.println(data); // PRINTS THE PREVIOUSLY READ DATA
            }

            myReader.close(); // CLOSING THE READER(compulsory)

        } catch (FileNotFoundException e) {
            System.out.println("Encountered Error");
            e.printStackTrace();
        }

    }
}
