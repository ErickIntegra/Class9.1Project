package ProjectClass9;

public class Task81Project {
    public static void main(String[] args) {
        int[][] nums={{34,56,54,55,77,66},
                {23,32,27,21,51,34},
                {71,61,41,31,57,29}};
        int max=0;
        int min=nums[0][0];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] > max) ;{
                    max = nums[i][j];
                }
                if(nums[i][j] < min) ;{
                min = nums[i][j];

                }
            }
        } System.out.print("The maximum number is "+max);
        System.out.println();
        System.out.print("The minimum number is "+min);
        System.out.println();
        }
    }
