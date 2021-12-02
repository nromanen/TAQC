package kata.impl.nataliazagoruiko;

import kata.EightKata;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class EightKataImpl implements EightKata {

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public int liters(double time) {
        final double litersPerHour = 0.5;
        double result = time * litersPerHour;
        return (int) Math.floor(result);
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float gallonToLitres = 4.54609188f;
        final float mileToKilometers = 1.609344f;

        float kilometres = mileToKilometers * mpg;
        float litters = gallonToLitres * mpg;
        float kilometersPerLiter = (kilometres / litters) * mpg;

        DecimalFormat dh = new DecimalFormat("0.0#");
        return Float.parseFloat(dh.format(kilometersPerLiter));
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] processedNumbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double squareRoot = Math.sqrt(element);

            if ((squareRoot - Math.floor(squareRoot) == 0)) {
                processedNumbers[i] = new Double(squareRoot).intValue();
            } else {
                processedNumbers[i] = element * element;
            }
        }
        return processedNumbers;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int[] result = new int[2];
        int count = 0;
        int sum = 0;
        for (int element : input) {
            if (element > 0) {
                count++;
            } else {
                sum = sum + element;
            }
        }

        result[0] = count;
        result[1] = sum;
        return result; //return an array with count of positives and sum of negatives
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        int[] primaries = {5, 13, 563};

        boolean result = false;

        for (int element : primaries) {
            int argument = (int) n;
            if (element == argument) {
                result = true;
                break;
            }
        }

        return result;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        BigDecimal a = new BigDecimal(number);
        BigDecimal roundOff = a.setScale(2, RoundingMode.HALF_EVEN);
        return roundOff.doubleValue();
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] divisibleNumbers = new int[]{};

        for (int element : numbers) {
            final boolean isDivisible = (element % divider) == 0;

            if (isDivisible) {
                int[] newArray = new int[divisibleNumbers.length + 1];
                System.arraycopy(divisibleNumbers, 0, newArray, 0, divisibleNumbers.length);
                newArray[newArray.length - 1] = element;
                divisibleNumbers = newArray;
            }
        }
        return divisibleNumbers;
    }
}
