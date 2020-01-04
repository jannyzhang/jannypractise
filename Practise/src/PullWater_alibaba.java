import java.util.Arrays;
import java.util.HashMap;

public class PullWater_alibaba {
    public static void leastTime(int n, int[] nums){
        bubbleSort(nums);
        int time = 0;
        while (nums[0]>0) {
            for (int j = 0; j <= n; j++) {
                if (nums[j] > 0) {
                    time++;
                    nums[j]--;
                }
                else {
                    time = time+n-j+1;
                    break;
                }
            }
            for (int k = 0; k<nums.length;k++)
            {
                System.out.print(nums[k]+",");
            }
            System.out.println("time:"+time);
            bubbleSort(nums);

        }
        System.out.println("least Time:"+time);
    }
    public static void bubbleSort(char letter[],int nums[]){
        char temp_c;
        int temp;
        for (int i = 0; i< nums.length;i++){
            for (int j = 0; j < nums.length -1 -i; j++){
                if (nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = nums[j];

                    temp_c = letter[j];
                    letter[j] = letter[j+1];
                    letter[j+1] = temp_c;

                }
            }
        }
    }

    public static void bubbleSort(int nums[]){
        int temp;
        for (int i = 0; i< nums.length;i++){
            for (int j = nums.length-1; j > i ; j--){
                if (nums[j]>nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

    }

    public static void main(String args[]){
        int n = 6;
        int[] nums = {5,3,1,0,5,3,1,2,4,6,4,9};
        leastTime(n,nums);
    }

}
