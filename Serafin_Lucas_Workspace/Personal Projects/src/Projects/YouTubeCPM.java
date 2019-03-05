package Projects;

import java.util.Scanner;

public class YouTubeCPM {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double views;
		double cpm;
		double sum;
		System.out.println("YouTube Views to USD Calculator \n");
		System.out.println("Enter total views: " + "\n");
		views = input.nextDouble();
		System.out.println("Enter cpm: " + "\n");
		cpm = input.nextDouble();
		
		sum = views / 1000 * cpm;
		
		System.out.println("With a total view count of " + views + " and a cpm of " + cpm + "\n");
		System.out.println("The total earnings are: " + sum + "\n");
		
	}

}
