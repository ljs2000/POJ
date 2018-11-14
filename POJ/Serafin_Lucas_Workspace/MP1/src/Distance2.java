import java.util.Scanner;

public class Distance2 {
	
	public static void main(String[] args) {
		double segment1;
		double segment2;
		double segment3;
		Scanner input = new Scanner(System.in);
		double totalDistance;
		
		System.out.println("Enter the distance of segment 1: ");
		segment1 = input.nextDouble();
		
		System.out.println("Enter the distance of segment 2: ");
		segment2 = input.nextDouble();
		
		System.out.println("Enter the distance of segment 3: ");
		segment3 = input.nextDouble();
		
		
		totalDistance = segment1 + segment2 + segment3;
		
		System.out.println("The total distance of the race in kilometers is: \n" + totalDistance);
		
		
	}
}
