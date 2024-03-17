import java.util.Arrays;
import java.util.Random;

public class M1L2_part2 {
    // part 2 multi dimensional arrays
    public static void main(String[] args) {
        // create 2x5 multi array
        int[][] multiArray = new int[2][5];
        // load random numbers into the array
        loadRandomNumbers(multiArray);
        // print multidimensional array and display method
        System.out.println("Multi-Dimensional Array:");
        displayArray(multiArray);
        // print the sum
        System.out.println("Sum: " + findSum(multiArray));
        // print smallest number
        System.out.println("Smallest number in array: " + findSmallestNumber(multiArray));
        findAndDisplayOddNumbers(multiArray);
    }

    private static void loadRandomNumbers(int[][] array) {
        // randomizing numbers in array
        Random r = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = r.nextInt(100) + 1;
    }

    private static void displayArray(int[][] array) {
        // create method displayArray
        for (int[] row : array)
            System.out.println(Arrays.toString(row));
    }

    private static int findSum(int[][] array) {
        // create method findSum to find the sum of the array
        int sum = 0;
        for (int[] row : array)
            for (int num : row)
                sum += num;
        return sum;
    }

    private static int findSmallestNumber(int[][] array) {
        // create method findSmallestNumber to find the smallest #
        int smallest = array[0][0];
        for (int[] row : array)
            for (int num : row)
                if (num < smallest)
                    smallest = num;
        return smallest;
    }

    private static void findAndDisplayOddNumbers(int[][] array) {
        // method findAndDisplayOddNumbers to find the odd numbers pos and and display
        // it
        System.out.println("Odd numbers and their positions:");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                if (array[i][j] % 2 != 0)
                    System.out.println("Number: " + array[i][j] + ", Position: [" + i + "][" + j + "]");
    }
}
