package ProjectClass9;

public class Task83Project {
    public static void main(String[] args) {

        int [][] numbers={
                {34,56,54,55,77,66},
                {23,32,27,21,51,34},
                {71,61,41,31,57,29}
        };

        int maximum=0;
        int minimum = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length;j++) {
                if (numbers[i][j]>maximum){
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
        System.out.print("eric solved "+maximum+" question");
    }
}



