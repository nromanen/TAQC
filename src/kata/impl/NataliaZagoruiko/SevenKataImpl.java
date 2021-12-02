package kata.impl.NataliaZagoruiko;

import kata.SevenKata;

public class SevenKataImpl implements SevenKata {

    /**
     * The function returns the expected donation (rounded up to the next integer)
     * that will permit to reach the average navg.
     *
     * @param arr  first donations
     * @param navg average value
     */
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;

        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        double lastDonat = navg * (arr.length + 1) - sum;
        if (lastDonat < 0) {
            throw new IllegalArgumentException();
        }

        return (long) Math.ceil(lastDonat);
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }


    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
