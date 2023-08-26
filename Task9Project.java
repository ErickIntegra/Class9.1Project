package ProjectClass9;

public class Task9Project {
    /*
    Write a java program to find the second largest number in the array?
     */

        public static void main(String[] args) {
            int[] numbers = {5, 10, 3, 8, 2};

            int max = numbers[0];
            int secondMax = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    secondMax = max;
                    max = numbers[i];
                } else if (numbers[i] > secondMax && numbers[i] != max) {
                    secondMax = numbers[i];
                }
            }

            System.out.println("Second largest number: " + secondMax);
        }
    }


