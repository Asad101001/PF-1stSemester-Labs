import java.util.Scanner;

public class PracticeWeekdayName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date you want to find the day name of : ");
        int dd = sc.nextInt();
        System.out.println("Enter the month you want to find the day name of : ");
        int mm = sc.nextInt();
        int[] daysElapsed = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        String[] weekdays = {"Wednes", "thurs", "fri", "satur", "sun", "mon", "tues"};
        int totalDays = dd + daysElapsed[mm - 1];
        int weekdayIndex = (totalDays % 7) - 1;
        System.out.println("The date entered corresponds to\t "+weekdays[weekdayIndex] +"day");
    }
}