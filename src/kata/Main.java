package kata;

import kata.impl.AnastasiaZadolinna.EightKataImpl;
import kata.impl.AnastasiaZadolinna.SixthKataImpl;
import kata.impl.DmytroHursrkyi.SevenKataImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choice kata:\n 1 - EightKata\n 2  - SevenKata\n 3 - SixthKata\n " +
                " 4 - FiveKata\n q - Exit");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();

        switch (choice) {

            case "1":

                eightKataHandler(scanner);

                break;

            case "2":

                sevenKataHandler(scanner);

                break;

            case "3":

                sixthKataHandler(scanner);

                break;

            case "4":

                fiveKataHandler(scanner);

                break;

        }

    }

    private static void fiveKataHandler(Scanner scanner) {

        System.out.println("Choice your method:\n 1 - to run artificialRain(int[]) method\n " +
                "2 - to run gap(int, long, long) method\n 3 - to run zeros(int) method\n " +
                "4 - to run perimeter(BigInteger) method\n 5 - to run solve(double) method\n " +
                "6 - to run smallest(long) method\n or other symbol to exit");

    }

    private static void sixthKataHandler(Scanner scanner) {

        System.out.println("Choice your method:\n 1 - to run findNb(long) method\n 2 - to run balance(String) method\n" +
                "3 - to run f(double) method\n 4 - to run mean(String, String) method\n 5 - to run variance(String, String) method\n " +
                "6 - to run nbaCup(String, String) method\n 7 - to run stockSummary(String[], String[]) method\n " +
                "or other symbol to exit");

        String choice = scanner.nextLine();

        if ("1".equals(choice)) {


        } else if ("2".equals(choice)) {


        } else if ("3".equals(choice)) {

            System.out.println("Input double number:");

            Double value = Double.parseDouble(scanner.nextLine());

            System.out.println("The result of execute of f method is: " + new SixthKataImpl().f(value));

        }

    }

    private static void sevenKataHandler(Scanner scanner) {

        System.out.println("Choice your method:\n 1 - to run newAvg(double[], double) method\n 2 - to run seriesSum(long) method\n " +
                "or other symbol to exit");

        String choice = scanner.nextLine();

        if ("1".equals(choice)) {

            System.out.println("Input double values separated by commas:");

            String arr = scanner.nextLine();

            String[] convertedRankArray = arr.split("\\s*,\\s*");

            double[] doubleArr = new double[convertedRankArray.length];

            for (int i = 0; i < doubleArr.length; i++) {

                doubleArr[i] = Double.parseDouble(convertedRankArray[i]);

            }

            System.out.println("Input double value:");

            double value = scanner.nextDouble();

            System.out.println("The result of execute of newAvg method is: " + new SevenKataImpl().newAvg(doubleArr, value));

        }

    }

    private static void eightKataHandler(Scanner scanner) {

        System.out.println("Enter your choice:\n 1 - to run getVolumeOfCuboid(double,double,double) method\n " +
                "2 - to run liters (double) method\n 3 - to run mpgToKPM(float) method\n 4 - to run squareOrSquareRoot(int[]) method\n " +
                "5 - to run countPositivesSumNegatives(int) method\n 6 - to run stringToNumber(String) method\n " +
                "7 - to run amIWilson(double) method\n 8 - to run twoDecimalPlaces(double) method\n " +
                "9 - to run divisibleBy(int[], int) method\n or other symbol to exit");

        String choice = scanner.nextLine();

        if ("1".equals(choice)) {

            System.out.println("Input double length:");

            Double length = Double.parseDouble(scanner.nextLine());

            System.out.println("Input double width:");

            Double width = Double.parseDouble(scanner.nextLine());

            System.out.println("Input double height:");

            Double height = Double.parseDouble(scanner.nextLine());

            System.out.println("The result of execute of getVolumeOfCuboid method is: " + new EightKataImpl().getVolumeOfCuboid(length, width, height));

        } else if ("2".equals(choice)) {

            System.out.println("Input double number:");

            double value = scanner.nextDouble();

            System.out.println("The result of execute of Liters method is: " + new EightKataImpl().liters(value));

        } else if ("6".equals(choice)) {

            System.out.println("Input number:");

            String number = scanner.nextLine();

            System.out.println("The result of execute of stringToNumber method is: " + new EightKataImpl().stringToNumber(number));
        } else if ("4".equals(choice)) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number");
            int Arraylenght = input.nextInt();
            int array[]=new int[Arraylenght];
            System.out.println("Enter the " + Arraylenght + " numbers now.");
            for (int i = 0; i < Arraylenght; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("These are the numbers you have entered." + new EightKataImpl().squareOrSquareRoot(array));
        }
    }
}