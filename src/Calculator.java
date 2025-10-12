import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER 1st number : ");
        int a = scanner.nextInt();
        System.out.println("ENTER operation you want to perform : ");
        char op = scanner.next().charAt(0);
        System.out.println("ENTER 2nd number : ");
        int b = scanner.nextInt();
        int result  = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b ;
                break;
        }
        System.out.println("Your answer is : " + result);
    }
}
