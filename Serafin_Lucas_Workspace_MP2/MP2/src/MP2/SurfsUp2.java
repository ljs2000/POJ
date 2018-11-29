package MP2;

import java.util.Scanner;

public class SurfsUp2 {
	
	public static void main(String[] args) {
		
	int waveHeight;
	final int wave = 6;
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a height of the wave: \n");
	waveHeight = input.nextInt();
	input.close();
	if(waveHeight >= wave) {
		System.out.println("Great day for surfing! \n");
		
	}
	
	else {
		
		System.out.println("Go body boarding!");
		
	}
		
	}
}

