import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int lp=0;
        int rp=n-1;
        int max_water=0;
        while(lp<rp){
            int width=rp-lp;
            int ht=Math.min(height[lp],height[rp]);
            int current_water=width*ht;
            max_water=Math.max(current_water,max_water);
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return max_water;
    }
}