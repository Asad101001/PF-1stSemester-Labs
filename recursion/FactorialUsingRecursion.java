import java.util.Scanner;

//RECURSIVE FUNCTION->function that calls itself and process is called RECURSION

public class FactorialUsingRecursion {

    // IN RECURSION , THE FUNCTION MUST BE WRITTEN BETWEEN class AND static void
    // main

    public static long fact(int n) { // long->FOR LONG VALUES , fact->NAME OF FUNCTION , int n->FUNCTION DEFINITION
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to calculate factorial : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("INVALID as Factorial of negative numbers in undefined!");
        } else {
            System.out.println("Factorial is : " + fact(num));
        }
        sc.close();
    }

}
