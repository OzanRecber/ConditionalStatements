package conditionalStatements;

import java.util.Scanner;

public class ZodiacSignFinder {

	public static void main(String[] args) {
		/*
		 * Aries: March 21 - April 20
		 * Taurus: April 21 - May 20
		 * Gemini: May 21 - June 21
		 * Cancer: June 22 - July 22
		 * Leo: July 22 - August 23
		 * Virgo: 23 August - 22 September
		 * Libra: September 23 - October 22
		 * Scorpio: October 23 - November 22
		 * Sagittarius: November 23 - December 21
		 * Capricorn: December 22 - January 20
		 * Aquarius: January 21 - February 19
		 * Pisces: February 20 - March 20
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month of your birth: ");
		int month = scan.nextInt();
		System.out.print("Enter the day of your birth: ");
		int day = scan.nextInt();
		boolean isError = false;
		scan.close();
		String zodiacSign = "";
		
		switch (month) {
		case 1:
			if (day >= 1 && day <= 31) {
				if (day < 21)
					zodiacSign = "Capricorn";
				else
					zodiacSign = "Aquarius";
			} else {
				isError = true;
			}
			break;
		case 2:
			if (day >= 1 && day <= 29) {
				if (day < 20)
					zodiacSign = "Aquarius";
				else
					zodiacSign = "Pisces";
			} else {
				isError = true;
			}
			break;
		case 3:
			if (day >= 1 && day <= 31) {
				if (day < 21)
					zodiacSign = "Pisces";
				else
					zodiacSign = "Aries";
			} else {
				isError = true;
			}
			break;
		case 4:
			if (day >= 1 && day <= 30) {
				if (day < 21)
					zodiacSign = "Aries";
				else
					zodiacSign = "Taurus";
			} else {
				isError = true;
			}
			break;
		case 5:
			if (day >= 1 && day <= 31) {
				if (day < 21)
					zodiacSign = "Taurus";
				else
					zodiacSign = "Gemini";
			} else {
				isError = true;
			}
			break;
		case 6:
			if (day >= 1 && day <= 30) {
				if (day < 22)
					zodiacSign = "Gemini";
				else
					zodiacSign = "Cancer";
			} else {
				isError = true;
			}
			break;
		case 7:
			if (day >= 1 && day <= 31) {
				if (day < 22)
					zodiacSign = "Cancer";
				else
					zodiacSign = "Leo";
			} else {
				isError = true;
			}
			break;
		case 8:
			if (day >= 1 && day <= 31) {
				if (day < 23)
					zodiacSign = "Leo";
				else
					zodiacSign = "Virgo";
			} else {
				isError = true;
			}
			break;
		case 9:
			if (day >= 1 && day <= 30) {
				if (day < 23)
					zodiacSign = "Virgo";
				else
					zodiacSign = "Libra";
			} else {
				isError = true;
			}
			break;
		case 10:
			if (day >= 1 && day <= 31) {
				if (day < 23)
					zodiacSign = "Libra";
				else
					zodiacSign = "Scorpio";
			} else {
				isError = true;
			}
			break;
		case 11:
			if (day >= 1 && day <= 30) {
				if (day < 23)
					zodiacSign = "Scorpio";
				else
					zodiacSign = "Sagittarius";
			} else {
				isError = true;
			}
			break;
		case 12:
			if (day >= 1 && day <= 31) {
				if (day < 22)
					zodiacSign = "Sagittarius";
				else
					zodiacSign = "Capricorn";
			} else {
				isError = true;
			}
			break;

		default:
			isError = true;
		}
		if (isError)
			System.out.println("You have entered invalid!");
		else
			System.out.println("Zodiac sign is: " + zodiacSign);

	}

}
