package ProjectClass9;

public class Task91Project
        /*
    Write a java program to find the second largest number in the array?
     */

{ public static void main(String[] args) {
    int[][] numbers = {
            {55, 10, 3},
            {8, 2, 7},
            {1, 60, 4}
    };

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int[] row : numbers) {
        for (int num : row) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
    }

    System.out.println("Second largest number: " + secondMax);
}
}

