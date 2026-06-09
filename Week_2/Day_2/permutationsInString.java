class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] hash1 = new int [26];
        int[] hash2 = new int [26];
        int m = s1.length();
        int n = s2.length();
        for(int k =0; k <  m ; k++){
            hash1[s1.charAt(k) - 'a']++;
        }
        int i = 0; 
        int j = 0;
        while( j < n ){
            hash2[s2.charAt(j) - 'a']++;
            if(j-i+1 > m ){
                hash2[s2.charAt(i) - 'a']--;
                i++;
            }
            if( Arrays.equals(hash1 , hash2)){
                return true;
            }
            j++;
        }
        return false;
    }
}