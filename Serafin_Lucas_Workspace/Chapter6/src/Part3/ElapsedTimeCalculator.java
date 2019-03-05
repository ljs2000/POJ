/* 
 * Lucas Serafin
 * Pd. 1
 * 3/5/19
 * This program calculates the number of hours that have elapsed from the starting hour value.
 */

package Part3;

import java.util.Scanner;

public class ElapsedTimeCalculator {
	
	public static void main(String args[]) {
	
	int startingHour;
	
	int hoursElapsed;
	
	int total;
	
	String amorpm = null;
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the starting hour: ");
	
	startingHour = input.nextInt();
	
	System.out.println("Enter am or pm: ");
	
	amorpm = input.nextLine();
	
	System.out.println("Enter the number of hours elapsed: ");
	
	hoursElapsed = input.nextInt();
		
	}

}
