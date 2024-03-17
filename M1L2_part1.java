import java.util.Arrays;
import java.util.Collections;

public class M1L2_part1 {

    public static void main(String[] args) {
        // part 1. one dimensional arrays
        // creating an array with 10 random numbers
        int[] randomNumberArray = { 40, 86, 63, 38, 57, 66, 82, 72, 93, 36 };

        // calculate average
        double average = calculateAverage(randomNumberArray);
        System.out.println("Average of the numbers: " + average);

        // calculate min, max
        int[] minMax = findMinMax(randomNumberArray);
        System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);

        // sort array low to high
        Arrays.sort(randomNumberArray);
        System.out.println("Sort the Array from low to high: " + Arrays.toString(randomNumberArray));

        // reverse sort high to low
        reverseSortArray(randomNumberArray);
        System.out.println("Sort the Array high to low: " + Arrays.toString(randomNumberArray));
    }

    private static double calculateAverage(int[] array) {
        // method to find average
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        return (double) sum / array.length;
    }

    private static int[] findMinMax(int[] array) {
        // method to find min/max
        if (array.length == 0) {
            return new int[] { 0, 0 };
        }

        int min = array[0];
        int max = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        return new int[] { min, max };
    }

    private static void reverseSortArray(int[] array) {
        // method to reverse sort from high to low
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            array[i] = boxedArray[i];
        }
    }

}