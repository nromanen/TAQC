package kata.impl.DmytroHursrkyi;

import kata.SixthKata;

public class Sixkataimpl implements SixthKata {
    @Override
    public long findNb(long m) {
        long result = 0;
        long sum =0;
        while (sum <m) {
            result++;
            sum += result*result*result;
        }
        return sum ==m?result:-1;
    }

    @Override
    public String balance(String book) {return "0";}


    @Override
    public double f(double x) {
        return 0;
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
        return null;
    }
}
