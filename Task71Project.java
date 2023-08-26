package ProjectClass9;

public class Task71Project {
    public static void main(String[] args) {
       /*
         7)Write a Java Program to print the first 10 numbers of Fibonacci series.
 Maximum and minimum number in the array?
        */


        int number1=0;
        int number2=1;

        for (int i=1;i<=10; i++) {

            System.out.print(number1 +" ");
            int nextNumber=number1+number2;
            number1 = number2;
            number2 = nextNumber;
        }
    }
}




