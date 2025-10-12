
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class SampleForQuizExam {

    // Helper class to store records and their calculated amounts for sorting
    static class Record {
        String line; // Stores the entire line from the file
        double amount; // Stores the calculated amount (unitPrice * quantity)

        Record(String line, double amount) {
            this.line = line;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        // Initialize file and reader variables
        File file = new File("src/sampleForQuizExam.txt"); // Create File object
        BufferedReader reader = null; // Initialize reader as null

        try {
            // ========== QUESTION 1 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 1 ===");
            System.out.println("Steps to open a text file:");

            // Step 1: Create File object
            System.out.println("1. Create File object representing the file");
            System.out.println("   File file = new File(\"sampleForQuizExam.txt\");");

            // Step 2: Create FileReader
            System.out.println("2. Create FileReader to read the file");
            System.out.println("   FileReader fileReader = new FileReader(file);");

            // Step 3: Wrap in BufferedReader
            System.out.println("3. Wrap FileReader in BufferedReader for efficient reading");
            System.out.println("   BufferedReader reader = new BufferedReader(fileReader);\n");

            // Actually open the file
            reader = new BufferedReader(new FileReader(file));
            System.out.println("File opened successfully!\n");
            System.out.println("=============================\n");

            // ========== QUESTION 2 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 2 ===");
            System.out.println("File opening is checked by:");
            System.out.println("1. The code is in a try-catch block");
            System.out.println("2. If file doesn't exist, FileNotFoundException is thrown");
            System.out.println("3. We catch it to determine if file wasn't opened");
            System.out.println("Current status: File was successfully opened\n");
            System.out.println("=============================\n");

            // ========== QUESTION 3 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 3 ===");
            System.out.println("Reading one line using readLine():");

            // Store the first line (header)
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine + "\n");

            // Reset reader to beginning
            reader = new BufferedReader(new FileReader(file));
            System.out.println("=============================\n");

            // ========== QUESTION 4 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 4 ===");
            System.out.println("Reading all lines until end of file:");

            // Read and print each line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("END OF THE FILE HAS REACHED\n");
            System.out.println("=============================\n");

            // ========== QUESTION 5 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 5 ===");
            System.out.println("Closing the file is done in the finally block");
            System.out.println("(Will be shown after all other operations)\n");
            System.out.println("=============================\n");

            // ========== QUESTION 6 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 6 ===");
            System.out.println("Splitting TAB-delimited line:");

            // Reset reader
            reader = new BufferedReader(new FileReader(file));
            reader.readLine(); // Skip header
            line = reader.readLine(); // Read first data line

            if (line != null) {
                // Split on tabs
                String[] fields = line.split("\t");
                System.out.println("Line split into " + fields.length + " fields\n");
                System.out.println("=============================\n");

                // ========== QUESTION 7 ANSWER ==========
                System.out.println("=== ANSWER TO QUESTION 7 ===");
                System.out.println("Printing all fields:");

                // Print each field with index
                for (int i = 0; i < fields.length; i++) {
                    System.out.println("Field " + i + ": " + fields[i]);
                }
                System.out.println();
                System.out.println("=============================\n");

                // ========== QUESTION 8 ANSWER ==========
                System.out.println("=== ANSWER TO QUESTION 8 ===");
                System.out.println("Calculating amount to pay:");

                // Parse numeric fields and calculate
                double unitPrice = Double.parseDouble(fields[2]);
                int quantity = Integer.parseInt(fields[3]);
                double amount = unitPrice * quantity;

                System.out.printf("Unit Price: $%.2f, Quantity: %d\n", unitPrice, quantity);
                System.out.printf("Amount to pay: $%.2f\n\n", amount);
                System.out.println("=============================\n");
            }

            // ========== QUESTION 9 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 9 ===");
            System.out.println("Calculating total of all items:");

            // Reset reader
            reader = new BufferedReader(new FileReader(file));
            reader.readLine(); // Skip header

            double grandTotal = 0;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                grandTotal += Double.parseDouble(fields[2]) * Integer.parseInt(fields[3]);
            }

            System.out.printf("Grand total of all purchases: $%.2f\n\n", grandTotal);
            System.out.println("=============================\n");

            // ========== QUESTION 10 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 10 ===");
            System.out.println("Calculating total quantity for specific item:");

            // Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter item code (A, B, C, or D): ");
            String itemCode = scanner.nextLine().toUpperCase();

            // Reset reader
            reader = new BufferedReader(new FileReader(file));
            reader.readLine(); // Skip header

            int totalQuantity = 0;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                if (fields[0].equals(itemCode)) {
                    totalQuantity += Integer.parseInt(fields[3]);
                }
            }

            System.out.println("Total quantity for item " + itemCode + ": " + totalQuantity + "\n");
            System.out.println("=============================\n");

            // ========== QUESTION 11 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 11 ===");
            System.out.println("Month-wise sales report:");

            // Reset reader
            reader = new BufferedReader(new FileReader(file));
            reader.readLine(); // Skip header

            // Create map to store monthly totals
            Map<String, Double> monthlySales = new TreeMap<>();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM yyyy");

            // Process each record
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                Date date = dateFormat.parse(fields[4]);
                String monthYear = monthFormat.format(date);
                double saleAmount = Double.parseDouble(fields[2]) * Integer.parseInt(fields[3]);

                // Add to existing month or create new entry
                monthlySales.merge(monthYear, saleAmount, Double::sum);
            }

            // Print monthly sales
            monthlySales.forEach((month, sales) -> System.out.printf("%s: $%.2f\n", month, sales));
            System.out.println();
            System.out.println("=============================\n");

            // ========== QUESTION 12 ANSWER ==========
            System.out.println("=== ANSWER TO QUESTION 12 ===");
            System.out.println("Records sorted by sales amount (descending):");

            // Reset reader
            reader = new BufferedReader(new FileReader(file));
            reader.readLine(); // Skip header

            // Create list to store records
            List<Record> records = new ArrayList<>();

            // Process each record
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                double amount = Double.parseDouble(fields[2]) * Integer.parseInt(fields[3]);
                records.add(new Record(line, amount));
            }

            // Sort by amount in descending order
            records.sort((a, b) -> Double.compare(b.amount, a.amount));

            // Print sorted records
            for (Record r : records) {
                System.out.printf("$%.2f: %s\n", r.amount, r.line);
            }
            System.out.println();
            System.out.println("=============================\n");

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File was not opened - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR reading file - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            // ========== QUESTION 5 ANSWER IMPLEMENTATION ==========
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully");
                } else {
                    System.out.println("File was not opened - nothing to close");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
