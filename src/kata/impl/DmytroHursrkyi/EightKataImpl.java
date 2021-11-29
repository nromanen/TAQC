package kata.impl.DmytroHursrkyi;

import kata.EightKata;

public class EightKataImpl implements EightKata {

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public int Liters(double time) {
        return (int) (time / 2);
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float kpm = (mpg * mile) / gallon;
        return Math.round(kpm * 100) / 100f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int res[] = {0, 0};

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0)
                res[1] = res[1] + input[i];
            else if (input[i] > 0)
                res[0]++;
        }
        return res;
    }

    @Override
    public double stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean am_i_wilson(double n) {
        return false;
    }

    @Override
    public double TwoDecimalPlaces(double number) {
        String result = String.format("%.2f", number);
        return Double.parseDouble(result);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
