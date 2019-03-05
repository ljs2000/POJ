package Part2;
/*Using instructions from the accompanying WORD document, 
 * use this program to explore the problems with, and effective 
 * utilization of, the next() and nextLine() methods of the String class.*  
 * Note that the intention of this class is that you enter the number 3, 
 * followed by the phrase blind mice, then print them out to yield the phrase 3 blind mice.
*/
import java.util.Scanner;
public class ThreeBlindMice {
	public static void main (String[] args) {
		int num1;
		String alpha, beta;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num1 = input.nextInt();
		beta = input.nextLine();
		System.out.println("Enter a word: ");
		alpha = input.nextLine();
		System.out.println(num1 + " " + alpha);
		input.close();
	}
}