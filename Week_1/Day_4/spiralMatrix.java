 class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int srow=0;
        int scol=0;
        int erow=m-1;
        int ecol=n-1;
        while( srow<=erow && scol<=ecol  ){
            //top boundary
            for(int j=scol;j<=ecol;j++){
              result.add(matrix[srow][j]);
            }
            //right boundary
            for(int i=srow+1;i<=erow;i++){
                result.add(matrix[i][ecol]);
            }
            //bottom boundary
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow) break;
                result.add(matrix[erow][j]);
            }
            //left boundary
            for(int i=erow-1;i>srow;i--){
                if(scol==ecol) break;
                result.add(matrix[i][scol]);
            }
            srow++; erow--;
            scol++; ecol--;
        }
        return result;
    }
}