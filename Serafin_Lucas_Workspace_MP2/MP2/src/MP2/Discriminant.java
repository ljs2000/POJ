package MP2;

import java.util.Scanner;
import java.lang.Math;

public class Discriminant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("Please enter a value for the variable a:");
		a = input.nextDouble();
		System.out.println("Please enter a value for the variable b:");
		b = input.nextDouble();
		System.out.println("Please enter a value for the variable c:");
		c = input.nextDouble();
		double discriminant = Math.pow(b, 2)-4*a*c;
}
}
