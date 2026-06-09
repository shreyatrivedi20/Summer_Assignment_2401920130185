class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] hash1 = new int [26];
        int[] hash2 = new int [26];
        List <Integer> lst =new ArrayList<>();
        int m = s.length();
        int n = p.length();
        for(int k =0; k <  n ; k++){
            hash1[p.charAt(k) - 'a']++;
        }
        int i = 0; 
        int j = 0;
        while( j < m ){
            hash2[s.charAt(j) - 'a']++;
            if(j-i+1 > n ){
                hash2[s.charAt(i) - 'a']--;
                i++;
            }
            if( Arrays.equals(hash1 , hash2)){
                lst.add(i);
            }
            j++;
        }
        return lst;
    }
}