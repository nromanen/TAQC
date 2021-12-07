package kata;

import kata.impl.AnastasiaZadolinna.EightKataImpl;
import kata.impl.DmytroHursrkyi.SevenKataImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Choice kata:\n 1 - EightKata\n 2  - SevenKata\n  q - Exit");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();

        switch (choice) {

            case "1":

                eightKataHandler(scanner);

                break;

            case "2":

                sevenKataHandle(scanner);

                break;

        }

    }

    private static void sevenKataHandle(Scanner scanner) {

        String choice;

        System.out.println("Choice your method: \n 1 - to run newAvg(double[], double)\n 2 -seriesSum(long)");

        choice = scanner.nextLine();

        if ("1".equals(choice)) {

            System.out.println("Input double values separated by commas");

            String arr = scanner.nextLine();

            String[] convertedRankArray = arr.split("\\s*,\\s*");

            double[] doubleArr = new double[convertedRankArray.length];

            for (int i = 0; i < doubleArr.length; i++) {

                doubleArr[i] = Double.parseDouble(convertedRankArray[i]);

            }

            System.out.println("Input double value");

            double value = scanner.nextDouble();

            System.out.println("The result of execute of newAvg method is: " + new SevenKataImpl().newAvg(doubleArr, value));

        }

    }

    private static void eightKataHandler(Scanner scanner) {

        System.out.println("Enter your choice : \n 1 - to run getVolumeOfCuboid(double,double,double) method \n " +
                "2 - to run liters (double)\n 3 - to run mpgToKPM( float ) or other symbol to exit");

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

            System.out.println("Enter double number");

            double value = scanner.nextDouble();

            System.out.println("The result of execute of Liters method is" + new EightKataImpl().liters(value));

            new EightKataImpl().liters(value);

        }

    }

}
