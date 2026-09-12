class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix= new int[n][n];
       int srow=0,erow=n-1;
       int scol=0,ecol=n-1;
       int num=1;
       while(srow<=erow && scol<=ecol){
        //top
        for(int j=scol;j<=ecol;j++){
            matrix[srow][j]=num;
            num++;
        }
        //right
        for(int i=srow+1;i<=erow;i++){
            matrix[i][ecol]=num;
            num++;
        }
        //bottom
        for(int j=ecol-1;j>=scol;j--){
            if(srow==erow) break;
            matrix[erow][j]=num;
            num++;
        }
        //left
        for(int i=erow-1;i>=srow+1;i--){
            if(scol==ecol) break;
            matrix[i][scol]=num;
            num++;
        }
        srow++;
        scol++;
        erow--;
        ecol--;
       }
       return matrix;
  }
}