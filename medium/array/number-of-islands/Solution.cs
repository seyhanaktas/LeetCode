public class Solution {
    char getMaxNeighbour(char[][] grid, int i, int j){
        char max='0';
        if(i>0){
            char val= grid[i-1][j];
            if(val>max)
                max= val;
        }
        if(j<grid[0].Length-1){
            char val= grid[i][j+1];
            if(val>max)
                max= val;
        }
        if(i<grid.Length-1){
            char val= grid[i+1][j];
            if(val>max)
                max= val;
        }
        if(j>0){
            char val= grid[i][j-1];
            if(val>max)
                max= val;
        }
        return max;
    }

    void setValue(char[][] grid, int i, int j, char islandCounter){
        if(i<0 || i>grid.Length-1|| j<0 || j>grid[0].Length-1)
            return;
        if(grid[i][j]=='1'){
            grid[i][j]=islandCounter;
            setValue(grid, i-1, j, islandCounter);
            setValue(grid, i, j+1, islandCounter);
            setValue(grid, i+1, j, islandCounter);
            setValue(grid, i, j-1, islandCounter);
        }

    }

    /*
[["1","0","1","1","1"],
["1","0","1","0","1"],
["1","1","1","0","1"]]
    */
    public int NumIslands(char[][] grid) {
        char islandCounter='1';

        for(int i=0; i< grid.Length; i++){
            for(int j=0;j<grid[0].Length; j++){
                if(grid[i][j]=='1'){
                    char maxNeighbour= getMaxNeighbour(grid, i, j);
                    if(maxNeighbour=='0' || maxNeighbour=='1'){
                        islandCounter=(char)((int)islandCounter+1);
                    }
                    if(islandCounter>'1'){
                        setValue(grid, i, j, islandCounter);
                    }
                }
            }
        }
        return (int)islandCounter-'0'-1;
    }
}