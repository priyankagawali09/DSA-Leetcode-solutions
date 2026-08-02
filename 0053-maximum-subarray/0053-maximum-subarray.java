class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int curr_sum =nums[0];
        for(int i= 1;i< nums.length ;i++){
         curr_sum =Math.max(nums[i], curr_sum + nums[i]);

         maxsum =Math.max(maxsum , curr_sum);
        }
        return maxsum;
    }
}