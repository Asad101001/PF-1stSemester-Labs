import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        System.out.println("Enter a number from 1 to 10 to search");

        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) found = true;
        }
        if (found) {
            System.out.println("The number " + target + " is present");
        }else    ;System.out.println("Not Present");

        scanner.close();


    }
}