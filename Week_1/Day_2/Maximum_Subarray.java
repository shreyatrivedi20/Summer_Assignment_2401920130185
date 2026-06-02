package Week_1.Day_2;
class Solution {
    public int maxSubArray(int[] nums) {
      int max_sum=Integer.MIN_VALUE;
      int crt_sum=0;
      for(int i=0;i<nums.length;i++){
        crt_sum=crt_sum+nums[i];
        max_sum=Math.max(max_sum,crt_sum);
        if(crt_sum<0)           // Kadane's Algorithm
         crt_sum=0;
      }
      return max_sum;
    }
}
    
