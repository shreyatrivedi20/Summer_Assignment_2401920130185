class Solution {
    public int lengthOfLongestSubstring(String s) {
    Set <Character>  st= new HashSet<>();
    int i=0;
    int j=0;
    int maxlen =0;
    int size=0;
    while(j < s.length()){
        if(!st.contains(s.charAt(j))){
            st.add(s.charAt(j));
            size=j-i+1;
            maxlen=Math.max(maxlen,size);
            j++;
        }
        else{
            st.remove(s.charAt(i));
            i++;
        }
    }
    return maxlen;
    }
}