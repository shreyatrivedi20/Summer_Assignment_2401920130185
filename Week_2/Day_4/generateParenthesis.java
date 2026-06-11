class Solution {
    List<String> lst = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String ans ="";
        solve(ans, n ,0 , 0);
        return lst;
    }
        public void solve(String ans,int n  , int open , int close ){
        if(ans.length() == 2*n){
                lst.add(ans);
            return;
        }
        if( open < n){
           solve(ans + '(' , n  ,  open + 1 , close);
        }
        if( close < open){
        solve(ans + ')' , n ,open , close + 1);
        }
    }
}
