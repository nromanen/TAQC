package kata.impl.NataliaZagoruiko;

import kata.SixthKata;

public class SixthKataImpl implements SixthKata {

    /**
     * construct a building which will be a pile of n cubes.
     */
    @Override
    public long findNb(long m) {
        long n = 1;
        while (m > 0) {
            double cubValue = Math.pow(n, 3);
            m -= cubValue;
            if (m == 0) {
                break;
            } else if (m < 0) {
                n = -1;
                break;
            }
            n++;
        }
        return n;
    }

    @Override
    public String balance(String book) {
        return null;
    }

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
