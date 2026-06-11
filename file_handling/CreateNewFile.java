package java1;

import java.io.File; //IMPORTING FILE & IOException CLASSES
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) {

		File myObj = new File("data/filename.txt"); // CREATING NEW FILE(myObj) with the name 'filename.txt'

		try { // USING TRY CATCH BLOCK TO AVOID ERRORS

			if (myObj.createNewFile()) // createNewFile is BOOLEAN method , if the value returns 'False' file was
										// already created and vice versa
			{
				System.out.println("File created : " + myObj.getName()); // DISPLAYS FILE NAME Created(only 1st time)
			} else {

				System.out.println("File exists : " + myObj.getName()); // DISPLAYS FILE NAME Exists(only except 1st
																		// time)
			}
		} catch (IOException e) {

			System.out.println("ERROR"); // DISPLAYS Error(like disk drive full or file is deleted,etc)

			e.printStackTrace(); // TECHNICAL DETAILS ABOUT ERROR

		}
	}

}
