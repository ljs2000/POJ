import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
		int num1;
		int ones;
		int tens;
		int result1;
		int result2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a two-digit number: \n");
		
		num1 = input.nextInt();
		
		ones = num1%10;
		tens =  (num1/10)%10;
		
	
		
		System.out.println("The answer is:" + tens);
		
		System.out.println("The answer is:" + ones);
		
		}
	}
