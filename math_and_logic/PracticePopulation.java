import java.util.Scanner;

public class PracticePopulation {
    public static void main(String[] args) {
        int t,c,x,i;
        int[] p = new int[100];
        float a;
        Scanner inputPopulation = new Scanner(System.in);
        t=0;
        c=0;
        x=1;
        while (x>0)
        {
            System.out.println("Enter population (enter zero to exit ) :");
            x = inputPopulation.nextInt();
            p[c] = x;
            if (x>0)
            {
                t+=x;
                c++;
            }
        }
    if (c>0)
    {
        a = (float)t / c ;
        System.out.println("The Average population is : \t"+a);
        i = 0;
        while (i<c)
        {
            if (p[i]>a) System.out.println("Population(s) entered that is(are) above average : \t"+p[i]);
            i = i+1;
        }
    }
    }

}
