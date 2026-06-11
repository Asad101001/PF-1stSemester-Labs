import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingAssignment {
    private static String line;

    public static void main(String[] args) {

//QUESTION 1:Write steps that are required to open a text file to read data from the file
        BufferedReader br = null;
        String path = "data/sampleForQuizExam.txt";
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);

//QUESTION 3:How to read one line from the opened file?
            String line = br.readLine();
            System.out.println(line);


            //QUESTION 6:Suppose the line that you read from the file contains TAB delimited data; how to convert that line into fields.
            String[] fields = line.split("\t");

            System.out.println("Fields:");
            for (String field : fields) {
                System.out.println(field);
            }

//QUESTION 7:Write a loop that prints all the fields extracted from the line.

            for (int i = 0; i < fields.length; i++) {
                System.out.println("Field " + (i + 1) + ": " + fields[i]);
            }

//            QUESTION 8:
//            Suppose that each split line contains following SIX  fields
//
//            ItemCode    ItemDescription    UnitPrice        Quantity         Date        SalesPersonID

            double unitPrice = Double.parseDouble(fields[2]);
            int quantity = Integer.parseInt(fields[3]);
            double amount = unitPrice * quantity;

            System.out.println("Amount to pay: $" + amount);

//QUESTION 4:How to keep on reading one line from the opened file and print each line. When all line are read, prints the message "END OF THE FILE HAS REACHED"
            do {
                System.out.println(line);
            }
            while ((line = br.readLine()) != null);


            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.err.println("ERROR : File Not Found");
        } catch (IOException e) {
            System.err.println("ERROR : Error occurred when attempting to read file");
        }

        {

//QUESTION 2:How to determine if the file is not opened?

            if (br == null) {
                System.out.println("File Opened and ready for Reading");
            } else {
                System.out.println("File Opened and ready for Reading");
            }

            System.out.println("\nEND OF THE FILE REACHED !!!");

        }

//QUESTION 5:How to close the file if it was opened other wise print the message "File was not opened".
        if (br != null) {
            try {
                br.close();
                System.out.println("File closed successfully.");
            } catch (IOException e) {
                System.err.println("Error closing file!");
            }
        } else {
            System.out.println("File was not opened.");
        }


    }
}
