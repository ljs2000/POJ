package Part2;
import java.util.Scanner;

public class Oddsum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter a number: \n");
		number = input.nextInt();
		int sum = 0;
		for(int i = 1; i <= number; i+=2) {
			sum += i;
		}
		System.out.println("The sum of the odd number entered is: \n" + sum);
		input.close();	
	}

}
