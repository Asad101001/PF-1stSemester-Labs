
import java.io.File;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
try {
	File myObj = new File("data/firsttxt.txt");
	 if (myObj.createNewFile()) {
         System.out.println("Created Successfully: " + myObj.getName());
     } else {
         System.out.println("Sorry, File Exists.");
     }
 } catch (IOException e) {
     System.out.println("Error.....");
     e.printStackTrace();
 }
}
	}


