package conditionalStatements;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String userName = scan.nextLine();
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		
		if (userName.equals("ozanrecber") && password.equals("ozan1234")) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Your username or password is incorrect.\nWould you like to reset your password? (yes or no)");
			String answer = scan.nextLine();
			if (answer.equals("yes")) {
				System.out.print("Enter new password: ");
				String newPassword = scan.nextLine();
				if (newPassword.equals("ozan1234")) {
					System.out.println("Your new password cannot be the same as your old one. Please try again.");
				} else {
					System.out.println("Your password has been changed successfully.\nyour new password: " + newPassword);
				}
			} else if (answer.equals("no")) {
				System.out.println("Your password has not been changed.");
			} else {
				System.out.println("You have logged in incorrectly!");
			}
		}
		scan.close();
	}

}
