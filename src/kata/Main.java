package kata;

import kata.impl.AnastasiaZadolinna.EightKataImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your choice : \n 1 - to run getVolumeOfCuboid(double) method \n or other symbol to exit");

        Scanner scanner = new Scanner(System.in);

        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {

            System.out.println("Input double length:");

            Double length = Double.parseDouble(scanner.nextLine());

            System.out.println("Input double width:");

            Double width = Double.parseDouble(scanner.nextLine());

            System.out.println("Input double height:");

            Double height = Double.parseDouble(scanner.nextLine());

            System.out.println("The result of execute of getVolumeOfCuboid method is: " + new EightKataImpl().getVolumeOfCuboid(length, width, height));

        }

    }

}
