package Week_1.Day_2;
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> st= new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i])){
                return true;
            }
            else{
                st.add(nums[i]);
            }
        }
        return false;
    }
}