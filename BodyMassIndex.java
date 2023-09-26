package conditionalStatements;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double height, weight, bmi;
		System.out.print("Please enter height information: ");
		height = scan.nextDouble();
		System.out.print("Please enter weight information: ");
		weight = scan.nextDouble();
		bmi = weight / Math.pow(height, 2);
		System.out.println("Body mass index: " + bmi);
		if (bmi < 18.5) {
			System.out.println("Thin");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30 ) {
			System.out.println("Fat");
		} else {
			System.out.println("Obese");
		}
		scan.close();
	}

}
