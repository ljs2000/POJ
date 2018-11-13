package chapter4;
import java.util.Scanner;
import java.text.NumberFormat;

public class Spending {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double food = 0;
		double clothing = 0;
		double rent = 0;
		double entertainment = 0;
		double total = 0;
		double totalfood = 0;
		double totalrent = 0;
		double totalclothing = 0;
		double totalentertainment = 0;
		NumberFormat percent = NumberFormat.getPercentInstance();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("How much did you spend on food last month?");
		food = input.nextDouble();
		System.out.println("How much did you spend on clothing last month?");
		clothing = input.nextDouble();
		System.out.println("How much did you spend on rent last month?");
		rent = input.nextDouble();
		System.out.println("How much did you spend on entertainment last month?");
		entertainment = input.nextDouble();
		total = food + clothing + entertainment + rent;
		totalfood = food / total;
		totalclothing = clothing / total;
		totalrent = rent / total;
		totalentertainment = entertainment / total;
		System.out.format("%10s %10s", "Category", "Budget \n");
		System.out.format("%10s %10s %5s", "Food", + totalfood, "% \n");
		System.out.format("%10s %10s %5s", "Clothing", + totalclothing, "% \n");
		System.out.format("%10s %10s %5s", "Rent", + totalrent, "%");
		System.out.format("%10s %10s %5s", "Entertainment", + totalentertainment, "%");
	}
}