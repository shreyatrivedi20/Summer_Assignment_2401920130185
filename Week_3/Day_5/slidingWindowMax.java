class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque < Integer> queue = new ArrayDeque<>();
        int [] arr = new int[n-k+1];
        for( int i = 0 ; i < nums.length ; i++){
            if(!queue.isEmpty() && queue.peekFirst() <= i - k){
                queue.pollFirst();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            queue.offerLast(i);
            if(i >=  k - 1){
                 arr[i - k + 1] = nums[queue.peekFirst()];
            }
        }
        return arr;
    }
}