package kata.utils;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

    public static int intInput(String welcomeMessage) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(welcomeMessage);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("You should enter the integer value");
            }
        }
    }

    public static BigInteger bigIntegerInput(String welcomeMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(welcomeMessage);
                String input = scanner.nextLine();
                return new BigInteger(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Incorrect format for big integer. Please try again");
            }
        }
    }

    public static double doubleInput(String welcomeMessage) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(welcomeMessage);
            try {
                return Double.parseDouble(input.nextLine());
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("You should input double value");
            }
        }
    }
}

