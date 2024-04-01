class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int tours = n /2;

        int step = n-1;
        int i=0;
        int r = n-1;

        while(step>0){
            for(int k=i;k<i+step;k++){
                int i1=k;
                int j1= i;
                int counter=0;
                int temp = matrix[i1][j1];
                int tempi1 = i1;
                i1=j1;
                j1= step-(tempi1-i)+i;
                while(counter <4){
                    int temp2 = matrix[i1][j1];
                    matrix[i1][j1]=temp;
                    temp=temp2;
                    tempi1 = i1;
                    i1=j1;
                    j1= step-(tempi1-i)+i;
                    counter++;
                }
            }
            i++;
            step -=2;
        }



    }
}