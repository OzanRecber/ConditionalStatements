package conditionalStatements;

import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first visa note: ");
		int v1 = scan.nextInt();
		System.out.print("Enter your second visa note: ");
		int v2 = scan.nextInt();
		System.out.print("Enter your final grade: ");
		int f = scan.nextInt();
		scan.close();
		if ((v1 >= 0 && v1 <= 100) && (v2 >= 0 && v2 <= 100) && (f >= 0 && f <= 100)) {
			double avg = (v1 * 0.25) + (v2 * 0.25) + (f * 0.5);
			System.out.println("Grade Average: " + avg);
			String letterGrade = "";
			if (avg <= 100 && avg >= 90) {
				letterGrade = "AA";
			} else if (avg < 90 && avg >= 80) {
				letterGrade = "BA";
			} else if (avg < 80 && avg >= 70) {
				letterGrade = "BB";
			} else if (avg < 70 && avg >= 60) {
				letterGrade = "CB";
			} else if (avg < 60 && avg >= 50) {
				letterGrade = "CC";
			} else if (avg < 50 && avg >= 40) {
				letterGrade = "DC";
			} else {
				letterGrade = "FF";
			}
			System.out.println("Your letter grade: " + letterGrade);
			if (letterGrade.equals("FF")) {
				System.out.println("Unfortunately you failed!");
			} else if (letterGrade.equals("DC")) {
				System.out.println("You passed with average!");
			} else {
				System.out.println("Congratulations, you have succeeded!");
			}
		} else {
			System.out.println("You have logged in incorrectly!");

		}

	}

}
