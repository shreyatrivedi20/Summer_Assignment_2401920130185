class Solution {
    
    private boolean check(TreeNode root , int target , int sum){
        if( root == null) return false;
        sum+=root.val;
        if(root.left == null && root.right == null){
            if(sum == target){
                return true;
            }
            return false;
        }
        boolean left = check(root.left , target , sum);
        boolean right = check(root.right , target , sum);

        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        boolean ans = check(root,targetSum,sum);
        return ans;
    }
}