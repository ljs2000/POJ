package chapter4;

import java.util.Scanner;

public class GradeAvg2 {
	public static void main(String[] args) {
		int grade1 = 0;
		int grade2 = 0;
		int grade3 = 0;
		int grade4 = 0;
		int grade5 = 0;
		int totalGrade;
		double Average;
		Scanner input = new Scanner(System.in);
		System.out.println("Grade Average Calculator: \n");
		System.out.println("Please enter your first grade: \n");
		grade1 += input.nextInt();
		System.out.println("Please enter your second grade: \n");
		grade2 += input.nextInt();
		System.out.println("Please enter your third grade: \n");
		grade3 += input.nextInt();
		System.out.println("Please enter your fourth grade: \n");
		grade4 += input.nextInt();
		System.out.println("Please enter your fifth grade: \n");
		grade5 += input.nextInt();
		input.close();
		
		totalGrade = grade1 + grade2 + grade3 + grade4 + grade5;
		Average = totalGrade / 5;
		
		System.out.println("The average of the grades you entered is: \n" + Average + "%");
		
}
	
}
