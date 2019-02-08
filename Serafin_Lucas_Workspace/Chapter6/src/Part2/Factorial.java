package Part2;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 1;
		int factorial = 1;
		System.out.println("Enter a number: \n");
		number = input.nextInt();		
		
		for(int i = number; number > 1; number--) {
			factorial *= number;
			
		}
		System.out.println("The factorial of " + number + " is: \n" + factorial);
		input.close();	
	}

}
