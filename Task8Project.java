package ProjectClass9;

public class Task8Project {
    public static void main(String[] args) {

        int [][] numbers={
                {12,13,14},{33,44,22},{24,25,21}
        };

        int maximum=1;
        int minimum = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length;j++) {
                if (numbers[i][j]>maximum);{
                    maximum=numbers[i][j];
                }
                if (numbers[i][j]<minimum){
                    minimum=numbers[i][j];
                }
            }
        } System.out.print("The maximum number is "+maximum);
        System.out.println();
        System.out.print("The minimum number is "+minimum);
        System.out.println();
        //
    }
}