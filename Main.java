//version 0.2 alpha

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //CoreGenPassword CGP = new CoreGenPassword();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String[] filepassword = new String[16000];
        //int sizePassword;
        byte length;
        boolean useSpecialCharacters;
        boolean useUppercaseLetters;
        boolean useLowercaseLetters;
        boolean useDigits;
        System.out.println("********************************************************************");
        System.out.println("*Welcome to the Password Generating Program!                       *");
        System.out.println("*Created and Distributed by Pragorammer Aleser                     *");
        System.out.println("*YouTube Channel: https://www.youtube.com/channel/UCgc04NBvofY_2RSK*");
        System.out.println("*tOTYO2g?view_as=subscriber                                       *");
        System.out.println("********************************************************************");

        System.out.print("Password's length: ");
        //sizePassword = scanner.nextInt();
        length = scanner.nextByte();
        System.out.println("Use special characters? true/false: ");
        useSpecialCharacters = scanner.nextBoolean();
        System.out.println("Use uppercase letters? true/false: ");
        useUppercaseLetters = scanner.nextBoolean();
        System.out.println("Use lowercase letters? true/false: ");
        useLowercaseLetters = scanner.nextBoolean();
        System.out.println("Use digits? true/false: ");
        useDigits = scanner.nextBoolean();

        System.out.println("********************************************************************");

        System.out.println("Password's size           " + length);
        System.out.println("Special characters        " + useSpecialCharacters);
        System.out.println("Uppercase letters         " + useUppercaseLetters);
        System.out.println("Lowercase ketters         " + useLowercaseLetters);
        System.out.println("Digits                    " + useDigits);

        System.out.println("********************************************************************");

        boolean[] choice = {
                useSpecialCharacters,
                useUppercaseLetters,
                useLowercaseLetters,
                useDigits
        };

        for (int k = 0; k < 16000; k++) {
            filepassword[k] = passwordGenerator.make(length, choice);
        }

        for (int k = 0; k < 16000; k++) {
            System.out.println(filepassword[k]);
        }

    }
}
//class CoreGenPassword {
//    //Объявление переменных.
//    String password;
//    static String Symbols = "%*)?@#$~ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //Из этих символов делается пароль.
//    int i;
//    int randomnum;
//
//    public String CoreGenPassword(int sizePassword, boolean useSings, boolean useBigLetters,boolean useSmallLetters, boolean useNumbers) {
//        //Обнуление переменных для повторного их использования.
//        Random random = new Random();
//        password = "";
//        i = 0;
//        randomnum = 0;
//        ///////////////////////////////////////////////////////////////////////////////////////////
//        ///////////////////////Великолепное Ядро генерации паролей/////////////////////////////////
//        ///////////////////////////////////////////////////////////////////////////////////////////
//        //В цикле выбирается случайное число (для переменной randomnum) и проверяется по условиям ядра.
//        //Если число не попадает ни под одно условие,
//        //то оно является пригодным и используется для вытаскивания символов из переменной Symbols. (Symbols.ChatAt(randomnum)).
//        //После эти символы присваиваются к перменной password. В конце цикла получается готовый пароль.
//        while (i != sizePassword) {
//            i++;
//            randomnum = random.nextInt(Symbols.length());
//
//            //              Условия ядра.             //
//
//            if (useSings == false && randomnum < 8) {
//                i -= 1;
//                continue;
//            }
//            if (useBigLetters == false && randomnum > 7 && randomnum < 34) {
//                i -= 1;
//                continue;
//            }
//            if (useSmallLetters == false && randomnum > 33 && randomnum < 60) {
//                i -= 1;
//                continue;
//            }
//            if (useNumbers == false && randomnum > 59) {
//                i -= 1;
//                continue;
//            }
//            //Формирование пароля.
//            password += Symbols.charAt(randomnum);
//        }
//        return password; //Возвращение переменной password как готовый пароль.
//    }
//}
