package kata.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    public static int intInput (String welcomeMessage){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(welcomeMessage);
            try {
                return Integer.parseInt(input.nextLine());

            }
            catch(NumberFormatException | InputMismatchException e){
                System.out.println("You should enter the integer value");
            }
        }
        }
      //  int arrayLenght = input.nextInt();
    }

