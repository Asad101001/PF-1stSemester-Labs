import java.util.Scanner;

public class FirstLecture {

	public static void main(String[] args) {
		int t,c,x;
		int[]p = new int[100];
		float a;
		try (Scanner inputPopulation = new Scanner(System.in)) {
			t=0;
			c=0;
			x=1;
			while(x>0);
			{
				x=inputPopulation.nextInt();
				p[c] = x;
				if (x>0)
				{
					t=t+x;
					c=c+1;
				}
			}
		}
		if (c>0)
		{
			a=t/c;
			System.out.println(a);
			int i = 0;
			while(i<c)
			{
				if (p[i]>a) System.out.println(p[i]);
				i = i+1;
			}
			
		}
	}
}
