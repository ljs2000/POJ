import java.util.Scanner;
 
public class Change {
 
	public static void main(String[] args) {	
		int change = 0;
	    int quarters = 0;
	    int dimes = 0;
	    int nickels = 0;
	    int pennies = 0;
	    //creates a copy of Scanner class
	    Scanner in = new Scanner(System.in);
 
	    System.out.println("Please enter amount of change less than $1.00");
 
	    change = in.nextInt();
	    int changeOut = change;
 
	    //loop for quarters
	    while (change >= 25)
	    {
	        change = change - 25;
	        quarters = quarters + 1;
	    }
	    while (change >= 10)
	    {
	        change = change - 10;
	        dimes = dimes + 1;
 
	    }
	    while (change >= 5)
	    {
	        change = change - 5;
	        nickels = nickels + 1;
	    }
	    while (change >= 1)
	    {
	        change = change - 1;
	        pennies = pennies + 1;
	    }
 
	    System.out.println("Change:" + changeOut);
	    System.out.println("Quarters= "+ quarters);
	    System.out.println("Dimes=" + dimes);
	    System.out.println("Nickels=" + nickels);
	    System.out.println("Pennies=" + pennies);
 
	    in.close();
	}
}
 