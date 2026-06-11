
import java.util.Random;

public class RollingTheDice {

	public static void main(String[] args) {
		

		Random numberonthedice = new Random();
		
		int O = numberonthedice.nextInt(6) + 1;
		
		
		
		System.out.println("You have rolled a : " + O);
		
		if (O==6)
		{		
		System.out.println("Congratulations on being the best(i.e Asad)");
		}
		
		if (O==1)
		{		
		System.out.println("Stop humiliating yourself and wrap it up");
		}
		
	}

}
