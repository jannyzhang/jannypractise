public class CanPatition {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) sum+=nums[i];
        if(sum%2!=0) return false;
        int target = sum/2;
        boolean[] memo = new boolean[target+1];
        memo[0] = true;

        for(int i=0; i<nums.length; i++){
            for(int j=target; j>=0; j--){
                if(j>=nums[i])
                    memo[j] |= memo[j-nums[i]];
            }
        }
        return memo[target];
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        canPartition(nums);
    }
}
