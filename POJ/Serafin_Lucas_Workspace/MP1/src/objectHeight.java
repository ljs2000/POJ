import java.util.Scanner;
public class objectHeight {
	public static void main(String[] args) {
		double t;
		double h;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a timeless than 4.5 seconds \n");
		t = input.nextDouble();
		
		h = 100-(4.9 * t * 2);
		
		System.out.println("The height of the object at the time you entered is: \n" + h);
	}
}
