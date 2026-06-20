class Solution {
    public int largestRectangleArea(int[] heights) {
        int max_area=0;
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int element=st.peek();
                st.pop();
                int nse=i;
                int pse;
                if(st.isEmpty()){
                     pse=-1;
                }
                else{
                    pse=st.peek();
                }
                max_area=Math.max(max_area,heights[element]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int nse=heights.length;
            int element=st.peek();
            st.pop();
            int pse;
            if(st.isEmpty()){
                pse=-1;
            }
            else{
                pse=st.peek();
            }
            max_area=Math.max(max_area,heights[element]*(nse-pse-1));
        }
        return max_area;
    }
}