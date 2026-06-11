import java.util.Scanner;

public class DaysElapsed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysElapsed = {
                0,//Jan
                31,//Feb
                31+28,//Mar
                31+28+31,//Apr
                31+28+31+30, //May
                31+28+31+30+31,//Jun
                31+28+31+30+31+30,//July
                31+28+31+30+31+30+31,//Aug
                31+28+31+30+31+30+31+30, //Sep
                31+28+31+30+31+30+31+30+31,//Oct
                31+28+31+30+31+30+31+30+31+30,//Nov
        };
        System.out.println("Enter Day (from 1 to 30) : ");
        int dd = sc.nextInt();
        System.out.println("Enter Month (from 1 to 12) : ");
        int mm = sc.nextInt();
        int days = 0;
        days = dd + daysElapsed[mm-1];

        System.out.println("The number of days elapsed is : " +days);
        int dn = days % 7;
        String[] wdays = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        System.out.println("The entered day is : "+wdays[dn-1]);


    }

}

