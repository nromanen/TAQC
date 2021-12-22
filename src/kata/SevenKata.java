package kata;

public interface SevenKata {

    /**
     * Looking for a benefactor
     *
     * @param arr expected donation
     * @param navg expected donation
     * @return  the expected donation rounded up to the next integer
     */
    public long newAvg(double[] arr, double navg);

    /**
     * Sum of the first nth term of Series
     *
     * @param n incoming values
     * @return the sum of following series up to nth term(parameter)
     */
    public String seriesSum(int n);
}