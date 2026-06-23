class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean left_TO_right =true;
        if( root == null) return ans;
        queue.add(root);
        while(!queue.isEmpty()){
          List< Integer >  level = new ArrayList<>();
          int size = queue.size();
          for( int i = 0 ; i < size ; i++){
               TreeNode node = queue.poll();
               if(left_TO_right){
                  level.add(node.val);
               }
               else{
                 level.add(0 , node.val);
               }
               if( node.left != null)  queue.offer(node.left);
               if( node.right != null)  queue.offer(node.right);
          }
          ans.add(level);
          left_TO_right =!left_TO_right ;

        }
    return ans;

    }
}