class Solution {
    private String reverse(String s){
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length -1;
        while(i < j){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
        s = new String(arr);
        return s;
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words =s.split( " ");
        for(String element: words){
          element=reverse( element );
          sb.append(element);
          sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}