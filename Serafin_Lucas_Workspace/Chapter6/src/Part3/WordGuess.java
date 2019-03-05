/* Brandon Jones, Lucas Serafin - Period 1
 * January 8, 2019
 * This program creates a word guessing game for the user.
 */

package chaptersixpartthree;

import java.util.Scanner;

public class WordGuess {
	public static void main(String[] args) {
		final String SECRET_WORD = "DETERMINATION";
		final String FLAG = "?";
		String hiddenLetters = "";
		String userGuess, userFinalGuess;
		int stringLength;
		int comparitor = 0; 
		int pointValue = 100;
		int numberOfGuesses = 0;
		boolean correctGuess = false;
		Scanner input = new Scanner(System.in);
		
		stringLength = SECRET_WORD.length();
		for (int i = stringLength; i > 0; i--) {
			hiddenLetters += "-";
		}
		System.out.println(hiddenLetters);
		
		do {
			do {
				System.out.print("\nEnter a letter (Enter \"?\" to guess the word): ");
				userGuess = input.next();
				if (userGuess.indexOf(SECRET_WORD) != 0) {
					userGuess = userGuess.toUpperCase();
					comparitor = SECRET_WORD.indexOf(userGuess);
					hiddenLetters = hiddenLetters.substring(0, comparitor) + userGuess + hiddenLetters.substring(comparitor + 1);
					System.out.println(hiddenLetters);
				}
				numberOfGuesses += 1;
			} while (userGuess != FLAG);
		} while (pointValue > 0 || correctGuess == false);
	}
}
