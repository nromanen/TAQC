package kata.impl.DmytroHursrkyi;

import kata.SevenKata;

public class SevenKataImpl implements SevenKata {

    @Override
    public long newAvg(double[] arr, double navg) {
        double summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        if ((summa / arr.length) >= navg) {
            throw new IllegalArgumentException();
        } else {
            Double temp = Math.ceil(((arr.length + 1) * navg) - summa);
            long res = temp.longValue();
            return res;
        }
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }
}
