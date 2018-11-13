package chapter4;
import java.util.Scanner;
import java.text.NumberFormat;
public class Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int burgers;
		int fries;
		int sodas;
		double burgercost = 1.69;
		double sodacost = 0.99;
		double friescost = 1.09;
		double tax = .6;
		double total;
		double total1;
		double total2;
		double total3;
		double finalprice;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Enter the number of burgers: \n");
		burgers = input.nextInt();
		System.out.println("Enter the number of fries: \n");
		fries = input.nextInt();
		System.out.println("Enter the number of soda: \n");
		sodas = input.nextInt();
		
		total1 = burgers * burgercost;
		total2 = fries * friescost;
		total3 = sodas * sodacost;
		total = total1 + total2 + total3;
		tax = total * tax;
		finalprice = total + tax;
		
		System.out.println("Number of burgers: " + burgers);
		System.out.println("Number of fries: " + fries);
		System.out.println("Number of sodas: " + sodas);
		System.out.println("Total beofre tax:" + total);
		System.out.println("Tax: " + tax);
		System.out.println("The total in dollars is: " + money.format(finalprice));
	
		
}

}
