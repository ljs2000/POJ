import java.util.Scanner;
public class pizzaCost {
	public static void main(String[] args) {
		double laborCost = 0.75;
		double Rent = 1.00;
		double Diameter;
		double Materials;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the diameter of the pizza: \n ");
		
		Diameter = input.nextDouble();
		
		Materials = 0.05 * Diameter * Diameter;
		
		System.out.println("The total cost of the pizza is: \n" + Materials);
		
	}
}
