package kata.impl.AnastasiaZadolinna;

import kata.SixthKata;

public class SixthKataImpl implements SixthKata {

    @Override
    public long findNb(long m) {

        long result = 0;

        long sum = 0;

        while (sum < m) {

            result++;

            sum += result * result * result;

        }

        return sum == m ? result : -1;

    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {

        return x / (1 + Math.sqrt(1 - x));

    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        String returnString = "";

        if (lstOfArt.length != 0 && lstOf1stLetter.length != 0) {

            for (int i = 0; i < lstOf1stLetter.length; i++) {

                String currentLetter = lstOf1stLetter[i];

                int count = 0;

                for (int q = 0; q < lstOfArt.length; q++) {

                    String currentArt = lstOfArt[q];

                    if (currentArt.substring(0,1).equals(currentLetter)) {

                        String[] artValues = currentArt.split(" ");

                        count += Integer.parseInt(artValues[1]);

                    }

                }

                String stockList = " ( " + currentLetter + " : " + count + " ) ";

                if (i != lstOf1stLetter.length - 1) {

                    returnString += stockList + " - ";

                } else {

                    returnString += stockList;

                }

            }

        }

        return returnString;

    }

}
