package chapter4;

import java.util.Scanner;

public class tempConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fahrenheit;
		int celsius;
		System.out.println("Enter a temperature in fahrenheit: \n");
		 fahrenheit = input.nextInt();
		 input.close();
		 celsius = (int) ((double)5 / (double)9 * (fahrenheit - (double)32));
		 System.out.print("The temperature in celsius is: " + celsius);
	}
}
