package ProjectClass9;
/*
3)Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even
        numbers only.
*/
public class task3Project {
    public static void main(String[] args) {

       int[][] nums={{34,56,54,55,77,66},
                     {23,32,27,21,51,34},
                     {71,61,41,31,57,29}};
        {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] % 2 == 0){
                        System.out.print(nums[i][j] + " ");}}}}
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 != 0){
                    System.out.print(nums[i][j] + " ");}}}}}



















