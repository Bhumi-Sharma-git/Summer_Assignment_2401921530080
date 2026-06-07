class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows= mat.length;
        int col= mat[0].length;
        if((rows*col)!=r*c) return mat;
        int[][] outputArr= new int[r][c];
        int row_num=0;
        int col_num=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                outputArr[row_num][col_num]= mat[i][j];
                col_num++;
                if(col_num==c){
                    col_num=0;
                    row_num++;
                }
            }
        }
        return outputArr;
    }
}