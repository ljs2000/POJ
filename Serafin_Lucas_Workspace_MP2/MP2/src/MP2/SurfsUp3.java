package MP2;

import java.util.Scanner;

public class SurfsUp3 {
	
	public static void main(String[] args) {
		
	int waveHeight;
	final int wave = 6;
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a height of the wave: \n");
	waveHeight = input.nextInt();
	input.close();
	
	switch (waveHeight) {
	
	case 0: System.out.println("What kind of surf is that?");
	break;
	case 1: System.out.println("What kind of surf is that?");
	break;
	case 2: System.out.println("What kind of surf is that?");
	case 3: System.out.println("Go for a swim");
	break;
	case 4: System.out.println("Go for a swim");
	break;
	case 5: System.out.println("Go for a swim");
	break;
	case 6: System.out.println("Go for a swim");
	break;
	case 7: System.out.println("Great day for surfing!");
	break;
	case 8: System.out.println("Great day for surfing!");
	break;
	case 9: System.out.println("Great day for surfing!");
	break;
	case 10: System.out.println("Great day for surfing!");
	break;
	}
		
	}
}
