//version 0.3 alpha

import java.util.Scanner;

public class Main {

    private static byte length;
    private static boolean useSpecialCharacters;
    private static boolean useUppercaseLetters;
    private static boolean useLowercaseLetters;
    private static boolean useDigits;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String[] bundleOfPasswords = new String[16000];

        printWelcoming();
        askPasswordProperties(scanner);
        printCheckList(length, useSpecialCharacters, useUppercaseLetters,
                useLowercaseLetters, useDigits);

        boolean[] properties = {
                useSpecialCharacters,
                useUppercaseLetters,
                useLowercaseLetters,
                useDigits
        };

        for (int k = 0; k < 16000; k++) {
            bundleOfPasswords[k] = passwordGenerator.make(length, properties);
        }

        printArrayOfPasswords(bundleOfPasswords);
    }

    private static void printArrayOfPasswords(String[] passwords) {

        for (int k = 0; k < 16000; k++) {
            System.out.println(passwords[k]);
        }
    }

    private static boolean getBooleanFromString(String str) {

        if (str.toLowerCase().equals("yes")) return true;

        return false;
    }

    private static void askPasswordProperties(Scanner scanner) {

        System.out.print("Password's length: ");
        length = scanner.nextByte();
        System.out.print("Use special characters? Yes/No: ");
        useSpecialCharacters = getBooleanFromString(scanner.next());
        System.out.print("Use uppercase letters?  Yes/No: ");
        useUppercaseLetters = getBooleanFromString(scanner.next());
        System.out.print("Use lowercase letters?  Yes/No: ");
        useLowercaseLetters = getBooleanFromString(scanner.next());
        System.out.print("Use digits?             Yes/No: ");
        useDigits = getBooleanFromString(scanner.next());
    }

    private static void printWelcoming() {

        System.out.println("********************************************************************");
        System.out.println("*Welcome to the Password Generating Program!                       *");
        System.out.println("*Created and distributed by programmer Aleser                      *");
        System.out.println("*YouTube Channel: https://www.youtube.com/channel/UCgc04NBvofY_2RSK*");
        System.out.println("*tOTYO2g?view_as=subscriber                                        *");
        System.out.println("********************************************************************");
    }

    private static void printCheckList(byte length, boolean useSpecialCharacters,
                                       boolean useUppercaseLetters, boolean useLowercaseLetters,
                                       boolean useDigits) {

        System.out.println("********************************************************************");
        System.out.println("Password's size           " + length);
        System.out.println("Special characters        " + useSpecialCharacters);
        System.out.println("Uppercase letters         " + useUppercaseLetters);
        System.out.println("Lowercase ketters         " + useLowercaseLetters);
        System.out.println("Digits                    " + useDigits);
        System.out.println("********************************************************************");
    }
}
