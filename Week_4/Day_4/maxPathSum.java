class Solution {
    int sum =Integer.MIN_VALUE;
    private int solve (TreeNode node ){
        if(node == null) return 0;
        int left = solve(node.left);
        int right = solve(node.right);
       //we found it down 
       
        int case_1 = left + right + node.val;
        sum = Math.max(sum , case_1);

        //Either the left side was best or the right side was best

        int case_2 = Math.max(left , right) + node.val; 
        sum = Math.max(sum , case_2);

        //Only including the root

        int case_3 = node.val;
        sum = Math.max(sum , case_3);

        return Math.max(case_2 ,case_3);   //in case 2 we can not return because we have already diverted our path downwards. 
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return sum;
    }
}