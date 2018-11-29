package MP2;

import java.util.Scanner;

public class CollegeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tuition;
		int rent;
		int scholarship;
		int books;
		int calculator;
		int supplies;
		int totalcost;
		int finalcost;
		System.out.println("The Apex College Cost Calcualtor \n");
		System.out.println("The following items are required for university: \n");
		System.out.println("Tuition, rent, calculator, books, and other supplies. \n");
		System.out.println("Please enter the price of your tuition: \n");
		tuition = input.nextInt();
		System.out.println("Please enter the price of your rent if applicable: \n");
		rent = input.nextInt();
		System.out.println("Please enter the price of your college books: \n");
		books = input.nextInt();
		System.out.println("Please enter the price of your calculator if applicable: \n");
		calculator = input.nextInt();
		System.out.println("Please enter the ammount of your scholarship in usd if applicable: \n");
		scholarship = input.nextInt();
		System.out.println("Please enter the price of any other supplies: \n");
		supplies = input.nextInt();
		input.close();
		totalcost = tuition + rent + books + calculator + supplies; 
		finalcost = totalcost - scholarship;
		System.out.println("The the total cost is:" + totalcost);
		System.out.println("The final cost with a scholarship is:" + finalcost);
		
}
	
}

