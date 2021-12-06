
package kata;

import kata.impl.SerhiiZdoima.EightKataImpl;
import java.util.Scanner;

public class Main {

    private static EightKata Kata;
    private static kata.impl.SerhiiZdoima.EightKata Converter;
    private static kata.impl.SerhiiZdoima.EightKata EvenNumbers;

    public static void main(String[] args) {
        EightKata water = new kata.impl.SerhiiZdoima.EightKata();
        System.out.println(water.liters(41));
        System.out.println(Kata.getVolumeOfCuboid(5, 6, 10));
        System.out.println(Converter.mpgToKPM(678.55f));
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] array2 = Kata.countPositivesSumNegatives(array);
        for (int i : array2) {
            System.out.println(i);
        }
        EightKata stringToNumber;
        System.out.print(stringToNumber.stringToNumber("123"));
        int[] arraym = new int[]{1, 2, 3, 4, 5, 6};
        int[] array3 = EvenNumbers.divisibleBy(arraym, 2);
        for (int i : array3) {
            System.out.print(i);
        }
    }
}