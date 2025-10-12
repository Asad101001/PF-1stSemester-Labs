

import java.io.FileWriter;
import java.io.IOException;

public class WRITENEWFILE {

	public static void main(String[] args) {

		try {
			FileWriter myWriter = new FileWriter("filename.txt"); // 'FileWriter'= OBJECT 'myWriter'= NAME
																	// FileWriter is used to write data to
																	// 'filename.txt' using myWriter

			myWriter.write("This is the first line in the file"); // FOLLOWING LINE IS WRITTEN TO THE FILE

			myWriter.close(); // NECESSARY TO CLOS THE WRITER(otherwise file will be locked and data will not
								// be saved)

			System.out.println("Successfully wrote to the file");

		} catch (IOException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}

	}

}
