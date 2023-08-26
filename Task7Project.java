package ProjectClass9;

public class Task7Project {
    public static void main(String[] args) {
       /*
         7)Write a Java Program to print the first 10 numbers of Fibonacci series.
 Maximum and minimum number in the array?
        */

        int n = 10;
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("First 10 numbers of Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}





