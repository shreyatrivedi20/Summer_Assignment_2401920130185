class Solution {
    private void traversal( TreeNode node , List< Integer> ans){
        if ( node == null){
          return ;
        }
        // left -> root -> right
    int data = node.val;
    traversal(node.left,ans);
    ans.add(data);
    traversal(node.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> ans = new ArrayList<>(); 
        traversal(root , ans);
        return ans;
    }
}