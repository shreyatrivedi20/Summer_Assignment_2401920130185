package Week_1.Day_2;

class Solution {
    public double findMaxAverage(int[] nums, int k) {  
        // similar to max subarray sum equal to k  -> sliding window
        int i=0;int j=0;
        int sum=0;
        int max_avg=Integer.MIN_VALUE;
        for(j=0;j<k;j++){
            sum=sum+nums[j];
        }
        max_avg=Math.max(max_avg,sum);
        while(j<nums.length){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            j++;
            max_avg=Math.max(sum,max_avg);
        }
        return (double ) max_avg/k;
    }
}