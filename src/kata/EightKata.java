package kata;

public interface EightKata {
	
	/**
	 * for Volume of a Cuboid task
	 * @param length of cuboid
	 * @param width of cuboid
	 * @param height of cuboid
	 * @return volume of cuboid
	 */
    double getVolumeOfCuboid(final double length, final double width, final double height); 

    /**
     * for Keep Hydrated! task
     * @param time
     * @return
     */
    int Liters(double time); 

    /**
     * for Miles per gallon to kilometers per liter task
     * @param mpg
     * @return
     */
    float mpgToKPM(final float mpg); 

    /**
     * for To square(root) or not to square(root) task
     * @param array
     * @return
     */
    int[] squareOrSquareRoot(int[] array); 

    /**
     * for Count of positives / sum of negatives task
     * @param input
     * @return
     */
    int[] countPositivesSumNegatives(int[] input); 

    /**
     * for Convert a String to a Number! task
     * @param str
     * @return
     */
    int stringToNumber(String str); 

    /**
     * for Wilson primes task
     * @param n
     * @return
     */
    boolean am_i_wilson(double n);  

    /**
     * for Formatting decimal places task
     * @param number
     * @return
     */
    double TwoDecimalPlaces(double number);  

    /**
     * for Find numbers which are divisible by given number task
     * @param numbers
     * @param divider
     * @return
     */
    int[] divisibleBy(int[] numbers, int divider); 

}
