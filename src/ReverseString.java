import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER string to be reversed : ");
        int n = scanner.nextInt();
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n  =n/10;
        }
        System.out.println("Reversed String is : " + reverse);
    }

}
