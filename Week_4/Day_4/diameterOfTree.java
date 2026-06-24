class Solution {
    int maxi= Integer.MIN_VALUE;
    private int length(TreeNode node){
        if(node == null){
            return 0;
        }
        int lh = length(node.left );
        int rh = length(node.right);
        maxi = Math.max(maxi , lh + rh);
        return  1 + Math.max( lh , rh );
    }
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return maxi;
    }
}