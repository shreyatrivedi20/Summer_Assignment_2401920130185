class Solution {
    public int compress(char[] chars) {
       int n = chars.length;
       int i = 0;
       int idx = 0;
       while( i < n){
        char  curr = chars[i];
        int count = 0;
        while( i < n && curr == chars[i]){
            count++;
            i++;
        }
        chars[idx] = curr;
        idx++;
        //We need to convert the integer count into a string before appending it to the character array 
        if( count > 1){
            String str = Integer.toString(count);
            for( char val : str.toCharArray()){
                chars[idx] = val;
                idx++;
            }
        }

       } 
       return idx;
    }
}