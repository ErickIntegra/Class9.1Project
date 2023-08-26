package ProjectClass9;

public class Task41Project {

        public static void main(String[] args) {
            int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int evenSum = 0;
            int oddSum = 0;

            for (int[] row : numbers) {
                for (int num : row) {
                    if (num % 2 == 0) {
                        evenSum += num;
                    } else {
                        oddSum += num;
                    }
                }
            }

            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
    }

