public class Solution {
    public void SetZeroes(int[][] matrix) {
        if(matrix ==null ||matrix.Length==0 || matrix[0].Length==0){
            return;
        }
        bool firstRow0=false;
        bool firstColumn0=false;
        for(int i=0;i<matrix.Length; i++){
            for(int j=0;j<matrix[0].Length; j++){
                if(matrix[i][j]==0){
                    if(i==0)
                        firstRow0=true;
                    if(j==0 )
                        firstColumn0=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.Length; i++){
            if(matrix[i][0] ==0){
                for(int j=1;j<matrix[0].Length; j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=1;i<matrix[0].Length; i++){
            if(matrix[0][i] ==0){
                for(int j=1;j<matrix.Length; j++){
                    matrix[j][i]=0;
                }
            }
        }
        if(firstRow0){
            for(int i=0;i< matrix[0].Length; i++){
                matrix[0][i]=0;
            }
        }
        if(firstColumn0 ){
            for(int i=0;i< matrix.Length; i++){
                matrix[i][0]=0;
            }
        }
    }
}