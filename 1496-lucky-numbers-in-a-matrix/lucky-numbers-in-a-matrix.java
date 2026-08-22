class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        int m=matrix.length;
        int n= matrix[0].length;
        for(int i=0;i<m;i++){
            int minCol=0;
            //Minimum element in row
            for(int j=1;j<n;j++){
                if(matrix[i][j]<matrix[i][minCol]){
                    minCol=j;
                }
            }
            //check maximum in column
            boolean lucky=true;
            for(int k=0;k<m;k++){
                if(matrix[k][minCol]>matrix[i][minCol]){
                    lucky=false;
                    break;
                }
            }
            if(lucky==true){
                ans.add(matrix[i][minCol]);
            }
        }
        return ans;
    }
}