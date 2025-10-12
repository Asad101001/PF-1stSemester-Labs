import java.io.*;
import java.util.*;

public class gptASSIGNMENT {


        public static void main(String[] args) {
            // Question 1: Open a text file to read data
            String filename = "src/sampleForQuizExam.txt";
            BufferedReader reader = null;

            try {
                // Open the file
                reader = new BufferedReader(new FileReader(filename));
                System.out.println("File opened successfully for reading.");

                // Question 2: Check if file is not opened
                if (reader == null) {
                    System.out.println("File was not opened.");
                    return;
                }

                // Skip header line
                reader.readLine();

                // Question 3: Read one line from the file
                String firstLine = reader.readLine();
                System.out.println("\nFirst line of data: " + firstLine);

                // Reset reader to start from beginning (for remaining questions)
                reader.close();
                reader = new BufferedReader(new FileReader(filename));
                reader.readLine(); // Skip header again

                // Question 4: Read all lines until EOF
                System.out.println("\nAll records in file:");
                String line;
                List<String> allLines = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    allLines.add(line);
                }
                System.out.println("\nEND OF THE FILE HAS REACHED");

                // Question 5: Close the file
                reader.close();
                System.out.println("\nFile closed successfully.");

                // Question 6: Split TAB-delimited data
                String[] firstRecord = allLines.get(0).split("\t");
                System.out.println("\nFirst record fields:");
                for (String field : firstRecord) {
                    System.out.println(field);
                }

                // Question 7: Print all fields from a line
                System.out.println("\nAll fields from first record:");
                for (int i = 0; i < firstRecord.length; i++) {
                    System.out.println("Field " + (i+1) + ": " + firstRecord[i]);
                }

                // Question 8: Calculate amount to pay for an item
                double price = Double.parseDouble(firstRecord[2]);
                int quantity = Integer.parseInt(firstRecord[3]);
                double total = price * quantity;
                System.out.printf("\nAmount to pay for first item: $%.2f\n", total);

                // Question 9: Total of all items purchased
                double grandTotal = 0;
                for (String record : allLines) {
                    String[] fields = record.split("\t");
                    grandTotal += Double.parseDouble(fields[2]) * Integer.parseInt(fields[3]);
                }
                System.out.printf("\nTotal of all purchases: $%.2f\n", grandTotal);

                // Question 10: Find total quantity for specific item
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nEnter item code (A, B, C, or D): ");
                String itemCode = scanner.nextLine().toUpperCase();

                int itemQuantity = 0;
                for (String record : allLines) {
                    String[] fields = record.split("\t");
                    if (fields[0].equals(itemCode)) {
                        itemQuantity += Integer.parseInt(fields[3]);
                    }
                }
                System.out.println("Total quantity for item " + itemCode + ": " + itemQuantity);

                // Question 11: Month-wise sales
                Map<String, Double> monthlySales = new HashMap<>();
                for (String record : allLines) {
                    String[] fields = record.split("\t");
                    String date = fields[4];
                    String month = date.split("/")[0];
                    double saleAmount = Double.parseDouble(fields[2]) * Integer.parseInt(fields[3]);

                    monthlySales.put(month, monthlySales.getOrDefault(month, 0.0) + saleAmount);
                }

                System.out.println("\nMonth-wise sales:");
                for (Map.Entry<String, Double> entry : monthlySales.entrySet()) {
                    System.out.printf("Month %s: $%.2f\n", entry.getKey(), entry.getValue());
                }

                // Question 12: Records sorted by sales amount (descending)
                List<String[]> allRecords = new ArrayList<>();
                for (String record : allLines) {
                    allRecords.add(record.split("\t"));
                }

                Collections.sort(allRecords, new Comparator<String[]>() {
                    public int compare(String[] a, String[] b) {
                        double amountA = Double.parseDouble(a[2]) * Integer.parseInt(a[3]);
                        double amountB = Double.parseDouble(b[2]) * Integer.parseInt(b[3]);
                        return Double.compare(amountB, amountA);
                    }
                });

                System.out.println("\nRecords sorted by sales amount (descending):");
                System.out.println("Item\tProduct\t\tPrice\tQty\tDate\t\tRep\tAmount");
                for (String[] record : allRecords) {
                    double amount = Double.parseDouble(record[2]) * Integer.parseInt(record[3]);
                    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t$%.2f\n",
                            record[0], record[1], record[2], record[3], record[4], record[5], amount);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found!");
            } catch (IOException e) {
                System.out.println("Error reading file!");
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing file!");
                }
            }

        }


}

