public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String s= Integer.toBinaryString(n);
        while(s.length()<32)
            s="0"+s;

        int result=0;

        for(var i=0;i<31;i++){
            int val= (int)s.charAt(i)-'0';
            if(val==1)
                result +=(int)Math.pow(2,i);
        }

        if(s.charAt(31)=='1')
        {
            result+=(int)Math.pow(-2,31);
        }

        return result;
    }
}