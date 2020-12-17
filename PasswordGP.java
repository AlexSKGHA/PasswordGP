import java.util.Scanner;

public class PasswordGP {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String enter;
		
		while (true) {
			System.out.print(">>>");
			enter = scanner.next();
			if (enter.equals("TTRL")) { 
				System.out.println("OK");
				continue;
			}
			if (enter.equals("Quit")) {
				System.out.println("Quiting...");
				break;
			} else if (enter.equals("mp")) {
				callPG();
			}	else {
				System.out.println("Unknown command");
			}
		}
	}
	
	private static void callPG() {
		Scanner scanner = new Scanner(System.in);
		
		byte passwordLength;

		boolean toUseSpecialCharacters;
		boolean toUseUppercaseLetters;
		boolean toUseLowercaseLetters;
		boolean toUseDigits;

		System.out.print("Password length: ");
		passwordLength = scanner.nextByte();
		System.out.print("toUseSpecialCharacters | true/false: ");
		toUseSpecialCharacters = scanner.nextBoolean();
		System.out.print("toUseUppercaseLetters | true/false: ");
		toUseUppercaseLetters = scanner.nextBoolean();
		System.out.print("toUseLowercaseLetters | true/false: ");
		toUseLowercaseLetters = scanner.nextBoolean();
		System.out.print("toUseDigits | true/false: ");
		toUseDigits = scanner.nextBoolean();

		boolean[] conditionArray = {toUseSpecialCharacters, toUseUppercaseLetters,
			toUseLowercaseLetters, toUseDigits};

		PasswordGenerator pg = new PasswordGenerator();
		System.out.println(pg.make(passwordLength, conditionArray));
	}
}
