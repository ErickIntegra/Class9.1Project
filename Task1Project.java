package ProjectClass9;

public class Task1Project {
    /*

 1) Create a program that uses an array to store a list of temperatures for
 a week, and then uses a loop to find the highest and lowest
 temperature for the week.
 2) Create an array of integer values. After the array is created, calculate
 the sum of all stored elements in that array.
 3)Create a 2D array or integer type where you will store odd and even
 numbers. Develop a program which will identify/print the even
 numbers only.
 4)Create a 2D array of integers. Develop a program which will calculate
 the sum of even and odd numbers for that array.
 5)Write a program to swap 2 numbers without a temporary variable?
 6)Write a java program to check whether a given number is prime or
 not?
 7)Write a Java Program to print the first 10 numbers of Fibonacci series.
 8)Maximum and minimum number in the array?
 9)Write a java program to find the second largest number in the array?
 10)Write a program to print out duplicate elements from an Array of
 Strings?



     */
    public static void main(String[] args) {

        int[] temp = {89, 90, 78, 87, 99, 100, 70};
        int high = 0;
        int low = 0;

        for (int i = 0; i < 7; i++) {
            if (temp[i] > high) {high = temp[i];}
        }System.out.println("the hottest temp is " + high);
        for (int j = 0; j < 7; j++) {low = temp[j];
        }System.out.println("the coolest temp is " +low );
    }}

