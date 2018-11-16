package MP2;

import java.util.Scanner;

public class CircleCircumference2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double pi = 3.141;
		double r;
		System.out.println("Enter a radius:");
		r = input.nextDouble();
		
		if(r < 0) {
			System.out.println("Negative radii are illegal.");
		}
		else {
			
			double C = 2 * pi * r;
			
			System.out.print("The radius of the circle is: " + C);
		}
		
	}
}
