/*
 * Lucas Serafin
 * 3/18/19
 * Pd. 1
 * This program converts minutes, hours, or days to days, hours, or minutes.
 */
package Part1;

import java.util.Scanner;

public class TimeConverter {
	
	public static void minutes() {
		System.out.println("Enter a time in minutes: \n");
	}
	
	public static void hours() {
		System.out.println("Enter a time in hours: \n");
	}
	
	public static void days() {
		System.out.println("Enter a time in days: \n");
	}
	
	public static void main() {
		int minutes;
		int hours;
		int days;
		String choice = null;
	Scanner input = new Scanner(System.in);
	
	System.out.println("* Time Converter 1.0 * \n");
	
	System.out.println("Specify if the time you are entering is in minutes(m), hours(h), or days(d) \n");
	
	choice = input.next();
	
	if(choice == "m") {
		minutes();
	}
	else if(choice == "h") {
		hours();
	}
	else if(choice == "d") {
		days();
	}
	
	System.out.println("Enter m if you want to convert to minutes, h if you want to cnvert to hours, or d if you want to convert to days. \n");
	
	
	
	}

}
