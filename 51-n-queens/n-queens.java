class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();
        char[][] board=new char[n][n];
        //Fill board with'.'
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(board,0,ans);
        return ans;
    }
    public void solve(char[][] board, int row, List<List<String>> ans){
        //all queens placed
        if(row==board.length){
            List<String> list=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }
        //Try every column in this row
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)==true){
            board[row][col]='Q';
            solve(board,row+1,ans);
            //backtrack
            board[row][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row,int col){
        int n=board.length;
        //check column
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //check row
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row, j=col; i>=0&& j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row,j=col ;i>=0 && j<n ; i--,j++){
if(board[i][j]=='Q'){
    return false;
}
        }
        return true;
    }
}