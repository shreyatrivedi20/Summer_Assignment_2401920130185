class Solution {
    public boolean isSubsequence(String s, String t) {
       int a=s.length();
       int b=t.length();
       int i =0;
       int j =0;
       while( j < b && i < a){
          if(t.charAt(j) == s.charAt(i)){
             i++;
          }
          j++;
       }
       if(i == a) return true;
       return false;
    }
}