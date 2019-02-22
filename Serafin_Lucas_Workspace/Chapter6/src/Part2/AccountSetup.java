package Part2;

import java.util.Scanner;

public class AccountSetup {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String username = null;
		
		String password = null;
		
		System.out.println("Enter your username: \n");
		username = input.next();
		
		System.out.println("Enter your password that is at least 8 characters: \n");
		password = input.next();
		
		while(password.length() <= 8 ) {
		
			System.out.println("Enter your password that is at least 8 characters: \n");
			password = input.next();
			
		}
	

	
}
	
}
