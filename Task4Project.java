package ProjectClass9;

public class Task4Project {
   /*
     4)Create a 2D array of integers. Develop a program which will calculate
 the sum of even and odd numbers for that array.
*/
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








