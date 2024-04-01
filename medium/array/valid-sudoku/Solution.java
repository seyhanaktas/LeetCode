class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] c =new boolean[10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
                int val = (int)board[i][j]-(int)'0';

                if(c[val])
                    return false;
                c[val]=true;
            }

            c=new boolean[10];
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')
                    continue;
                int val = (int)board[j][i]-(int)'0';

                if(c[val])
                    return false;
                c[val]=true;
            }

            c=new boolean[10];
        }

        for(int k = 0; k<3;k++){
            for(int l=0;l<3;l++){
                for(int i=k*3;i<k*3+3;i++){
                    for(int j=l*3;j<l*3+3;j++){
                        if(board[i][j]=='.')
                            continue;
                        int val = (int)board[i][j]-(int)'0';
                        if(c[val])
                            return false;
                        c[val]=true;
                    }
                }
                c=new boolean[10];
            }
        }
        return true;
    }
}