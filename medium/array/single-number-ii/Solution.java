class Solution {
   public static int singleNumber(int[] nums) {
        int size=33;
        int[] sum= new int[size];
        for(int i=0;i<size;i++){
            sum[i]=0;
        }        
        for(int n: nums){
            int sign =n<0?-1:1;
            
            for(int i=0;i<size-1;i++){
                sum[i]+=(n%2)*sign;
                n/=2;
            }
            if(sign<0)
                sum[size-1]+=1;
        }
        int res = 0;
        int level =1;
        for(int i=0;i<size-1;i++){
            int n = sum[i];
            res += (n%3)*level;
            level*=2;
        } 
        if(sum[size-1]%3>0)
            res*=-1;
        return res;
    }
}