class Solution {
    public int reverse(int x) {
        char[] c =String.valueOf(x).toCharArray();

        int l= 0;
        int r = c.length-1;


        if(c[0]=='-')
            l=1;

        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            r--;
            l++;
        }

        String resStr = String.valueOf(c);

        try{
            return Integer.parseInt(resStr);
        }catch(NumberFormatException ex ){
            return 0;
        }

    }
}