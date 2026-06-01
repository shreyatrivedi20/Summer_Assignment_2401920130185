class Solution {
    public  static int RemoveDuplicates(int[] nums) {
     int i=0;
     for(int j=1;j<nums.length;j++){
        if(nums[j] != nums[i]){
            nums[i+1]=nums[j];
            i++;
        }
     }   
     return i+1;
    }
}
//[1(i),2(j),2,3] -> [1,2(i),2(j),3] ->[1,2(i),2,3(j)] ->[1,2,3(i)]  2+1=3 ->answer