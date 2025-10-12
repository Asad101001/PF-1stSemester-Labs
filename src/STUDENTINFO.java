/*
a) Write a Java program that keeps taking input of Seat Number, name and GPA of class-fellows and stores each of the three input values in three separate one dimensional arrays; (one for storing seat numbers, second for names and third for GPAs). Input should end when the user gives a blank input for seat number.
b) Extend the program developed in previous part of this question to add following functionality;
c) After all the input is complete your program should ask for Seat Number. If that seat number is in the array then print  the Seat Number , Name and GPA of this class-fellow otherwise it should print “Data for This Seat Number was not entered”. Keep on taking input of Seat Number and searching it until the user enters a blank value for Seat Number.-
*/


import java.util.Scanner;

public class STUDENTINFO {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] seatnumbers = new String[100]; // CREATING ARRAY: seatnumbers->NAME , STORES MAX. 100 STRING VALUES
		String[] names = new String[100]; // CREATING ARRAY: names->NAME , STORES MAX. 100 STRING VALUES
		double[] GPAs = new double[100]; // CREATING ARRAY: GPAs->NAME , STORES MAX. 100 DOUBLE VALUES

		int count = 0; // KEEPS COUNTS OF STUDENT ENTRIES

		while (true) // KEEPS LOOPING
		{
			System.out.println("Enter your Seat Number : (leave blank to exit)");
			String seat = scanner.nextLine(); // INPUTS ROLL NUMBER

			if (seat.isEmpty()) // exits the program if blank input is entered into the Roll Number field
			{
				break; // BREAKS LOOP
			}

			System.out.println("Enter your Name : ");
			String name = scanner.nextLine(); // INPUTS NAME

			System.out.println("Enter G.P.A : ");
			double GPA = scanner.nextDouble(); // INPUTS GPA

			scanner.nextLine();

			// STORING INPUT VALUES ENTERED BY USER

			seatnumbers[count] = seat; // seat->INPUT VALUE THAT IS STORED AT count->INDEX # (all stored at previously
										// initialized arrays)
			names[count] = name; // name->INPUT VALUE THAT IS STORED AT count->INDEX # (all stored at previously
									// initialized arrays)
			GPAs[count] = GPA; // GPA->INPUT VALUE THAT IS STORED AT count->INDEX # (all stored at previously
								// initialized arrays)

			count++; // INCREMENTS BY 1 EVERY TIME INPUT IS ENTERED THE 'count' VARIABLE THAT IS
						// FURTHER USED AS INDEX FOR STORING INPUT VALUES
		}

		while (true) {
			System.out.println("\nEnter Seat Number to search (leave blank to exit) : ");

			String searchSeat = scanner.nextLine();

			if (searchSeat.isEmpty()) {
				break;
			}

			// found VARIABLE IS AN EASY WAY TO CHECK IF WE FOUND A MATCH OR NOT
			boolean found = false; // BEFORE CHECKING WE INITIALIZE 'found' VARIABLE AS FALSE
			for (int i = 0; i < count; i++) { // i=0->SEARCHING VALUES FROM COUNT , count->STORED VALUES
				if (seatnumbers[i].equals(searchSeat)) {
					System.out.println("\nStudent Found:");
					System.out.println("Seat Number: " + seatnumbers[i]);
					System.out.println("Name: " + names[i]);
					System.out.println("GPA: " + GPAs[i]);
					found = true; // IF found->TRUE THEN WE HAVE GOT A MATCH THEREFORE EXIT THE LOOP
					break;
				}
			}

			if (!found) { // IF found STILL RETURNS "FALSE" THEN WE DID NOT FIND A MATCH AND FOLLOWING
							// LINE IS DISPLAYED
				System.out.println("Data for This Seat Number was not entered");
			}
		}

		scanner.close();
	}

}
