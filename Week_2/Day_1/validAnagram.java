class Solution {
    public boolean isAnagram(String s, String t) {
        char[] new1=s.toCharArray();
        char[] new2=t.toCharArray();
        Arrays.sort(new1);
        Arrays.sort(new2);
        return Arrays.equals(new1,new2);
    }
}