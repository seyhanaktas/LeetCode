class Solution {
    public int maxArea(int[] height) {
        int p1=0;
        int p2=height.length -1;
        int sum =(p2-p1)*(height[p1]<height[p2]?height[p1]:height[p2]);

        while(p1<p2){
            int p22 = p2-1;
            int sumLeft=(p22-p1)*(height[p1]<height[p22]?height[p1]:height[p22]);

            int p11 = p1+1;
            int sumRight = (p2-p11)*(height[p11]<height[p2]?height[p11]:height[p2]);

            int sumBoth = (p22-p11)*(height[p11]<height[p22]?height[p11]:height[p22]);

            int sumTemp = Math.max(Math.max(sumLeft,sumRight),sumBoth);

            if(sum<sumTemp){
                sum= sumTemp;
                if(sumTemp==sumLeft){
                    p2--;
                }else if(sumTemp==sumRight){
                    p1++;
                }else{
                    p1++;
                    p2--;
                }
            }else{
                if(height[p1]<height[p2]){
                    p1++;
                }else{
                    p2--;
                }
            }
        }
        return sum;

    }
}