/**
 * Created by Aamir on 2/3/2018.
 */

// a set of methods to randomly generate ints, doubles, booleans, and arrays of these elements
public class RandomGenerator {

    public String errorMessage = "lowerBound must not be greater than upperBound";

    /**
     * throws and IllegalArgumentException if the lowerBound is greater than the upperBound
     * @param lowerBound the lower bound to check
     * @param upperBound the upper bound to check
     */
    private void checkBounds(int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     * throws and IllegalArgumentException if the lowerBound is greater than the upperBound
     * @param lowerBound the lower bound to check
     * @param upperBound the upper bound to check
     */
    private void checkBounds(double lowerBound, double upperBound) {
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     *
     * @param lowerBound the lower bound of the desired randomly generated int
     * @param upperBound the upper bound of the desired randomly generated int
     * @return a random integer that is greater than or equal to lowerBound, and less than or equal to upperBound
     */
    public int randomInt(int lowerBound, int upperBound) {
        checkBounds(lowerBound, upperBound);
        int range = (upperBound - lowerBound) + 1;
        return (int) (Math.random() * range) + lowerBound;
    }

    /**
     *
     * @param lowerBound the lower bound of the desired randomly generated double
     * @param upperBound the upper bound of the desired randomly generated double
     * @return a random double that is greater than or equal to lowerBound, and less than or equal to upperBound
     */
    public double randomDouble(int lowerBound, int upperBound) {
        checkBounds(lowerBound, upperBound);
        double range = (upperBound - lowerBound);
        return (Math.random() * range) + lowerBound;
    }

    /**
     *
     * @param lowerBound the lower bound of the desired randomly generated double
     * @param upperBound the upper bound of the desired randomly generated double
     * @return a random double that is greater than or equal to lowerBound, and less than or equal to upperBound
     */
    public double randomDouble(double lowerBound, double upperBound) {
        checkBounds(lowerBound, upperBound);
        double range = (upperBound - lowerBound);
        return (Math.random() * range) + lowerBound;
    }

    /**
     *
     * @return a random boolean
     */
    public boolean randomBoolean() {
        return Math.random() >= .5;
    }

    /**
     *
     * @param elements the number of elements in the array
     * @param lowerBound the lower bound of the desired randomly generated int elements
     * @param upperBound the upper bound of the desired randomly generated int elements
     * @return an integer array of length elements whose elements are randomly generated integers greater than
     * or equal to lowerBound, and less than or equal to upperBound
     */
    public int[] randomIntArray(int elements, int lowerBound, int upperBound) {
        checkBounds(lowerBound, upperBound);
        int[] intArray = new int[elements];
        for (int i = 0; i < elements; i++) {
            intArray[i] = randomInt(lowerBound, upperBound);
        }
        return intArray;
    }

    /**
     *
     * @param elements the number of elements in the array
     * @param lowerBound the lower bound of the desired randomly generated double elements
     * @param upperBound the upper bound of the desired randomly generated double elements
     * @return a double array of length elements whose elements are randomly generated doubles greater than
     * or equal to lowerBound, and less than or equal to upperBound
     */
    public double[] randomDoubleArray(int elements, int lowerBound, int upperBound) {
        checkBounds(lowerBound, upperBound);
        double[] doubleArray = new double[elements];
        for (int i = 0; i < elements; i++) {
            doubleArray[i] = randomDouble(lowerBound, upperBound);
        }
        return doubleArray;
    }

    /**
     *
     * @param elements the number of elements in the array
     * @param lowerBound the lower bound of the desired randomly generated double elements
     * @param upperBound the upper bound of the desired randomly generated double elements
     * @return a double array of length elements whose elements are randomly generated doubles greater than
     * or equal to lowerBound, and less than or equal to upperBound
     */
    public double[] randomDoubleArray(int elements, double lowerBound, double upperBound) {
        checkBounds(lowerBound, upperBound);
        double[] doubleArray = new double[elements];
        for (int i = 0; i < elements; i++) {
            doubleArray[i] = randomDouble(lowerBound, upperBound);
        }
        return doubleArray;
    }

    /**
     *
     * @param elements the number of elements in the array
     * @return a boolean array of length elements whose elements are randomly generated booleans
     */
    public boolean[] randomBooleanArray(int elements) {
        boolean[] booleanArray = new boolean[elements];
        for (int i = 0; i < elements; i++) {
            booleanArray[i] = randomBoolean();
        }
        return booleanArray;
    }

}