package MP2;

import java.util.Scanner;

public class SurfsUp {
	
	public static void main(String[] args) {
		
	int waveHeight;
	final int wave = 6;
		
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter a height of the wave: \n");
	waveHeight = reader.nextInt();
	if(waveHeight >= wave) {
		System.out.println("Great day for surfing! \n");
	}
	
	
		
	}
}
